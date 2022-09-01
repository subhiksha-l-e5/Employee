/*
 * <p>
 * This package com.element5.employee.service has an interface EmployeeService 
 * </p>
 */
package com.element5.employee.service;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    public int addTrainer(String id, String name, String designation, float salary, LocalDate dateOfJoining, String emailId, 
                           long mobileNumber, String project) throws SQLException;

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
    public int addTrainee(String id, String name, String designation, float salary, LocalDate dateOfJoining, String emailId,
                           long mobileNumber, String task, String trainerId) throws SQLException;

    /**
     * <p>
     * The modifyTrainerName method update Trainer name by id with new name
     * </p>
     *
     * @param - employee id
     *
     * @param - employee name for updation
     *
     */
    public int modifyTrainerName(String id, String newName) throws SQLException;

    /**
     * <p>
     * The modifyTraineeName method update Trainee name by id with new name   
     * </p>
     *
     * @param - employee id
     *
     * @param - employee name for updation
     *
     */
    public int modifyTraineeName(String id, String newName) throws SQLException;

    /**
     * <p>
     * The modifyTrainerDesignation method update Trainer designation by id with new designation  
     * </p>
     *
     * @param - employee id
     *
     * @param - designation for updation
     *
     * 
     */    
    public int modifyTrainerDesignation(String id, String newDesignation) throws SQLException;

    /**
     * <p>
     * The modifyTraineeDesignation method update Trainee designation by id with new designation
     * </p>
     *
     * @param - employee id
     *
     * @param - designation for updation
     *
     */    
    public int modifyTraineeDesignation(String id, String newDesignation) throws SQLException;

    /**
     * <p>
     * The modifyTrainerSalary method update Trainer salary by id with new salary
     * </p>
     *
     * @param - employee id
     *
     * @param - salary for updation
     *
     */    
    public int modifyTrainerSalary(String id, float newSalary) throws SQLException;

    /**
     * <p>
     * The modifyTraineeSalary method update Trainee salary by id with new salary     
     * </p>
     *
     * @param - employee id
     *
     * @param - salary for updation
     *
     */  
    public int modifyTraineeSalary(String id, float newSalary) throws SQLException; 

    /**
     * <p>
     * The modifyTrainerProject method update project by id with new project     
     * </p>
     *
     * @param - employee id
     *
     * @param - project for updation
     *
     */  
    public int modifyProject(String id, String newProject) throws SQLException;

    /**
     * <p>
     * The modifyTrainerProject method update task by id with new project     
     * </p>
     *
     * @param - employee id
     *
     * @param - task for updation
     *
     */  
    public int modifyTask(String id, String newTask) throws SQLException; 

    /**
     * <p>
     * This method removes Trainer  by id
     * </p>
     *
     * @param - employee id
     *
     *
     */   
    public int removeTrainer(String id) throws SQLException;

    /**
     * <p>
     * This method  deletes Trainee  by id
     * </p>
     * 
     * @param - employee id
     *
     */  
    public int removeTrainee(String id) throws SQLException;

    /**
     * <p>
     * This method  returns Trainer  by id 
     * </p>
     *
     * @param - employee id
     * 
     */  
    public Trainer getTrainer(String id) throws SQLException; 

    /**
     * <p>
     * This method  returns Trainee  by id 
     * </p>
     *
     * @param - employee id
     *
     */    
    public Trainee getTrainee(String id) throws SQLException; 

    /**
     * <p>
     * This method  returns unassigned Trainer
     * </p>
     *
     * @return - String return unassigned trainer names
     *
     */        
    public List<String> getUnAssignedTrainer() throws SQLException; 

   /**
     * <p>
     * This method  returns unassigned Trainee
     * </p>
     *
     * @return - String return unassigned trainee names
     *
     */      
    public List<String> getUnAssignedTrainee() throws SQLException; 
    
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
    public int assignTrainee(String trainerId, String traineeId) throws SQLException; 

     
}
