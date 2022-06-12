package com.servicedb.MVC.PumpStationScreen.Controllers;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.TextFlow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class RtuInspectionController {
    public TextField DI1TF ;
    public TextField DI2TF;
    public TextField DI3TF;
    public TextField DI4TF;
    public TextField DI7TF;
    public TextField DI8TF;
    public TextField DI9TF;
    public TextField DI10TF;
    public TextField DI5TF;
    public TextField DI6TF;
    public TextField DI11TF;
    public TextField DI12TF;
    public TextField DI13TF;
    public TextField DI14TF;
    public TextField DI15TF;
    public TextField P1L1AmpTF;
    public TextField P1L2AmpTF;
    public TextField P1L3AmpTF;
    public TextField P1L1MegTF;
    public TextField P1L2MegTF;
    public TextField P1L3MegTF;
    public TextField P1L1HertzTF;
    public TextField P1L2HertzTF;
    public TextField P1L3HertzTF;
    public TextField P2L1AmpTF;
    public TextField P2L2AmpTF;
    public TextField P2L3AmpTF;
    public TextField P2L1MegTF;
    public TextField P2L2MegTF;
    public TextField P2L3MegTF;
    public TextField P2L1HertzTF;
    public TextField P2L2HertzTF;
    public TextField P2L3HertzTF;
    public TextField P3L1AmpTF;
    public TextField P3L2AmpTF;
    public TextField P3L3AmpTF;
    public TextField P3L1MegTF;
    public TextField P3L2MegTF;
    public TextField P3L3MegTF;
    public TextField P3L1HertzTF;
    public TextField P3L2HertzTF;
    public TextField P3L3HertzTF;
    public CheckBox in1Ok;
    public CheckBox in1Bad;
    public CheckBox in2Ok;
    public CheckBox in2Bad;
    public CheckBox in3Ok;
    public CheckBox in3Bad;
    public CheckBox in4Ok;
    public CheckBox in4Bad;
    public CheckBox in7Ok;
    public CheckBox in7Bad;
    public CheckBox in8Ok;
    public CheckBox in8Bad;
    public CheckBox in9Ok;
    public CheckBox in9Bad;
    public CheckBox in10Ok;
    public CheckBox in10Bad;
    public CheckBox terminationsCB;
    public CheckBox picturesCB;
    public CheckBox drawingsCB;
    public CheckBox lightCB;
    public CheckBox gfciCB;
    public CheckBox floatCB;
    public CheckBox batCB;
    public CheckBox cleanCB;
    public CheckBox sealOffCB;
    public CheckBox in5Ok;
    public CheckBox in5Bad;
    public CheckBox in6Ok;
    public CheckBox in6Bad;
    public CheckBox in11Ok;
    public CheckBox in11Bad;
    public CheckBox in12Ok;
    public CheckBox in12Bad;
    public CheckBox in13Ok;
    public CheckBox in13Bad;
    public CheckBox in14Ok;
    public CheckBox in14Bad;
    public CheckBox in15Ok;
    public CheckBox in15Bad;
    public Button saveBtn;

    public int stationNum;
    public Label P3Label;
    public TextFlow notesField;
    public TextArea notesArea;
    public CheckBox panelConditionCBgood;
    public CheckBox panelConditionCBreplace;
    private FileWriter fw;
    private File file;
    private String dateString;
    private int pumpCount;

    public RtuInspectionController(){

    }

    public void initDate(int stationNum, int pumpCount) {
        this.stationNum = stationNum;
        this.pumpCount = pumpCount;

        SimpleDateFormat dateFormat = new SimpleDateFormat("MMMM-dd-yyyy HH mm ss");
        long date = new Date().getTime();
        this.dateString = this.stationNum + "--" + dateFormat.format(date);
        this.file =  new File( "/Users/reeceyorgensen/PSinspectionRTU/PS" + dateString + ".txt");
        if(this.pumpCount != 3) {
            P3L1AmpTF.setVisible(false);
            P3L2AmpTF.setVisible(false);
            P3L3AmpTF.setVisible(false);

            P3L1MegTF.setVisible(false);
            P3L2MegTF.setVisible(false);
            P3L3MegTF.setVisible(false);

            P3L1HertzTF.setVisible(false);

            P3Label.setVisible(false);
        }
    }

    @FXML
    void save() throws IOException {
        this.fw = new FileWriter(file);
        fw.write("\nPS:" + this.dateString + "\n\n\n");

        if (panelConditionCBgood.isSelected()) fw.write("\u2705Panel Condition:  GOOD\n");
        if (panelConditionCBreplace.isSelected()) fw.write(" \u274CPanel Condition:  REPLACE\n");

        writePump(P1L1AmpTF, P1L2AmpTF, P1L3AmpTF, P1L1MegTF, P1L2MegTF, P1L3MegTF, P1L1HertzTF, "One");
        writePump(P2L1AmpTF, P2L2AmpTF, P2L3AmpTF, P2L1MegTF, P2L2MegTF, P2L3MegTF, P2L1HertzTF, "Two");
        if (this.pumpCount == 3) writePump(P3L1AmpTF, P3L2AmpTF, P3L3AmpTF, P3L1MegTF, P3L2MegTF, P3L3MegTF, P3L1HertzTF, "Three");



        fw.write("Check List--------------------------------------------------------------------------------------\n\n");
        writeChecklist(terminationsCB, "Terminations");
        writeChecklist(picturesCB, "Pictures");
        writeChecklist(drawingsCB, "Drawings");
        writeChecklist(lightCB, "Light");
        writeChecklist(gfciCB, "GFCI");
        writeChecklist(sealOffCB, "Seal-offs");
        writeChecklist(floatCB, "Floats/Transducer");
        writeChecklist(batCB, "Battery");
        writeChecklist(cleanCB, "Clean");

        fw.write("ACE3600 Inputs----------------------------------------------------------------------------------\n\n");
        writeCheckBoxes(in1Ok, in1Bad, DI1TF, 1, "high level");
        writeCheckBoxes(in2Ok, in2Bad, DI2TF, 2, "pump 1 fail");
        writeCheckBoxes(in3Ok, in3Bad, DI3TF,3, "pump 2 fail");
        writeCheckBoxes(in4Ok, in4Bad, DI4TF,4, "pump 1 running");
        writeCheckBoxes(in5Ok, in5Bad, DI5TF,5, "pump 2 running");
        writeCheckBoxes(in6Ok, in6Bad, DI6TF,6, "control power");
        writeCheckBoxes(in7Ok, in7Bad, DI7TF,7, "emergency breaker closed");
        writeCheckBoxes(in8Ok, in8Bad, DI8TF,8, "utility power fail");
        writeCheckBoxes(in9Ok, in9Bad, DI9TF,9, "pump 1 in auto");
        writeCheckBoxes(in10Ok, in10Bad, DI10TF,10, "pump 2 in auto");
        writeCheckBoxes(in11Ok, in11Bad, DI11TF,11, "pump 1 breaker trip");
        writeCheckBoxes(in12Ok, in12Bad, DI12TF,12, "pump 2 breaker trip");

        fw.write("Notes-------------------------------------------------------------------------------------------\n\n");
        fw.write(notesArea.getText());



        fw.close();
        saveBtn.getScene().getWindow().hide();
    }

    void writeCheckBoxes(CheckBox cbOk, CheckBox cbBad, TextField tf, int diNum, String name) throws IOException {
        if (cbOk.isSelected()) fw.write("\u2705   DI "+ diNum + " " + name + "\n\n");
        else if (cbBad.isSelected()) fw.write("\u274C   DI " + diNum + " " + name + ".\n        \u2705   DI " + tf.getText() + " " + name + ".\n\n");
        else if (!cbOk.isSelected() && !cbBad.isSelected()) fw.write("\u274C   DI " + diNum + " " + name + " not used\n\n");
    }

    void writePump(TextField amp1, TextField amp2, TextField amp3,
                   TextField meg1, TextField meg2, TextField meg3,
                   TextField hertz, String pumpNum) throws IOException {
        fw.write("Pump "+ pumpNum + " --------------------------------------------------------------------------------------\n\n");
        fw.write("Leg 1    Amp:  " + amp1.getText() + "   Meg: " + meg1.getText() + "   Hertz: " + hertz.getText() + "\n\n");
        fw.write("Leg 2    Amp:  " + amp2.getText() + "   Meg: " + meg2.getText() +  "\n\n");
        fw.write("Leg 3    Amp:  " + amp3.getText() + "   Meg: " + meg3.getText() +  "\n\n\n");
    }

    void writeChecklist(CheckBox cb, String itemName) throws IOException {
        if (cb.isSelected()) fw.write(  "\u2705   " + itemName + "\n\n");
        else fw.write("\u274c   " + itemName + "\n\n");
    }
}