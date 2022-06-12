package com.servicedb.MVC.Entities;

import javax.persistence.*;

@Entity
@Table(name = "station_power")
public class StationPower {
    @Id
    @Column(name = "station_num", nullable = false)
    private Integer stationNum;

    @Column(name = "main_breaker_brand", length = 100)
    private String mainBreakerBrand;

    @Column(name = "main_breaker_model", length = 100)
    private String mainBreakerModel;

    @Column(name = "main_breaker_wire_size", length = 100)
    private String mainBreakerWireSize;

    @Column(name = "em_breaker_brand", length = 100)
    private String emBreakerBrand;

    @Column(name = "em_breaker_model", length = 100)
    private String emBreakerModel;

    @Column(name = "em_breaker_wire_size", length = 100)
    private String emBreakerWireSize;

    @Column(name = "fused_disconnect_size", length = 100)
    private String fusedDisconnectSize;

    @Column(name = "non_fused_disconnect_size", length = 100)
    private String nonFusedDisconnectSize;

    @Column(name = "fuse_type", length = 100)
    private String fuseType;

    @Column(name = "fuse_size", length = 100)
    private String fuseSize;

    @Column(name = "surge_suppressor_brand", length = 100)
    private String surgeSuppressorBrand;

    @Column(name = "surge_suppressor_model", length = 100)
    private String surgeSuppressorModel;

    @Column(name = "phase_monitor_brand", length = 100)
    private String phaseMonitorBrand;

    @Column(name = "phase_monitor_model", length = 100)
    private String phaseMonitorModel;

    @Column(name = "main_breaker_size", length = 100)
    private String mainBreakerSize;

    @Column(name = "em_breaker_size", length = 100)
    private String emBreakerSize;



    public Integer getStationNum() {
        return stationNum;
    }

    public void setStationNum(Integer stationNum) {
        this.stationNum = stationNum;
    }

    public String getMainBreakerBrand() {
        return mainBreakerBrand;
    }

    public void setMainBreakerBrand(String mainBreakerBrand) {
        this.mainBreakerBrand = mainBreakerBrand;
    }

    public String getMainBreakerModel() {
        return mainBreakerModel;
    }

    public void setMainBreakerModel(String mainBreakerModel) {
        this.mainBreakerModel = mainBreakerModel;
    }

    public String getMainBreakerWireSize() {
        return mainBreakerWireSize;
    }

    public void setMainBreakerWireSize(String mainBreakerWireSize) {
        this.mainBreakerWireSize = mainBreakerWireSize;
    }

    public String getEmBreakerBrand() {
        return emBreakerBrand;
    }

    public void setEmBreakerBrand(String emBreakerBrand) {
        this.emBreakerBrand = emBreakerBrand;
    }

    public String getEmBreakerModel() {
        return emBreakerModel;
    }

    public void setEmBreakerModel(String emBreakerModel) {
        this.emBreakerModel = emBreakerModel;
    }

    public String getEmBreakerWireSize() {
        return emBreakerWireSize;
    }

    public void setEmBreakerWireSize(String emBreakerWireSize) {
        this.emBreakerWireSize = emBreakerWireSize;
    }

    public String getFusedDisconnectSize() {
        return fusedDisconnectSize;
    }

    public void setFusedDisconnectSize(String fusedDisconnectSize) {
        this.fusedDisconnectSize = fusedDisconnectSize;
    }

    public String getNonFusedDisconnectSize() {
        return nonFusedDisconnectSize;
    }

    public void setNonFusedDisconnectSize(String nonFusedDisconnectSize) {
        this.nonFusedDisconnectSize = nonFusedDisconnectSize;
    }

    public String getFuseType() {
        return fuseType;
    }

    public void setFuseType(String fuseType) {
        this.fuseType = fuseType;
    }

    public String getFuseSize() {
        return fuseSize;
    }

    public void setFuseSize(String fuseSize) {
        this.fuseSize = fuseSize;
    }

    public String getSurgeSuppressorBrand() {
        return surgeSuppressorBrand;
    }

    public void setSurgeSuppressorBrand(String surgeSuppressorBrand) {
        this.surgeSuppressorBrand = surgeSuppressorBrand;
    }

    public String getSurgeSuppressorModel() {
        return surgeSuppressorModel;
    }

    public void setSurgeSuppressorModel(String surgeSuppressorModel) {
        this.surgeSuppressorModel = surgeSuppressorModel;
    }

    public String getPhaseMonitorBrand() {
        return phaseMonitorBrand;
    }

    public void setPhaseMonitorBrand(String phaseMonitorBrand) {
        this.phaseMonitorBrand = phaseMonitorBrand;
    }

    public String getPhaseMonitorModel() {
        return phaseMonitorModel;
    }

    public void setPhaseMonitorModel(String phaseMonitorModel) {
        this.phaseMonitorModel = phaseMonitorModel;
    }

    public String getMainBreakerSize() {
        return mainBreakerSize;
    }

    public void setMainBreakerSize(String mainBreakerSize) {
        this.mainBreakerSize = mainBreakerSize;
    }

    public String getEmBreakerSize() {
        return emBreakerSize;
    }

    public void setEmBreakerSize(String emBreakerSize) {
        this.emBreakerSize = emBreakerSize;
    }



}