/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.entitis;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

/**
 *
 * @author saada1
 */
@Entity
@DiscriminatorValue("crowd")
public class Crowd extends Contact implements Serializable {

    @Column(name = "ID_Number")
    private String IDNumber;
    
    @Column(name = "ID_Type")
    private IDType idType;

    public Crowd(String contactname, String address, String phone, String IDNumber, IDType idType) {
        super(contactname, address, phone);
        this.IDNumber = IDNumber;
        this.idType = idType;
    }

    public String getIDNumber() {
        return IDNumber;
    }

    public void setIDNumber(String IDNumber) {
        this.IDNumber = IDNumber;
    }

    public IDType getIdType() {
        return idType;
    }

    public void setIdType(IDType idType) {
        this.idType = idType;
    }

}
