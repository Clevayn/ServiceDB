package com.servicedb.DAO;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public interface EntityManager {
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MPW");
    javax.persistence.EntityManager em = entityManagerFactory.createEntityManager();
}
