package com.servicedb.DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UpdateEntity implements EntityManager {
    public UpdateEntity(Object o){
        em.getTransaction().begin();
        em.merge(o);
        em.getTransaction().commit();
    }
}
