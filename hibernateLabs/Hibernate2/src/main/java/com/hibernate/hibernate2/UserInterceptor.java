/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.hibernate2;

import java.util.Iterator;
import org.hibernate.EmptyInterceptor;

/**
 *
 * @author eslam java
 */
public class UserInterceptor extends EmptyInterceptor{

    @Override
    public String onPrepareStatement(String sql) {
        super.onPrepareStatement(sql);
        System.out.println(sql);
        return super.onPrepareStatement(sql); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void postFlush(Iterator entities) {
        super.postFlush(entities);
        
        System.out.println("postFlush");
        super.postFlush(entities); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
