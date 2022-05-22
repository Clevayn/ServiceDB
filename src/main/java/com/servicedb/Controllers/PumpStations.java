package com.servicedb.Controllers;

import com.servicedb.Entities.AcE;
import com.servicedb.Entities.PumpStationsE;
import com.servicedb.HibernateUtil;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

public class PumpStations {
    private final HibernateUtil hu = new HibernateUtil();
    public ListView<PumpStationsE> psList;
    public Text oitText;
    public Button rtuBatteryBtn;
    public Button pBatteryBtn;
    public Button groundWaterBtn;
    public Button chlorineBtn;
    public Button rainGaugeBtn;
    public Button spillBtn;
    public Button acBtn;
    public Text zoneText;
    PumpStationsE ps;
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
    public AcE ac;

    public PumpStations() throws Exception {
    }

    public void initialize() throws Exception {
        psList.setItems(hu.psListQuery());
        stationListCreator();
    }

    void stationListCreator() {
        psList.setCellFactory(p -> new ListCell<>() {
            @Override
            public void updateItem(PumpStationsE item, boolean empty) {
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
    void stationPresenter() {
        this.ps = psList.getFocusModel().getFocusedItem();

        psNumText.setText((Integer.toString(ps.getStationNum())));
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
        pumpThreeButton.setVisible(ps.getPumpCount() == 3);
        levelPriBtn.setVisible(Objects.nonNull(ps.getLevelIndicatorPrimary()));
        levelSecBtn.setVisible(Objects.nonNull(ps.getLevelIndicatorSecondary()));
        p1ContBtn.setVisible(Objects.nonNull(ps.getPumpController1()));
        p2ContBtn.setVisible(Objects.nonNull(ps.getPumpController2()));
        p3ContBtn.setVisible(Objects.nonNull(ps.getPumpController3()));
        if (ps.getBerkelyElectric()) elecComLabel.setText("Berkeley Electric");
        else elecComLabel.setText("Dominion");


        ac = hu.getAC(Integer.toString(ps.getStationNum()));
        acBtn.setVisible(Objects.nonNull(ac));
    }



    @FXML
    void pumpOneScreen() throws Exception {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                PumpStations.class.getResource("/com/servicedb/stationPump.fxml")));
        Stage stage = new Stage();
        stage.setTitle("Pump");
        stage.setScene(loader.load());

        StationPump controller = loader.getController();
        controller.initData(ps, 1);

        stage.show();
    }

    @FXML
    void pumpTwoScreen() throws Exception {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                PumpStations.class.getResource("/com/servicedb/stationPump.fxml")));
        Stage stage = new Stage();
        stage.setTitle("Pump");
        stage.setScene(loader.load());

        StationPump controller = loader.getController();
        controller.initData(ps, 2);

        stage.show();
    }

    @FXML
    void pumpThreeScreen() throws Exception {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                PumpStations.class.getResource("/com/servicedb/stationPump.fxml")));
        Stage stage = new Stage();
        stage.setTitle("Pump");
        stage.setScene(loader.load());

        StationPump controller = loader.getController();
        controller.initData(ps,3);

        stage.show();
    }

    @FXML
    void electricalScreen() throws Exception{
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                PumpStations.class.getResource("/com/servicedb/electrical-screen.fxml")));
        Stage stage = new Stage();
        stage.setTitle("Electrical");
        stage.setScene(loader.load());

        ElectricalScreen controller = loader.getController();
        controller.initData(ps);

        stage.show();
    }


    @FXML
    void acScreen() throws IOException {
        FXMLLoader loader = new FXMLLoader(Objects.requireNonNull(
                PumpStations.class.getResource("/com/servicedb/ac.fxml")));
        Stage stage = new Stage();
        stage.setTitle("AC");
        stage.setScene(loader.load());

        Ac controller = loader.getController();
        controller.initData(ac);

        stage.show();
    }
}
