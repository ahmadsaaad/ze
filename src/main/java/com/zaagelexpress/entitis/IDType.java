/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.entitis;


/**
 *
 * @author saada1
 */
public enum IDType {
    NATIONALID("National ID"),
    PASSPORT("Passport");

    private String displayName;

    IDType(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return displayName;
    }
}
