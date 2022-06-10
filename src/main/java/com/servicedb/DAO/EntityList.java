package com.servicedb.DAO;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityList<T> implements com.servicedb.DAO.EntityManager {
    private final T t;
    public EntityList(T t){
        this.t = t;
    }

    public ObservableList<T> getObservableList(){
        ObservableList<T> output = FXCollections.observableArrayList();
        output.addAll(em.createQuery("from com.servicedb.Entities." + this.t.getClass().getSimpleName() + " ORDER BY id asc").getResultList());
        return output;
    }
}
