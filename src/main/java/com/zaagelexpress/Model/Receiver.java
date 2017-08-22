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
public class Receiver {
    private EndPoint receiver;

    public Receiver(EndPoint receiver) {
        this.receiver = receiver;
    }

    public EndPoint getReceiver() {
        return receiver;
    }

    public void setReceiver(EndPoint receiver) {
        this.receiver = receiver;
    }
    
    
}
