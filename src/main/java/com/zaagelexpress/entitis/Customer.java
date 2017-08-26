/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.entitis;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author saada1
 */
@Entity
@Table(name = "customer")
public class Customer implements Serializable {

    @Id
    @Column(name = "customer_id")
    private int id;

    @NotNull
    String name;

    public Customer(String name) {
        this.name = name;
    }
    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    Set<Branch> branchs;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Branch> getBranchs() {
        return branchs;
    }

    public void addBranch(Branch branch) {
        if (branchs == null) {
            branchs = new HashSet<>();
        }
        branchs.add(branch);
    }

}
