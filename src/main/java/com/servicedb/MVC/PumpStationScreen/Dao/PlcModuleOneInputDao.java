package com.servicedb.MVC.PumpStationScreen.Dao;

import com.servicedb.MVC.Dao;
import com.servicedb.MVC.Entities.PlcModuleOneInput;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PlcModuleOneInputDao implements Dao<PlcModuleOneInput> {
    @Override
    public void update(PlcModuleOneInput plcModuleOneInput) {
        tx.begin();
        em.merge(plcModuleOneInput);
        tx.commit();

    }

    @Override
    public ObservableList<PlcModuleOneInput> getObservableList() {
        ObservableList<PlcModuleOneInput> output = FXCollections.observableArrayList();
        output.addAll(em.createQuery("from com.servicedb.MVC.Entities.PlcModuleOneInput ORDER BY station_num asc", PlcModuleOneInput.class).getResultList());
        return output;
    }

    @Override
    public PlcModuleOneInput retrieve(int location) {
        return em.find(PlcModuleOneInput.class, location);
    }

    @Override
    public PlcModuleOneInput retrieve(String location) {
        return null;
    }

    @Override
    public void create(PlcModuleOneInput plcModuleOneInput) {
        tx.begin();
        em.persist(plcModuleOneInput);
        tx.commit();
    }
}
