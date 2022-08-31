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

public class Trainee extends Employee {
    private String task;
    private String trainerId;

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
     * This method is used to set trainer id given by user
     * </p>
     *
     * @param - trainerId is the trainer assigned to Trainee
     *
     * @return - void
     *
     */
    public void setTrainerId(String trainerId) {
       this.trainerId = trainerId;
     }
   
    /**
     * <p>
     * This method is used to return trainer of trainee
     * </p>
     *
     * @return - String returns trainer of trainee
     *
     */    
    public String getTrainerId() {
        return trainerId;
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
    public Trainee(String id, String name, String designation, float salary,
                   LocalDate dateOfJoining, String emailId, long mobileNumber, String task, String traineeId) {
        super( id, name, designation, salary, dateOfJoining, emailId, mobileNumber);  
        this.task = task;
        this.trainerId = trainerId;
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
        return( "ID"+"\t" +getId()+"\n"
                +"Name"+"\t" +getName()+"\n"
                +"Companyname"+"\t" +getCompanyName()+"\n"
                +"Designation"+"\t" +getDesignation()+"\n"
                +"Email"+"\t" +getEmailId()+"\n"
                +"Experience"+"\t" +getExperience()+"\n"
                +"dateOfJoining"+"\t" +getDateOfJoining()+"\n"
                +"Mobile Number"+"\t" +getMobileNumber()+"\n"
                +"Task"+"\t" +getTask());
    }
 
}