package com.scujcc.david.dao;

import com.scujcc.david.entity.Order;
import com.scujcc.david.util.HibernateUtil;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import java.util.List;

/**
 * Created by David on 4/19/17.
 */
public class OrderDaoImpl implements OrderDao {

    //Query Version. Achieve by Query version.
    @Override
    public List<Order> selectOrdersByCID(String customerID) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        //HQL, but not SQL. HQL is an object-oriented query language.
        Query query = session.createQuery("from Order where customer.customerID = ?");
        query.setString(0, customerID);
        List<Order> orders = query.list();
        return orders;
    }

//    //Criteria Version. Achieve by Criteria version.
//    @Override
//    public List<Order> selectOrdersByCID(String customerID) {
//        //get session.
//        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//        //start a transaction.
//        session.beginTransaction();
//        //创建条件查询接口。也是通过session创建。
//        Criteria criteria = session.createCriteria(Order.class);
//        criteria.add(Restrictions.eq("customer.CustomerID", customerID));
//        List<Order> orders = criteria.list();
//        HibernateUtil.getSessionFactory().getCurrentSession().getTransaction().commit();
//        return orders;
//    }
}
