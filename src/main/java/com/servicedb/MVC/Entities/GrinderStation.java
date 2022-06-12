package com.servicedb.MVC.Entities;

import javax.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "grinder_station", schema = "public", catalog = "MPW")
public class GrinderStation {
    @Basic
    @Column(name = "station_num", nullable = false, precision = 0)
    private BigInteger stationNum;
    @Basic
    @Column(name = "station_name", nullable = true, length = 100)
    private String stationName;
    @Basic
    @Column(name = "location_gps_lat", nullable = true, precision = 0)
    private BigInteger locationGpsLat;
    @Basic
    @Column(name = "location_gps_long", nullable = true, precision = 0)
    private BigInteger locationGpsLong;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    public BigInteger getStationNum() {
        return stationNum;
    }

    public void setStationNum(BigInteger stationNum) {
        this.stationNum = stationNum;
    }

    public String getStationName() {
        return stationName;
    }

    public void setStationName(String stationName) {
        this.stationName = stationName;
    }

    public BigInteger getLocationGpsLat() {
        return locationGpsLat;
    }

    public void setLocationGpsLat(BigInteger locationGpsLat) {
        this.locationGpsLat = locationGpsLat;
    }

    public BigInteger getLocationGpsLong() {
        return locationGpsLong;
    }

    public void setLocationGpsLong(BigInteger locationGpsLong) {
        this.locationGpsLong = locationGpsLong;
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

        GrinderStation that = (GrinderStation) o;

        if (id != that.id) return false;
        if (stationNum != null ? !stationNum.equals(that.stationNum) : that.stationNum != null) return false;
        if (stationName != null ? !stationName.equals(that.stationName) : that.stationName != null) return false;
        if (locationGpsLat != null ? !locationGpsLat.equals(that.locationGpsLat) : that.locationGpsLat != null)
            return false;
        if (locationGpsLong != null ? !locationGpsLong.equals(that.locationGpsLong) : that.locationGpsLong != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = stationNum != null ? stationNum.hashCode() : 0;
        result = 31 * result + (stationName != null ? stationName.hashCode() : 0);
        result = 31 * result + (locationGpsLat != null ? locationGpsLat.hashCode() : 0);
        result = 31 * result + (locationGpsLong != null ? locationGpsLong.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
