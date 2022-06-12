package com.servicedb.MVC.PumpStationScreen.Controllers;

import com.servicedb.MVC.Entities.PlcModuleOneInput;
import com.servicedb.MVC.PumpStationScreen.Dao.PlcModuleOneInputDao;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

public class PlcInspectionController {


    public TextField P1L1AmpTF;
    public TextField P1L2AmpTF;
    public TextField P1L3AmpTF;
    public TextField P1L1MegTF;
    public TextField P1L2MegTF;
    public TextField P1L3MegTF;
    public TextField P1L1HertzTF;
    public TextField P2L1AmpTF;
    public TextField P2L2AmpTF;
    public TextField P2L3AmpTF;
    public TextField P2L1MegTF;
    public TextField P2L2MegTF;
    public TextField P2L3MegTF;
    public TextField P2L1HertzTF;
    public Label pump3Label;
    public TextField P3L1AmpTF;
    public TextField P3L2AmpTF;
    public TextField P3L3AmpTF;
    public TextField P3L1MegTF;
    public TextField P3L2MegTF;
    public TextField P3L3MegTF;
    public TextField P3L1HertzTF;
    public CheckBox terminationsCB;
    public CheckBox picturesCB;
    public CheckBox drawingsCB;
    public CheckBox lightCB;
    public CheckBox gfciCB;
    public CheckBox floatCB;
    public CheckBox batCB;
    public CheckBox cleanCB;
    public CheckBox sealOffCB;
    public TextArea notes;
    public CheckBox panelConditionCBgood;
    public CheckBox panelConditionCBreplace;
    public Text m2in0T;
    public Text m2in1T;
    public Text m2in2T;
    public Text m2in3T;
    public CheckBox m2in0ok;
    public CheckBox m2in0bad;
    public TextField m2in0TF;
    public CheckBox m2in1ok;
    public CheckBox m2in1bad;
    public TextField m2in1TF;
    public CheckBox m2in2ok;
    public CheckBox m2in2bad;
    public TextField m2in2TF;
    public CheckBox m2in3ok;
    public CheckBox m2in3bad;
    public TextField m2in3TF;
    public Text m2in4T;
    public CheckBox m2in4ok;
    public CheckBox m2in4bad;
    public TextField m2in4TF;
    public Text m2in5T;
    public CheckBox m2in5ok;
    public CheckBox m2in5bad;
    public TextField m2in5TF;
    public Text m2in6T;
    public CheckBox m2in6ok;
    public CheckBox m2in6bad;
    public TextField m2in6TF;
    public Text m2in7T;
    public CheckBox m2in7ok;
    public CheckBox m2in7bad;
    public TextField m2in7TF;
    public Text m2in8T;
    public CheckBox m2in8ok;
    public CheckBox m2in8bad;
    public TextField m2in8TF;
    public Text m2in9T;
    public CheckBox m2in9ok;
    public CheckBox m2in9bad;
    public TextField m2in9TF;
    public Text m2in10T;
    public CheckBox m2in10ok;
    public CheckBox m2in10bad;
    public TextField m2in10TF;
    public Text m2in11T;
    public CheckBox m2in11ok;
    public CheckBox m2in11bad;
    public TextField m2in11TF;
    public Text m2in12T;
    public CheckBox m2in12ok;
    public CheckBox m2in12bad;
    public TextField m2in12TF;
    public Text m2in13T;
    public CheckBox m2in13ok;
    public CheckBox m2in13bad;
    public TextField m2in13TF;
    public Text m2in14T;
    public CheckBox m2in14ok;
    public CheckBox m2in14bad;
    public TextField m2in14TF;
    public Text m2in0instructionsT;
    public Text m2in1instructionsT;
    public Text m2in2instructionsT;
    public Text m2in3instructionsT;
    public Text m2in4instructionsT;
    public Text m2in5instructionsT;
    public Text m2in6instructionsT;
    public Text m2in7instructionsT;
    public Text m2in8instructionsT;
    public Text m2in9instructionsT;
    public Text m2in10instructionsT;
    public Text m2in13instructionsT;
    public CheckBox m2in15ok;
    public CheckBox m2in15bad;
    public TextField m2in15TF;
    public Text m2in15T;
    public Text m2in11instructionsT;
    public Text m2in12instructionsT;
    public Text m2in14instructionsT;
    public Text m2in15instructionsT;
    public Text m1in0T;
    public Text m1in1T;
    public Text m1in2T;
    public Text m1in3T;
    public CheckBox m1in0ok;
    public CheckBox m1in0InUse;
    public TextField m1in0TF;
    public CheckBox m1in1ok;
    public CheckBox m1in1InUse;
    public TextField m1in1TF;
    public CheckBox m1in2ok;
    public CheckBox m1in2bad;
    public TextField m1in2TF;
    public CheckBox m1in3ok;
    public CheckBox m1in3bad;
    public TextField m1in3TF;
    public Text m1in4T;
    public CheckBox m1in4ok;
    public CheckBox m1in4bad;
    public TextField m1in4TF;
    public Text m1in5T;
    public CheckBox m1in5ok;
    public CheckBox m1in5bad;
    public TextField m1in5TF;
    public Text m1in6T;
    public CheckBox m1in6ok;
    public CheckBox m1in6bad;
    public TextField m1in6TF;
    public Text m1in7T;
    public CheckBox m1in7ok;
    public CheckBox m1in7bad;
    public TextField m1in7TF;
    public Text m1in8T;
    public CheckBox m1in8ok;
    public CheckBox m1in8bad;
    public TextField m1in8TF;
    public Text m1in9T;
    public CheckBox m1in9ok;
    public CheckBox m1in9bad;
    public TextField m1in9TF;
    public Text m1in10T;
    public CheckBox m1in10ok;
    public CheckBox m1in10bad;
    public TextField m1in10TF;
    public Text m1in11T;
    public CheckBox m1in11ok;
    public CheckBox m1in11bad;
    public TextField m1in11TF;
    public Text m1in12T;
    public CheckBox m1in12ok;
    public CheckBox m1in12bad;
    public TextField m1in12TF;
    public Text m1in13T;
    public CheckBox m1in13ok;
    public CheckBox m1in13bad;
    public TextField m1in13TF;
    public Text m1in14T;
    public CheckBox m1in14ok;
    public CheckBox m1in14bad;
    public TextField m1in14TF;
    public CheckBox m1in15ok;
    public CheckBox m1in15bad;
    public TextField m1in15TF;
    public Text m1in15T;
    public Text m1in0InstructionT;
    public Text m1in1instructionT;
    public Text m1in2instructionT;
    public Text m1in3instructionT;
    public Text m1in4instructionT;
    public Text m1in5instructionsT;
    public Text m1in6instructionsT;
    public Text m1in7instructionsT;
    public Text m1in8instructionsT;
    public Text m1in9instructionsT;
    public Text m1in10instructionsT;
    public Text m1in11instructionsT;
    public Text m1in12instructionsT;
    public Text m1in13instructionsT;
    public Text m1in14instructionsT;
    public Text m1in15instructionsT;
    public Button saveBtn;

    public int stationNum;
    public int pumpCount;

    public String dateString;

    public File file;

    public FileWriter fw;

    public PlcInspectionController(){

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

            pump3Label.setVisible(false);
        }
        populate();

    }

    void populate(){
        PlcModuleOneInput moduleOneInput = new PlcModuleOneInputDao().retrieve(stationNum);
        setLabel(m1in0InUse, m1in0T, m1in0InstructionT, moduleOneInput.getInUse0(), moduleOneInput.getLabel0(), moduleOneInput.getInstructions0());
        setLabel(m1in1InUse, m1in1T, m1in1instructionT, moduleOneInput.getInUse1(), moduleOneInput.getLabel1(), moduleOneInput.getInstructions1());
        setLabel(m1in2bad, m1in2T, m1in2instructionT, moduleOneInput.getInUse2(), moduleOneInput.getLabel2(), moduleOneInput.getInstructions2());
        setLabel(m1in3bad, m1in3T, m1in3instructionT, moduleOneInput.getInUse3(), moduleOneInput.getLabel3(), moduleOneInput.getInstructions3());
        setLabel(m1in4bad, m1in4T, m1in4instructionT, moduleOneInput.getInUse4(), moduleOneInput.getLabel4(), moduleOneInput.getInstructions4());

    }

    void setLabel(CheckBox cb, Text labelText, Text instructionText, boolean bool, String label, String instructions){
        if (bool) {
            cb.setSelected(true);
            if (Objects.nonNull(label)) labelText.setText(label.strip());
            if (Objects.nonNull(instructions)) instructionText.setText(instructions);

        }
        else {
            labelText.setText("Spare");
            instructionText.setText("");
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

        fw.write("Module 1 Inputs----------------------------------------------------------------------------------\n\n");
        writeCheckBoxes(m1in0ok, m1in0InUse, m1in0TF, 0, m1in0T.getText());
        writeCheckBoxes(m1in1ok, m1in1InUse, m1in1TF, 1, m1in1T.getText());
        writeCheckBoxes(m1in2ok, m1in2bad, m1in2TF,2, m1in2T.getText());
        writeCheckBoxes(m1in3ok, m1in3bad, m1in3TF,3, m1in3T.getText());
        writeCheckBoxes(m1in4ok, m1in4bad, m1in4TF,4, m1in4T.getText());
        writeCheckBoxes(m1in5ok, m1in5bad, m1in5TF,5, m1in5T.getText());

        writeCheckBoxes(m1in6ok, m1in6bad, m1in6TF,6, m1in6T.getText());
        writeCheckBoxes(m1in7ok, m1in7bad, m1in7TF,7, m1in7T.getText());
        writeCheckBoxes(m1in8ok, m1in8bad, m1in8TF,8, m1in8T.getText());
        writeCheckBoxes(m1in9ok, m1in9bad, m1in9TF,9, m1in9T.getText());
        writeCheckBoxes(m1in10ok, m1in10bad, m1in10TF,10, m1in10T.getText());
        writeCheckBoxes(m1in11ok, m1in11bad, m1in11TF,11, m1in11T.getText());

        writeCheckBoxes(m1in12ok, m1in12bad, m1in12TF,12, m1in12T.getText());
        writeCheckBoxes(m1in13ok, m1in13bad, m1in13TF,13, m1in13T.getText());
        writeCheckBoxes(m1in14ok, m1in14bad, m1in14TF,14, m1in14T.getText());
        writeCheckBoxes(m1in15ok, m1in15bad, m1in14TF,15, m1in15T.getText());

        fw.write("Module 2 Inputs----------------------------------------------------------------------------------\n\n");
        writeCheckBoxes(m2in0ok, m2in0bad, m2in0TF, 0, m2in0T.getText());
        writeCheckBoxes(m2in1ok, m2in1bad, m2in1TF, 1, m2in1T.getText());
        writeCheckBoxes(m2in2ok, m2in2bad, m2in2TF,2, m2in2T.getText());
        writeCheckBoxes(m2in3ok, m2in3bad, m2in3TF,3, m2in3T.getText());
        writeCheckBoxes(m2in4ok, m2in4bad, m2in4TF,4, m2in4T.getText());
        writeCheckBoxes(m2in5ok, m2in5bad, m2in5TF,5, m2in5T.getText());

        writeCheckBoxes(m2in6ok, m2in6bad, m2in6TF,6, m2in6T.getText());
        writeCheckBoxes(m2in7ok, m2in7bad, m2in7TF,7, m2in7T.getText());
        writeCheckBoxes(m2in8ok, m2in8bad, m2in8TF,8, m2in8T.getText());
        writeCheckBoxes(m2in9ok, m2in9bad, m2in9TF,9, m2in9T.getText());
        writeCheckBoxes(m2in10ok, m2in10bad, m2in10TF,10, m2in10T.getText());
        writeCheckBoxes(m2in11ok, m2in11bad, m2in11TF,11, m2in11T.getText());

        writeCheckBoxes(m2in12ok, m2in12bad, m2in12TF,12, m2in12T.getText());
        writeCheckBoxes(m2in13ok, m2in13bad, m2in13TF,13, m2in13T.getText());
        writeCheckBoxes(m2in14ok, m2in14bad, m2in14TF,14, m2in14T.getText());
        writeCheckBoxes(m2in15ok, m2in15bad, m2in14TF,15, m2in15T.getText());

        fw.write("Notes-------------------------------------------------------------------------------------------\n\n");
        fw.write(notes.getText());

        fw.close();
        saveBtn.getScene().getWindow().hide();
    }

    void writeCheckBoxes(CheckBox cbOk, CheckBox cbBad, TextField tf, int diNum, String name) throws IOException {
        if (cbOk.isSelected()) fw.write("\u2705   In:"+ diNum + " " + name + "\n\n");
        else if (cbBad.isSelected()) fw.write("\u274C   In:" + diNum + " " + name + ".\n        \u2705   DI " + tf.getText() + " " + name + ".\n\n");
        else if (!cbOk.isSelected() && !cbBad.isSelected()) fw.write("\u274C   In:" + diNum + " " + name + " not used\n\n");
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
