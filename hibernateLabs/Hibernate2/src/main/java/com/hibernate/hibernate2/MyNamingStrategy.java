/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.hibernate2;

import org.hibernate.cfg.DefaultNamingStrategy;

/**
 *
 * @author eslam java
 */
public class MyNamingStrategy extends DefaultNamingStrategy {

    @Override
    public String classToTableName(String className) {
        if (className.equals("Users")) {
            return ("users");
        } else {
            return ("EMPTY");
        }
    }


}
