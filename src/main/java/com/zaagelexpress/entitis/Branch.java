/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.entitis;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author saada1
 */
@Entity
@DiscriminatorValue("branch")
public class Branch extends Contact implements Serializable {

    @Column(name = "user_id")
    private String userID;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "zone_id")
    private Zone zone;
    
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    private Customer customer;

    public Branch(String contactname, String address, String phone, Zone zone, String userID) {
        super(contactname, address, phone);
        this.zone = zone;
        this.userID = userID;
    }

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public Zone getZone() {
        return zone;
    }

    public void setZone(Zone zone) {
        this.zone = zone;
    }

}
