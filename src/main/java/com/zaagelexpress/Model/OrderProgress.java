/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.Model;

import java.util.Date;

/**
 *
 * @author saada1
 */
public class OrderProgress {

    private int id;
    private Order order;
    private OrderStatus status;
    private Date updateDate;
    private Carrier currentOwner;

    public OrderProgress(Order order, OrderStatus status) {
        this.order = order;
        this.status = status;
        this.updateDate = new Date();
    }

    public OrderProgress(Order order, OrderStatus status, Carrier currentOwner) {
        this.order = order;
        this.status = status;
        this.currentOwner = currentOwner;
        this.updateDate = new Date();
    }

    public int getId() {
        return id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public Carrier getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(Carrier currentOwner) {
        this.currentOwner = currentOwner;
    }

}
