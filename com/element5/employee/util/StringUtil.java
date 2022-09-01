/*
 * <p>
 * Copyrights 2022 element5
 * This package com.element5.employee.util has StringUtil class
 * </p>
 */
package com.element5.employee.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * This class StringUtil contains  validation methods for id, name, designation, salary, emailId, mobileNumber
 * </p>
 *
 * @author L.subhiksha
 * 
 * @since 2022-08-17
 *
 */
public class StringUtil {
    /**
     * <p>
     * This method isValidId validates the id given by user    
     * </p>
     *
     * @param - id is the employee id
     *
     * @return - boolean returns true or false
     *
     */   
    public static boolean isValidId(String id) {
        Pattern pattern = Pattern.compile("[E]{1}[5]{1}[0-9]{5}");
        Matcher matcher = pattern.matcher(id);
        boolean isValid = matcher.matches();
        return isValid;
    } 

    /**
     * <p>
     * This method isValidName validates the  name given by user  
     * </p>
     *
     * @param - name is the employee name
     *
     * @return - boolean returns true or false
     *
     */      
    public static boolean isValidName(String name) {
        Pattern pattern = Pattern.compile("[A-Z]{1}[.]{1}[a-z\s]{2,}");
        Matcher matcher = pattern.matcher(name);
        boolean isValid = matcher.matches();
        return isValid;
    }
    
    /**
     * <p>
     * This method isValidDesignation validates the designation given by user
     * </p>
     *
     * @param - designation is the designation
     *
     * @return - boolean returns true or false
     *
     */     
    public static boolean isValidDesignation(String designation) {
        Pattern pattern = Pattern.compile("[A-Za-z\s]{2,}");
        Matcher matcher = pattern.matcher(designation);
        boolean isValid = matcher.matches();
        return isValid;
    } 


    /**
     * <p>
     * This method isValidSalary validates the salary given by user
     * </p>
     *
     * @param - salary is the salary
     *
     * @return - boolean returns true or false
     *
     */     
    public static boolean isValidSalary(String salary) {
        Pattern pattern = Pattern.compile("[1-9]{1}[0-9]{4,6}[.]{1}[0-9]{1,6}");
        Matcher matcher = pattern.matcher(salary);
        boolean isValid = matcher.matches();
        return isValid;
    } 

    /**
     * <p>
     * This method isValidEmail validates the email id given by user    
     * </p>
     *
     * @param - emailId is the email id
     *
     * @return - boolean returns true or false
     *
     */    
    public static boolean isValidEmail(String emailId) {
        Pattern pattern = Pattern.compile("[a-z]{3,15}[@]{1}[a-z]{5,9}[.]{1}[a-z]{3,6}");
        Matcher matcher = pattern.matcher(emailId);
        boolean isValid = matcher.matches();
        return isValid;
    } 
    
    /**
     * <p>
     * This method isValidMobileNumber validates the mobile number given by user
     * </p>
     *
     * @param - mobile number is the mobile number
     *
     * @return - boolean returns true or false
     *
     */  
    public static  boolean isValidMobileNumber(String mobileNumber) {
        Pattern pattern = Pattern.compile("[6-9]{1}[0-9]{9}");
        Matcher matcher = pattern.matcher(mobileNumber);
        boolean isValid = matcher.matches();
        return isValid;
    } 
}  