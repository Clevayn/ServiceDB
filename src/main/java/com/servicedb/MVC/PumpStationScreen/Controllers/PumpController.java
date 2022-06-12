package com.servicedb.MVC.PumpStationScreen.Controllers;

import com.servicedb.MVC.Entities.PumpStation;
import com.servicedb.MVC.Entities.Pump;
import com.servicedb.HibernateUtil;

import com.servicedb.OpenPDF;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.util.Objects;

public class PumpController {
    public Text brandText;
    public Text serialText;
    public Hyperlink modelHText;
    public Text hpText;
    public Text voltageText;
    public Text phaseText;
    public Text rpmText;
    public Text headText;
    public Text impDiaText;
    public Text flaText;
    public Text voluteBoltText;
    public Text locationText;
    public Text mpwAssetText;
    public Text impBoltText;
    public Text designText;
    public Text startUpText;
    public Text typeText;
    public Text sizeText;
    public Text gpmText;
    public Button editBtn;
    public Button updateBtn;
    public Button cancelBtn;
    public TextField locationTF;
    public TextField brandTF;
    public TextField modelTF;
    public TextField serialTF;
    public TextField hpTF;
    public TextField voltageTF;
    public TextField flaTF;
    public TextField phaseTF;
    public TextField rpmTF;
    public TextField headTF;
    public TextField gpmTF;
    public TextField impDiaTF;
    public TextField voluteTF;
    public TextField impBoltTF;
    public TextField pumpTypeTF;
    public TextField pumpSizeTF;
    public TextField designCondTF;
    public TextField startUpTF;
    public TextField mpwAssetTF;
    public TextField fla480TF;
    public TextField fla240TF;
    private Pump pump;

    public PumpController(){

    }
    public void initialize() {

    }
    String locationString(int i, int pumpNum){
        String s;
        if (i < 10) s = "00" + i;
        else if(i > 10 && i < 100) s = "0" + i;
        else s = String.valueOf(i);
        return "WWCPS" + s + "P" + pumpNum;
    }

    public void initData(Pump pump) throws Exception {
        this.pump = pump;
        populate();
    }

    public void populate(){
        if (Objects.nonNull(pump.getLocation())) locationText.setText(pump.getLocation());
        if (Objects.nonNull(pump.getBrand())) brandText.setText(pump.getBrand());
        if (Objects.nonNull(pump.getModel())) modelHText.setText(pump.getModel().strip());
        if (Objects.nonNull(pump.getSerial())) serialText.setText(pump.getSerial());
        if (Objects.nonNull(pump.getHp())) hpText.setText(pump.getHp().toString());
        if (Objects.nonNull(pump.getVoltage())) voltageText.setText(pump.getVoltage());
        if (Objects.nonNull(pump.getRpm())) rpmText.setText(pump.getRpm().toString());
        if (Objects.nonNull(pump.getGpm())) gpmText.setText(pump.getGpm().toString());
        if (Objects.nonNull(pump.getHead())) headText.setText(pump.getHead().toString());
        if (Objects.nonNull(pump.getImpellerDiameter())) impDiaText.setText(pump.getImpellerDiameter().toString());
        if (Objects.nonNull(pump.getImpellerBoltSize())) impBoltText.setText(pump.getImpellerBoltSize().toString());
        if (Objects.nonNull(pump.getVoluteBoltSize())) voluteBoltText.setText(pump.getVoluteBoltSize().toString());
        if (Objects.nonNull(pump.getDesignCondition())) designText.setText(pump.getDesignCondition());
        if (Objects.nonNull(pump.getStartUpCondition())) startUpText.setText(pump.getStartUpCondition());
        if (Objects.nonNull(pump.getMpwAssetNum())) mpwAssetText.setText(pump.getMpwAssetNum());
        if (Objects.nonNull(pump.getPumpType())) typeText.setText(pump.getPumpType());
        if (Objects.nonNull(pump.getPumpSize())) sizeText.setText(pump.getPumpSize().toString());
        if (Objects.nonNull(pump.getPhase())) phaseText.setText(pump.getPhase().toString());
        if (Objects.nonNull(pump.getFla240()) && Objects.nonNull(pump.getFla480())) flaText.setText(pump.getFla240().toString() + " / " + pump.getFla480().toString());
        else if (Objects.nonNull(pump.getFla240())) flaText.setText(pump.getFla240().toString());
        else if (Objects.nonNull(pump.getFla480())) flaText.setText(pump.getFla480().toString());
        else flaText.setText("");
    }

    @FXML
    void openManual(){
        if (this.pump.getModel().contains("XFP"))
            new OpenPDF("src/main/resources/manuals/XFP 80 - 305.pdf");
    }

    @FXML
    void edit(){
        updateBtn.setVisible(true);
        cancelBtn.setVisible(true);
        setToEdit(brandText, brandTF);
        setToEdit(modelHText, modelTF);
        setToEdit(serialText, serialTF);
        setToEdit(hpText, hpTF);
        setToEdit(voltageText, voltageTF);
        setToEdit(rpmText, rpmTF);
        setToEdit(gpmText, gpmTF);
        setToEdit(headText, headTF);
        setToEdit(impBoltText, impBoltTF);
        setToEdit(locationText, locationTF);
        setToEdit(voluteBoltText, voluteTF);
        setToEdit(impDiaText, impDiaTF);
        setToEdit(designText, designCondTF);
        setToEdit(flaText, fla240TF);
        setToEdit(flaText, fla480TF);
        setToEdit(startUpText, startUpTF);
        setToEdit(sizeText, pumpSizeTF);
        setToEdit(typeText, pumpTypeTF);
        setToEdit(phaseText, phaseTF);
        setToEdit(mpwAssetText, mpwAssetTF);

    }
    @FXML
    void update() throws Exception {
        if(checkForUpdate(brandText, brandTF)) this.pump.setBrand(brandTF.getText());
        if(checkForUpdate(modelHText, modelTF)) this.pump.setModel(modelTF.getText());
        if(checkForUpdate(serialText, serialTF)) this.pump.setSerial(serialTF.getText());
        if(checkForUpdate(hpText, hpTF)) this.pump.setHp(Float.parseFloat(hpTF.getText()));
        if(checkForUpdate(voltageText, voltageTF)) this.pump.setVoltage(voltageTF.getText());
        if(checkForUpdate(rpmText, rpmTF)) this.pump.setRpm(Float.parseFloat(rpmTF.getText()));
        if(checkForUpdate(gpmText, gpmTF)) this.pump.setGpm(Float.parseFloat(gpmTF.getText()));
        if(checkForUpdate(headText, headTF)) this.pump.setHead(Float.parseFloat(headTF.getText()));
        if(checkForUpdate(impBoltText, impBoltTF)) this.pump.setImpellerBoltSize(Float.parseFloat(impBoltTF.getText()));
        if(checkForUpdate(locationText, locationTF)) this.pump.setLocation(locationTF.getText());
        if(checkForUpdate(voluteBoltText, voluteTF)) this.pump.setVoluteBoltSize(Float.parseFloat(voluteTF.getText()));
        if(checkForUpdate(impDiaText, impDiaTF)) this.pump.setImpellerDiameter(Float.parseFloat(impDiaTF.getText()));
        if(checkForUpdate(designText, designCondTF)) this.pump.setDesignCondition(designCondTF.getText());
        if(checkForUpdate(flaText, fla240TF)) this.pump.setFla240(Float.parseFloat(fla240TF.getText()));
        if(checkForUpdate(flaText, fla480TF)) this.pump.setFla480(Float.parseFloat(fla480TF.getText()));
        if(checkForUpdate(startUpText, startUpTF)) this.pump.setStartUpCondition(startUpTF.getText());
        if(checkForUpdate(sizeText, pumpSizeTF)) this.pump.setPumpSize(Float.parseFloat(pumpSizeTF.getText()));
        if(checkForUpdate(typeText, pumpTypeTF)) this.pump.setPumpType(pumpTypeTF.getText());
        if(checkForUpdate(phaseText, phaseTF)) this.pump.setPhase(Integer.parseInt(phaseTF.getText()));
        if(checkForUpdate(mpwAssetText, mpwAssetTF)) this.pump.setMpwAssetNum(mpwAssetTF.getText());
        //new Update(this.pump);
        updateBtn.setVisible(false);
        cancelBtn.setVisible(false);
        cancel();
        populate();
    }
    @FXML
    void cancel(){
        cancelBtn.setVisible(false);
        updateBtn.setVisible(false);
        setToDisplay(brandText, brandTF);
        setToDisplay(modelHText, modelTF);
        setToDisplay(serialText, serialTF);
        setToDisplay(hpText, hpTF);
        setToDisplay(voltageText, voltageTF);
        setToDisplay(rpmText, rpmTF);
        setToDisplay(gpmText, gpmTF);
        setToDisplay(headText, headTF);
        setToDisplay(impBoltText, impBoltTF);
        setToDisplay(locationText, locationTF);
        setToDisplay(voluteBoltText, voluteTF);
        setToDisplay(impDiaText, impDiaTF);
        setToDisplay(designText, designCondTF);
        setToDisplay(flaText, fla240TF);
        setToDisplay(flaText, fla480TF);
        setToDisplay(startUpText, startUpTF);
        setToDisplay(sizeText, pumpSizeTF);
        setToDisplay(typeText, pumpTypeTF);
        setToDisplay(phaseText, phaseTF);
        setToDisplay(mpwAssetText, mpwAssetTF);

    }
    private boolean checkForUpdate(Text text, TextField tf){
        return !text.getText().equals(tf.getText());
    }

    private boolean checkForUpdate(String s, TextField tf){
        return !s.equals(tf.getText());
    }
    private boolean checkForUpdate(Hyperlink s, TextField tf){
        return !s.toString().equals(tf.getText());
    }
    private void setToEdit(Text text, TextField tf) {
        text.setVisible(false);
        tf.setVisible(true);
        tf.setText(text.getText());
    }
    private void setToEdit(Hyperlink text, TextField tf) {
        text.setVisible(false);
        tf.setVisible(true);
        tf.setText(text.getText());
    }
    private void setToDisplay(Text text, TextField tf){
        text.setVisible(true);
        tf.setVisible(false);
    }
    private void setToDisplay(Hyperlink text, TextField tf){
        text.setVisible(true);
        tf.setVisible(false);
    }
}
