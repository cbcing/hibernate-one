package com.scujcc.david.dao;

import com.scujcc.david.entity.Customer;
import com.scujcc.david.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by David on 3/29/17.
 */
public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public List<Customer> getAllCustomers() {
        //一个session代表程序与数据库的一次会话。
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        //创建一个查询，但是查询不是面对数据库，而是面对对象的。而Hibernate的作用就是把面向对象的查询转化成面向数据库的查询。
        Query query = session.createQuery("from Customer");
        List list = query.list();
        //提交。
        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
        return list;
    }
}
