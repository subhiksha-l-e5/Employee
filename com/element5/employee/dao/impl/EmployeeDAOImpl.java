/*
 * <p>
 * This package com.element5.employee.dao.impl has EmployeeDao class
 * </p>
 */
package com.element5.employee.dao.impl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.element5.employee.dao.EmployeeDAO;
import com.element5.employee.model.Employee;
import com.element5.employee.model.Trainee;
import com.element5.employee.model.Trainer;
import com.element5.employee.util.connectionUtil;

/**
 * <p> 
 * This class EmployeeDaoImpl contains ArrayList of Trainer and Trainer 
 * All the add, update , view, delete operations are done here
 * </p>
 *
 * @author L.subhiksha
 * 
 * @since 2022-08-17
 *
 */ 
public class EmployeeDAOImpl implements EmployeeDAO {  
    private static List<Trainer> trainers = new ArrayList<Trainer>();
    private static List<Trainee> trainees = new ArrayList<Trainee>();
    private static List<String> trainerIds = new ArrayList<String>();
    private static List<String> traineeIds = new ArrayList<String>();

    /**
     * <p>
     * This method is used to add Trainer
     * </p>
     *
     * @param - trainer is the object of Trainer type
     *
     */ 
    public int insertTrainer(Trainer trainer) throws SQLException {
        try {
            Connection connection = connectionUtil.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into trainer values(?,?,?,?,?,?,?,?,?)");                                                                                           
            preparedStatement.setString(1,trainer.getId()); 
            preparedStatement.setString(2,trainer.getName());  
            preparedStatement.setString(3,trainer.getDesignation());
            preparedStatement.setFloat(4,trainer.getSalary());
            preparedStatement.setDate(5,Date.valueOf(trainer.getDateOfJoining())); 
            preparedStatement.setString(6,trainer.getEmailId());   
            preparedStatement.setLong(7,trainer.getMobileNumber());
            preparedStatement.setString(8,trainer.getProject());
            preparedStatement.setBoolean(9,true);
            inserted = preparedStatement.executeUpdate();  
            preparedStatement.close();
            connection.close();
            return inserted; 
        } catch (SQLException sqlException) {
             throw new SQLException(sqlException.getMessage());
        } 
        return 0;      
    } 

    /**
     * <p>
     * This method is used to return Trainer list
     * </p>
     *
     * @return - List<Trainer> returns list of trainer
     *
     */   
    public List<Trainer> getTrainers() {
        return trainers;
    }

     /**
     * <p>
     * This method is used to add Trainee
     * </p>
     *
     * @param - trainee is the object of Trainee type
     *
     */  
    public int insertTrainee(Trainee trainee) throws SQLException {
        try {
            Connection connection = connectionUtil.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement("insert into trainee values(?,?,?,?,?,?,?,?,?,?)");                                                                                         
            preparedStatement.setString(1,trainee.getId()); 
            preparedStatement.setString(2,trainee.getName());  
            preparedStatement.setString(3,trainee.getDesignation());
            preparedStatement.setFloat(4,trainee.getSalary());
            preparedStatement.setDate(5,Date.valueOf(trainee.getDateOfJoining())); 
            preparedStatement.setString(6,trainee.getEmailId());   
            preparedStatement.setLong(7,trainee.getMobileNumber());
            preparedStatement.setString(8,trainee.getTask());
            preparedStatement.setString(9,trainee.getTrainerId());
            preparedStatement.setBoolean(10,true);
            int inserted = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            return inserted;        
        } catch (SQLException sqlException) { 
            throw new SQLException(sqlException.getMessage());
        }
        return 0;       
    }
  
     /**
     * <p>
     * This method is used to return Trainee list
     * </p>
     *
     * @return - List<Trainee> returns list of trainer
     *
     */   
    public List<Trainee> getTrainees() {
        return trainees;
    }
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
    public int updateTrainerName(String id,String newName) throws SQLException { 
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("update trainer set name = ? where id = ?"); 
            preparedStatement.setString(1,newName);
            preparedStatement.setString(2,id); 
            int updated = preparedStatement.executeUpdate();
            preparedStatement.close();  
            connection.close();
            return updated; 
        } catch (SQLException sqlException) {
            throw new SQLException(sqlException.getMessage());
        }
        return 0; 
    }

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
    public int updateTraineeName(String id, String newName) throws SQLException  {
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("update trainee set name = ? where id = ?"); 
            preparedStatement.setString(1,newName);
            preparedStatement.setString(2,id);
            int updated = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            return updated;   
        } catch (SQLException sqlException) {
            throw new SQLException(sqlException.getMessage()); 
        }
        return 0;
    }

    /**
     * <p>
     * updateTrainerDesignation method is used to update Designation of Trainer     
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - Designation for updation
     *
     */      
    public int updateTrainerDesignation(String id, String newDesignation) throws SQLException {
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("update trainer set designation = ? where id = ?"); 
            preparedStatement.setString(1,newDesignation);
            preparedStatement.setString(2,id);
            int updated = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
            return updated;   
        } catch (SQLException sqlException) {
            throw new SQLException(sqlException.getMessage());
        }
        return 0; 
    }

    /**
     * <p>
     * updateTraineeDesignation method is used to update Designation of Trainee    
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - Designation for updation
     *
     */      
    public int updateTraineeDesignation(String id, String newDesignation) throws SQLException {
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("update trainee set designation = ? where id = ?"); 
            preparedStatement.setString(1,newDesignation);
            preparedStatement.setString(2,id);
            int updated = preparedStatement.executeUpdate();
            preparedStatement.close(); 
            connection.close(); 
            return updated; 
        } catch (SQLException sqlException) {
            throw new SQLException(sqlException.getMessage());
        }
        return 0; 
    }

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
    public int updateTrainerSalary(String id, float newSalary) throws SQLException {
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("update trainer set salary = ? where id = ?"); 
            preparedStatement.setFloat(1,newSalary);
            preparedStatement.setString(2,id);
            int updated = preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close(); 
            return updated;     
        } catch (SQLException sqlException) {
            throw new SQLException(sqlException.getMessage());
        }
        return 0;
    }

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
    public int updateTraineeSalary(String id, float newSalary) throws SQLException {
        int isUpdated = 0;
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("update trainee set salary = ? where id = ?"); 
            preparedStatement.setFloat(1,newSalary);
            preparedStatement.setString(2,id);
            int updated = preparedStatement.executeUpdate(); 
            preparedStatement.close();
            connection.close(); 
            return updated;    
        } catch (SQLException sqlException) {
            throw new SQLException(sqlException.getMessage());
        } 
        return 0; 
    }

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
    public int updateProject(String id, String newProject) throws SQLException {
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("update trainer set project = ? where id = ?"); 
            preparedStatement.setString(1,newProject);
            preparedStatement.setString(2,id); 
            int updated = preparedStatement.executeUpdate(); 
            preparedStatement.close();  
            connection.close(); 
            return updated;
        } catch (SQLException sqlException) {
            throw new SQLException(sqlException.getMessage());
        }
        return 0;
    } 

    /**
     * <p>
     * updateTask method is used to update Task of Trainer
     * </p>
     *
     * @param - index is used to check the id given by user
     *
     * @param - newTask is the Task for updation
     *
     */          
   public int updateTask(String id, String newTask) throws SQLException {
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("update trainee set task = ? where id = ?"); 
            preparedStatement.setString(1,newTask);
            preparedStatement.setString(2,id);
            int updated = preparedStatement.executeUpdate(); 
            preparedStatement.close();  
            connection.close();
            return updated;  
        } catch (SQLException sqlException) {
            throw new SQLException(sqlException.getMessage());
        }
        return 0; 
    }

    /**
     * <p>
     * deleteTrainer method is used to delete Trainer
     * </p>
     *
     * @param - index is used to check the id given by user to delete
     *
     */                  
    public int deleteTrainer(String id) throws SQLException {
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("update trainer set is_active = ?  where id = ?"); 
            preparedStatement.setBoolean(1,false);
            preparedStatement.setString(2,id);
            int deleted = preparedStatement.executeUpdate(); 
            preparedStatement.close(); 
            connection.close();
            return deleted;       
        } catch(SQLException sqlException) {
            throw new SQLException(sqlException.getMessage());
        }
        return 0;  
    }  

    /**
     * <p>
     * deleteTrainee method is used to delete Trainee   
     * </p>
     *
     * @param - index is used to check the id given by user to delete
     *
     */              
    public int deleteTrainee(String id) throws SQLException {
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("update trainee set is_active = ? where id = ?"); 
            preparedStatement.setBoolean(1,false);
            preparedStatement.setString(2,id);
            int deleted = preparedStatement.executeUpdate(); 
            preparedStatement.close();
            connection.close();
            return deleted;    
        } catch (SQLException sqlException) {
            throw new SQLException(sqlException.getMessage()); 
        }
        return 0; 
    }

    /**
     * <p>
     * retrieveTrainer method is used to view Trainer  
     * </p>
     *
     * @param - index is used to check the id given by user to view
     *
     */       
    public Trainer retrieveTrainer(String id) throws SQLException {
        try {
            Connection connection = connectionUtil.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement("select * from trainer  where id = ?"); 
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Trainer trainer = new Trainer(resultSet.getString("id"),
                                  resultSet.getString("name"),
                                  resultSet.getString("designation"),
                                  resultSet.getFloat("salary"),
                                  resultSet.getDate("date_of_joining").toLocalDate(),
                                  resultSet.getString("email_id"),  
                                  resultSet.getLong("mobilenumber"),
                                  resultSet.getString("project")); 
            preparedStatement = connection.prepareStatement("select * from trainee  where trainer_id = ?"); 
            preparedStatement.setString(1,id);
            resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Trainee trainee = new Trainee(resultSet.getString("id"),
                                  resultSet.getString("name"),
                                  resultSet.getString("designation"),
                                  resultSet.getFloat("salary"),
                                  resultSet.getDate("date_of_joining").toLocalDate(),
                                  resultSet.getString("email_id"),  
                                  resultSet.getLong("mobilenumber"),
                                  resultSet.getString("task"),
                                  resultSet.getString("trainer_id"));  
            trainees.add(trainee);
            trainer.setTrainees(trainees); 
            preparedStatement.close();
            connection.close();
            return trainer;                              
         } catch (SQLException sqlException) {
             throw new SQLException(sqlException.getMessage());  
         } 
         return null;      
    }

    /**
     * <p>
     * retrieveTrainee method is used to view Trainee   
     * </p>
     *
     * @param - index is used to check the id given by user to view
     *
     */       
    public Trainee retrieveTrainee(String id) throws SQLException {
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select * from trainee  where id = ?"); 
            preparedStatement.setString(1,id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            Trainee trainee = new Trainee(resultSet.getString("id"),
                                  resultSet.getString("name"),
                                  resultSet.getString("designation"),
                                  resultSet.getFloat("salary"),
                                  resultSet.getDate("date_of_joining").toLocalDate(),
                                  resultSet.getString("email_id"),  
                                  resultSet.getLong("mobilenumber"),
                                  resultSet.getString("task"),
                                  resultSet.getString("trainer_id"));   
             preparedStatement.close();
             connection.close();
             return trainee;                                         
        } catch (SQLException sqlException) {
            throw new SQLException(sqlException.getMessage()); 
        }
        return null;    
    }

    /**
     * <p>
     * This method is used to return unassigned Trainer   
     * </p>
     *
     * @param - index is used to view the name of trainer
     *
     */       
     public List<String> retrieveUnAssignedTrainer() throws SQLException {
         try {
             Connection connection = connectionUtil.getInstance(); 
             PreparedStatement preparedStatement = connection.prepareStatement("select trainer.id from trainer  left join trainee on " 
                                                                               +"trainer.id != trainee.trainer_id"); 
             ResultSet resultSet = preparedStatement.executeQuery();
             resultSet.next();
             trainerIds.add(resultSet.getString("id"));
             preparedStatement.close();
             connection.close();
             return trainerIds;     
         } catch (SQLException sqlException) {
             throw new SQLException(sqlException.getMessage());  
         }          
         return null;          
    }

    /**
     * <p>
     * This method is used to return unassigned Trainee   
     * </p>
     *
     * @param - index is used to view the name of trainee
     *
     */           
    public List<String> retrieveUnAssignedTrainee() throws SQLException{
        try {
            Connection connection = connectionUtil.getInstance(); 
            PreparedStatement preparedStatement = connection.prepareStatement("select id from trainee  where trainer_id = ?"); 
            preparedStatement.setString(1,"null");
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            traineeIds.add(resultSet.getString("id"));
            preparedStatement.close();
            connection.close();
            return traineeIds;
        } catch (SQLException sqlException) {
            throw new SQLException(sqlException.getMessage());  
        }          
        return null;
    }

     /**
     * <p>
     * This method  is used to assign  Trainee for Trainer  
     * </p> 
     *
     * @param -  trainer id
     *
     * @param -  trainee names List
     *
     * @return - void
     */     
    public int assignTrainee(String trainerId, String traineeId) throws SQLException{
        try {
            Connection connection = connectionUtil.getInstance();
            PreparedStatement preparedStatement = connection.prepareStatement("update trainee set trainer_id = ? where id = ?");                                                                                           
            preparedStatement.setString(1,trainerId); 
            preparedStatement.setString(2,traineeId);  
            int assigned = preparedStatement.executeUpdate();
            preparedStatement.close();  
            connection.close(); 
        } catch (SQLException sqlException) {
            System.out.println(sqlException.getMessage());
        }
        return null;        
    }      
}