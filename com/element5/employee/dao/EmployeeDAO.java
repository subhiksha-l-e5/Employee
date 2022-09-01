/*
 * <p>
 * This package com.element5.employee.dao has an interface EmployeeDAO
 * </p>
 */
package com.element5.employee.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
    public int insertTrainer(Trainer trainer) throws SQLException;

    /**
     * <p>
     * This method is used to return Trainer list
     * </p>
     *
     * @return - List<Trainer> returns Trainer
     *
     */
    public List<Trainer> getTrainers();

    /**
     * <p>
     * This method is used to add Trainee
     * </p>
     *
     * @param - trainee is the object of Trainee type
     *
     */
    public int insertTrainee(Trainee trainee) throws SQLException ;

    /**
     * <p>
     * This method is used to return Trainee list
     * </p>
     *
     * @return - List<Trainee> returns Trainee
     *
     */
    public List<Trainee> getTrainees();
    
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
    public int updateTrainerName(String id, String newName) throws SQLException ;

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
    public int updateTraineeName(String id, String newName) throws SQLException ;

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
    public int updateTrainerDesignation(String id, String newDesignation) throws SQLException ;

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
    public int updateTraineeDesignation(String id, String newDesignation) throws SQLException ; 

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
    public int updateTrainerSalary(String id, float newSalary) throws SQLException ;

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
    public int updateTraineeSalary(String id, float newSalary) throws SQLException ;

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
    public int updateProject(String id, String newProject) throws SQLException ;

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
    public int updateTask(String id, String newTask) throws SQLException ;

    /**
     * <p>
     * This method is used to delete Trainer
     * </p>
     *
     * @param - index is used to check the id given by user to delete
     *
     *
     */   
    public int deleteTrainer(String id) throws SQLException ;

    /**
     * <p>
     * This method is used to delete Trainee
     * </p>
     *
     * @param - index is used to check the id given by user to delete
     *
     */   
    public int deleteTrainee(String id) throws SQLException ;

    /**
     * <p>
     * This method is used to view Trainer  
     * </p>
     *
     * @param - index is used to check the id given by user to view
     *
     */   
    public Trainer retrieveTrainer(String id) throws SQLException ;

    /**
     * <p>
     * This method is used to view Trainee    
     * </p>
     *
     * @param - index is used to check the id given by user to view
     *
     */       
    public Trainee retrieveTrainee(String id) throws SQLException; 

    /**
     * <p>
     * This method is used to view unassigned Trainer    
     * </p>
     *
     * @param - index is used to view the name of unassigned Trainer
     *
     */      
    public List<String> retrieveUnAssignedTrainer() throws SQLException; 

    /**
     * <p>
     * This method is used to view unassigned Trainee    
     * </p>
     *
     * @param - index is used to view the name of unassigned Trainee
     *
     */       
    public List<String> retrieveUnAssignedTrainee() throws SQLException; 

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
    public int assignTrainee(String trainerId, String traineeId) throws SQLException; 
     
}