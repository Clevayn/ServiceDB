package com.servicedb.Controllers;

import com.servicedb.Entities.PumpStationsE;
import javafx.scene.text.Text;

import java.util.Objects;

public class ElectricalScreen {
    public Text atsText;
    public Text mtsText;
    public Text coilText;
    public Text contactText;
    public Text ControlPowerText;
    public Text fuseText;
    public Text mbText;
    public Text embText;
    public Text pbText;
    public Text starterText;
    public Text nemaText;
    public Text phasemText;
    public Text overloadText;

    public ElectricalScreen(){}

    void initialize(){}

    void initData(PumpStationsE ps){
        if (Objects.nonNull(ps.getCoil())) coilText.setText(ps.getCoil());
        else coilText.setText("");
        if (Objects.nonNull(ps.getAts()))  atsText.setText(ps.getAts().toString());
        else atsText.setText("");
        if (Objects.nonNull(ps.getMts())) mtsText.setText(ps.getMts());
        else mtsText.setText("");
        if (Objects.nonNull(ps.getContactKit())) contactText.setText(ps.getContactKit());
        else contactText.setText("");
        if (Objects.nonNull(ps.getControlPower())) ControlPowerText.setText(ps.getControlPower());
        else ControlPowerText.setText("");
        if (Objects.nonNull(ps.getFuses())) fuseText.setText(ps.getFuses());
        else fuseText.setText("");
        if (Objects.nonNull(ps.getMainBreaker())) mbText.setText(ps.getMainBreaker());
        mbText.setText("");
        if (Objects.nonNull(ps.getPumpBreaker())) pbText.setText(ps.getPumpBreaker());
        else pbText.setText("");
        if (Objects.nonNull(ps.getEmergencyBreaker())) embText.setText(ps.getEmergencyBreaker());
        embText.setText("");
        if (Objects.nonNull(ps.getStarter())) starterText.setText(ps.getStarter());
        else starterText.setText("");
        if (Objects.nonNull(ps.getNema())) nemaText.setText(ps.getNema().toString());
        else nemaText.setText("");
        if (Objects.nonNull(ps.getPhaseMonitor())) phasemText.setText(ps.getPhaseMonitor());
        else phasemText.setText("");
        if (Objects.nonNull(ps.getOverload())) overloadText.setText(ps.getOverload());
        else overloadText.setText("");


    }
}
