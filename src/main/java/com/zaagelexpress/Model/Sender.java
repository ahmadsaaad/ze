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
public class Sender {
    
    private EndPoint sender;

    public Sender(EndPoint sender) {
        this.sender = sender;
    }

    public EndPoint getSender() {
        return sender;
    }

    public void setSender(EndPoint sender) {
        this.sender = sender;
    }
}
