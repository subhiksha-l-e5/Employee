/*
 * <p>
 * Copyrights 2022 Element5
 * This package com.element5.employee.model has  classes Employee, Trainer, Trainee
 * </p>
 *
 */
package com.element5.employee.model;

import java.time.LocalDate;

/**
 * <p>
 * The Employee class has the common attributes of an employee
 * It contains setters and getters of all the attributes and constructor
 * </p>
 *
 * @author L.subhiksha
 * 
 * @since 2022-08-17
 *
 */
public class Employee {
    private String companyName = "element5";   
    private String id;
    private String name;
    private String designation;
    private float salary;
    private LocalDate dateOfJoining;
    private int experience;
    private String emailId;
    private long mobileNumber;
  
    /**
     * <p>
     * This method is used to return  company name
     * </p>
     *
     * @return - String returns company name
     *
     */  
    public String getCompanyName() {
        return companyName;
    } 
  
    /**
     * <p>
     * This method is used to set the employee id given by user
     * </p>
     *
     * @param - id is the employee id
     *
     * @return - void
     *
     */
    public void setId(String id) {
        this.id = id;
    }
  
    /**
     * <p>
     * This method is used to return  employee id 
     * </p>
     *
     * @return - String returns employee id
     *
     */
    public String getId() {
        return id;
    }

    /**
     * <p>
     * This method is used to set the employee name given by user
     * </p>
     *
     * @param - name is the employee name
     *
     * @return - void
     * 
     */
     public void setName(String name) {
         this.name = name;
     }
    
    /**
     * <p>
     * This method is used to return the employee name
     * </p>
     *
     * @return - String returns employee name
     *     
     */  
     public String getName() {
         return name;
     }
    
    /**
     * <p>
     * This method is used to set the employee designation given by user
     * </p>
     *
     * @param - designation is the employee designation
     *
     * @return - void
     * 
     */   
     public void setDesignation(String designation) {        
         this.designation = designation;
     }

    /**
     * <p>
     * This method is used to return the employee designation
     * </p>
     *
     * @return - String returns employee designation
     * 
     */  
     public String getDesignation() {
         return designation;
     }

    /**
     * <p>
     * This method is used to set the salary given by user
     * </p>
     *
     * @param - salary is the salary
     *
     * @return - void
     *
     */    
     public void setSalary(float salary) {        
         this.salary = salary;    
     }

     /**
     * <p>
     * This method is used to return the employee salary
     * </p>
     *
     * @return - int returns employee salary
     * 
     */  
     public float getSalary() {
         return salary;
     }
  
    /**
     * <p>
     * This method is used to set the date of joining given by user
     * </p>
     *
     * @param - date of joining 
     *
     * @return - void
     * 
     */    
     public void setDateOfJoining(LocalDate dateOfJoining) {        
         this.dateOfJoining = dateOfJoining;    
     }
     
    /**
     * <p>
     * This method is used to return the employee dateOfJoining
     * </p>
     *
     * @return - String returns employee dateOfJoining
     * 
     */  
     public LocalDate getDateOfJoining() {
         return dateOfJoining;
     }
        
    /**
     * <p>
     * This method is used to return the experience
     * </p>
     *
     * @return - int returns experience in years
     *
     */  
     public int getExperience() {
         return experience;
     }

    /**
     * <p>
     * This method is used to set the email id given by user 
     * </p>
     *
     * @param - emailId is the email id of employee
     *
     * @return - void
     * 
     */   
     public void setEmailId(String emailId) {        
         this.emailId = emailId;    
     }

    /**
     * <p>
     * This method is used to return the email id of employee
     * </p>
     *
     * @return - String returns emailId
     * 
     */   
     public String getEmailId() {
         return emailId;
     }
  
    /**
     * <p>
     * This method is used to set the mobile number  given by user
     * </p>
     *
     * @param - mobileNumber is the mobile number of employee
     *
     * @return - void
     * 
     */    
     public void setMobileNumber(long mobileNumber) {        
         this.mobileNumber = mobileNumber;    
     }
    
    /**
     * <p>
     * This method is used to return the mobile number of employee
     * </p>
     * 
     * @return - String returns mobileNumber of employee 
     *
     */   
     public long getMobileNumber() {
         return mobileNumber;
     }
     
    /**
     * <p>
     * This is the constructor of Employee 
     * </p>
     * 
     * @param - id is the employee id
     *
     * @param - name is the employee name
     *
     * @param - companyName is the employee's company name
     *
     * @param - designation is the employee's designation
     *
     * @param - salary is the employee's salary
     *
     * @param - date of joining is the employee's date of joining
     *
     * @param - emailId is the employee's email id
     *
     * @param - mobile number is the employee's mobile number
     * 
     */         
     public Employee(String id, String name, String designation, float salary, LocalDate dateOfJoining, String emailId, long mobileNumber) {
         this.id = id;
         this.name = name;
         this.companyName = companyName;
         this.designation = designation;
         this.salary = salary;
         this.dateOfJoining = dateOfJoining;
         this.emailId = emailId;
         this.mobileNumber = mobileNumber;
     }
    
}