package com.scujcc.david.dao;

import com.scujcc.david.entity.Order;

import java.util.List;

/**
 * Created by David on 4/19/17.
 */
public interface OrderDao {
    public List<Order> selectOrdersByCID(String customerID);
}
