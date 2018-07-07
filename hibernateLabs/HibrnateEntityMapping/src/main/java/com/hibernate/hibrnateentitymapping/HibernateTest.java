/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.hibrnateentitymapping;


import dto.Product;
import dto.Seller;
import dto.User;
import java.util.Date;
import java.util.HashSet;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author eslam java
 */
public class HibernateTest {
    
      public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        //================================many to one relation=====================
        
        User user=new User();
        user.setAddress("jhasjdgasj");
        user.setDate_of_birth(new Date());
        user.setEmail("islamanwar27@gmail.com");
        user.setFull_name("islam");
        user.setMobile("01288973254");
        user.setPassword("islamanwar");
        user.setPhone("012889732543");
        user.setUser_name("islam");
        
        Product product1=new Product();
        product1.setName("Nokia");
        product1.setDescription("this is a mobile phone");
        product1.setManufacturing_name("Nokia");
        product1.setQuantity(10);
        product1.setOffered_date(new Date());
        product1.setManufacturing_date(new Date());
        product1.setExpiration_date(new Date());
        product1.setFinish_date(new Date());
        
        Product product2=new Product();
        product2.setName("Samsung");
        product2.setDescription("this is a mobile phone");
        product2.setManufacturing_name("Samsung");
        product2.setQuantity(10);
        product2.setOffered_date(new Date());
        product2.setManufacturing_date(new Date());
        product2.setExpiration_date(new Date());
        product2.setFinish_date(new Date());
        
        HashSet set=new HashSet();
        set.add(product1);
        set.add(product2);
        
        Seller seller=new Seller();
        
        seller.setValue("ajhgdajsdgahd");
        seller.setProducts(set);
        user.setSeller(seller);
       
        
        Transaction trans= session.beginTransaction();
        session.persist(seller);
        trans.commit();
        
        System.out.println("Insertion Don");
        

    }
    
}
