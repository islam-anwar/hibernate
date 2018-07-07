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
public class Seller {

    private int id;
    private String value;
    private User user;
    private Set products = new HashSet<Product>();

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

    public Set getProducst() {
        return products;
    }

    public void setProducts(Set product) {
        this.products = product;
    }

    public void addProduct(Product product) {
        product.setSeller(this);
        products.add(product);
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    

}
