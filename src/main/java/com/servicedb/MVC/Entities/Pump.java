package com.servicedb.MVC.Entities;

import javax.persistence.*;


@Entity(name = "pumps")
public class Pump {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private int id;
    @Basic
    @Column(name = "brand", nullable = true, length = 50)
    private String brand;
    @Basic
    @Column(name = "model", nullable = true, length = 50)
    private String model;
    @Basic
    @Column(name = "serial", nullable = true, length = 100)
    private String serial;
    @Basic
    @Column(name = "hp", nullable = true, precision = 0)
    private Float hp;
    @Basic
    @Column(name = "voltage", nullable = true, length = 25)
    private String voltage;
    @Basic
    @Column(name = "rpm", nullable = true, precision = 0)
    private Float rpm;
    @Basic
    @Column(name = "gpm", nullable = true, precision = 0)
    private Float gpm;
    @Basic
    @Column(name = "head", nullable = true, precision = 0)
    private Float head;
    @Basic
    @Column(name = "impeller_diameter", nullable = true, precision = 0)
    private Float impellerDiameter;
    @Basic
    @Column(name = "location", nullable = true, length = 25)
    private String location;
    @Basic
    @Column(name = "volute_bolt_size", nullable = true, precision = 0)
    private Float voluteBoltSize;
    @Basic
    @Column(name = "impeller_bolt_size", nullable = true, precision = 0)
    private Float impellerBoltSize;
    @Basic
    @Column(name = "design_condition", nullable = true, length = 35)
    private String designCondition;
    @Basic
    @Column(name = "fla240", nullable = true, precision = 0)
    private Float fla240;
    @Basic
    @Column(name = "fla480", nullable = true, precision = 0)
    private Float fla480;
    @Basic
    @Column(name = "start_up_condition", nullable = true, length = 35)
    private String startUpCondition;
    @Basic
    @Column(name = "mpw_asset_num", nullable = true, length = 25)
    private String mpwAssetNum;
    @Basic
    @Column(name = "pump_type", nullable = true, length = 50)
    private String pumpType;
    @Basic
    @Column(name = "pump_size", nullable = true, precision = 0)
    private Float pumpSize;
    @Basic
    @Column(name = "phase", nullable = true)
    private Integer phase;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Float getHp() {
        return hp;
    }

    public void setHp(Float hp) {
        this.hp = hp;
    }

    public String getVoltage() {
        return voltage;
    }

    public void setVoltage(String voltage) {
        this.voltage = voltage;
    }

    public Float getRpm() {
        return rpm;
    }

    public void setRpm(Float rpm) {
        this.rpm = rpm;
    }

    public Float getGpm() {
        return gpm;
    }

    public void setGpm(Float gpm) {
        this.gpm = gpm;
    }

    public Float getHead() {
        return head;
    }

    public void setHead(Float head) {
        this.head = head;
    }

    public Float getImpellerDiameter() {
        return impellerDiameter;
    }

    public void setImpellerDiameter(Float impellerDiameter) {
        this.impellerDiameter = impellerDiameter;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Float getVoluteBoltSize() {
        return voluteBoltSize;
    }

    public void setVoluteBoltSize(Float voluteBoltSize) {
        this.voluteBoltSize = voluteBoltSize;
    }

    public Float getImpellerBoltSize() {
        return impellerBoltSize;
    }

    public void setImpellerBoltSize(Float impellerBoltSize) {
        this.impellerBoltSize = impellerBoltSize;
    }

    public String getDesignCondition() {
        return designCondition;
    }

    public void setDesignCondition(String designCondition) {
        this.designCondition = designCondition;
    }

    public Float getFla240() {
        return fla240;
    }

    public void setFla240(Float fla240) {
        this.fla240 = fla240;
    }

    public Float getFla480() {
        return fla480;
    }

    public void setFla480(Float fla480) {
        this.fla480 = fla480;
    }

    public String getStartUpCondition() {
        return startUpCondition;
    }

    public void setStartUpCondition(String startUpCondition) {
        this.startUpCondition = startUpCondition;
    }

    public String getMpwAssetNum() {
        return mpwAssetNum;
    }

    public void setMpwAssetNum(String mpwAssetNum) {
        this.mpwAssetNum = mpwAssetNum;
    }

    public String getPumpType() {
        return pumpType;
    }

    public void setPumpType(String pumpType) {
        this.pumpType = pumpType;
    }

    public Float getPumpSize() {
        return pumpSize;
    }

    public void setPumpSize(Float pumpSize) {
        this.pumpSize = pumpSize;
    }

    public Integer getPhase() {
        return phase;
    }

    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Pump pumps = (Pump) o;

        if (id != pumps.id) return false;
        if (brand != null ? !brand.equals(pumps.brand) : pumps.brand != null) return false;
        if (model != null ? !model.equals(pumps.model) : pumps.model != null) return false;
        if (serial != null ? !serial.equals(pumps.serial) : pumps.serial != null) return false;
        if (hp != null ? !hp.equals(pumps.hp) : pumps.hp != null) return false;
        if (voltage != null ? !voltage.equals(pumps.voltage) : pumps.voltage != null) return false;
        if (rpm != null ? !rpm.equals(pumps.rpm) : pumps.rpm != null) return false;
        if (gpm != null ? !gpm.equals(pumps.gpm) : pumps.gpm != null) return false;
        if (head != null ? !head.equals(pumps.head) : pumps.head != null) return false;
        if (impellerDiameter != null ? !impellerDiameter.equals(pumps.impellerDiameter) : pumps.impellerDiameter != null)
            return false;
        if (location != null ? !location.equals(pumps.location) : pumps.location != null) return false;
        if (voluteBoltSize != null ? !voluteBoltSize.equals(pumps.voluteBoltSize) : pumps.voluteBoltSize != null)
            return false;
        if (impellerBoltSize != null ? !impellerBoltSize.equals(pumps.impellerBoltSize) : pumps.impellerBoltSize != null)
            return false;
        if (designCondition != null ? !designCondition.equals(pumps.designCondition) : pumps.designCondition != null)
            return false;
        if (fla240 != null ? !fla240.equals(pumps.fla240) : pumps.fla240 != null) return false;
        if (fla480 != null ? !fla480.equals(pumps.fla480) : pumps.fla480 != null) return false;
        if (startUpCondition != null ? !startUpCondition.equals(pumps.startUpCondition) : pumps.startUpCondition != null)
            return false;
        if (mpwAssetNum != null ? !mpwAssetNum.equals(pumps.mpwAssetNum) : pumps.mpwAssetNum != null) return false;
        if (pumpType != null ? !pumpType.equals(pumps.pumpType) : pumps.pumpType != null) return false;
        if (pumpSize != null ? !pumpSize.equals(pumps.pumpSize) : pumps.pumpSize != null) return false;
        if (phase != null ? !phase.equals(pumps.phase) : pumps.phase != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (brand != null ? brand.hashCode() : 0);
        result = 31 * result + (model != null ? model.hashCode() : 0);
        result = 31 * result + (serial != null ? serial.hashCode() : 0);
        result = 31 * result + (hp != null ? hp.hashCode() : 0);
        result = 31 * result + (voltage != null ? voltage.hashCode() : 0);
        result = 31 * result + (rpm != null ? rpm.hashCode() : 0);
        result = 31 * result + (gpm != null ? gpm.hashCode() : 0);
        result = 31 * result + (head != null ? head.hashCode() : 0);
        result = 31 * result + (impellerDiameter != null ? impellerDiameter.hashCode() : 0);
        result = 31 * result + (location != null ? location.hashCode() : 0);
        result = 31 * result + (voluteBoltSize != null ? voluteBoltSize.hashCode() : 0);
        result = 31 * result + (impellerBoltSize != null ? impellerBoltSize.hashCode() : 0);
        result = 31 * result + (designCondition != null ? designCondition.hashCode() : 0);
        result = 31 * result + (fla240 != null ? fla240.hashCode() : 0);
        result = 31 * result + (fla480 != null ? fla480.hashCode() : 0);
        result = 31 * result + (startUpCondition != null ? startUpCondition.hashCode() : 0);
        result = 31 * result + (mpwAssetNum != null ? mpwAssetNum.hashCode() : 0);
        result = 31 * result + (pumpType != null ? pumpType.hashCode() : 0);
        result = 31 * result + (pumpSize != null ? pumpSize.hashCode() : 0);
        result = 31 * result + (phase != null ? phase.hashCode() : 0);
        return result;
    }
}
