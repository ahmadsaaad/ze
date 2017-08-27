/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.zaagelexpress.rest;

/**
 *
 * @author saada1
 */

import com.google.firebase.auth.FirebaseAuth;
import com.zaagelexpress.utils.FireBaseConnection;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;

@Path("/order")
public class Order {

    @GET
    @Path("/{param}")
    public Response getMsg(@PathParam("param") String msg) {

        FirebaseAuth zaagelXAuthApp= FireBaseConnection.getFirebaseAppInstance();
        String output = "Jersey say : " + zaagelXAuthApp.getUser(msg).getResult().getEmail();

        return Response.status(200).entity(output).build();

    }

}
