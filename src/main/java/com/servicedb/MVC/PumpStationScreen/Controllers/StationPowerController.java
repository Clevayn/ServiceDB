package com.servicedb.MVC.PumpStationScreen.Controllers;

import com.servicedb.MVC.Entities.StationPower;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Objects;

public class StationPowerController {

    public Text stationNumT;
    public Text mainBreakerBrandT;
    public Text mainBreakerModelT;
    public Text mainBreakerWIreSizeT;
    public Text emBreakerBrandT;
    public Text emBreakerModelT;
    public Text emBreakerWireSizeT;
    public Text nonFusedDCSizeT;
    public Text fusedDCSizeT;
    public Text fuseTypeT;
    public Text fuseSizeT;
    public Text surgeBrandT;
    public Text surgeModelT;
    public Text phaseBrandT;
    public Text phaseModelT;
    public Text emBreakerSizeT;
    public TextField stationNumTF;
    public TextField mainBreakerBrandTF;
    public TextField mainBreakerModelTF;
    public TextField mainBreakerSizeTF;
    public TextField mainBreakerWIreSizeTF;
    public TextField emBreakerBrandTF;
    public TextField emBreakerModelTF;
    public TextField emBreakerSizeTF;
    public TextField emBreakerWireSizeTF;
    public TextField nonFusedDCSizeTF;
    public TextField fusedDCSizeTF;
    public TextField fuseTypeTF;
    public TextField fuseSizeTF;
    public TextField surgeBrandTF;
    public TextField surgeModelTF;
    public TextField phaseBrandTF;
    public TextField phaseModelTF;
    public Button cancelBtn;
    public Button updateBtn;
    public Button editBtn;

    public StationPower stationPower;
    public Text mainBreakerSizeT;

    public Button saveBtn;
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MPW");
    final EntityManager em = entityManagerFactory.createEntityManager();

    public StationPowerController(){

    }

    void initData(int stationNum) {
        this.stationPower = em.find(StationPower.class, stationNum);
        if (Objects.nonNull(this.stationPower)) populate();
        else {
            this.stationPower = new StationPower();
            this.stationPower.setStationNum(stationNum);
            //new CreateEntity(this.stationPower);
            populate();
        }
    }

    void populate(){
       cancel();
        if (Objects.nonNull(this.stationPower.getStationNum())) stationNumT.setText(Integer.toString(this.stationPower.getStationNum()));
        else stationNumT.setText("");
        if (Objects.nonNull(this.stationPower.getMainBreakerBrand())) mainBreakerBrandT.setText(this.stationPower.getMainBreakerBrand());
        else mainBreakerBrandT.setText("");
        if (Objects.nonNull(this.stationPower.getMainBreakerModel())) mainBreakerModelT.setText(this.stationPower.getMainBreakerModel());
        else mainBreakerModelT.setText("");
        if (Objects.nonNull(this.stationPower.getMainBreakerWireSize())) mainBreakerSizeT.setText(this.stationPower.getMainBreakerSize());
        else mainBreakerSizeT.setText("");
        if (Objects.nonNull(this.stationPower.getMainBreakerWireSize())) mainBreakerWIreSizeT.setText(this.stationPower.getMainBreakerWireSize());
        else mainBreakerWIreSizeT.setText("");
        if (Objects.nonNull(this.stationPower.getEmBreakerBrand())) emBreakerBrandT.setText(this.stationPower.getEmBreakerBrand());
        else emBreakerBrandT.setText("");
        if (Objects.nonNull(this.stationPower.getEmBreakerModel())) emBreakerModelT.setText(this.stationPower.getEmBreakerModel());
        else emBreakerModelT.setText("");
        if (Objects.nonNull(this.stationPower.getEmBreakerSize())) emBreakerSizeT.setText(this.stationPower.getEmBreakerSize());
        else emBreakerSizeT.setText("");
        if (Objects.nonNull(this.stationPower.getEmBreakerWireSize())) emBreakerWireSizeT.setText(this.stationPower.getEmBreakerWireSize());
        else emBreakerWireSizeT.setText("");
        if (Objects.nonNull(this.stationPower.getNonFusedDisconnectSize())) nonFusedDCSizeT.setText(this.stationPower.getNonFusedDisconnectSize());
        else nonFusedDCSizeT.setText("");
        if (Objects.nonNull(this.stationPower.getFusedDisconnectSize())) fusedDCSizeT.setText(this.stationPower.getFusedDisconnectSize());
        else fusedDCSizeT.setText("");
        if (Objects.nonNull(this.stationPower.getFuseType())) fuseTypeT.setText(this.stationPower.getFuseType());
        else fuseTypeT.setText("");
        if (Objects.nonNull(this.stationPower.getFuseSize())) fuseSizeT.setText(this.stationPower.getFuseSize());
        else fuseSizeT.setText("");
        if (Objects.nonNull(this.stationPower.getSurgeSuppressorBrand())) surgeBrandT.setText(this.stationPower.getSurgeSuppressorBrand());
        else surgeBrandT.setText("");
        if (Objects.nonNull(this.stationPower.getSurgeSuppressorModel())) surgeModelT.setText(this.stationPower.getSurgeSuppressorModel());
        else surgeModelT.setText("");
        if (Objects.nonNull(this.stationPower.getPhaseMonitorBrand())) phaseBrandT.setText(this.stationPower.getPhaseMonitorBrand());
        else phaseBrandT.setText("");
        if (Objects.nonNull(this.stationPower.getPhaseMonitorModel())) phaseModelT.setText(this.stationPower.getPhaseMonitorModel());
        else phaseModelT.setText("");
    }

    @FXML
    void edit(){
        updateBtn.setVisible(true);
        setToEdit(mainBreakerBrandT, mainBreakerBrandTF);
        setToEdit(mainBreakerModelT, mainBreakerModelTF);
        setToEdit(mainBreakerSizeT, mainBreakerSizeTF);
        setToEdit(mainBreakerWIreSizeT, mainBreakerWIreSizeTF);
        setToEdit(emBreakerBrandT, emBreakerBrandTF);
        setToEdit(emBreakerModelT, emBreakerModelTF);
        setToEdit(emBreakerSizeT, emBreakerSizeTF);
        setToEdit(emBreakerWireSizeT, emBreakerWireSizeTF);
        setToEdit(fusedDCSizeT, fusedDCSizeTF);
        setToEdit(nonFusedDCSizeT, nonFusedDCSizeTF);
        setToEdit(fuseTypeT, fuseTypeTF);
        setToEdit(fuseSizeT, fuseSizeTF);
        setToEdit(surgeBrandT, surgeBrandTF);
        setToEdit(surgeModelT, surgeModelTF);
        setToEdit(phaseBrandT, phaseBrandTF);
        setToEdit(phaseModelT, phaseModelTF);
        setToEdit(stationNumT, stationNumTF);
    }

    @FXML
    void save(){

    }

    @FXML
    void update() {
        if (checkForUpdate(mainBreakerBrandTF)) this.stationPower.setMainBreakerBrand(mainBreakerBrandTF.getText());
        if (checkForUpdate(mainBreakerModelTF)) this.stationPower.setEmBreakerModel(mainBreakerModelTF.getText());
        if (checkForUpdate(mainBreakerSizeTF)) this.stationPower.setMainBreakerSize(mainBreakerSizeTF.getText());
        if (checkForUpdate(mainBreakerWIreSizeTF))
            this.stationPower.setMainBreakerWireSize(mainBreakerWIreSizeTF.getText());
        if (checkForUpdate(emBreakerBrandTF)) this.stationPower.setEmBreakerBrand(emBreakerBrandTF.getText());
        if (checkForUpdate(emBreakerModelTF)) this.stationPower.setEmBreakerModel(emBreakerModelTF.getText());
        if (checkForUpdate(emBreakerSizeTF)) this.stationPower.setEmBreakerSize(emBreakerSizeTF.getText());
        if (checkForUpdate(emBreakerWireSizeTF))
            this.stationPower.setEmBreakerWireSize(emBreakerWireSizeTF.getText());
        if (checkForUpdate(fusedDCSizeTF)) this.stationPower.setFusedDisconnectSize(fusedDCSizeTF.getText());
        if (checkForUpdate(nonFusedDCSizeTF))
            this.stationPower.setNonFusedDisconnectSize(nonFusedDCSizeTF.getText());
        if (checkForUpdate(fuseTypeTF)) this.stationPower.setFuseType(fuseTypeTF.getText());
        if (checkForUpdate(fuseSizeTF)) this.stationPower.setFuseSize(fuseSizeTF.getText());
        if (checkForUpdate(surgeBrandTF)) this.stationPower.setSurgeSuppressorBrand(surgeBrandTF.getText());
        if (checkForUpdate(surgeModelTF)) this.stationPower.setSurgeSuppressorModel(surgeModelTF.getText());
        if (checkForUpdate(phaseBrandTF)) this.stationPower.setPhaseMonitorBrand(phaseBrandTF.getText());
        if (checkForUpdate(phaseModelTF)) this.stationPower.setPhaseMonitorModel(phaseModelTF.getText());
        if (checkForUpdate(stationNumTF)) this.stationPower.setStationNum(Integer.parseInt(stationNumTF.getText()));
        //new UpdateEntity(this.stationPower);
        populate();
        updateBtn.setVisible(false);
    }

    private boolean checkForUpdate(TextField tf){
            return !tf.getPromptText().equals(tf.getText()) && !tf.getText().equals("");
    }

    private void setToEdit(Text text, TextField tf) {
        text.setVisible(false);
        tf.setVisible(true);
        tf.setPromptText(text.getText());
    }

    private void setToDisplay(Text text, TextField tf){
        text.setVisible(true);
        tf.setVisible(false);
    }
    @FXML
    void cancel(){
        cancelBtn.setVisible(false);
        updateBtn.setVisible(false);
        setToDisplay(mainBreakerBrandT, mainBreakerBrandTF);
        setToDisplay(mainBreakerModelT, mainBreakerModelTF);
        setToDisplay(mainBreakerSizeT, mainBreakerSizeTF);
        setToDisplay(mainBreakerWIreSizeT, mainBreakerWIreSizeTF);
        setToDisplay(emBreakerBrandT, emBreakerBrandTF);
        setToDisplay(emBreakerModelT, emBreakerModelTF);
        setToDisplay(emBreakerSizeT, emBreakerSizeTF);
        setToDisplay(emBreakerWireSizeT, emBreakerWireSizeTF);
        setToDisplay(fusedDCSizeT, fusedDCSizeTF);
        setToDisplay(nonFusedDCSizeT, nonFusedDCSizeTF);
        setToDisplay(fuseTypeT, fuseTypeTF);
        setToDisplay(fuseSizeT, fuseSizeTF);
        setToDisplay(surgeBrandT, surgeBrandTF);
        setToDisplay(surgeModelT, surgeModelTF);
        setToDisplay(phaseBrandT, phaseBrandTF);
        setToDisplay(phaseModelT, phaseModelTF);
        setToDisplay(stationNumT, stationNumTF);
    }

}
