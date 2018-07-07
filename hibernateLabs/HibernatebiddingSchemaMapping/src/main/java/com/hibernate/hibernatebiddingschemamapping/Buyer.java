package com.hibernate.hibernatebiddingschemamapping;
// Generated Feb 1, 2018 1:11:28 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Buyer generated by hbm2java
 */
public class Buyer  implements java.io.Serializable {


     private Integer id;
     private User user;
     private String value;
     private Set buyerBuyProducts = new HashSet(0);
     private Set buyerBidProducts = new HashSet(0);

    public Buyer() {
    }

	
    public Buyer(User user, String value) {
        this.user = user;
        this.value = value;
    }
    public Buyer(User user, String value, Set buyerBuyProducts, Set buyerBidProducts) {
       this.user = user;
       this.value = value;
       this.buyerBuyProducts = buyerBuyProducts;
       this.buyerBidProducts = buyerBidProducts;
    }
   
    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }
    public User getUser() {
        return this.user;
    }
    
    public void setUser(User user) {
        this.user = user;
    }
    public String getValue() {
        return this.value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }
    public Set getBuyerBuyProducts() {
        return this.buyerBuyProducts;
    }
    
    public void setBuyerBuyProducts(Set buyerBuyProducts) {
        this.buyerBuyProducts = buyerBuyProducts;
    }
    public Set getBuyerBidProducts() {
        return this.buyerBidProducts;
    }
    
    public void setBuyerBidProducts(Set buyerBidProducts) {
        this.buyerBidProducts = buyerBidProducts;
    }




}


