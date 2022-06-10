package com.servicedb.DAO;

public class DeleteEntity implements EntityManager{

    DeleteEntity(Object o){
        em.getTransaction().begin();
        em.detach(o);
        em.getTransaction().commit();
    }
}
