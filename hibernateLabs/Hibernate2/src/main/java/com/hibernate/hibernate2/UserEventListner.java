/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.hibernate2;

import org.hibernate.HibernateException;
import org.hibernate.event.PersistEvent;
import org.hibernate.event.SaveOrUpdateEvent;
import org.hibernate.event.def.DefaultPersistEventListener;
import org.hibernate.event.def.DefaultSaveEventListener;
import org.hibernate.event.def.DefaultSaveOrUpdateEventListener;

/**
 *
 * @author eslam java
 */
public class UserEventListner extends DefaultSaveOrUpdateEventListener{

    @Override
    public void onSaveOrUpdate(SaveOrUpdateEvent event) {
        super.onSaveOrUpdate(event); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Entity name is: "+event.getEntity());
    }

    
    
    
    
}
