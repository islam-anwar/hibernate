/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.hibernatejpa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author eslam java
 */
public class Test {

    public static void main(String[] args) {

        EntityManagerFactory factory = Persistence.createEntityManagerFactory("HibernateJPA");
        EntityManager mgr = factory.createEntityManager();

        Users user = new Users();

        user.setUserName("Islam Anwar");
        user.setEmail("islamanwar27@gmail.com");
        user.setPassword("islamanwar");
        mgr.getTransaction().begin();
        mgr.persist(user);
        mgr.getTransaction().commit();
        mgr.close();
        factory.close();
        System.out.println("Insertion Don");
    }

}
