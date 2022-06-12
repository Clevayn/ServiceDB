package com.servicedb.MVC.Entities;

import javax.persistence.*;

@Entity
@Table(name = "level_indicator", schema = "public", catalog = "MPW")
public class LevelIndicator {
    @Basic
    @Column(name = "brand", nullable = true, length = 50)
    private String brand;
    @Basic
    @Column(name = "model", nullable = true, length = 50)
    private String model;
    @Basic
    @Column(name = "manual", nullable = true, length = 150)
    private String manual;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

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

    public String getManual() {
        return manual;
    }

    public void setManual(String manual) {
        this.manual = manual;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LevelIndicator that = (LevelIndicator) o;

        if (id != that.id) return false;
        if (brand != null ? !brand.equals(that.brand) : that.brand != null) return false;
        if (model != null ? !model.equals(that.model) : that.model != null) return false;
        if (manual != null ? !manual.equals(that.manual) : that.manual != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = brand != null ? brand.hashCode() : 0;
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (manual != null ? manual.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
