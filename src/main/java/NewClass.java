

import com.zaagelexpress.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author saada1
 */
public class NewClass {

    public static void main(String[] args) {
        new NewClass().addStock();
    }
    Session session = null;
    Transaction transaction = null;

    // add new record to user currency conversion history
    // we will firstly persist the logged in user 
    public boolean addStock() {

        try {
            SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();

            //get the current logged in user
            //the best way to implment this is to set the date in the interceptor just before the save operation
           // Employee st = new Employee();

           // session.saveOrUpdate(st);
            transaction.commit();
            return true;

        } catch (Exception ex) {
            System.out.println("Problem creating session factory");
            ex.printStackTrace();
            return false;

        } finally {
            if (session != null && session.isOpen()) {
                session.close();
            }
        }
    }

}
