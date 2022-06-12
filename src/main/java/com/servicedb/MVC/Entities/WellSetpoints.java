package com.servicedb.MVC.Entities;

import javax.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "well_setpoints", schema = "public", catalog = "MPW")
public class WellSetpoints {
    @Basic
    @Column(name = "location", nullable = false, length = -1)
    private String location;
    @Basic
    @Column(name = "lead_on", nullable = true, precision = 0)
    private BigInteger leadOn;
    @Basic
    @Column(name = "lead_off", nullable = true, precision = 0)
    private BigInteger leadOff;
    @Basic
    @Column(name = "lag_on", nullable = true, precision = 0)
    private BigInteger lagOn;
    @Basic
    @Column(name = "lag_off", nullable = true, precision = 0)
    private BigInteger lagOff;
    @Basic
    @Column(name = "low_level", nullable = true, precision = 0)
    private BigInteger lowLevel;
    @Basic
    @Column(name = "high_level", nullable = true, precision = 0)
    private BigInteger highLevel;
    @Basic
    @Column(name = "low_low_level", nullable = true, precision = 0)
    private BigInteger lowLowLevel;
    @Basic
    @Column(name = "high_high_level", nullable = true, precision = 0)
    private BigInteger highHighLevel;
    @Basic
    @Column(name = "lag1_on", nullable = true, precision = 0)
    private BigInteger lag1On;
    @Basic
    @Column(name = "lag2_off", nullable = true, precision = 0)
    private BigInteger lag2Off;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "id", nullable = false)
    private int id;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public BigInteger getLeadOn() {
        return leadOn;
    }

    public void setLeadOn(BigInteger leadOn) {
        this.leadOn = leadOn;
    }

    public BigInteger getLeadOff() {
        return leadOff;
    }

    public void setLeadOff(BigInteger leadOff) {
        this.leadOff = leadOff;
    }

    public BigInteger getLagOn() {
        return lagOn;
    }

    public void setLagOn(BigInteger lagOn) {
        this.lagOn = lagOn;
    }

    public BigInteger getLagOff() {
        return lagOff;
    }

    public void setLagOff(BigInteger lagOff) {
        this.lagOff = lagOff;
    }

    public BigInteger getLowLevel() {
        return lowLevel;
    }

    public void setLowLevel(BigInteger lowLevel) {
        this.lowLevel = lowLevel;
    }

    public BigInteger getHighLevel() {
        return highLevel;
    }

    public void setHighLevel(BigInteger highLevel) {
        this.highLevel = highLevel;
    }

    public BigInteger getLowLowLevel() {
        return lowLowLevel;
    }

    public void setLowLowLevel(BigInteger lowLowLevel) {
        this.lowLowLevel = lowLowLevel;
    }

    public BigInteger getHighHighLevel() {
        return highHighLevel;
    }

    public void setHighHighLevel(BigInteger highHighLevel) {
        this.highHighLevel = highHighLevel;
    }

    public BigInteger getLag1On() {
        return lag1On;
    }

    public void setLag1On(BigInteger lag1On) {
        this.lag1On = lag1On;
    }

    public BigInteger getLag2Off() {
        return lag2Off;
    }

    public void setLag2Off(BigInteger lag2Off) {
        this.lag2Off = lag2Off;
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

        WellSetpoints that = (WellSetpoints) o;

        if (id != that.id) return false;
        if (location != null ? !location.equals(that.location) : that.location != null) return false;
        if (leadOn != null ? !leadOn.equals(that.leadOn) : that.leadOn != null) return false;
        if (leadOff != null ? !leadOff.equals(that.leadOff) : that.leadOff != null) return false;
        if (lagOn != null ? !lagOn.equals(that.lagOn) : that.lagOn != null) return false;
        if (lagOff != null ? !lagOff.equals(that.lagOff) : that.lagOff != null) return false;
        if (lowLevel != null ? !lowLevel.equals(that.lowLevel) : that.lowLevel != null) return false;
        if (highLevel != null ? !highLevel.equals(that.highLevel) : that.highLevel != null) return false;
        if (lowLowLevel != null ? !lowLowLevel.equals(that.lowLowLevel) : that.lowLowLevel != null) return false;
        if (highHighLevel != null ? !highHighLevel.equals(that.highHighLevel) : that.highHighLevel != null)
            return false;
        if (lag1On != null ? !lag1On.equals(that.lag1On) : that.lag1On != null) return false;
        if (lag2Off != null ? !lag2Off.equals(that.lag2Off) : that.lag2Off != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = location != null ? location.hashCode() : 0;
        result = 31 * result + (leadOn != null ? leadOn.hashCode() : 0);
        result = 31 * result + (leadOff != null ? leadOff.hashCode() : 0);
        result = 31 * result + (lagOn != null ? lagOn.hashCode() : 0);
        result = 31 * result + (lagOff != null ? lagOff.hashCode() : 0);
        result = 31 * result + (lowLevel != null ? lowLevel.hashCode() : 0);
        result = 31 * result + (highLevel != null ? highLevel.hashCode() : 0);
        result = 31 * result + (lowLowLevel != null ? lowLowLevel.hashCode() : 0);
        result = 31 * result + (highHighLevel != null ? highHighLevel.hashCode() : 0);
        result = 31 * result + (lag1On != null ? lag1On.hashCode() : 0);
        result = 31 * result + (lag2Off != null ? lag2Off.hashCode() : 0);
        result = 31 * result + id;
        return result;
    }
}
