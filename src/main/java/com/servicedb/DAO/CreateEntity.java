package com.servicedb.DAO;

public class CreateEntity implements EntityManager {
    public CreateEntity(Object o){
        em.getTransaction().begin();
        em.persist(o);
        em.getTransaction().commit();
    }
}
