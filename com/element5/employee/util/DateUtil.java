/*
 * <p>
 * Copyrights 2022 Element5
 * This package com.element5.employee.util has DateUtil class
 * </p>
 */
package com.element5.employee.util;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * <p>
 * This class DateUtil contains  method for calculating experience from date of joining given by user
 * </p>
 *
 * @author L.subhiksha
 * 
 * @since 2022-08-17
 *
 */ 
public class DateUtil {    
    /**
     * <p>
     * This method calculates experience from date of joining
     * it parses the string to LocalDate, gets the current date and finds the period between in years 
     * </p>
     *
     * @param - dateOfJoining
     *
     * @return - int returns experience in years
     *
     */   
    public static int getExperience(LocalDate dateOfJoining) {  
        LocalDate currentDate = LocalDate.now();
        if ((dateOfJoining != null)&&(currentDate != null)) {
            return Period.between(dateOfJoining,currentDate).getYears();
        } else {
              return 0;
          }
    }

    /**
     * <p>
     * This method validates date format given by user
     * </p>
     *
     * @param - dateOfJoining
     *
     * @return - 
     *
     */
     public static boolean isValidDate(String dateOfJoining) {
        Pattern pattern = Pattern.compile("([1-9]{1}[0-9]{1}[0-9]{1}[0-9]{1})-([0-1]{1}[0-9]{1})-([0-3]{1}[0-9]{1})");
        Matcher matcher = pattern.matcher(dateOfJoining);
        boolean isValid = matcher.matches();
        return isValid;
    } 
}
        