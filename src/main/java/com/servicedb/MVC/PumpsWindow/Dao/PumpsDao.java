package com.servicedb.MVC.PumpsWindow.Dao;

import com.servicedb.MVC.Dao;
import com.servicedb.MVC.Entities.Pump;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PumpsDao implements Dao<Pump> {
    @Override
    public void update(Pump pump) {

    }

    @Override
    public ObservableList<Pump> getObservableList() {
        ObservableList<Pump> output = FXCollections.observableArrayList();
        output.addAll(em.createQuery("from Pump ORDER BY station_num asc").getResultList());
        return output;
    }

    @Override
    public Pump retrieve(int location) {
        return null;
    }

    @Override
    public void create(Pump pump) {

    }
}
