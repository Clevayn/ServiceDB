package com.servicedb.MVC.PumpStationScreen.Dao;

import com.servicedb.MVC.Dao;
import com.servicedb.MVC.Entities.Pump;
import com.servicedb.MVC.Entities.SpillLevel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PumpDao implements Dao<Pump> {
    @Override
    public void update(Pump pump) {
        tx.begin();
        em.merge(pump);
        tx.commit();
    }

    @Override
    public ObservableList<Pump> getObservableList() {
        ObservableList<Pump> output = FXCollections.observableArrayList();
        output.addAll(em.createQuery("from com.servicedb.MVC.Entities.Pump ORDER BY station_num asc", Pump.class).getResultList());
        return output;
    }

    @Override
    public Pump retrieve(int location) {
        return null;

    }

    @Override
    public Pump retrieve(String location) {
        return  em.createQuery("from com.servicedb.MVC.Entities.Pump pump where pump.location = :location", Pump.class)
                .setParameter("location", location)
                .getSingleResult();
    }

    @Override
    public void create(Pump pump) {
        tx.begin();
        em.persist(pump);
        tx.commit();
    }
}
