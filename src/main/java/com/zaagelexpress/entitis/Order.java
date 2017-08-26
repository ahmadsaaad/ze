/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.entitis;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Date;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author saada1
 */
@Entity
@Table(name = "delivery_order")
public class Order implements Serializable {

    @Id
    @Column(name = "order_id")
    private int id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "customer_id")
    @NotNull
    private Customer customer;

    @NotNull
    private String PackInfo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pickup_from_id")
    @NotNull
    private Contact pickupFrom;

    @Column(precision = 10, scale = 3)
    private BigDecimal cashOnDilvery;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "delivery_to_id")
    @NotNull
    private Contact deliverTo;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "current_holder_id")
    private Contact curentHolder;

    private OrderStatus status;

    @Column(name = "last_update", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastUpdate;

    @Column(name = "created_at", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date creationDate;

    @Column(name = "created_by")
    @NotNull
    private String createdBy;

    @OneToMany(mappedBy = "delivery_request")
    private Set<OrderHistory> history;

    public Order(Customer customer, String PackInfo, Contact pickupFrom, Contact deliverTo, String createdBy) {
        this.customer = customer;
        this.PackInfo = PackInfo;
        this.pickupFrom = pickupFrom;
        this.deliverTo = deliverTo;
        this.createdBy = createdBy;

        this.status = OrderStatus.TOBECOLLECTED;
        this.creationDate = new Date();
        this.lastUpdate = new Date();
        OrderHistory newHistory = new OrderHistory(this, status, lastUpdate);
        this.addHistory(newHistory);
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getPackInfo() {
        return PackInfo;
    }

    public void setPackInfo(String PackInfo) {
        this.PackInfo = PackInfo;
    }

    public Contact getPickupFrom() {
        return pickupFrom;
    }

    public void setPickupFrom(Contact pickupFrom) {
        this.pickupFrom = pickupFrom;
    }

    public Contact getDeliverTo() {
        return deliverTo;
    }

    public void setDeliverTo(Contact deliverTo) {
        this.deliverTo = deliverTo;
    }

    public Contact getCurentHolder() {
        return curentHolder;
    }

    public void setCurentHolder(Contact curentHolder) {
        this.curentHolder = curentHolder;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public BigDecimal getCashOnDilvery() {
        return cashOnDilvery;
    }

    public void setCashOnDilvery(BigDecimal cashOnDilvery) {
        this.cashOnDilvery = cashOnDilvery;
    }

    public Set<OrderHistory> getHistory() {
        return history;
    }

    public final void addHistory(OrderHistory newHistory) {
        if (this.history == null) {
            this.history = new HashSet<>();
        }
        history.add(newHistory);
    }

}
