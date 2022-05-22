package com.servicedb;

import com.servicedb.Controllers.MainScreen;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("main-screen.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Service DB");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) throws Exception {
        //new ApachePOI().acExcel();

        launch();
    }
}