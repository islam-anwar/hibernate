/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hibernate.hibernatebiddingschemamapping;

import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author eslam java
 */
public class Test {

    public static void main(String[] args) {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();

//        Category c = new Category();
//        c.setId(2);
//
//        Query hqlQuery = (Query) session.createQuery("from Product p where ? member of p.categories ").setEntity(0, c);
//
//        List list = hqlQuery.list();
//
//        Product p = (Product) list.get(0);
//        System.out.println("product name is: " + p.getName());
//
//        Query q = session.createQuery("select p.buyerBidProducts from Product p where p.id=1");
//        Iterator pids = q.list().iterator();
//        while (pids.hasNext()) {
//
//            BuyerBidProduct bid = (BuyerBidProduct) pids.next();
//
//            System.out.println("==========================================\n \n");
//            System.out.println("product name is: " + bid.getDate());
//            System.out.println("product bid " + bid.getBuyer().getValue());
//        }
//
//        //============================================
//        Query q1 = session.createQuery("select sum(buy.amount) from BuyerBuyProduct buy where buy.product.id=1 ");
//        List l = q1.list();
//
//        System.out.println("===============================");
//        System.out.println("amount is: " + l.get(0));
        //========================== using criteria ============================
        Criteria productCriteria1 = session.createCriteria(Product.class);

        Criteria categoryCriteria1 = productCriteria1.createCriteria("categories")
                .add(Restrictions.like("value", "mobile1", MatchMode.ANYWHERE));

        List result = categoryCriteria1.list();

        System.out.println(" product name is: " + ((Product) result.get(0)).getName());
        System.out.println(" product Description is: " + ((Product) result.get(0)).getDescription());

        //=================================================
        Criteria bidsCriteria2 = session.createCriteria(BuyerBidProduct.class);
        Criteria productCriteria2 = bidsCriteria2.createCriteria("product").add(Restrictions.like("name", "sony"));
        List result2 = bidsCriteria2.list();

        Iterator pids = result2.iterator();
        while (pids.hasNext()) {

            BuyerBidProduct bid = (BuyerBidProduct) pids.next();

            System.out.println("==========================================\n \n");
            System.out.println("Date is: " + bid.getDate());
            System.out.println("Amount is " + bid.getAmount());
            System.out.println("Quantity is " + bid.getQuantity());
        }

            //============================================
         Criteria criteria2= session.createCriteria(BuyerBuyProduct.class)
                .setProjection(Projections.sum("amount"))
                .add(Restrictions.like("product.id", 2));

        List result3 = criteria2.list();
        Iterator iterator3 = result3.iterator();
        System.out.println("=============================");
        while (iterator3.hasNext()) {
            Double productAmount = (Double) iterator3.next();
            System.out.println("Product 1 bids are " + productAmount);

        }

    }
}