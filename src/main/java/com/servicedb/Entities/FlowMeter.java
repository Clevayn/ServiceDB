package com.servicedb.Entities;





import javax.persistence.*;
import java.util.Objects;

@Entity(name = "flow_meter")
@Table(name = "flow_meter", schema = "public", catalog = "MPW")
public class FlowMeter {
    @Basic
    @Column(name = "brand", nullable = true, length = 50)
    private String brand;
    @Basic
    @Column(name = "model", nullable = true, length = 50)
    private String model;
    @Basic
    @Column(name = "Manual", nullable = true, length = 50)
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

        FlowMeter that = (FlowMeter) o;

        if (id != that.id) return false;
        if (!Objects.equals(brand, that.brand)) return false;
        if (!Objects.equals(model, that.model)) return false;
        return Objects.equals(manual, that.manual);
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
