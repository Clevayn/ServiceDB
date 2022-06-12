package com.servicedb.MVC;

import javafx.collections.ObservableList;
import org.hibernate.Transaction;

import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public interface Dao<T> {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MPW");
    javax.persistence.EntityManager em = entityManagerFactory.createEntityManager();
    EntityTransaction tx = em.getTransaction();


    void update(T t);
    ObservableList<T> getObservableList();
    T retrieve(int location);
    T retrieve(String location);
    void create(T t);
}
