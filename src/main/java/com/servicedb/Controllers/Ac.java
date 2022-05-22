package com.servicedb.Controllers;

import com.servicedb.Entities.AcE;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.text.SimpleDateFormat;
import java.util.Objects;

public class Ac {

    public Text brandT;
    public Text modelT;
    public Text serialT;
    public Text voltageT;
    public Text btuT;
    public Text refrigT;
    public Text filterT;
    public TextField filterTF;
    public Text installT;
    public Button updateBtn;
    public Button cancelBtn;
    public Button editBtn;
    public TextField installTF;
    public TextField refrigTF;
    public TextField voltageTF;
    public TextField btuTF;
    public TextField serialTF;
    public TextField modelTF;
    public TextField brandTF;

    public Ac(){

    }

    void initialize(){

        filterTF.setVisible(false);
    }


    void initData(AcE ac){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");

        if (Objects.nonNull(ac.getBrand())) brandT.setText(ac.getBrand());
        else brandT.setText("");
        if (Objects.nonNull(ac.getSerial())) serialT.setText(ac.getSerial());
        else serialT.setText("");
        if (Objects.nonNull(ac.getModel())) modelT.setText(ac.getModel());
        else modelT.setText("");
        if (Objects.nonNull(ac.getVoltage())) voltageT.setText(ac.getVoltage());
        else voltageT.setText("");
        if (Objects.nonNull(ac.getBtu())) btuT.setText(Integer.toString(ac.getBtu()));
        else btuT.setText("");
        if (Objects.nonNull(ac.getRefrigerant())) refrigT.setText(ac.getRefrigerant());
        else refrigT.setText("");
        if (Objects.nonNull(ac.getInstallationDate())) installT.setText(dateFormat.format(ac.getInstallationDate()));
        else installT.setText("");
        if (Objects.nonNull(ac.getFilterSize())) filterT.setText(ac.getFilterSize());
        else filterT.setText("");

    }

    @FXML
    void edit(){
        brandT.setVisible(false);
        brandTF.setVisible(true);
        brandTF.setText(brandT.getText());

    }

}
