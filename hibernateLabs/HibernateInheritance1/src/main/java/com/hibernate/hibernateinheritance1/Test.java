/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.hibernateinheritance1;

import java.util.Date;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author eslam java
 */
public class Test {
    
      public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        Student student=new Student();
        student.setFirstName("islam");
        student.setLastName("anwar");
        student.setDepartment("Java");
        
        Teacher teacher=new Teacher();
        teacher.setFirstName("islam");
        teacher.setLastName("anwar");
        teacher.setHireDate(new Date());
        
        
        
        
        
        Transaction trans= session.beginTransaction();
        session.persist(teacher);
        session.persist(student);
        trans.commit();
        
        System.out.println("Insertion Don");
        

    }
    
}
