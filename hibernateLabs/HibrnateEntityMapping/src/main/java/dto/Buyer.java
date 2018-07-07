/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author eslam java
 */
public class Buyer {

    private int id;
    private String value;
    private User user;
    private Set buyerBuyProduct = new HashSet();
    private Set buyerBidProduct = new HashSet();

    public Set getBuyerBuyProduct() {
        return buyerBuyProduct;
    }

    public void setBuyerBuyProduct(Set buyerBuyProduct) {
        this.buyerBuyProduct = buyerBuyProduct;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set getBuyerBidProduct() {
        return buyerBidProduct;
    }

    public void setBuyerBidProduct(Set buyerBidProduct) {
        this.buyerBidProduct = buyerBidProduct;
    }

    
}
