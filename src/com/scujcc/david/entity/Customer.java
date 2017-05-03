package com.scujcc.david.entity;

import java.util.Set;

/**
 * Created by David on 3/22/17.
 */

/*
 * Customers--(1,n)--Orders---(1,n)--OrderDetail-(n,1)-Product.
 * from left to right.
 */
public class Customer {
    private String CustomerID;
    private String companyName;
    private String contactTitle;
    private String contactName;

    private Set<Order> orders;

    public Set<Order> getOrders() {
        return orders;
    }

    public void setOrders(Set<Order> orders) {
        this.orders = orders;
    }

    public String getCustomerID() {
        return CustomerID;
    }

    public void setCustomerID(String customerID) {
        CustomerID = customerID;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }
}
