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
public class ServiceArea {

    private int id;
    private String Name;
    private boolean isActive;

    public ServiceArea(String Name, boolean isActive) {
        this.Name = Name;
        this.isActive = isActive;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }


    

}
