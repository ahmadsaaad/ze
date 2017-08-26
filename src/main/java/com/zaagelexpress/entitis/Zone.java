/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.entitis;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author saada1
 */
@Entity
@Table(name = "zone")
public class Zone implements Serializable {

    @Id
    @Column(name = "zone_id")
    private int id;

    @NotNull
    @Column(name = "area_name")
    private String areaname;

    @NotNull
    private boolean isOperated;

    public Zone(String areaname, boolean isOperated) {
        this.areaname = areaname;
        this.isOperated = isOperated;
    }

    public int getId() {
        return id;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public boolean isIsOperated() {
        return isOperated;
    }

    public void setIsOperated(boolean isOperated) {
        this.isOperated = isOperated;
    }

}
