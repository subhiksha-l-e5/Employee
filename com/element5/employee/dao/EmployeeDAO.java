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
     * This method is used to return SessionFactory
     * </p>
     *
     */
    public SessionFactory getSessionFactory();

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
     * This method is used to update name of Trainer
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - name  for updation
     *
     */
    public void updateTrainerName(Trainer trainer) throws HibernateException ;

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
    public void updateTraineeName(Trainee trainee) throws HibernateException ;

    /**
     * <p>
     * This method is used to update Designation of Trainer
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - Designation for updation
     *
     */   
    public void updateTrainerDesignation(Trainer trainer) throws HibernateException ;

    /**
     * <p>
     * This method is used to update Designation of Trainee
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - Designation for updation
     *
     */    
    public void updateTraineeDesignation(Trainee trainee) throws HibernateException ; 

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
    public void updateTrainerSalary(Trainer trainer) throws HibernateException ;

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
    public void updateTraineeSalary(Trainee trainee) throws HibernateException ;

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
    public void updateProject(Trainer trainer) throws HibernateException ;

    /**
     * <p>
     * This method is used to update Task of Trainer   
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - Task for updation
     *
     */   
    public void updateTask(Trainee trainee) throws HibernateException ;

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
     * This method is used to view unassigned Trainer    
     * </p>
     *
     * @param - index is used to view the name of unassigned Trainer
     *
     */      
   // public List<Trainer> retrieveUnAssignedTrainer() throws HibernateException; 

    /**
     * <p>
     * This method is used to view unassigned Trainee    
     * </p>
     *
     * @param - index is used to view the name of unassigned Trainee
     *
     */       
   // public List<Trainee> retrieveUnAssignedTrainee() throws HibernateException; 

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