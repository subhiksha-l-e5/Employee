/*
 * <p>
 * Copyrights 2022 Element5
 * This package com.element5.employee.service has an interface EmployeeService 
 * </p>
 */
package com.element5.employee.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.HibernateException;

import com.element5.employee.dao.EmployeeDAO;
import com.element5.employee.model.Employee;
import com.element5.employee.model.Trainee;
import com.element5.employee.model.Trainer;
import com.element5.employee.service.EmployeeService;
/**
 * <p>
 * This interface  contains all the method declarations that are used to send the data for operations to EmployeeDAO
 * </p>
 *
 * @author L.subhiksha
 * 
 * @since 2022-08-17
 *
 */
public interface EmployeeService {
    /**
     * <p>
     * This method stores the parameters in object of Trainer and stores the object in list
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
     * @param - project name of trainer
     *
     */    
    public void addTrainer(String employeeId, String name, String designation, float salary, LocalDate dateOfJoining, String emailId, 
                           long mobileNumber, String project) throws HibernateException;

    /**
     * <p>
     * The addTrainee method stores the parameters in object of Trainee and stores the object in list
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
    public void addTrainee(String employeeId, String name, String designation, float salary, LocalDate dateOfJoining, String emailId,
                           long mobileNumber, String task) throws HibernateException;

    /**
     * <p>
     * The modifyTrainer method updates Trainer
     * </p>
     *
     * @param - employee id
     *
     * @param - new value for updation
     *
     * @param - modifyValue for case choice
     *
     */
    public void modifyTrainer(String employeeId, String newValue,String modifyValue) throws HibernateException;

    /**
     * <p>
     * The modifyTrainee method updates Trainee  
     * </p>
     *
     * @param - employee id
     *
     * @param - new value for updation
     *
     * @param - modifyValue for case choice
     *
     */
    public void modifyTrainee(String employeeId, String newName, String modifyValue) throws HibernateException;

    /**
     * <p>
     * This method removes Trainer  by id
     * </p>
     *
     * @param - employee id
     *
     *
     */   
    public void removeTrainer(String employeeId) throws HibernateException;

    /**
     * <p>
     * This method  deletes Trainee  by id
     * </p>
     * 
     * @param - employee id
     *
     */  
    public void removeTrainee(String employeeId) throws HibernateException;

    /**
     * <p>
     * This method  returns Trainer  by id 
     * </p>
     *
     * @param - employee id
     * 
     */  
    public Trainer getTrainer(String employeeId) throws HibernateException; 

    /**
     * <p>
     * This method  returns Trainee  by id 
     * </p>
     *
     * @param - employee id
     *
     */    
    public Trainee getTrainee(String employeeId) throws HibernateException; 

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
    public void assignTrainee(String trainerId, String traineeId) throws HibernateException; 

     
}
