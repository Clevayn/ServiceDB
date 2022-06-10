package com.servicedb.Controllers;

import com.servicedb.DAO.EntityList;
import com.servicedb.Entities.PumpsE;
import com.servicedb.HibernateUtil;
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

public class PumpsScreen extends HibernateUtil {
    public ListView<PumpsE> pumpsList;
    public Button menuBtn;
    public BorderPane mainPane;

    public PumpsScreen() throws Exception {
        super();

    }
    public void initialize() {
        pumpsList.setItems(new EntityList<PumpsE>(new PumpsE()).getObservableList());
        listCellCreator();
    }
    void listCellCreator() {
        pumpsList.setCellFactory(p -> new ListCell<>() {
            @Override
            public void updateItem(PumpsE item, boolean empty) {

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
