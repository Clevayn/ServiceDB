package com.servicedb.Controllers;

import com.servicedb.Entities.SpillLevel;
import com.servicedb.HibernateUtil;
import javafx.scene.text.Text;

import java.util.Objects;

public class SpillScreen {

    public int stationNum;
    public SpillLevel spillLevel;
    public Text locationT;
    public Text assetT;
    public Text spillT;
    public Text timeT;

    public SpillScreen(){

    }

    void initialize(){
    }

    public void initData(int stationNum) throws Exception {
        this.stationNum = stationNum;
        this.spillLevel = new HibernateUtil().getSpillLevel(stationNum);
        populate();
    }

    void populate(){
        if (Objects.nonNull(this.spillLevel.getLocationString()))locationT.setText(this.spillLevel.getLocationString());
        else locationT.setText("");
        if (Objects.nonNull(this.spillLevel.getMpwAsset()))assetT.setText(this.spillLevel.getMpwAsset());
        else assetT.setText("");
        if (Objects.nonNull(this.spillLevel.getSpillLevel()))spillT.setText(this.spillLevel.getSpillLevel());
        else spillT.setText("");
        if (Objects.nonNull(this.spillLevel.getTimeOff()))timeT.setText(this.spillLevel.getTimeOff());
        else timeT.setText("");
    }

}
