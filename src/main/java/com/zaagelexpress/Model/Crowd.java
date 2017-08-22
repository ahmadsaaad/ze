/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.Model;

/**
 *
 * @author saada1
 */
public class Crowd extends Carrier{


    private String IDNumber;
    private IDType idType;

    public Crowd(String name, String address, String phone, String IDNumber, IDType idType) {
        this.name = name;
        this.address = address;
        this.phone = phone;
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
