/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author saada1
 */
public class Order {

    private int id;
    private Sender sender;
    private Receiver receiver;
    private Package parcel;
    private ArrayList<OrderProgress> progress;
    boolean cashOnDelivery;
    private final Date creationDate;
    private OrderStatus latestStatus;

    public Order(Sender sender, Receiver receiver, Package parcel, boolean cashOnDelivery, OrderStatus latestStatus) {
        this.sender = sender;
        this.receiver = receiver;
        this.parcel = parcel;
        this.cashOnDelivery = cashOnDelivery;
        this.latestStatus = latestStatus;
        this.creationDate = new Date();
    }

    public int getId() {
        return id;
    }

    public Sender getSender() {
        return sender;
    }

    public void setSender(Sender sender) {
        this.sender = sender;
    }

    public Receiver getReceiver() {
        return receiver;
    }

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    public Package getParcel() {
        return parcel;
    }

    public void setParcel(Package parcel) {
        this.parcel = parcel;
    }

    public ArrayList<OrderProgress> getProgress() {
        return progress;
    }

    public void addProgress(OrderProgress progress) {
        this.progress.add(progress);
    }

    public boolean isCashOnDelivery() {
        return cashOnDelivery;
    }

    public void setCashOnDelivery(boolean cashOnDelivery) {
        this.cashOnDelivery = cashOnDelivery;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public OrderStatus getLatestStatus() {
        return latestStatus;
    }

    public void updateOrder() {
        // to be implmented
    }

}
