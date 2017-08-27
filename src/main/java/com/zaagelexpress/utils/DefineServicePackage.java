/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.utils;

import org.glassfish.jersey.server.ResourceConfig;

/**
 *
 * @author ahmad
 */
public class DefineServicePackage extends ResourceConfig {

    public DefineServicePackage() {
        packages("com.zaagelexpress.rest");

    }

}
