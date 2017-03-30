package com.scujcc.david.dao;

import com.scujcc.david.entity.Customer;

import java.util.List;

/**
 * Created by David on 3/29/17.
 */

/*
 * 用接口的原因：
 */
public interface CustomerDAO {
    public List<Customer> getAllCustomers();
}
