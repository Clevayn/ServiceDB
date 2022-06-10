package com.servicedb.Entities;

import javax.persistence.*;


@Entity
@Table(name = "pump_stations")
public class PumpStationsE {
    @Id
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "station_num", nullable = false)
    private Integer stationNum;

    @Column(name = "above_ground")
    private Boolean aboveGround;

    @Column(name = "ats")
    private Boolean ats;

    @Column(name = "berkely_electric")
    private Boolean berkelyElectric;

    @Column(name = "coil", length = 100)
    private String coil;

    @Column(name = "contact_kit", length = 100)
    private String contactKit;

    @Column(name = "control_power", length = 100)
    private String controlPower;

    @Column(name = "design_condition", length = 100)
    private String designCondition;

    @Column(name = "discharge_size")
    private Long dischargeSize;

    @Column(name = "emergency_breaker", length = 100)
    private String emergencyBreaker;

    @Column(name = "flow_meter")
    private Integer flowMeter;

    @Column(name = "fuses", length = 100)
    private String fuses;

    @Column(name = "generator_size")
    private Integer generatorSize;

    @Column(name = "gpd")
    private Long gpd;

    @Column(name = "high_leg")
    private Boolean highLeg;

    @Column(name = "level_indicator_primary")
    private Integer levelIndicatorPrimary;

    @Column(name = "level_indicator_secondary")
    private Integer levelIndicatorSecondary;

    @Column(name = "location_address", length = 100)
    private String locationAddress;

    @Column(name = "location_gps_lat")
    private Double locationGpsLat;

    @Column(name = "location_gps_long")
    private Double locationGpsLong;

    @Column(name = "main_breaker", length = 100)
    private String mainBreaker;

    @Column(name = "meter_num")
    private Integer meterNum;

    @Column(name = "mts", length = 100)
    private String mts;

    @Column(name = "name", length = 100)
    private String name;

    @Column(name = "nema")
    private Double nema;

    @Column(name = "oit")
    private Integer oit;

    @Column(name = "overload", length = 100)
    private String overload;

    @Column(name = "phase")
    private Integer phase;

    @Column(name = "phase_monitor", length = 100)
    private String phaseMonitor;

    @Column(name = "plc")
    private Boolean plc;

    @Column(name = "pressure_transmitter")
    private Integer pressureTransmitter;

    @Column(name = "pump_breaker", length = 100)
    private String pumpBreaker;

    @Column(name = "pump_controller_1")
    private Integer pumpController1;

    @Column(name = "pump_controller_2")
    private Integer pumpController2;

    @Column(name = "pump_controller_3")
    private Integer pumpController3;

    @Column(name = "pump_count")
    private Integer pumpCount;

    @Column(name = "rain_gauge")
    private Boolean rainGauge;

    @Column(name = "rotation_cw")
    private Boolean rotationCw;

    @Column(name = "rtu")
    private Boolean rtu;

    @Column(name = "start_up_condition", length = 100)
    private String startUpCondition;

    @Column(name = "starter", length = 100)
    private String starter;

    @Column(name = "stationary_gen")
    private Boolean stationaryGen;

    @Column(name = "ultrasonic", length = 100)
    private String ultrasonic;

    @Column(name = "voltage")
    private Integer voltage;

    @Column(name = "zone")
    private Integer zone;

    @Column(name = "station_before")
    private Integer stationBefore;

    @Column(name = "station_after")
    private Integer stationAfter;

    @Column(name = "ac_id")
    private Integer acId;

    @Column(name = "panel_bat", length = 25)
    private String panelBat;

    @Column(name = "rtu_bat", length = 25)
    private String rtuBat;

    public String getRtuBat() {
        return rtuBat;
    }

    public void setRtuBat(String rtuBat) {
        this.rtuBat = rtuBat;
    }

    public Integer getAcId() {
        return acId;
    }

    public String getPanelBat() {
        return panelBat;
    }

    public void setPanelBat(String panelBat) {
        this.panelBat = panelBat;
    }

    public void setAcId(Integer acId) {
        this.acId = acId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStationNum() {
        return stationNum;
    }

    public void setStationNum(Integer stationNum) {
        this.stationNum = stationNum;
    }

    public Boolean getAboveGround() {
        return aboveGround;
    }

    public void setAboveGround(Boolean aboveGround) {
        this.aboveGround = aboveGround;
    }

    public Boolean getAts() {
        return ats;
    }

    public void setAts(Boolean ats) {
        this.ats = ats;
    }

    public Boolean getBerkelyElectric() {
        return berkelyElectric;
    }

    public void setBerkelyElectric(Boolean berkelyElectric) {
        this.berkelyElectric = berkelyElectric;
    }

    public String getCoil() {
        return coil;
    }

    public void setCoil(String coil) {
        this.coil = coil;
    }

    public String getContactKit() {
        return contactKit;
    }

    public void setContactKit(String contactKit) {
        this.contactKit = contactKit;
    }

    public String getControlPower() {
        return controlPower;
    }

    public void setControlPower(String controlPower) {
        this.controlPower = controlPower;
    }

    public String getDesignCondition() {
        return designCondition;
    }

    public void setDesignCondition(String designCondition) {
        this.designCondition = designCondition;
    }

    public Long getDischargeSize() {
        return dischargeSize;
    }

    public void setDischargeSize(Long dischargeSize) {
        this.dischargeSize = dischargeSize;
    }

    public String getEmergencyBreaker() {
        return emergencyBreaker;
    }

    public void setEmergencyBreaker(String emergencyBreaker) {
        this.emergencyBreaker = emergencyBreaker;
    }

    public Integer getFlowMeter() {
        return flowMeter;
    }

    public void setFlowMeter(Integer flowMeter) {
        this.flowMeter = flowMeter;
    }

    public String getFuses() {
        return fuses;
    }

    public void setFuses(String fuses) {
        this.fuses = fuses;
    }

    public Integer getGeneratorSize() {
        return generatorSize;
    }

    public void setGeneratorSize(Integer generatorSize) {
        this.generatorSize = generatorSize;
    }

    public Long getGpd() {
        return gpd;
    }

    public void setGpd(Long gpd) {
        this.gpd = gpd;
    }

    public Boolean getHighLeg() {
        return highLeg;
    }

    public void setHighLeg(Boolean highLeg) {
        this.highLeg = highLeg;
    }

    public Integer getLevelIndicatorPrimary() {
        return levelIndicatorPrimary;
    }

    public void setLevelIndicatorPrimary(Integer levelIndicatorPrimary) {
        this.levelIndicatorPrimary = levelIndicatorPrimary;
    }

    public Integer getLevelIndicatorSecondary() {
        return levelIndicatorSecondary;
    }

    public void setLevelIndicatorSecondary(Integer levelIndicatorSecondary) {
        this.levelIndicatorSecondary = levelIndicatorSecondary;
    }

    public String getLocationAddress() {
        return locationAddress;
    }

    public void setLocationAddress(String locationAddress) {
        this.locationAddress = locationAddress;
    }

    public Double getLocationGpsLat() {
        return locationGpsLat;
    }

    public void setLocationGpsLat(Double locationGpsLat) {
        this.locationGpsLat = locationGpsLat;
    }

    public Double getLocationGpsLong() {
        return locationGpsLong;
    }

    public void setLocationGpsLong(Double locationGpsLong) {
        this.locationGpsLong = locationGpsLong;
    }

    public String getMainBreaker() {
        return mainBreaker;
    }

    public void setMainBreaker(String mainBreaker) {
        this.mainBreaker = mainBreaker;
    }

    public Integer getMeterNum() {
        return meterNum;
    }

    public void setMeterNum(Integer meterNum) {
        this.meterNum = meterNum;
    }

    public String getMts() {
        return mts;
    }

    public void setMts(String mts) {
        this.mts = mts;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getNema() {
        return nema;
    }

    public void setNema(Double nema) {
        this.nema = nema;
    }

    public Integer getOit() {
        return oit;
    }

    public void setOit(Integer oit) {
        this.oit = oit;
    }

    public String getOverload() {
        return overload;
    }

    public void setOverload(String overload) {
        this.overload = overload;
    }

    public Integer getPhase() {
        return phase;
    }

    public void setPhase(Integer phase) {
        this.phase = phase;
    }

    public String getPhaseMonitor() {
        return phaseMonitor;
    }

    public void setPhaseMonitor(String phaseMonitor) {
        this.phaseMonitor = phaseMonitor;
    }

    public Boolean getPlc() {
        return plc;
    }

    public void setPlc(Boolean plc) {
        this.plc = plc;
    }

    public Integer getPressureTransmitter() {
        return pressureTransmitter;
    }

    public void setPressureTransmitter(Integer pressureTransmitter) {
        this.pressureTransmitter = pressureTransmitter;
    }

    public String getPumpBreaker() {
        return pumpBreaker;
    }

    public void setPumpBreaker(String pumpBreaker) {
        this.pumpBreaker = pumpBreaker;
    }

    public Integer getPumpController1() {
        return pumpController1;
    }

    public void setPumpController1(Integer pumpController1) {
        this.pumpController1 = pumpController1;
    }

    public Integer getPumpController2() {
        return pumpController2;
    }

    public void setPumpController2(Integer pumpController2) {
        this.pumpController2 = pumpController2;
    }

    public Integer getPumpController3() {
        return pumpController3;
    }

    public void setPumpController3(Integer pumpController3) {
        this.pumpController3 = pumpController3;
    }

    public Integer getPumpCount() {
        return pumpCount;
    }

    public void setPumpCount(Integer pumpCount) {
        this.pumpCount = pumpCount;
    }

    public Boolean getRainGauge() {
        return rainGauge;
    }

    public void setRainGauge(Boolean rainGauge) {
        this.rainGauge = rainGauge;
    }

    public Boolean getRotationCw() {
        return rotationCw;
    }

    public void setRotationCw(Boolean rotationCw) {
        this.rotationCw = rotationCw;
    }

    public Boolean getRtu() {
        return rtu;
    }

    public void setRtu(Boolean rtu) {
        this.rtu = rtu;
    }

    public String getStartUpCondition() {
        return startUpCondition;
    }

    public void setStartUpCondition(String startUpCondition) {
        this.startUpCondition = startUpCondition;
    }

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

    public Boolean getStationaryGen() {
        return stationaryGen;
    }

    public void setStationaryGen(Boolean stationaryGen) {
        this.stationaryGen = stationaryGen;
    }

    public String getUltrasonic() {
        return ultrasonic;
    }

    public void setUltrasonic(String ultrasonic) {
        this.ultrasonic = ultrasonic;
    }

    public Integer getVoltage() {
        return voltage;
    }

    public void setVoltage(Integer voltage) {
        this.voltage = voltage;
    }

    public Integer getZone() {
        return zone;
    }

    public void setZone(Integer zone) {
        this.zone = zone;
    }

    public Integer getStationBefore() {
        return stationBefore;
    }

    public void setStationBefore(Integer stationBefore) {
        this.stationBefore = stationBefore;
    }

    public Integer getStationAfter() {
        return stationAfter;
    }

    public void setStationAfter(Integer stationAfter) {
        this.stationAfter = stationAfter;
    }

}