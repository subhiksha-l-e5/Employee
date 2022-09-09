/*
 * <p>
 * Copyrights 2022 Element5
 * This package com.element5.employee.model has the class Trainee
 * 
 * {@link Trainee}
 *
 * </p>
 */
package com.element5.employee.model;

import java.time.LocalDate;
import javax.persistence.Column;  
import javax.persistence.Entity; 
import javax.persistence.JoinColumn;   
import javax.persistence.Id;  
import javax.persistence.Table;  
import javax.persistence.ManyToOne;  

/**
 * <p>
 * This Trainee class contains all the attributes that belong only to Trainee
 * It contains all the setters and getters of the attributes and constructor
 * </p>
 *
 * @author L.subhiksha
 * 
 * @since 2022-08-17
 *
 */
@Entity
@Table(name = "trainee")
public class Trainee extends Employee {
    @Column(name = "task")
    private String task;

    @ManyToOne
    @JoinColumn(name ="trainer_id")
    private Trainer trainer;

    @Column(name = "is_Active")
    private boolean isActive = true;

    /**
     * <p>
     * This method is used to set task given by user
     * </p>
     *
     * @param - task is the task assigned to Trainee
     *
     * @return - void
     *
     */
    public void setTask(String task) {
       this.task = task;
     }
    
    /**
     * <p>
     * This method is used to return task of trainee
     * </p>
     *
     * @return - String returns task of trainee
     *
     */    
    public String getTask() {
        return task;
     }
   
      /**
     * <p>
     * This method is used to set trainer 
     * </p>
     *
     * @param - trainer assigned to Trainee
     *
     * @return - void
     *
     */
    public void setTrainer(Trainer trainer) {
       this.trainer = trainer;
     }
    
    /**
     * <p>
     * This method is used to return trainer of trainee
     * </p>
     *
     * @return - int returns trainer of trainee
     *
     */    
    public Trainer getTrainer() {
        return trainer;
     }
   
    /**
     * <p>
     * This method is used to set trainee as not active
     * </p>
     *
     * @param - boolean isActive stores whether the trainee is active
     *
     * @return - void
     *
     */
    public void setNotActive(boolean isActive) {
       this.isActive = isActive;
     }

    /**
     * <p>
     * This is the default constructor of Trainee
     * </p>
     */
    public Trainee() {
       super();
    }
  
    /**
     * <p>
     * This is the constructor of Trainee
     * </p>
     *
     * @param - id is the employee id
     *
     * @param - name is the employee name   
     *
     * @param - designation is the employee's designation
     *
     * @param - salary is the employee's salary
     *
     * @param - date of joining is the employee's date of joining
     *
     * @param - emailId is the employee's email id
     *
     * @param - mobileNumber is the employee's mobile number
     *
     * @param - task is the task name of trainee
     *
     */    
    public Trainee(String employeeId, String name, String designation, float salary,
                   LocalDate dateOfJoining, String emailId, long mobileNumber, String task) {
        super(employeeId, name, designation, salary, dateOfJoining, emailId, mobileNumber);  
        this.task = task;
    } 
  
    /**
     * <p>
     * The toString() is used to return the parameters
     *</p>
     *
     * @return - String returns id, name, companyName, designation, emailId, experience, dateOfJoining, mobileNumber, task
     * 
     */    
    public String toString() {
        return( "ID"+"\t" +getEmployeeId()+"\n"
                +"Name"+"\t" +getName()+"\n"
                +"Companyname"+"\t" +getCompanyName()+"\n"
                +"Designation"+"\t" +getDesignation()+"\n"
                +"Email"+"\t" +getEmailId()+"\n"
                +"dateOfJoining"+"\t" +getDateOfJoining()+"\n"
                +"Mobile Number"+"\t" +getMobileNumber()+"\n"
                +"Task"+"\t" +getTask());
    }
 
}