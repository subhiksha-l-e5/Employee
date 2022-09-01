/*
 * <p>
 * Copyrights 2022 element5
 * This package com.element5.employee.model has the class Trainer
 *
 * {@link  Trainer}
 *
 * </p>
 */
package com.element5.employee.model;

import java.time.LocalDate;
import java.util.List;


/**
 * <p>
 * The Trainer class contains all the attributes that belong only to Trainer
 * It contains the setters and getters of all the attributes and constructor
 * </p>
 *
 * @author L.subhiksha
 * 
 * @since 2022-08-17
 *
 */
public class Trainer extends Employee {
    private String project;
    
    private List<Trainee> trainees;

    /**
     * <p>
     * This method is used to set project given by user
     * </p>
     *
     * @param - project is the project of Trainer
     *
     * @return - void
     *
     */
    public void setProject(String project) {
       this.project = project;
    }
     
    /**
     * <p>
     * This method is used to return project of trainer
     * </p>
     *
     * @return - String
     * 
     */    
    public String getProject() {
        return project;
    }
   
    /**
     * <p>
     * This method is used to set trainees given by user
     * </p>
     *
     * @param - trainees name is list of trainee names assigned to a trainer
     *
     * @return - void
     *
     */   
    public void setTrainees(List<Trainee>  trainees) {
        this.trainees = trainees;
    }

    /**
     * <p>
     * This method is used to return trainee names of a trainer
     * </p>
     *
     * @return - Trainee
     * 
     */    
    public List<Trainee> getTrainees() {
        return trainees;
    }
   
    /**
     * <p>
     * This is the constructor of Trainer
     * </p>
     *
     * @param - id is the employee id

     * @param - name is the employee name

     * @param - companyName is the employee's company name

     * @param - designation is the employee's designation

     * @param - salary is the employee's salary
     
     * @param - date of joining is the employee's date of joining

     * @param - emailId is the employee's email id

     * @param - mobile number is the employee's mobile number

     * @param - project is the project name of trainer
     *
     */    
    public Trainer(String id, String name, String designation, float salary,
                   LocalDate dateOfJoining, String emailId, long mobileNumber, String project) {
        super(id, name, designation, salary, dateOfJoining, emailId, mobileNumber);
        this.project = project;
    } 
    
    /**
     * <p>
     * The toString() is used to return the parameters
     * </p>
     *
     * @return - String returns id, name, companyName, designation, experience, dateOfJoining, emailId, mobileNumber,project
     * 
     */
    public String toString() {  
        return("ID"+"\t" +getId()+"\n"
                +"Name"+"\t" +getName()+"\n"
                +"Company Name"+"\t" +getCompanyName()+"\n"
                +"Designation"+"\t" +getDesignation()+"\n"
                +"Experience"+"\t" +getExperience()+"\n" 
                +"Date of joining"+"\t" +getDateOfJoining()+"\n"
                +"Email"+"\t" +getEmailId()+"\n"
                +"Mobile Number"+"\t" +getMobileNumber()+"\n"
                +"Project"+"\t" +getProject()+"\n"    
                +"Trainees"+"\t" +getTrainees());
    }
 
}
 



    
        
    