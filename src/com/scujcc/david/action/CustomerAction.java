package com.scujcc.david.action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.scujcc.david.dao.CustomerDAO;
import com.scujcc.david.dao.CustomerDAOImpl;
import com.scujcc.david.entity.Customer;

import java.util.List;

/**
 * Created by David on 3/29/17.
 */
public class CustomerAction extends ActionSupport {

    private String customerID;	//cbc

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public String execute() throws Exception{
        CustomerDAO customerDao = new CustomerDAOImpl();
        List<Customer> list = customerDao.getAllCustomers();
        Customer customer = customerDao.selectCustomer(customerID);
        ActionContext.getContext().getSession().put("customer", customer);
//        ActionContext.getContext().getSession().put("allCustomers", customer);
        return SUCCESS;
    }
}
