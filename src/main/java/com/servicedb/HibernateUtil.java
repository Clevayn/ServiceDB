package com.servicedb;

import com.servicedb.Entities.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.exception.SQLGrammarException;
import org.hibernate.query.Query;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.Date;


public class HibernateUtil {

    SessionFactory sessionFactory ;
    Session session;


    final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MPW");
    final EntityManager entityManager = entityManagerFactory.createEntityManager();
    public HibernateUtil() throws Exception {
    }

    protected void setUp() throws Exception {
        // A SessionFactory is set up once for an application
        //System.out.println(entityManager.isOpen());
        final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                .configure("hibernate.cfg.xml") // configures settings from hibernate.cfg.xml
                .build();
        try {
            this.sessionFactory = new MetadataSources( registry ).buildMetadata().getSessionFactoryBuilder().build();
            System.out.println("Connected");
        }
        catch (Exception e) {
            // The registry would be destroyed by the SessionFactory, but we had trouble building the SessionFactory
            // so destroy it manually.
            StandardServiceRegistryBuilder.destroy( registry );
            e.printStackTrace();
        }
        this.session = sessionFactory.openSession();
    }

    public ObservableList<PumpsE> pumpsListQuery() {
        ObservableList<PumpsE> output = FXCollections.observableArrayList();
        output.addAll(entityManager.createQuery("from com.servicedb.Entities.PumpsE order by location", PumpsE.class).getResultList());
        return output;
    }
    public SpillLevel getSpillLevel(int stationNum){
        return entityManager.find(SpillLevel.class, stationNum + 598);
    }
    public PumpsE getPumpByLocation(String location){
        return (PumpsE) entityManager.createQuery("from com.servicedb.Entities.PumpsE pump where pump.location = :location").setParameter("location", location).getSingleResult();
    }
    public AcE getAC(int location){
        return entityManager.find(AcE.class, location);
    }


    public Session getSession() {
        return session;
    }

}
