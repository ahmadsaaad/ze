/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.entitis;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author saada1
 */
@Entity
@Table(name = "request_delivery_history")
public class OrderHistory implements Serializable {

    @Id
    @Column(name = "order_history_id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    @NotNull
    private Order delivery_request;

    private OrderStatus status;
    @Column(name = "update_date", columnDefinition = "DATETIME")
    @Temporal(TemporalType.TIMESTAMP)
    @NotNull
    private Date updateDate;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "current_owner_id")
    private Contact currentOwner;

    public OrderHistory(Order order, OrderStatus status, Date updateDate) {
        this.delivery_request = order;
        this.status = status;
        this.updateDate = updateDate;
    }

    public int getId() {
        return id;
    }

    public Order getOrder() {
        return delivery_request;
    }

    public void setOrder(Order delivery_request) {
        this.delivery_request = delivery_request;
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

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public Contact getCurrentOwner() {
        return currentOwner;
    }

    public void setCurrentOwner(Contact currentOwner) {
        this.currentOwner = currentOwner;
    }

}
