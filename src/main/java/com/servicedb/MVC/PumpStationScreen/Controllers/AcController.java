package com.servicedb.MVC.PumpStationScreen.Controllers;

import com.servicedb.MVC.Entities.AC;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.text.SimpleDateFormat;
import java.util.Objects;

public class AcController {

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
    public AC ac;

    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MPW");
    final EntityManager em = entityManagerFactory.createEntityManager();
    public AcController(){

    }

    void initialize(){

    }

    void initData(int psNum){
        this.ac = em.find(AC.class, psNum);
    }

    void populate(){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        setToDisplay(brandT, brandTF);
        setToDisplay(modelT, modelTF);
        setToDisplay(serialT, serialTF);
        setToDisplay(voltageT, voltageTF);
        setToDisplay(btuT, btuTF);
        setToDisplay(refrigT, refrigTF);
        setToDisplay(installT, installTF);
        setToDisplay(filterT, filterTF);

        if (Objects.nonNull(this.ac.getBrand())) brandT.setText(this.ac.getBrand());
        else brandT.setText("");
        if (Objects.nonNull(this.ac.getSerial())) serialT.setText(this.ac.getSerial());
        else serialT.setText("");
        if (Objects.nonNull(this.ac.getModel())) modelT.setText(this.ac.getModel());
        else modelT.setText("");
        if (Objects.nonNull(this.ac.getVoltage())) voltageT.setText(this.ac.getVoltage());
        else voltageT.setText("");
        if (Objects.nonNull(this.ac.getBtu())) btuT.setText(Integer.toString(this.ac.getBtu()));
        else btuT.setText("");
        if (Objects.nonNull(this.ac.getRefrigerant())) refrigT.setText(this.ac.getRefrigerant());
        else refrigT.setText("");
        if (Objects.nonNull(this.ac.getInstallationDate())) installT.setText(dateFormat.format(this.ac.getInstallationDate()));
        else installT.setText("");
        if (Objects.nonNull(this.ac.getFilterSize())) filterT.setText(this.ac.getFilterSize());
        else filterT.setText("");
    }

    @FXML
    void edit(){
        updateBtn.setVisible(true);
        setToEdit(brandT, brandTF);
        setToEdit(modelT, modelTF);
        setToEdit(serialT, serialTF);
        setToEdit(voltageT, voltageTF);
        setToEdit(btuT, btuTF);
        setToEdit(refrigT, refrigTF);
        setToEdit(filterT, filterTF);
        setToEdit(installT, installTF);
    }

    @FXML
    void update() throws Exception {
        if (checkForUpdate(brandT, brandTF)) this.ac.setBrand(brandTF.getText());
        if (checkForUpdate(modelT, modelTF)) this.ac.setModel(modelTF.getText());
        if (checkForUpdate(serialT, serialTF)) this.ac.setSerial(serialTF.getText());
        if (checkForUpdate(voltageT, voltageTF)) this.ac.setVoltage(voltageTF.getText());
        if (checkForUpdate(btuT, btuTF)) this.ac.setBtu(Integer.parseInt(btuTF.getText()));
        if (checkForUpdate(refrigT, refrigTF)) this.ac.setRefrigerant(refrigTF.getText());
        if (checkForUpdate(installT, installTF)) this.ac.setInstallationDate(
                new SimpleDateFormat("dd MMMM yyyy").parse(installTF.getText()));
        if (checkForUpdate(filterT, filterTF)) this.ac.setFilterSize(filterTF.getText());
        //new UpdateEntity(this.ac);
        populate();
        updateBtn.setVisible(false);
    }

    private boolean checkForUpdate(Text text, TextField tf){
        return !text.getText().equals(tf.getText());
    }

    private void setToEdit(Text text, TextField tf) {
        text.setVisible(false);
        tf.setVisible(true);
        tf.setText(text.getText());
    }

    private void setToDisplay(Text text, TextField tf){
        text.setVisible(true);
        tf.setVisible(false);
    }



}
