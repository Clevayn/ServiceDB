package com.servicedb;

import com.servicedb.MVC.Entities.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import javax.persistence.*;


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

    public ObservableList<Pump> pumpsListQuery() {
        ObservableList<Pump> output = FXCollections.observableArrayList();
        output.addAll(entityManager.createQuery("from com.servicedb.MVC.Entities.Pump order by location", Pump.class).getResultList());
        return output;
    }
    public SpillLevel getSpillLevel(int stationNum){
        return entityManager.find(SpillLevel.class, stationNum + 598);
    }
    public Pump getPumpByLocation(String location){
        return (Pump) entityManager.createQuery("from com.servicedb.MVC.Entities.Pump pump where pump.location = :location").setParameter("location", location).getSingleResult();
    }
    public AC getAC(int location){
        return entityManager.find(AC.class, location);
    }


    public Session getSession() {
        return session;
    }

}
