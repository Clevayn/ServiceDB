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
        em.getTransaction().begin();
        em.merge(pumpStation);
        em.getTransaction().commit();
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
    public void create(PumpStation pumpStation) {
        em.getTransaction().begin();
        em.persist(pumpStation);
        em.getTransaction().commit();

    }


}


