/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.github.lgooddatepicker.demo;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Asus
 */
@Entity
@Table(name = "LOCATION", catalog = "", schema = "NBUSER")
@NamedQueries({
    @NamedQuery(name = "Location.findAll", query = "SELECT l FROM Location l")
    , @NamedQuery(name = "Location.findByLocid", query = "SELECT l FROM Location l WHERE l.locid = :locid")
    , @NamedQuery(name = "Location.findByLocname", query = "SELECT l FROM Location l WHERE l.locname = :locname")})
public class Location implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "LOCID")
    private String locid;
    @Basic(optional = false)
    @Column(name = "LOCNAME")
    private String locname;

    public Location() {
    }

    public Location(String locid) {
        this.locid = locid;
    }

    public Location(String locid, String locname) {
        this.locid = locid;
        this.locname = locname;
    }

    public String getLocid() {
        return locid;
    }

    public void setLocid(String locid) {
        String oldLocid = this.locid;
        this.locid = locid;
        changeSupport.firePropertyChange("locid", oldLocid, locid);
    }

    public String getLocname() {
        return locname;
    }

    public void setLocname(String locname) {
        String oldLocname = this.locname;
        this.locname = locname;
        changeSupport.firePropertyChange("locname", oldLocname, locname);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (locid != null ? locid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Location)) {
            return false;
        }
        Location other = (Location) object;
        if ((this.locid == null && other.locid != null) || (this.locid != null && !this.locid.equals(other.locid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.github.lgooddatepicker.demo.Location[ locid=" + locid + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
