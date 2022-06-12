package com.servicedb;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

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
        //new ApachePOI().spillExcel();
        //new HibernateUtil().setUp();
        launch();
    }
}