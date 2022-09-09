/*
 * <p>
 * Copyrights 2022 Element5
 * This package com.element5.employee.service.impl has EmployeeService class
 * </p>
 */
package com.element5.employee.service.impl;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

import com.element5.employee.dao.EmployeeDAO;
import com.element5.employee.dao.impl.EmployeeDAOImpl;
import com.element5.employee.model.Employee;
import com.element5.employee.model.Trainee;
import com.element5.employee.model.Trainer;
import com.element5.employee.service.EmployeeService;

/**
 * <p>
 * The class EmployeeService has all the business logics like add, update, view, delete
 * </p>
 *
 * @author L.subhiksha
 * 
 * @since 2022-08-17
 *
 */
public class EmployeeServiceImpl implements EmployeeService {
    
    private EmployeeDAO employeeDaoImpl = new EmployeeDAOImpl();

    /**
     * <p>
     * This method stores the parameters in object of Trainer and stores the object in list
     *</p>
     *
     * @param - employee id
     *
     * @param - employee name
     *
     * @param - employee's company name
     *
     * @param - employee's designation
     *
     * @param - employee's salary
     *
     * @param - employee's date of joining
     *
     * @param - employee's email id
     *
     * @param - employee's mobile number
     *
     * @param - project name of trainer
     *
     */
    public void addTrainer(String employeeId, String name, String designation, float salary, LocalDate dateOfJoining,
                           String emailId, long mobileNumber, String project) throws HibernateException{
        Trainer trainer = new Trainer(employeeId, name, designation, salary, dateOfJoining, emailId, mobileNumber, project);
        employeeDaoImpl.insertTrainer(trainer);
    }
 
    /**
     * <p>
     * This method stores the parameters in object of Trainee and stores the object in list
     * </p>
     *
     * @param - employee id
     *
     * @param - employee name
     *
     * @param - employee's company name
     *
     * @param - employee's designation
     *
     * @param - employee's salary
     *
     * @param - employee's date of joining
     *
     * @param - employee's email id
     *
     * @param - employee's mobile number
     *
     * @param - task name of trainee
     *
     */
    public void addTrainee(String employeeId, String name, String designation, float salary, LocalDate dateOfJoining,
                           String emailId, long mobileNumber, String task) throws HibernateException {
        Trainee trainee = new Trainee( employeeId, name, designation, salary, dateOfJoining, emailId, mobileNumber, task);
        employeeDaoImpl.insertTrainee(trainee);
    }

    /**
     * <p>
     * This method update Trainer  by id  
     * </p>
     *
     * @param - employee id
     *
     * @param - employee name for updation
     *
     */
    public void modifyTrainer(String employeeId, String newValue, String modifyValue) throws HibernateException { 
        switch (modifyValue) {
            case "name":
               Trainer trainer = employeeDaoImpl.retrieveTrainer(employeeId);
               trainer.setName(newValue); 
               employeeDaoImpl.updateTrainer(trainer);
               break;
            
            case "designation":
               Trainer trainer = employeeDaoImpl.retrieveTrainer(employeeId);
               trainer.setDesignation(newValue);
               employeeDaoImpl.updateTrainer(trainer);
               break; 
           
            case "project":
               Trainer trainer = employeeDaoImpl.retrieveTrainer(employeeId);
               trainer.setProject(newValue);
               employeeDaoImpl.updateTrainer(trainer);
               break;
         
            default:
                break;
        }
    }

    public void modifyTrainee(String employeeId, String newValue, String modifyValue) throws HibernateException { 
        switch (modifyValue) {
           case "name":
               Trainee trainee = employeeDaoImpl.retrieveTrainee(employeeId);
               trainee.setName(newValue); 
               employeeDaoImpl.updateTrainee(trainee);
               break;
            
           case "designation":
                Trainee trainee = employeeDaoImpl.retrieveTrainee(employeeId);
                trainee.setDesignation(newValue);
                employeeDaoImpl.updateTrainee(trainee);
                break; 
           
           case "project":
                Trainee trainee = employeeDaoImpl.retrieveTrainee(employeeId);
                trainee.setTask(newValue);
                employeeDaoImpl.updateTrainee(trainee);
                break;
         
           default:
                break;
        }
    }
    
    /**
     * <p>
     * This method  deletes Trainer  by id      
     * </p>
     *
     * @param - employee id
     *
     * @return - int
     *
     */  
    public void removeTrainer(String employeeId) throws HibernateException {
        boolean isAssigned = false;
        Trainer trainer = employeeDaoImpl.retrieveTrainer(employeeId);
        trainer.setNotActive(isAssigned);
        employeeDaoImpl.deleteTrainer(trainer);
    }  

    /**
     * <p>
     * This method  deletes Trainee  by id 
     * </p>
     *
     * @param - employee id
     *
     * @return - int
     *
     */  
    public void removeTrainee(String employeeId) throws HibernateException {
        boolean isAssigned = false;
        Trainee trainee = employeeDaoImpl.retrieveTrainee(employeeId);
        trainee.setNotActive(isAssigned);
        employeeDaoImpl.deleteTrainee(trainee);    
    }

    /**
     * <p>
     * This method  returns Trainer  by id 
     * </p>
     *
     * @param - employee id
     *
     * @return - int
     *
     */     
    public Trainer getTrainer(String employeeId) throws HibernateException {
        return employeeDaoImpl.retrieveTrainer(employeeId);   
    }

    /**
     * <p>
     * This method  returns Trainee  by id 
     * </p> 
     *
     * @param - employee id
     *
     */  
    public Trainee getTrainee(String employeeId) throws HibernateException{
        return employeeDaoImpl.retrieveTrainee(employeeId);      
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
     * @return - int
     */     
    public void assignTrainee(String trainerId, String traineeId) throws HibernateException {
        Trainee trainee = employeeDaoImpl.retrieveTrainee(traineeId);
        Trainer trainer = employeeDaoImpl.retrieveTrainer(trainerId);
        trainer.getTrainees().add(trainee);
        employeeDaoImpl.assignTrainee(trainer);    
    }     

}
