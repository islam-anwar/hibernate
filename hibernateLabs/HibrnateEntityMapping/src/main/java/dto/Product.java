/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author eslam java
 */
public class Product {

    private int id;
    private String name;
    private String description;
    private String manufacturing_name;
    private Date manufacturing_date;
    private Date expiration_date;
    private int seller_id;
    private int quantity;
    private Date offered_date;
    private Date finish_date;

    private Seller seller;
    private Set categories = new HashSet<Object>();

    private Set buyerBuyBroduct = new HashSet();
    private Set buyerBidBroduct = new HashSet();

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getManufacturing_name() {
        return manufacturing_name;
    }

    public void setManufacturing_name(String manufacturing_name) {
        this.manufacturing_name = manufacturing_name;
    }

    public Date getManufacturing_date() {
        return manufacturing_date;
    }

    public void setManufacturing_date(Date manufacturing_date) {
        this.manufacturing_date = manufacturing_date;
    }

    public Date getExpiration_date() {
        return expiration_date;
    }

    public void setExpiration_date(Date expiration_date) {
        this.expiration_date = expiration_date;
    }

    public int getSeller_id() {
        return seller_id;
    }

    public void setSeller_id(int seller_id) {
        this.seller_id = seller_id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getOffered_date() {
        return offered_date;
    }

    public void setOffered_date(Date offered_date) {
        this.offered_date = offered_date;
    }

    public Date getFinish_date() {
        return finish_date;
    }

    public void setFinish_date(Date finish_date) {
        this.finish_date = finish_date;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Set getCategories() {
        return categories;
    }

    public void setCategories(Set categories) {
        this.categories = categories;
    }

    public Set getBuyerBuyBroduct() {
        return buyerBuyBroduct;
    }

    public void setBuyerBuyBroduct(Set buyerBuyBroduct) {
        this.buyerBuyBroduct = buyerBuyBroduct;
    }

    public Set getBuyerBidBroduct() {
        return buyerBidBroduct;
    }

    public void setBuyerBidBroduct(Set buyerBidBroduct) {
        this.buyerBidBroduct = buyerBidBroduct;
    }

    
}
