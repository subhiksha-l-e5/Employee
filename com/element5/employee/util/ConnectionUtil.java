/*
 * <p>
 * Copyrights 2022 Element5
 * This package com.element5.employee.util contains all the util classes such as string util, date util and connection util
 * </p>
 */
package com.element5.employee.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * This class connection util follows singleton pattern and returns connection of employee database in mySql
 * it contains all the details about connection that is url ,username, password about database and connection object is created
 */
public class ConnectionUtil {
 
    private static Connection connection = null;
    /**
     * <p>
     * This is a private constructor of this class 
     * </p>
     */
    private ConnectionUtil() {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "Subhi@ele@5";
        connection = DriverManager.getConnection(url, username, password);
    }
   
    /**
     * <p>
     * This is a method of connectionUtil and 
     * it is static as singleton pattern will have static method 
     * it returns the instance
     * </p>
     */
    public static Connection getInstance(){  
        if (connection == null) {  
            ConnectionUtil connection = new ConnectionUtil(); 
        }    
        return connection;
   } 
}
