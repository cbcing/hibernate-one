package com.scujcc.david.util;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Created by David on 3/29/17.
 */

//该工具类的目的是为那些需要session（会话）的类提供会话工厂。
public class HibernateUtil {

    private static SessionFactory sessionFactory;

    static{
        try {
            //获取hibernate的主配置文件。（注意：只要读了主配置文件，自然就会读其他的配置文件，因为这些配置文件都在主配置文件中定义了的。）
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
