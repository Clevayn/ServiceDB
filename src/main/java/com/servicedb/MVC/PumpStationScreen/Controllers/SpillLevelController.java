package com.servicedb.MVC.PumpStationScreen.Controllers;

import com.servicedb.MVC.Entities.SpillLevel;
import javafx.scene.text.Text;

import java.util.Objects;

public class SpillLevelController {

    public int stationNum;
    public SpillLevel spillLevel;
    public Text locationT;
    public Text assetT;
    public Text spillT;
    public Text timeT;

    public SpillLevelController(){

    }

    void initialize(){
    }

    public void initData(SpillLevel spillLevel) {
        this.spillLevel = spillLevel;
        populate();
    }

    void populate(){
        if (Objects.nonNull(spillLevel.getLocationString()))locationT.setText(spillLevel.getLocationString());
        else locationT.setText("");
        if (Objects.nonNull(spillLevel.getMpwAsset()))assetT.setText(spillLevel.getMpwAsset());
        else assetT.setText("");
        if (Objects.nonNull(spillLevel.getSpillLevel()))spillT.setText(spillLevel.getSpillLevel());
        else spillT.setText("");
        if (Objects.nonNull(spillLevel.getTimeOff()))timeT.setText(spillLevel.getTimeOff());
        else timeT.setText("");
    }

}
