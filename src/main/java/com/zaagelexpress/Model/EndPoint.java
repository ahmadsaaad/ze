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
public abstract class EndPoint {
    protected int id;
    protected String name;
    protected String address;
    protected String phone;
    protected ServiceArea area;

    protected EndPoint(String name, String address, String phone, ServiceArea area) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.area = area;
    }

    protected int getId() {
        return id;
    }

    protected String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected String getAddress() {
        return address;
    }

    protected void setAddress(String address) {
        this.address = address;
    }

    protected ServiceArea getArea() {
        return area;
    }

    protected void setArea(ServiceArea area) {
        this.area = area;
    }
}
