package com.servicedb.MVC.Entities;

import javax.persistence.*;

@Entity
@Table(name = "spill_level")
public class SpillLevel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "location_string", length = 250)
    private String locationString;

    @Column(name = "location_gps_lat")
    private Double locationGpsLat;

    @Column(name = "location_gps_long")
    private Double locationGpsLong;

    @Column(name = "mpw_asset", length = 50)
    private String mpwAsset;

    @Column(name = "spill_level", length = 30)
    private String spillLevel;

    @Column(name = "time_off", length = 50)
    private String timeOff;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocationString() {
        return locationString;
    }

    public void setLocationString(String locationString) {
        this.locationString = locationString;
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

    public String getMpwAsset() {
        return mpwAsset;
    }

    public void setMpwAsset(String mpwAsset) {
        this.mpwAsset = mpwAsset;
    }

    public String getSpillLevel() {
        return spillLevel;
    }

    public void setSpillLevel(String spillLevel) {
        this.spillLevel = spillLevel;
    }

    public String getTimeOff() {
        return timeOff;
    }

    public void setTimeOff(String timeOff) {
        this.timeOff = timeOff;
    }

}