/*
 * <p>
 * Copyrights 2022 Element5
 * This package com.element5.employee.dao.impl has EmployeeDao class
 * </p>
 */
package com.element5.employee.dao.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.HibernateException;
import org.hibernate.Query; 
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.element5.employee.dao.EmployeeDAO;
import com.element5.employee.model.Employee;
import com.element5.employee.model.Trainee;
import com.element5.employee.model.Trainer;
import com.element5.employee.util.HibernateConnectionUtil;

/**
 * <p> 
 * This class EmployeeDaoImpl contains ArrayList of Trainer and Trainer 
 * All the add, update , view, delete operations are done here
 * </p>
 *
 * @author L.subhiksha
 * 
 * @since 2022-08-17
 *
 */ 
public class EmployeeDAOImpl implements EmployeeDAO { 
     
    /**
     * <p>
     * This method is used to add Trainer
     * </p>
     *
     * @param - trainer is the object of Trainer type
     *
     */ 
    public void insertTrainer(Trainer trainer) throws HibernateException {
        Session session = HibernateConnectionUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(trainer);
            transaction.commit(); 
        } catch (HibernateException hibernateException) {
            throw new HibernateException(hibernateException.getMessage());
        } finally {
            session.close();
        }     
    } 
   
     /**
     * <p>
     * This method is used to add Trainee
     * </p>
     *
     * @param - trainee is the object of Trainee type
     *
     */  
    public void insertTrainee(Trainee trainee) throws HibernateException {
        Session session = HibernateConnectionUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.save(trainee);
            transaction.commit(); 
        } catch (HibernateException hibernateException) { 
            throw new HibernateException(hibernateException.getMessage());
        } finally {
            session.close();
        }          
    }

    /**
     * <p>
     * This method is used to update Trainer   
     * </p>
     *
     * @param - trainer for updation
     *
     */
    public void updateTrainer(Trainer trainer) throws HibernateException { 
        Session session = HibernateConnectionUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(trainer); 
            transaction.commit();   
        } catch (HibernateException hibernateException) {
            throw new HibernateException(hibernateException.getMessage());
        } finally {
            session.close();
        }     
    }

    /**
     * <p>
     * This method is used to  Trainee  
     * </p>
     *
     * @param - trainee for updation
     *
     */  
    public void updateTrainee(Trainee trainee) throws HibernateException  {
        Session session = HibernateConnectionUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(trainee); 
            transaction.commit();   
        } catch (HibernateException hibernateException) {
            throw new HibernateException(hibernateException.getMessage());
        } finally {
            session.close();
        }     
    }

    /**
     * <p>
     * deleteTrainer method is used to delete Trainer
     * </p>
     *
     * @param - index is used to check the id given by user to delete
     *
     */                  
    public void deleteTrainer(Trainer trainer) throws HibernateException {
        Session session = HibernateConnectionUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(trainer); 
            transaction.commit(); 
        } catch (HibernateException hibernateException) {
            throw new HibernateException(hibernateException.getMessage());
        } finally {
            session.close();
        }     
    }  

    /**
     * <p>
     * deleteTrainee method is used to delete Trainee   
     * </p>
     *
     * @param - index is used to check the id given by user to delete
     *
     */              
    public void deleteTrainee(Trainee trainee) throws HibernateException {
        Session session = HibernateConnectionUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction(); 
            session.update(trainee); 
            transaction.commit();  
        } catch (HibernateException hibernateException) {
            throw new HibernateException(hibernateException.getMessage());
        } finally {
            session.close();
        }     
    }

    /**
     * <p>
     * retrieveTrainer method is used to view Trainer  
     * </p>
     *
     * @param - index is used to check the id given by user to view
     *
     */       
    public Trainer retrieveTrainer(String employeeId) throws HibernateException {
        Session session = HibernateConnectionUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from Trainer where employeeId =:employeeId";
            Query query = session.createQuery(hql);
            query.setParameter("employeeId",employeeId);
            transaction.commit();   
            return (Trainer) query.uniqueResult();                    
        } catch (HibernateException hibernateException) {
            throw new HibernateException(hibernateException.getMessage());  
        } finally {
            session.close();
        }           
    }

    /**
     * <p>
     * retrieveTrainee method is used to view Trainee   
     * </p>
     *
     * @param - index is used to check the id given by user to view
     *
     */       
    public Trainee retrieveTrainee(String employeeId) throws HibernateException {
        Session session = HibernateConnectionUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from Trainee  where employeeId =: employeeId";
            Query query = session.createQuery(hql);
            query.setParameter("employeeId",employeeId);
            transaction.commit();
            return (Trainee) query.uniqueResult();
        } catch (HibernateException hibernateException) {
            throw new HibernateException(hibernateException.getMessage());
        } finally {
            session.close();
        }     
    }

    /**
     * <p>
     * This method  is used to assign  Trainee for Trainer  
     * </p> 
     *
     * @param -  trainer id
     *
     * @param -  trainee names List
     *
     * @return - void
     */     
    public void assignTrainee(Trainer trainer) throws HibernateException{
        Session session = HibernateConnectionUtil.getSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            session.update(trainer); 
            transaction.commit(); 
        } catch (HibernateException hibernateException) {
            throw new HibernateException(hibernateException.getMessage());
        } finally {
            session.close();
        }            
    }     
}