/*
 * <p>
 * Copyrights 2022 element5
 * This package com.element5.employee.service.impl has EmployeeService class
 * </p>
 */
package com.element5.employee.service.impl;

import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

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
    public int addTrainer(String id, String name, String designation, float salary, LocalDate dateOfJoining,
                           String emailId, long mobileNumber, String project) throws SQLException{
        Trainer trainer = new Trainer(id, name, designation, salary, dateOfJoining, emailId, mobileNumber, project);
        return employeeDaoImpl.insertTrainer(trainer);
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
    public int addTrainee(String id, String name, String designation, float salary, LocalDate dateOfJoining,
                           String emailId, long mobileNumber, String task, String trainerId) throws SQLException {
        Trainee trainee = new Trainee( id, name, designation, salary, dateOfJoining, emailId, mobileNumber, task, trainerId);
        return employeeDaoImpl.insertTrainee(trainee);
    }

    /**
     * <p>
     * This method update Trainer name by id with new name  
     * </p>
     *
     * @param - employee id
     *
     * @param - employee name for updation
     *
     * @return - int
     */
    public int modifyTrainerName(String id, String newName) throws SQLException { 
        return employeeDaoImpl.updateTrainerName(id, newName);     
    }

    /**
     * <p>
     * This method update Trainee name by id with new name
     * </p>
     *
     * @param - employee id
     *
     * @param - employee name for updation
     *
     * @return - int
     *
     */
    public int modifyTraineeName(String id, String newName) throws SQLException { 
        return employeeDaoImpl.updateTraineeName(id, newName);    
    }

    /**
     * <p>
     * This method update Trainer designation by id with new designation
     * </p>
     * @param - employee id
     *
     * @param - designation for updation
     *
     * @return - int
     *    
     */
    public int modifyTrainerDesignation(String id, String newDesignation) throws SQLException {
        return employeeDaoImpl.updateTrainerDesignation(id, newDesignation);
    }

    /**
     * <p>
     * This method update Trainee designation by id with new designation     
     * </p>
     *
     * @param - employee id
     *
     * @param - designation for updation
     *
     * @return - int
     *
     */   
    public int modifyTraineeDesignation(String id, String newDesignation) throws SQLException {
        return employeeDaoImpl.updateTraineeDesignation(id, newDesignation);
    } 

    /**
     * <p>
     * This method update Trainer salary by id with new salary
     * </p>
     *
     * @param - employee id
     *
     * @param - salary for updation
     *
     * @return - int
     *
     */  
    public int modifyTrainerSalary(String id, float newSalary) throws SQLException {
        return employeeDaoImpl.updateTrainerSalary(id, newSalary);
    }

    /**
     * <p>
     * This method update Trainee salary by id with new salary
     * </p>
     * @param - employee id
     *
     * @param - salary for updation
     *
     * @return - int
     *
     */  
    public int modifyTraineeSalary(String id, float newSalary) throws SQLException {
        return employeeDaoImpl.updateTraineeSalary(id, newSalary);
    }

    /**
     * <p>
     * This method update Trainer project by id with new project
     * </p>
     *
     * @param - employee id
     *
     * @param - project for updation
     *
     * @return - int
     *
     */  
    public int modifyProject(String id, String newProject) throws SQLException {
        return employeeDaoImpl.updateProject(id, newProject);
    }

    /**
     * <p>
     * This method update Trainee task by id with new task
     * </p>
     * @param - employee id
     *
     * @param - task for updation
     *
     * @return - int
     *
     */  
    public int modifyTask(String id, String newTask) throws SQLException {
        return employeeDaoImpl.updateTask(id, newTask);
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
    public int removeTrainer(String id) throws SQLException {
        return employeeDaoImpl.deleteTrainer(id);
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
    public int removeTrainee(String id) throws SQLException {
        return employeeDaoImpl.deleteTrainee(id);
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
    public Trainer getTrainer(String id) throws SQLException {
        return employeeDaoImpl.retrieveTrainer(id);   
    }

    /**
     * <p>
     * This method  returns Trainee  by id 
     * </p> 
     *
     * @param - employee id
     *
     */  
    public Trainee getTrainee(String id) throws SQLException{
        return employeeDaoImpl.retrieveTrainee(id);      
    }
     
    /**
     * <p>
     * This method  returns unassigned  Trainer   
     * </p> 
     *
     * @return Trainer returns trainer
     *
     */  
   public List<String> getUnAssignedTrainer() throws SQLException {
        return employeeDaoImpl.retrieveUnAssignedTrainer();
   }

    /**
     * <p>
     * This method  returns unassigned  Trainee   
     * </p> 
     *
     * @return Trainee returns trainee
     *
     */   
   public List<String> getUnAssignedTrainee() throws SQLException {
        return employeeDaoImpl.retrieveUnAssignedTrainee();        
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
    public int assignTrainee(String trainerId, String traineeId) throws SQLException {
        return employeeDaoImpl.assignTrainee(trainerId, traineeId);
        
    }     

}
