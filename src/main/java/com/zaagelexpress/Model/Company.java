/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.Model;

import java.util.HashSet;

/**
 *
 * @author saada1
 */
public class Company{
    
    private int id;
    private String name;
    private String phone;
    private String contactPerson;
    private HashSet<Branch> branches;

    public Company(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public HashSet<Branch> getBranches() {
        return branches;
    }

    public void addBranch( Branch branch) {
        this.branches.add(branch);
    }
    
    
    
    
    
}
