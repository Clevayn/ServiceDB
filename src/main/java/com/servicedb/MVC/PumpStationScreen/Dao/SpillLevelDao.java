package com.servicedb.MVC.PumpStationScreen.Dao;

import com.servicedb.MVC.Dao;
import com.servicedb.MVC.Entities.SpillLevel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class SpillLevelDao implements Dao<SpillLevel> {
    @Override
    public void update(SpillLevel spillLevel) {

    }

    @Override
    public ObservableList<SpillLevel> getObservableList() {
        ObservableList<SpillLevel> output = FXCollections.observableArrayList();
        output.addAll(em.createQuery("from com.servicedb.Entities.SpillLevel ORDER BY station_num asc").getResultList());
        return output;
    }

    @Override
    public SpillLevel retrieve(int location) {
        return em.find(SpillLevel.class, location);
    }

    @Override
    public void create(SpillLevel spillLevel) {

    }
}
