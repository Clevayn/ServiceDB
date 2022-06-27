package com.servicedb;


import com.servicedb.MVC.Entities.AC;
import com.servicedb.MVC.Entities.Pump;
import com.servicedb.MVC.Entities.SpillLevel;
import org.apache.poi.openxml4j.opc.OPCPackage;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xwpf.usermodel.*;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.openxmlformats.schemas.wordprocessingml.x2006.main.CTRow;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ApachePOI {

    public ApachePOI() throws Exception {}

    void spillExcel() throws Exception {
        FileInputStream inFile = new FileInputStream("/Users/reeceyorgensen/spill level clean.xlsx");
        Workbook workbook = new XSSFWorkbook(inFile);
        Sheet spill = workbook.getSheetAt(0);
        Session session = new HibernateUtil().getSession();

        for (int i = 0; i < 164; i++) {
            SpillLevel spillLevel = new SpillLevel();
            Row row = spill.getRow(i);
            System.out.println(i + " " + row.getCell(0) + " " + row.getCell(2) + " " + row.getCell(3) + " " +
                    row.getCell(4) + " " + row.getCell(5));

                spillLevel.setLocationString(row.getCell(0).getStringCellValue().strip());


                if (row.getCell(1).getCellType() == CellType.NUMERIC )spillLevel.setMpwAsset(Integer.toString((int)row.getCell(1).getNumericCellValue()));
                else spillLevel.setMpwAsset(row.getCell(1).getStringCellValue().strip());
                if (row.getCell(2).getCellType() == CellType.NUMERIC ) spillLevel.setSpillLevel(Integer.toString((int)row.getCell(2).getNumericCellValue()));
                else spillLevel.setSpillLevel(row.getCell(2).getStringCellValue().strip());
                spillLevel.setTimeOff(row.getCell(3).getStringCellValue().strip());

                session.saveOrUpdate(spillLevel);

        }
        session.close();

    }


    void pumpStationExcel() throws Exception {
        new XWPFDocument(OPCPackage.open(new File("")));
        FileInputStream inFile = new FileInputStream("/Users/reeceyorgensen/Downloads/MASTER_LIST.xlsx");
        Workbook workbook = new XSSFWorkbook(inFile);
        Sheet pumpstations = workbook.getSheetAt(1);

        for (int i = 162; i < 170; i++) {
            System.out.println(i);
            Row row = pumpstations.getRow(i);
            //psu.name(row.getCell(2).getStringCellValue())
              //      .meterNum((int) row.getCell(3).getNumericCellValue())
                //    .locationAdress(row.getCell(6).getStringCellValue())
                  //  .commitTX();
        }
    }

    void pumpExcel() throws Exception {
        FileInputStream inFile = new FileInputStream("/Users/reeceyorgensen/MPW_Asset_Details.xlsx");
        Workbook workbook = new XSSFWorkbook(inFile);
        Sheet sheet = workbook.getSheetAt(0);
        Session session = new HibernateUtil().getSession();
        Transaction transaction = session.beginTransaction();
        for (int i = 1; i < 6554; i += 14) {
            Pump pump = new Pump();

            pump.setMpwAssetNum(sheet.getRow(i).getCell(0).getStringCellValue());
            pump.setLocation(sheet.getRow(i).getCell(1).getStringCellValue());
            pump.setSerial(String.valueOf(sheet.getRow(i).getCell(2).getStringCellValue()));
            pump.setBrand(sheet.getRow(i).getCell(4).getStringCellValue());
            pump.setModel(sheet.getRow(i + 2).getCell(4).getStringCellValue());
            pump.setImpellerDiameter( (float) sheet.getRow(i + 3).getCell(4).getNumericCellValue());
            pump.setPumpSize( (float) sheet.getRow(i + 4).getCell(4).getNumericCellValue());
            pump.setHp( (float) sheet.getRow(i + 6).getCell(4).getNumericCellValue());
            pump.setPhase( (int) sheet.getRow(i +7).getCell(4).getNumericCellValue());
            pump.setPumpType(sheet.getRow(i + 8).getCell(4).getStringCellValue());
            pump.setVoltage(sheet.getRow(i + 10).getCell(4).getStringCellValue());

        }

    }




    void acExcel() throws Exception {
        FileInputStream inFile = new FileInputStream("/Users/reeceyorgensen/MASTER_LIST.xlsx");
        Workbook workbook = new XSSFWorkbook(inFile);
        Sheet sheet = workbook.getSheetAt(8);
        Session session = new HibernateUtil().getSession();

        for (int i = 0; i < 16; i += 1) {

            AC ac = new AC();

            ac.setBrand(sheet.getRow(i + 22).getCell(1).getStringCellValue());
            ac.setModel(sheet.getRow(i + 22).getCell(3).getStringCellValue());
            ac.setVoltage(sheet.getRow(i + 22).getCell(4).getStringCellValue());
            ac.setBtu((int) sheet.getRow(i + 22).getCell(5).getNumericCellValue());
            ac.setSerial(sheet.getRow(i + 22).getCell(6).getStringCellValue());
            ac.setRefrigerant(sheet.getRow(i + 22).getCell(7).getStringCellValue());
            ac.setInstallationDate(sheet.getRow(i + 22).getCell(8).getDateCellValue());
            session.saveOrUpdate(ac);

        }
        session.close();
    }

    void wordDocument() throws IOException {
        String fileName = "/Users/reeceyorgensen/Test outputs/text.docx";
        try(XWPFDocument document = new XWPFDocument()) {
            XWPFParagraph p1 = document.createParagraph();
            p1.setAlignment(ParagraphAlignment.CENTER);
            XWPFRun run = p1.createRun();
            run.setBold(true);
            run.setItalic(true);
            run.setFontSize(22);
            run.setFontFamily("New Roman");
            run.setText("Pump Station 076");

            //XWPFTable pumpContainerTable = document.createTable();
            XWPFTable table1 = generatePumpTable(document);
            XWPFTable table2 = generatePumpTable(document);
            XWPFTable table3 = generatePumpTable(document);
            //pumpContainerTable.getRow(0).getCell(1).insertTable(2, table2);
            //pumpContainerTable.getRow(0).getCell(2).insertTable(4, table3);


            try(FileOutputStream out = new FileOutputStream(fileName)) {
                document.write(out);
            }
        }

    }

    XWPFTable generatePumpTable(XWPFDocument doc){
        XWPFTable table = doc.createTable(4,3);
        //PUMP 1
        table.removeBorders();
        XWPFRun tableRun = table.getRow(0).getCell(0).addParagraph().createRun();
        //column 1 labels
        table.getRow(0).getCell(0).addParagraph().createRun().setText("Pump 1");
        table.getRow(1).getCell(0).addParagraph().createRun().setText("Leg 1");
        table.getRow(2).getCell(0).addParagraph().createRun().setText("Leg 2");
        table.getRow(3).getCell(0).addParagraph().createRun().setText("Leg 3");
        //column 2
        table.getRow(0).getCell(1).addParagraph().createRun().setText("AMPS");
        table.getRow(1).getCell(1).addParagraph().createRun().setText("");
        table.getRow(2).getCell(1).addParagraph().createRun().setText("");
        table.getRow(3).getCell(1).addParagraph().createRun().setText("");
        //column 3
        table.getRow(0).getCell(2).addParagraph().createRun().setText("MEG");
        table.getRow(1).getCell(2).addParagraph().createRun().setText("");
        table.getRow(2).getCell(2).addParagraph().createRun().setText("");
        table.getRow(3).getCell(2).addParagraph().createRun().setText("");
        return table;
    }


}
