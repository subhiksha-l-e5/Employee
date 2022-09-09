/*
 * <p>
 * Copyrights 2022 Element5
 * This package com.element5.employee.util contains all the util classes such as string util, date util , connection util and hibernate connection util
 * </p>
 */     
package com.element5.employee.util;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder; 
import org.hibernate.cfg.Configuration;
import org.hibernate.Session; 
import org.hibernate.SessionFactory; 

import com.element5.employee.model.Trainee;
import com.element5.employee.model.Trainer;

/**
 * This class hibernate connection util follows singleton pattern and returns session factory 
 * the hibernate.cfg.xml is configured here and annotated classes Trainer and Trainee is added
 */
public class HibernateConnectionUtil {    
    
    private static Session session = null; 
    private static HibernateConnectionUtil hibernateConnectionUtil = null; 

    /**
     * <p>
     * This is a private constructor of this class 
     * </p>
     */
    private HibernateConnectionUtil() {
        Configuration configuration = new Configuration().
        configure("hibernate.cfg.xml").
        addAnnotatedClass(Trainer.class).
        addAnnotatedClass(Trainee.class);
        StandardServiceRegistryBuilder reg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(reg.build());
        session = sessionFactory.openSession();
    } 

    /**
     * <p>
     * This is a method of HibernateConnectionUtil and 
     * it is static as singleton pattern will have static method 
     * it returns the session factory
     * </p>
     */
    public static Session getSession() {
        if(!session.isOpen() || session == null) {
            HibernateConnectionUtil hibernateConnectionUtil = new HibernateConnectionUtil();   
        }        
        return session;
    }
}