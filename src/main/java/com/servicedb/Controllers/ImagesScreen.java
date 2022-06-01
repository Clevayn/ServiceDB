package com.servicedb.Controllers;

import com.servicedb.Entities.PumpStationsE;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableListBase;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class ImagesScreen {


    public ListView<Image> listView;
    public ImageView imageVIewMain;
    public int stationNum;

    public ImagesScreen(){

    }

    public void initialize() throws FileNotFoundException, MalformedURLException {
        listView.setItems(list());
        listCreator();
        if (Objects.isNull(imageVIewMain.getImage())) imageVIewMain.setImage(listView.getItems().get(0));

    }

    public void initData(int stationNum){
        this.stationNum = stationNum;
        System.out.println(this.stationNum);
    }

    void listCreator() {
        listView.setCellFactory(p -> new ListCell<>() {
            @Override
            public void updateItem(Image image, boolean empty) {
                super.updateItem(image, empty);
                if (image != null && !empty) {
                    this.setText(image.getUrl().substring(88));
                } else {
                    setText(null);
                    setGraphic(null);
                }
            }
        });
    }

    public ObservableList<Image> list() throws MalformedURLException {
        File file = new File("src/main/resources/PS 1/stationPics");
        ObservableList<Image> output = FXCollections.observableArrayList();
        for (String s: Objects.requireNonNull(file.list())
             ) {
            output.add(new Image(new File("src/main/resources/PS 1/stationPics/" + s).toURI().toURL().toString()));
        }

        return output;
    }

    @FXML
    public void setImage(){
        imageVIewMain.setImage(listView.getFocusModel().getFocusedItem());
    }


}
