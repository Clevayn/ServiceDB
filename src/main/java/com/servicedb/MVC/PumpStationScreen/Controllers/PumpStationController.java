package com.servicedb.MVC.PumpStationScreen.Controllers;

import com.servicedb.MVC.PumpStationScreen.Dao.PumpDao;
import com.servicedb.MVC.PumpStationScreen.Dao.PumpStationDao;
import com.servicedb.MVC.Entities.AC;

import com.servicedb.MVC.Entities.*;

import com.servicedb.MVC.PumpStationScreen.Dao.SpillLevelDao;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.io.IOException;
import java.util.Objects;

public class PumpStationController {
    //private final HibernateUtil hu = new HibernateUtil();
    public ListView<PumpStation> psList;
    public Text oitText;
    public Button rtuBatteryBtn;
    public Button pBatteryBtn;
    public Button groundWaterBtn;
    public Button chlorineBtn;
    public Button rainGaugeBtn;
    public Button spillBtn;
    public Button acBtn;
    public Text zoneText;
    public TextField meterNumTF;
    public TextField dischargeTF;
    public TextField stationBTF;
    public TextField stationATF;
    public TextField zoneTF;
    public TextField oitTF;
    public TextField startUpTF;
    public TextField designCondTF;
    public TextField gpdTF;
    public Button editBtn;
    public Button updateBtn;
    public Button cancelBtn;
    public Text panelBatT;
    public Text rtuBatT;
    public TextField panelBatTF;
    public TextField rtuBatTF;
    public Button flowBtn;
    public Button distributionPresBtn;
    public Button wellBtn;
    public Button inspectionBtn;
    public Button dischargePresBtn;
    public TextField genSizeTF;
    public TextField voltageTF;
    public TextField phaseTF;
    public TextField highLegTF;
    public TextField nameTF;
    public TextField addressTF;
    public Button picsBtn;
    PumpStation ps;
    public Text psNumText;
    public Text nameText;
    public Text voltText;
    public Text phaseText;
    public Text mNumText;
    public Text hlText;
    public Text addressText;
    public Text startUpText;
    public Text designText;
    public Text gpdText;
    public Text dischargeText;
    public Text stationbText;
    public Text stationaText;
    public ImageView mapImage;
    public ImageView staitonImage;
    public Button pumpTwoButton;
    public Button pumpOneButton;
    public Button pumpThreeButton;
    public Text genText;
    public Button oitBtn;
    public Button levelPriBtn;
    public Button levelSecBtn;
    public Button p1ContBtn;
    public Button p2ContBtn;
    public Button p3ContBtn;
    public Button elecBtn;
    public Label elecComLabel;
    public AC ac;






    private int psNum;
    public StationPower stationPower;
    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MPW");
    final EntityManager em = entityManagerFactory.createEntityManager();

    public PumpStationController() throws Exception {
    }
    public void initialize() throws Exception {
        psList.setItems(new PumpStationDao().getObservableList());
        stationListCreator();
        populate();

    }
    void stationListCreator() {
        psList.setCellFactory(p -> new ListCell<>() {
            @Override
            public void updateItem(PumpStation item, boolean empty) {
                super.updateItem(item, empty);
                if (item != null && !empty) {
                    this.setText(item.getStationNum() + ". " + item.getName().strip() + "\n" +
                            item.getLocationAddress() + "\n" +
                            item.getMeterNum());
                } else {
                    setText(null);
                    setGraphic(null);
                }
            }
        });
    }
    @FXML
    void stationPresenter() throws IOException {
        ps = psList.getFocusModel().getFocusedItem();
        cancel();
        populate();
    }
    void populate() throws IOException {
        if (Objects.isNull(ps)) ps = psList.getItems().get(0);
        psNum = ps.getStationNum();
        psNumText.setText((Integer.toString(this.ps.getStationNum())));
        if (Objects.nonNull(ps.getName())) nameText.setText(ps.getName());
        else nameText.setText("");
        if (Objects.nonNull(ps.getGeneratorSize())) genText.setText(Integer.toString(ps.getGeneratorSize()));
        else genText.setText("");
        if (Objects.nonNull(ps.getVoltage())) voltText.setText(Integer.toString(ps.getVoltage()));
        else voltText.setText("");
        if (Objects.nonNull(ps.getPhase())) phaseText.setText(Integer.toString(ps.getPhase()));
        else phaseText.setText("");
        if (Objects.nonNull(ps.getMeterNum())) mNumText.setText(Integer.toString(ps.getMeterNum()));
        else mNumText.setText("");
        if (Objects.nonNull(ps.getHighLeg())) hlText.setText(Boolean.toString(ps.getHighLeg()));
        else hlText.setText("");
        if (Objects.nonNull(ps.getLocationAddress())) addressText.setText(ps.getLocationAddress());
        else addressText.setText("");
        if (Objects.nonNull(ps.getStartUpCondition())) startUpText.setText(ps.getStartUpCondition());
        else startUpText.setText("");
        if (Objects.nonNull(ps.getDesignCondition())) designText.setText(ps.getDesignCondition());
        else designText.setText("");
        if (Objects.nonNull(ps.getGpd())) gpdText.setText(Long.toString(ps.getGpd()));
        else gpdText.setText("");
        if (Objects.nonNull(ps.getDischargeSize())) dischargeText.setText(Long.toString(ps.getDischargeSize()));
        else dischargeText.setText("");
        if (Objects.nonNull(ps.getOit())) {
            if (ps.getOit() == 1)
                oitText.setText("Advantech");
            if (ps.getOit() == 2)
                oitText.setText("Maple");
        } else {
            oitText.setText("");
        }
        if (Objects.nonNull(ps.getZone())) zoneText.setText(Integer.toString(ps.getZone()));
        else zoneText.setText("");
        if (Objects.nonNull(ps.getStationBefore())) stationbText.setText(Integer.toString(ps.getStationBefore()));
        else stationbText.setText("");
        if (Objects.nonNull(ps.getStationAfter())) stationaText.setText(Integer.toString(ps.getStationAfter()));
        else stationaText.setText("");
        if (Objects.nonNull(ps.getRtuBat())) rtuBatT.setText(ps.getRtuBat());
        else rtuBatT.setText("");
        if (Objects.nonNull(ps.getPanelBat())) panelBatT.setText(ps.getPanelBat());
        else panelBatT.setText("");
        pumpThreeButton.setVisible(ps.getPumpCount() == 3);
        levelPriBtn.setVisible(Objects.nonNull(ps.getLevelIndicatorPrimary()));
        levelSecBtn.setVisible(Objects.nonNull(ps.getLevelIndicatorSecondary()));
        p1ContBtn.setVisible(Objects.nonNull(ps.getPumpController1()));
        p2ContBtn.setVisible(Objects.nonNull(ps.getPumpController2()));
        p3ContBtn.setVisible(Objects.nonNull(ps.getPumpController3()));
        if (ps.getBerkelyElectric()) elecComLabel.setText("Berkeley Electric");
        else elecComLabel.setText("Dominion");
        ac = em.find(AC.class, ps.getStationNum());
        acBtn.setVisible(Objects.nonNull(ac));


    }

    @FXML
    void openStationPower() throws Exception {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                PumpStationController.class.getResource("/com/servicedb/station-power-screen.fxml")));
        Stage stage = new Stage();
        stage.setTitle("Station Power");
        stage.setScene(loader.load());

        StationPowerController controller = loader.getController();
        controller.initData(this.ps.getStationNum());
        stage.show();
    }
    @FXML
    void openSpillScreen() throws Exception {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                PumpStationController.class.getResource("/com/servicedb/spill-screen.fxml")));
        Stage stage = new Stage();
        stage.setTitle("Spill");
        stage.setScene(loader.load());

        SpillLevelController controller = loader.getController();
        controller.initData(new SpillLevelDao().retrieve(ps.getStationNum()));

        stage.show();
    }
    @FXML
    void openPictureScreen() throws Exception {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                PumpStationController.class.getResource("/com/servicedb/images_screen.fxml")));
        Stage stage = new Stage();
        stage.setTitle("Station Pictures");
        stage.setScene(loader.load());

        PictureContoller controller = loader.getController();
        controller.initData(1);

        stage.show();
    }
    String locationString(int i, int pumpNum){
        String s;
        if (i < 10) s = "00" + i;
        else if(i > 10 && i < 100) s = "0" + i;
        else s = String.valueOf(i);
        return "WWCPS" + s + "P" + pumpNum;
    }
    @FXML
    void pumpWindow() throws Exception {
        int pumpPosition = 0;
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                PumpStationController.class.getResource("/com/servicedb/stationPump.fxml")));
        Stage stage = new Stage();
        stage.setTitle("Pump");
        stage.setScene(loader.load());

        if (pumpOneButton.isFocused()) pumpPosition = 1;
        else if (pumpTwoButton.isFocused()) pumpPosition = 2;
        else if (pumpThreeButton.isFocused()) pumpPosition = 3;

        PumpController controller = loader.getController();
        controller.initData(new PumpDao().retrieve(locationString(ps.getStationNum(), pumpPosition)));

        stage.show();
    }
    @FXML
    void electricalScreen() throws Exception{
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                PumpStationController.class.getResource("/com/servicedb/electrical-screen.fxml")));
        Stage stage = new Stage();
        stage.setTitle("Electrical");
        stage.setScene(loader.load());

        ElectricalController controller = loader.getController();
        controller.initData(ps);

        stage.show();
    }
    @FXML
    void inspectionScreen() throws IOException {
        Stage stage = new Stage();
        if(ps.getPlc()){
            FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                    PumpStationController.class.getResource("/com/servicedb/ps_inspection_plc.fxml")));
            stage.setTitle("PS Inspection");
            stage.setScene(loader.load());

            PlcInspectionController controller = loader.getController();
            controller.initDate(ps.getStationNum(), ps.getPumpCount());
        }
        else {
            FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                    PumpStationController.class.getResource("/com/servicedb/ps_inspection.fxml")));
            stage.setTitle("PS Inspection");
            stage.setScene(loader.load());

            RtuInspectionController controller = loader.getController();
            controller.initDate(ps.getStationNum(), ps.getPumpCount());
        }
        stage.show();
    }
    @FXML
    void acScreen() throws IOException {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                PumpStationController.class.getResource("/com/servicedb/ac.fxml")));
        Stage stage = new Stage();
        stage.setTitle("AC");
        stage.setScene(loader.load());

        AcController controller = loader.getController();
        controller.initData(this.ps.getStationNum());
        controller.populate();

        stage.show();
    }
    @FXML
    void update() throws Exception {
        em.find(PumpStation.class, this.ps.getStationNum() + 1092);
        em.getTransaction().begin();
        if (checkForUpdate(dischargeText, dischargeTF))
            this.ps.setDischargeSize(Long.parseLong(dischargeTF.getText()));
        if (checkForUpdate(stationaText, stationATF))
            this.ps.setStationAfter(Integer.parseInt(stationATF.getText()));
        if (checkForUpdate(stationbText, stationBTF))
            this.ps.setStationBefore(Integer.parseInt(stationBTF.getText()));
        if (checkForUpdate(zoneText, zoneTF))
            this.ps.setZone(Integer.parseInt(zoneTF.getText()));
        if (checkForUpdate(oitText, oitTF)) this.ps.setOit(Integer.parseInt(oitTF.getText()));
        if (checkForUpdate(startUpText, startUpTF)) this.ps.setStartUpCondition(startUpTF.getText());
        if (checkForUpdate(designText, designCondTF)) this.ps.setDesignCondition(designCondTF.getText());
        if (checkForUpdate(mNumText, meterNumTF)) this.ps.setMeterNum(Integer.parseInt(meterNumTF.getText()));
        if (checkForUpdate(panelBatT, panelBatTF)) this.ps.setPanelBat(panelBatTF.getText());
        if (checkForUpdate(rtuBatT, rtuBatTF)) this.ps.setRtuBat(rtuBatTF.getText());
        if (checkForUpdate(nameText, nameTF)) this.ps.setName(nameTF.getText());
        if (checkForUpdate(voltText, voltageTF)) this.ps.setVoltage(Integer.parseInt(voltageTF.getText()));
        if (checkForUpdate(phaseText, phaseTF)) this.ps.setPhase(Integer.parseInt(phaseTF.getText()));
        if (checkForUpdate(genText, genSizeTF)) this.ps.setGeneratorSize(Integer.parseInt(genSizeTF.getText()));
        if (checkForUpdate(hlText, highLegTF)) this.ps.setHighLeg(Boolean.getBoolean(highLegTF.getText().toLowerCase()));
        if (checkForUpdate(gpdText, gpdTF)) this.ps.setGpd(Long.parseLong(gpdText.getText()));
        em.merge(this.ps);
        em.getTransaction().commit();
        updateBtn.setVisible(false);
        cancelBtn.setVisible(false);
        initialize();
        cancel();
        populate();
    }
    @FXML
    void edit(){
        updateBtn.setVisible(true);
        cancelBtn.setVisible(true);
        setToEdit(dischargeText, dischargeTF);
        setToEdit(stationbText, stationBTF);
        setToEdit(stationaText, stationATF);
        setToEdit(zoneText, zoneTF);
        setToEdit(oitText, oitTF);
        setToEdit(startUpText, startUpTF);
        setToEdit(designText, designCondTF);
        setToEdit(mNumText, meterNumTF);
        setToEdit(panelBatT, panelBatTF);
        setToEdit(rtuBatT, rtuBatTF);
        setToEdit(nameText, nameTF);
        setToEdit(genText, genSizeTF);
        setToEdit(hlText, highLegTF);
        setToEdit(voltText, voltageTF);
        setToEdit(phaseText, phaseTF);
        setToEdit(gpdText, gpdTF);
        setToEdit(addressText, addressTF);

    }
    @FXML
    void cancel(){
        cancelBtn.setVisible(false);
        updateBtn.setVisible(false);
        setToDisplay(dischargeText, dischargeTF);
        setToDisplay(stationbText, stationBTF);
        setToDisplay(stationaText, stationATF);
        setToDisplay(zoneText, zoneTF);
        setToDisplay(oitText, oitTF);
        setToDisplay(startUpText, startUpTF);
        setToDisplay(designText, designCondTF);
        setToDisplay(mNumText, meterNumTF);
        setToDisplay(panelBatT, panelBatTF);
        setToDisplay(rtuBatT, rtuBatTF);
        setToDisplay(nameText, nameTF);
        setToDisplay(genText, genSizeTF);
        setToDisplay(hlText, highLegTF);
        setToDisplay(voltText, voltageTF);
        setToDisplay(phaseText, phaseTF);
        setToDisplay(gpdText, gpdTF);
        setToDisplay(addressText, addressTF);
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
