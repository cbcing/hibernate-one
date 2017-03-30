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
public class CustomerAction extends ActionSupport{
    public String execute() throws Exception{
        CustomerDAO customerDao = new CustomerDAOImpl();
        List<Customer> list = customerDao.getAllCustomers();
        ActionContext.getContext().getSession().put("allCustomers", list);
        return SUCCESS;
    }
}
