package com.scujcc.david.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by David on 3/29/17.
 */
public class HibernateUtil {
    private static SessionFactory sessionFactory;

    static{
        try {
            Configuration configuration = new Configuration().configure();
            StandardServiceRegistry serviceRegistry =
                    new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
            sessionFactory = configuration.buildSessionFactory(serviceRegistry);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
