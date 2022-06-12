package com.servicedb.MVC.MenuScreen;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class MainScreen {
    @FXML
    public Button pBtn, psBtn, gsBtn, gBtn, wwBtn, wBtn;
    public GridPane mainScreen;


    public MainScreen() throws Exception {

    }



    @FXML
    public void psBtnClick() throws IOException {
        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(MainScreen.class.getResource("/com/servicedb/pumpStations-screen.fxml"))));
        Stage stage = (Stage) mainScreen.getScene().getWindow();
        stage.setScene(scene);
    }

    @FXML
    public void pBtnClick() throws IOException {
        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(MainScreen.class.getResource("/com/servicedb/pumps-screen.fxml"))));
        Stage stage = (Stage) mainScreen.getScene().getWindow();
        stage.setScene(scene);

    }



}