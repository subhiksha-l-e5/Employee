/*
 * <p>
 * Copyrights 2022 Element5
 * This package com.element5.employee.model has the class Trainer
 *
 * {@link  Trainer}
 *
 * </p>
 */
package com.element5.employee.model;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.CascadeType;  
import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.FetchType;  
import javax.persistence.Id;
import javax.persistence.JoinColumn;    
import javax.persistence.OneToMany;    
import javax.persistence.Table;  

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
@Entity
@Table(name ="trainer")
public class Trainer extends Employee {
    @Column(name = "project")
    private String project;

    @Column(name = "is_Active")
    private boolean isActive = true;

    @OneToMany(fetch=FetchType.EAGER,cascade = CascadeType.ALL)
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

    public List<Trainee> getTrainees() {
        return trainees;
    }

    public void setTrainees(List<Trainee> trainees) {
        this.trainees = trainees;
    }
   
    /**
     * <p>
     * This method is used to set trainer as not active
     * </p>
     *
     * @param - boolean isActive stores whether the trainer is active
     *
     * @return - void
     *
     */
    public void setNotActive(boolean isActive) {
       this.isActive = isActive;
     }

    /**
     * <p>
     * This is the default constructor of Trainer
     * </p>
     */
    public Trainer() {
        super();
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
        return("ID"+"\t" +getEmployeeId()+"\n"
                +"Name"+"\t" +getName()+"\n"
                +"Company Name"+"\t" +getCompanyName()+"\n"
                +"Designation"+"\t" +getDesignation()+"\n"
                +"Date of joining"+"\t" +getDateOfJoining()+"\n"
                +"Email"+"\t" +getEmailId()+"\n"
                +"Mobile Number"+"\t" +getMobileNumber()+"\n"
                +"Project"+"\t" +getProject());
    }
 
}
 



    
        
    