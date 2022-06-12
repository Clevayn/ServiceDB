package com.servicedb.MVC.Entities;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "ac")
public class AC {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "brand", length = 100)
    private String brand;

    @Column(name = "model", length = 100)
    private String model;

    @Column(name = "voltage", length = 10)
    private String voltage;

    @Column(name = "btu")
    private Integer btu;

    @Column(name = "serial", length = 100)
    private String serial;

    @Column(name = "refrigerant", length = 10)
    private String refrigerant;

    @Column(name = "installation_date")
    private Date installationDate;

    @Column(name = "filter_size", length = 20)
    private String filterSize;
    @Id
    @Column(name = "location")
    private int location;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public Integer getBtu() {
        return btu;
    }

    public void setBtu(Integer btu) {
        this.btu = btu;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getRefrigerant() {
        return refrigerant;
    }

    public void setRefrigerant(String refrigerant) {
        this.refrigerant = refrigerant;
    }

    public Date getInstallationDate() {
        return installationDate;
    }

    public void setInstallationDate(Date installationDate) {
        this.installationDate = installationDate;
    }

    public String getFilterSize() {
        return filterSize;
    }

    public void setFilterSize(String filterSize) {
        this.filterSize = filterSize;
    }

    public int getLocation() {
        return location;
    }

    public void setLocation(int location) {
        this.location = location;
    }

}