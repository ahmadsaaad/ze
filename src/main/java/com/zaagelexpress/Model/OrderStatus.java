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
public enum OrderStatus {
    PENDING("Pending"),
    TOBECOLLECTED("To Be Collected"),
    COLLECTED("Collected"),
    ONTHEWAY("On The Way"),
    TOBEDELIVERED("To Be Delivered"),
    DELIVERED("Delivered");

    private String displayName;

    OrderStatus(String displayName) {
        this.displayName = displayName;
    }

    public String displayName() {
        return displayName;
    }
}
