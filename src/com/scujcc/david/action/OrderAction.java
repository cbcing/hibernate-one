package com.scujcc.david.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scujcc.david.dao.OrderDao;
import com.scujcc.david.dao.OrderDaoImpl;
import com.scujcc.david.entity.Order;

import java.util.List;

/**
 * Created by David on 4/19/17.
 */
public class OrderAction extends ActionSupport {
    private String customerID;

    public String execute() throws Exception {
        OrderDao orderDao = new OrderDaoImpl();
        List<Order> orders = orderDao.selectOrdersByCID(customerID);
        ActionContext.getContext().getSession().put("orders", orders);
        return SUCCESS;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
