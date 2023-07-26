package com.utility;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import java.util.Properties;

import com.entity.SuperMarket;
import com.entity.Item;

public class HibernateUtilities {

	private static SessionFactory sessionFactory=null;
    public static SessionFactory getSessionFactory()
    {
        
        if(sessionFactory==null)
        {
           try 
           {
               Configuration configuration=new Configuration();
               
               Properties settings=new Properties();
               
               settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
               settings.put(Environment.URL, "jdbc:mysql://localhost:3306/hari");
               settings.put(Environment.USER, "root");
               settings.put(Environment.PASS, "root");
               settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
               settings.put(Environment.SHOW_SQL, true);
               settings.put(Environment.FORMAT_SQL, true);
               settings.put(Environment.HBM2DDL_AUTO, "update");
               
               configuration.setProperties(settings);
               
               configuration.addAnnotatedClass(Item.class);
               configuration.addAnnotatedClass(SuperMarket.class);
               
               ServiceRegistry serviceRegistry=(ServiceRegistry) new StandardServiceRegistryBuilder().applySettings(configuration.getProperties()).build();
               
               sessionFactory=configuration.buildSessionFactory(serviceRegistry);
               
               
               
           }
           catch (Exception e)
           {
            System.out.println(e);
           }
        }
        
        return sessionFactory;
}
}


