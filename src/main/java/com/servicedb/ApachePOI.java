package com.servicedb;


import com.servicedb.Entities.AcE;
import com.servicedb.Entities.PumpsE;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.io.FileInputStream;


public class ApachePOI {

    public ApachePOI() throws Exception {}

    void pumpStationExcel() throws Exception {
        FileInputStream inFile = new FileInputStream("/Users/reeceyorgensen/Downloads/MASTER_LIST.xlsx");
        Workbook workbook = new XSSFWorkbook(inFile);
        Sheet pumpstations = workbook.getSheetAt(1);

        for (int i = 162; i < 170; i++) {
            System.out.println(i);
            HibernateUtil.PumpStationUpdate psu = new HibernateUtil.PumpStationUpdate(i);
            Row row = pumpstations.getRow(i);
            psu.name(row.getCell(2).getStringCellValue())
                    .meterNum((int) row.getCell(3).getNumericCellValue())
                    .locationAdress(row.getCell(6).getStringCellValue())
                    .commitTX();
        }
    }

    void pumpExcel() throws Exception {
        FileInputStream inFile = new FileInputStream("/Users/reeceyorgensen/MPW_Asset_Details.xlsx");
        Workbook workbook = new XSSFWorkbook(inFile);
        Sheet sheet = workbook.getSheetAt(0);
        Session session = new HibernateUtil().getSession();
        Transaction transaction = session.beginTransaction();
        for (int i = 1; i < 6554; i += 14) {
            PumpsE pump = new PumpsE();

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

            AcE ac = new AcE();

            ac.setLocation(sheet.getRow(i + 22).getCell(0).getStringCellValue());
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

}