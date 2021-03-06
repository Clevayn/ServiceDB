package com.servicedb.MVC.PumpStationScreen.Dao;

import com.servicedb.MVC.Dao;
import com.servicedb.MVC.Entities.AC;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class AcDao implements Dao<AC> {

    public AcDao(){}

    @Override
    public void update(AC ac) {
        tx.begin();
        em.merge(ac);
        tx.commit();
    }

    @Override
    public ObservableList<AC> getObservableList() {
        ObservableList<AC> output = FXCollections.observableArrayList();
        output.addAll(em.createQuery("from com.servicedb.MVC.Entities.AC ORDER BY station_num asc").getResultList());
        return output;
    }

    @Override
    public AC retrieve(int location) {
        return null;
    }

    @Override
    public AC retrieve(String location) {
        return null;
    }

    @Override
    public void create(AC ac) {
        tx.begin();
        em.persist(ac);
        tx.commit();
    }
}
