/*
 * <p>
 * Copyrights 2022 Element5
 * This package com.element5.employee.service.impl has EmployeeService class
 * </p>
 */
package com.element5.employee.service.impl;

import org.hibernate.HibernateException;
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
    public int addTrainer(String employeeId, String name, String designation, float salary, LocalDate dateOfJoining,
                           String emailId, long mobileNumber, String project) throws HibernateException{
        Trainer trainer = new Trainer(employeeId, name, designation, salary, dateOfJoining, emailId, mobileNumber, project);
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
    public int addTrainee(String employeeId, String name, String designation, float salary, LocalDate dateOfJoining,
                           String emailId, long mobileNumber, String task, String trainerId) throws HibernateException {
        Trainee trainee = new Trainee( employeeId, name, designation, salary, dateOfJoining, emailId, mobileNumber, task, trainerId);
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
    public int modifyTrainerName(String employeeId, String newName) throws HibernateException { 
        Trainer trainer = employeeDaoImpl.retrieveTrainer(employeeId);
        trainer.setName(newName); 
        return employeeDaoImpl.updateTrainerName(trainer);     
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
    public int modifyTraineeName(String employeeId, String newName) throws HibernateException { 
        Trainee trainee = employeeDaoImpl.retrieveTrainee(employeeId);
        trainee.setName(newName);
        return employeeDaoImpl.updateTraineeName(trainee);   
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
    public int modifyTrainerDesignation(String employeeId, String newDesignation) throws HibernateException {
        Trainer trainer = employeeDaoImpl.retrieveTrainer(employeeId);
        trainer.setDesignation(newDesignation);
        return employeeDaoImpl.updateTrainerDesignation(trainer);    
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
    public int modifyTraineeDesignation(String employeeId, String newDesignation) throws HibernateException {
        Trainee trainee = employeeDaoImpl.retrieveTrainee(employeeId);
        trainee.setDesignation(newDesignation);
        return employeeDaoImpl.updateTraineeDesignation(trainee);
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
    public int modifyTrainerSalary(String employeeId, float newSalary) throws HibernateException {
        Trainer trainer = employeeDaoImpl.retrieveTrainer(employeeId);
        trainer.setSalary(newSalary);
        return employeeDaoImpl.updateTrainerSalary(trainer);
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
    public int modifyTraineeSalary(String employeeId, float newSalary) throws HibernateException {
        Trainee trainee = employeeDaoImpl.retrieveTrainee(employeeId);
        trainee.setSalary(newSalary);
        return employeeDaoImpl.updateTraineeSalary(trainee);
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
    public int modifyProject(String employeeId, String newProject) throws HibernateException {
        Trainer trainer = employeeDaoImpl.retrieveTrainer(employeeId);
        trainer.setProject(newProject);
        return employeeDaoImpl.updateProject(trainer);
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
    public int modifyTask(String employeeId, String newTask) throws HibernateException {
        Trainee trainee = employeeDaoImpl.retrieveTrainee(employeeId);
        trainee.setTask(newTask);
        return employeeDaoImpl.updateTask(trainee);
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
    public int removeTrainer(String employeeId) throws HibernateException {
        boolean isAssigned = false;
        Trainer trainer = employeeDaoImpl.retrieveTrainer(employeeId);
        trainer.setNotActive(isAssigned);
        return employeeDaoImpl.deleteTrainer(trainer);
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
    public int removeTrainee(String employeeId) throws HibernateException {
        boolean isAssigned = false;
        Trainee trainee = employeeDaoImpl.retrieveTrainee(employeeId);
        trainee.setNotActive(isAssigned);
        return employeeDaoImpl.deleteTrainee(trainee);    
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
     * This method  returns unassigned  Trainer   
     * </p> 
     *
     * @return Trainer returns trainer
     *
     */  
   /*public List<Trainer> getUnAssignedTrainer() throws HibernateException {
        return employeeDaoImpl.retrieveUnAssignedTrainer();
   }*/

    /**
     * <p>
     * This method  returns unassigned  Trainee   
     * </p> 
     *
     * @return Trainee returns trainee
     *
     */   
   /*public List<Trainee> getUnAssignedTrainee() throws HibernateException {
        return employeeDaoImpl.retrieveUnAssignedTrainee();        
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
     * @return - int
     */     
    public int assignTrainee(String trainerId, String traineeId) throws HibernateException {
        Trainee trainee = employeeDaoImpl.retrieveTrainee(traineeId);
        Trainer trainer = employeeDaoImpl.retrieveTrainer(trainerId);
        List<Trainee> trainees = new ArrayList<Trainee>() ;
        trainees.add(trainee);
        trainer.setTrainees(trainees);
        return employeeDaoImpl.assignTrainee(trainer);    
    }     

}
