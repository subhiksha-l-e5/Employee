/*
 * <p>
 * Copyrights 2022 Element5
 * This package com.element5.employee.dao has an interface EmployeeDAO
 * </p>
 */
package com.element5.employee.dao;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;

import com.element5.employee.model.Employee;
import com.element5.employee.model.Trainee;
import com.element5.employee.model.Trainer; 
/**
 * <p>
 * This interface EmployeeDAO contains all the method declarations like add, update, view, delete 
 * </p>
 *
 * @author L.subhiksha
 * 
 * @since 2022-08-17
 *
 */
public interface EmployeeDAO {
     
    /**
     * <p>
     * This method is used to add Trainer
     * </p>
     *
     * @param - trainer is the object of Trainer type
     *
     */
    public void insertTrainer(Trainer trainer) throws HibernateException;

    /**
     * <p>
     * This method is used to add Trainee
     * </p>
     *
     * @param - trainee is the object of Trainee type
     *
     */
    public void insertTrainee(Trainee trainee) throws HibernateException ;

    /**
     * <p>
     * This method is used to update Trainer
     * </p>
     *
     * @param - trainer  for updation
     *
     */
    public void updateTrainer(Trainer trainer) throws HibernateException ;

    /**
     * <p>
     * This method is used to update  Trainee
     * </p>
     *
     * @param - trainee for updation
     *
     */
    public void updateTrainee(Trainee trainee) throws HibernateException ;

    /**
     * <p>
     * This method is used to delete Trainer
     * </p>
     *
     * @param - index is used to check the id given by user to delete
     *
     *
     */   
    public void deleteTrainer(Trainer trainer) throws HibernateException ;

    /**
     * <p>
     * This method is used to delete Trainee
     * </p>
     *
     * @param - index is used to check the id given by user to delete
     *
     */   
    public void deleteTrainee(Trainee trainee) throws HibernateException ;

    /**
     * <p>
     * This method is used to view Trainer  
     * </p>
     *
     * @param - index is used to check the id given by user to view
     *
     */   
    public Trainer retrieveTrainer(String id) throws HibernateException ;

    /**
     * <p>
     * This method is used to view Trainee    
     * </p>
     *
     * @param - index is used to check the id given by user to view
     *
     */       
    public Trainee retrieveTrainee(String id) throws HibernateException; 

     /**
     * <p>
     * This method is used to assign Trainee    
     * </p>
     *
     * @param - trainer id
     *
     * @param - trainee id
     *
     */          
    public void assignTrainee(Trainer trainer) throws HibernateException; 
     
}