/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.hibernate2;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author eslam java
 */
public class Test {

    public static void main(String[] args) {

        Configuration cfg = new Configuration();
        cfg.addAnnotatedClass(Users.class);
        cfg.setInterceptor(new UserInterceptor());
        cfg.setListener("save-update", new UserEventListner());
        cfg.addPackage("com.hibernate.hibernate2");
        cfg.setNamingStrategy(new MyNamingStrategy());
        cfg.configure();
        SessionFactory sessionFactory1 = cfg.buildSessionFactory();


        Session session = sessionFactory1.openSession();

        Users user = new Users();

        user.setUserName("Islam Anwar");
        user.setEmail("islamanwar27@gmail.com");
        user.setPassword("islamanwar");

        Transaction trans = session.beginTransaction();
        session.saveOrUpdate(user);
        trans.commit();

        System.out.println("Insertion Don");
        sessionFactory1.close();

    }

}
