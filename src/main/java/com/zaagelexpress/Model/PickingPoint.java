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
public class PickingPoint extends Carrier{

    private String contactPerson;

    public PickingPoint(String name, String phone,String address, String contactPerson) {
        this.name = name;
        this.phone = phone;
        this.address=address;
        this.contactPerson = contactPerson;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

}
