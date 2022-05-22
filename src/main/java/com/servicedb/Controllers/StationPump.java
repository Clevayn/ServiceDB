package com.servicedb.Controllers;

import com.servicedb.Entities.PumpStationsE;
import com.servicedb.Entities.PumpsE;
import com.servicedb.HibernateUtil;
import com.servicedb.OpenPDF;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.text.Text;

import java.util.Objects;

public class StationPump{
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
    PumpsE pump;

    public StationPump(){
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

    public void initData(PumpStationsE ps, int pumpNum) throws Exception {
        this.pump = new HibernateUtil().getPumpByLocation(locationString(ps.getStationNum(), pumpNum));

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

    public PumpsE getPump() {
        return pump;
    }
}
