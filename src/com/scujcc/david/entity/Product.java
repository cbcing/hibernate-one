package com.scujcc.david.entity;

import java.util.Set;

/**
 * Created by David on 5/3/17.
 */
public class Product {
    private int productID;
    private String productName;
    private Set orderDetails;

    public Set getOrderDetails() {
        return orderDetails;
    }

    public void setOrderDetails(Set orderDetails) {
        this.orderDetails = orderDetails;
    }

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
}
