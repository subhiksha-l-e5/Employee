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
import org.hibernate.boot.registry.StandardServiceRegistryBuilder; 
import org.hibernate.cfg.Configuration;
import org.hibernate.HibernateException;
import org.hibernate.Query; 
import org.hibernate.Session;
import org.hibernate.SessionFactory; 
import org.hibernate.Transaction;

import com.element5.employee.dao.EmployeeDAO;
import com.element5.employee.model.Employee;
import com.element5.employee.model.Trainee;
import com.element5.employee.model.Trainer;

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
    private static SessionFactory sessionFactory; 

    /**
     * <p>
     * This method is used to return SessionFactory
     * </p>
     */ 
    public SessionFactory getSessionFactory() {
         Configuration configuration = new Configuration().
                   configure("hibernate.cfg.xml").
                   addAnnotatedClass(Trainer.class).
                   addAnnotatedClass(Trainee.class);
        StandardServiceRegistryBuilder reg = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
        SessionFactory sessionFactory = configuration.buildSessionFactory(reg.build());
                
        return sessionFactory;
    }
    /**
     * <p>
     * This method is used to add Trainer
     * </p>
     *
     * @param - trainer is the object of Trainer type
     *
     */ 
    public void insertTrainer(Trainer trainer) throws HibernateException {
        Session session = getSessionFactory().openSession();
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
        Session session = getSessionFactory().openSession();
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
     * This method is used to update name of Trainer   
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - name  for updation
     *
     */
    public void updateTrainerName(Trainer trainer) throws HibernateException { 
        Session session = getSessionFactory().openSession();
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
     * This method is used to update name of Trainee  
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - name  for updation
     *
     */  
    public void updateTraineeName(Trainee trainee) throws HibernateException  {
        Session session = getSessionFactory().openSession();
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
     * updateTrainerDesignation method is used to update Designation of Trainer     
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - Designation for updation
     *
     */      
    public void updateTrainerDesignation(Trainer trainer) throws HibernateException {
        Session session = getSessionFactory().openSession();
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
     * updateTraineeDesignation method is used to update Designation of Trainee    
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - Designation for updation
     *
     */      
    public void updateTraineeDesignation(Trainee trainee) throws HibernateException {
        Session session = getSessionFactory().openSession();
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
     * This method is used to update salary of Trainer 
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - Salary for updation
     *
     */     
    public void updateTrainerSalary(Trainer trainer) throws HibernateException {
        Session session = getSessionFactory().openSession();
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
     * This method is used to update salary of Trainee     
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - Salary for updation
     *
     */    
    public void updateTraineeSalary(Trainee trainee) throws HibernateException {
        Session session = getSessionFactory().openSession();
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
     * This method is used to update project of Trainer
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - project for updation
     *
     */   
    public void updateProject(Trainer trainer) throws HibernateException {
        Session session = getSessionFactory().openSession();
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
     * updateTask method is used to update Task of Trainer
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - newTask is the Task for updation
     *
     */          
    public void updateTask(Trainee trainee) throws HibernateException {
        Session session = getSessionFactory().openSession();
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
        Session session = getSessionFactory().openSession();
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
        Session session = getSessionFactory().openSession();
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
        Session session = getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from trainer  where employee_id =:employeeId";
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
        Session session = getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "from trainee  where employee_id =: employeeId";
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
     * This method is used to return unassigned Trainer   
     * </p>
     *
     * @param - index is used to view the name of trainer
     *
     */       
     /*public List<Trainer> retrieveUnAssignedTrainer() throws HibernateException {
         Session session = getSessionFactory().openSession();
         Transaction transaction = null;
         try {
            transaction = session.beginTransaction();
            String hql = " select t.employee_id, t.name from trainer t where r.trainer_id from trainee r != t.employee_id";
            Query query = session.createQuery(hql); 
           // query.setParameter("trainerId",null);
            List<Trainer> trainers = query.list();
            transaction.commit();
            return(trainers);     
         } catch (HibernateException hibernateException) {
            throw new HibernateException(hibernateException.getMessage());  
         } finally {
            session.close();
        }               
         return null;          
    }*/

    /**
     * <p>
     * This method is used to return unassigned Trainee   
     * </p>
     *
     * @param - index is used to view the name of trainee
     *
     */           
    /*public List<Trainee> retrieveUnAssignedTrainee() throws HibernateException{
        Session session = getSessionFactory().openSession();
        Transaction transaction = null;
        try {
            transaction = session.beginTransaction();
            String hql = "select employee_id ,name from trainee  where trainer_id =: trainerId";
            Query query = session.createQuery(hql);
            query.setParameter("trainerId",null);
            List<Trainee> trainees = query.list();
            for (Trainee aTrainee : trainees) {
                System.out.println( aTrainee.getEmployeeId()+aTrainee.getName());
            }
            transaction.commit();
            return(trainees); 
        } catch (HibernateException hibernateException) {
            throw new HibernateException(hibernateException.getMessage());  
        } finally {
            session.close();
        }               
        //return null;
    }*/

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
        Session session = getSessionFactory().openSession();
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