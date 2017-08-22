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
public class DeliveryPartner extends Carrier{

    private String contactPerson;
    protected ServiceArea area;

    public DeliveryPartner(String name, String phone,String address, String contactPerson, ServiceArea area) {
        this.name = name;
        this.phone = phone;
        this.address=address;
        this.contactPerson = contactPerson;
        this.area = area;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public ServiceArea getArea() {
        return area;
    }

    public void setArea(ServiceArea area) {
        this.area = area;
    }

}
