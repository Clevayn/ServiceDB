package com.servicedb.MVC;

import javafx.collections.ObservableList;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface Dao<T> {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MPW");
    javax.persistence.EntityManager em = entityManagerFactory.createEntityManager();


    void update(T t);
    ObservableList<T> getObservableList();
    T retrieve(int location);
    void create(T t);
}
