package com.servicedb.MVC.PumpStationScreen.Dao;

import com.servicedb.MVC.Dao;
import com.servicedb.MVC.Entities.PumpStation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PumpStationDao implements Dao<PumpStation> {

    public PumpStationDao(){

    }

    @Override
    public void update(PumpStation pumpStation) {
        tx.begin();
        em.merge(pumpStation);
        tx.commit();
    }

    @Override
    public ObservableList<PumpStation> getObservableList() {
        ObservableList<PumpStation> output = FXCollections.observableArrayList();
        output.addAll(em.createQuery("from com.servicedb.MVC.Entities.PumpStation ORDER BY station_num asc").getResultList());
        return output;
    }

    @Override
    public PumpStation retrieve(int location) {
        return em.find(PumpStation.class, location);
    }

    @Override
    public PumpStation retrieve(String location) {
        return null;
    }

    @Override
    public void create(PumpStation pumpStation) {
        tx.begin();
        em.persist(pumpStation);
        tx.commit();

    }


}


