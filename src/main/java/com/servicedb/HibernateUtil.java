package com.servicedb;

import com.servicedb.Entities.*;
import com.servicedb.Entities.PumpsE;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.hibernate.*;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.query.Query;
import org.hibernate.tool.schema.spi.ScriptTargetOutput;

import javax.persistence.NoResultException;
import java.io.FileInputStream;
import java.math.BigDecimal;
import java.util.Locale;


public class HibernateUtil {

    SessionFactory sessionFactory;
    Session session;

    public HibernateUtil() throws Exception {
    setUp();
    }

    protected void setUp() throws Exception {
        // A SessionFactory is set up once for an application!

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

    public ObservableList<PumpStationsE> psListQuery() throws Exception {
        setUp();
        ObservableList<PumpStationsE> output = FXCollections.observableArrayList();
        Session session = sessionFactory.openSession().getSession();
        output.addAll(session.createQuery("from com.servicedb.Entities.PumpStationsE ORDER BY id ASC", PumpStationsE.class).list());

        session.close();

        return output;
    }

    public ObservableList<PumpsE> pumpsListQuery() {
        ObservableList<PumpsE> output = FXCollections.observableArrayList();
        Session session = sessionFactory.openSession().getSession();
        output.addAll(session.createQuery("from com.servicedb.Entities.PumpsE order by location", PumpsE.class).list());

        session.close();

        return output;
    }

    public PumpsE getPumpByLocation(String location){
        Session session = sessionFactory.openSession();
        Query<com.servicedb.Entities.PumpsE> q = session.createQuery("from com.servicedb.Entities.PumpsE pump where pump.location = :location");

        q.setParameter("location", location);

        return q.getSingleResult();
    }

    public AcE getAC(String location){
        AcE ac;
        Session session = sessionFactory.openSession();
        Query<com.servicedb.Entities.AcE> q;
        try{
            q = session.createQuery("from com.servicedb.Entities.AcE ac where ac.location = :location");
            q.setParameter("location", location);
            return q.getSingleResult();
        } catch (NoResultException e){
            return null;
        }
    }

    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public static class PumpStationUpdate extends HibernateUtil{

        private final Session session = sessionFactory.openSession();
        Transaction tx;
        private PumpStationsE pse;


        public PumpStationUpdate(int stationNum) throws Exception {
            super();
            try{
                pse = session.get(com.servicedb.Entities.PumpStationsE.class, 1092 + stationNum);
            }  catch (Exception e) {
                e.printStackTrace();
            }
        }

        void commitTX(){

            try {
                tx = session.beginTransaction();
                session.update(pse);
                tx.commit();
            } catch (HibernateException ignored){
                if (tx != null) tx.rollback();
                ignored.printStackTrace();
            }

        }



        PumpStationUpdate name(String s){
            pse.setName(s);
            return this;
        }

        PumpStationUpdate ats(boolean b){
            pse.setAts(b);
            return this;
        }

        PumpStationUpdate berkleyElectric(boolean b){
            pse.setBerkelyElectric(b);
            return this;
        }

        PumpStationUpdate coil(String s){
            pse.setCoil(s);
            return this;
        }

        PumpStationUpdate contactKit(String s){
            pse.setContactKit(s);
            return this;
        }

        PumpStationUpdate controlPower(String s){
            pse.setControlPower(s);
            return this;
        }

        PumpStationUpdate designCondition(String s){
            pse.setDesignCondition(s);
            return this;
        }

        PumpStationUpdate dischargeSize(long f){
            pse.setDischargeSize(f);
            return this;
        }

        PumpStationUpdate emergencyBreaker(String s){
            pse.setEmergencyBreaker(s);
            return this;
        }

        PumpStationUpdate flowMeter(int i){
            pse.setFlowMeter(i);
            return this;
        }

        PumpStationUpdate fuses(String s){
            pse.setFuses(s);
            return this;
        }

        PumpStationUpdate generatorSize(int i){
            pse.setGeneratorSize(i);
            return this;
        }

        PumpStationUpdate gpd(long l){
            pse.setGpd(l);
            return this;
        }

        PumpStationUpdate highLeg(boolean b){
            pse.setHighLeg(b);
            return this;
        }

        PumpStationUpdate levelPri(int i){
            pse.setLevelIndicatorPrimary(i);
            return this;
        }

        PumpStationUpdate levelSec(int i){
            pse.setLevelIndicatorSecondary(i);
            return this;
        }

        PumpStationUpdate locationAdress(String s){
            pse.setLocationAddress(s);
            return this;
        }

        PumpStationUpdate locationLat(float f){
            pse.setLocationGpsLat((double) f);
            return this;
        }

        PumpStationUpdate locationLong(float f){
            pse.setLocationGpsLong((double) f);
            return this;
        }

        PumpStationUpdate mainBreaker(String s){
            pse.setMainBreaker(s);
            return this;
        }

        PumpStationUpdate meterNum(int i){
            pse.setMeterNum(i);
            return this;
        }

        PumpStationUpdate mts(String s){
            pse.setMts(s);
            return this;
        }

        PumpStationUpdate nema(float f){
            pse.setNema((double) f);
            return this;
        }

        PumpStationUpdate oit(int i){
            pse.setOit(i);
            return this;
        }

        PumpStationUpdate overload(String s){
            pse.setOverload(s);
            return this;
        }

        PumpStationUpdate phase(int i){
            pse.setPhase(i);
            return this;
        }

        PumpStationUpdate phaseMonitor(String s){
            pse.setPhaseMonitor(s);
            return this;
        }

        PumpStationUpdate plc(boolean b){
            pse.setPlc(b);
            return this;
        }

        PumpStationUpdate pressureTran(int i){
            pse.setPressureTransmitter(i);
            return this;
        }

        PumpStationUpdate pumpCount(int i){
            pse.setPumpCount(i);
            return this;
        }

        PumpStationUpdate rainGauge(boolean b){
            pse.setRainGauge(b);
            return this;
        }

        PumpStationUpdate rotationCW(boolean b){
            pse.setRotationCw(b);
            return this;
        }

        PumpStationUpdate rtu(boolean b){
            pse.setRtu(b);
            return this;
        }

        PumpStationUpdate startUpCond(String s){
            pse.setStartUpCondition(s);
            return this;
        }

        PumpStationUpdate starter(String s){
            pse.setStarter(s);
            return this;
        }

        PumpStationUpdate stationaryGen(boolean b){
            pse.setStationaryGen(b);
            return this;
        }

        PumpStationUpdate ultrasonic(String s){
            pse.setUltrasonic(s);
            return this;
        }

        PumpStationUpdate voltage(int i){
            pse.setVoltage(i);
            return this;
        }

        /*protected void setUp() throws Exception {
            // A SessionFactory is set up once for an application!

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
        }*/


    }




}
