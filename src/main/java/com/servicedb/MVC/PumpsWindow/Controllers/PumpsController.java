package com.servicedb.MVC.PumpsWindow.Controllers;

import com.servicedb.MVC.PumpsWindow.Dao.PumpsDao;
import com.servicedb.MVC.Entities.Pump;
import com.servicedb.HibernateUtil;
import com.servicedb.MVC.MenuScreen.MainScreen;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class PumpsController extends HibernateUtil {
    public ListView<Pump> pumpsList;
    public Button menuBtn;
    public BorderPane mainPane;

    public PumpsController() throws Exception {
        super();

    }
    public void initialize() {
        pumpsList.setItems(new PumpsDao().getObservableList());
        listCellCreator();
    }
    void listCellCreator() {
        pumpsList.setCellFactory(p -> new ListCell<>() {
            @Override
            public void updateItem(Pump item, boolean empty) {

                super.updateItem(item, empty);
                if (item != null && !empty) {
                    this.setText(item.getBrand().strip() + "   " + item.getModel().strip() + "\n" + item.getLocation().strip());
                } else {
                    setText(null);
                    setGraphic(null);
                }
            }
        });
    }
    @FXML
    void menuBtnClick() throws IOException {
        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(MainScreen.class.getResource("/com/servicedb/main-screen.fxml"))));
        Stage stage = (Stage) mainPane.getScene().getWindow();
        stage.setScene(scene);
    }
}
