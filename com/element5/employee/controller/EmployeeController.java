/*
 * Copyrights 2022 Element5
 * <p>
 * This package com.element5.employee.controller has EmployeeController class
 * </p>
 */
package com.element5.employee.controller;

import java.lang.NullPointerException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.hibernate.HibernateException;

import com.element5.employee.model.Employee;
import com.element5.employee.model.Trainee;
import com.element5.employee.model.Trainer;
import com.element5.employee.service.EmployeeService;
import com.element5.employee.service.impl.EmployeeServiceImpl;
import com.element5.employee.util.DateUtil;
import com.element5.employee.util.StringUtil;

/**
 * <p>
 * This class EmployeeController  has main method ,another method to get inputs from user, method named init for inserting trainer or trainee
 * updating trainer or trainee, viewing trainer or trainee, deleting trainer or trainee 
 *
 * </p> 
 *
 * @author L.subhiksha
 * 
 * @since 2022-08-17
 *
 */
public class EmployeeController  {
    
    private Scanner input = new Scanner(System.in);

    private EmployeeService employeeServiceImpl = new EmployeeServiceImpl();
  
    private Logger employeeLogger = Logger.getLogger(EmployeeController.class);

    /**
     * <p>
     * This method gets the input in String and exception is handled
     * </p>
     * 
     * @return - String returns a string value
     *
     */
    public String getInput() {
        String userInput = null;
        while(true) {
            try {
                input.nextLine(); 
                userInput = input.nextLine(); 
                //input.nextLine(); 
                break;
            } catch (InputMismatchException inputMismatchException) {
                employeeLogger.info(inputMismatchException.getMessage());
            }
        }
        return userInput;
    }

    /**
     * <p>
     * This method gets the input in a word and exception is handled
     * </p>
     * 
     * @return - String returns a string value
     *
     */
    public String getStringInput() {
        String userInput = null;
        while (true) {
            try {
                userInput = input.next(); 
                break;
            } catch (InputMismatchException inputMismatchException) {
                employeeLogger.info(inputMismatchException.getMessage());
            }
        }
        return userInput;
    }
    
    /**
     * <p>
     * This method  gets the input for id, name, designation, salary, experience, mobileNumber and based on userRole it gets project
     * and task using getInputInAWord and getInputInALine
     * </p> 
     *
     * @return - void
     *
     */     
    public void getEmployeeInputs(int userRole) {
        
        employeeLogger.info("Enter employee id:");
        String employeeId = getStringInput() ;     
        while (!StringUtil.isValidId(employeeId)) {
            employeeLogger.error("Enter id in this format eg:E520136");
            employeeId = getStringInput(); 
        }
        employeeLogger.info("Enter employee name:");
        String name = getStringInput();
        while (!StringUtil.isValidName(name)) {
            employeeLogger.error("Enter name in this format eg:L.subhiksha");
            name = getStringInput(); 
        }
        employeeLogger.info("Enter designation:"); 
        String designation = getInput(); 
        while (!StringUtil.isValidDesignation(designation)) {
            employeeLogger.error("Enter name in this format eg:software engineer");
            designation = getInput(); 
        } 
        employeeLogger.info("Enter salary:");
        String salaryInput = getStringInput();  
        while (!StringUtil.isValidSalary(salaryInput)) {
            employeeLogger.error("Enter salary in this format eg:25000");
            salaryInput = getStringInput(); 
        }
        float salary= Float.parseFloat(salaryInput); 
        employeeLogger.info("Enter date of joining as yyyy-mm-dd");
        String dateInput = getStringInput();
        while (!DateUtil.isValidDate(dateInput)) {
            employeeLogger.error("Enter  date in this format eg:2002-02-02");
            dateInput = getStringInput(); 
        }  
        LocalDate dateOfJoining = LocalDate.parse(dateInput);
        int experience = DateUtil.getExperience(dateOfJoining);
        employeeLogger.info("Enter E-mail Id:");
        String emailId = getStringInput(); 
        while (!StringUtil.isValidEmail(emailId)) {
            employeeLogger.error("Enter E-mail Id in this format eg:abc@gmail.com");
            emailId = getStringInput(); 
        }  
        employeeLogger.info("Enter Mobile number:"); 
        String mobileNumberInput = getStringInput();
        while (!StringUtil.isValidMobileNumber(mobileNumberInput)) {
            employeeLogger.error("Enter Mobile number in this format with 10 digits"); 
            mobileNumberInput = getStringInput(); 
        }
        long mobileNumber = Long.parseLong(mobileNumberInput);
        if (1 == userRole) { 
            employeeLogger.info("Enter Project name:");
            String project = input.next(); 
            try {
                employeeServiceImpl.addTrainer(employeeId, name, designation, salary, dateOfJoining, emailId, mobileNumber, project);
                employeeLogger.info("Trainer added successfully");    
            } catch (HibernateException  hibernateException) {
                employeeLogger.info(hibernateException.getMessage());
            }                    
        } else if (2 == userRole) {
            employeeLogger.info("Enter Task name:");
            String task = input.next(); 
            String trainerId = "null"; 
            try {  
                employeeServiceImpl.addTrainee(employeeId, name, designation, salary, dateOfJoining, emailId, mobileNumber, task ,trainerId);
                employeeLogger.info("Trainee added successfully");
            } catch (HibernateException hibernateException) {
                employeeLogger.info(hibernateException.getMessage());
            }    
        }
    }

    /**
     * <p>
     * This method has all the logics for program to execute add, update, view, delete operations on Trainer or Trainee
     * </p>
     *
     * @return - void
     */
    public void init() {
        
        employeeLogger.info("Employee details");
        boolean condition = true;

        while(condition) {   
            employeeLogger.info("Enter your role 1 for trainer,press 2 for trainee,3 for exit");
            int userRole = input.nextInt();

            switch (userRole) {
                case 1:
                    boolean isContinue = true;
                    while(isContinue) {
                        employeeLogger.info("\n Press 1 to add trainer"
                        +"\n Press 2 to update trainer"
                        +"\n Press 3 to view trainer"
                        +"\n Press 4 to delete trainer"
                        +"\n Press 5 to assign trainee"
                        +"\n Press 6 to exit");
                        int userChoice = input.nextInt();
                        switch (userChoice) {
                            case 1:
                                getEmployeeInputs(userRole);
                                employeeLogger.info("Trainer added successfully");
                                break;

                            case 2:
                                employeeLogger.info("press 1 to update name, 2 to update designation, 3 to update salary, 4 to update project");
                                int updateChoice = input.nextInt();
                                switch (updateChoice) {
                                case 1:
                                    try {
                                        employeeLogger.info("Enter employee id:");
                                        String employeeId = input.next();
                                        employeeLogger.info("Enter new name :");
                                        String newName = input.next();
                                        employeeServiceImpl.modifyTrainerName(employeeId, newName);
                                        employeeLogger.info("Trainer name modified  successfully");
                                    } catch (HibernateException hibernateException) {
                                        employeeLogger.info(hibernateException.getMessage());
                                    }
                                    break;
     
                                case 2:
                                    try {
                                        employeeLogger.info("Enter employee id:");
                                        String employeeId = input.next();
                                        employeeLogger.info("Enter new designation :");
                                        String newDesignation = input.next();
                                        employeeServiceImpl.modifyTrainerDesignation(employeeId, newDesignation);
                                        employeeLogger.info("Trainer designation modified  successfully");  
                                    } catch (HibernateException hibernateException) {
                                        employeeLogger.info(hibernateException.getMessage());
                                    }
                                    break;
                   
                                case 3:
                                    try {
                                        employeeLogger.info("Enter employee id:");
                                        String employeeId = input.next();
                                        employeeLogger.info("Enter new designation :");
                                        float newSalary = input.nextFloat();
                                        employeeServiceImpl.modifyTrainerSalary(employeeId, newSalary);
                                        employeeLogger.info("Trainer salary modified  successfully");
                                    } catch (HibernateException hibernateException) {
                                        employeeLogger.info(hibernateException.getMessage());
                                    }
                                    break;
 
                               case 4:
                                    try {
                                        employeeLogger.info("Enter employee id:");
                                        String employeeId = input.next();
                                        employeeLogger.info("Enter new project :");
                                        String newProject = input.next();
                                        employeeServiceImpl.modifyProject(employeeId, newProject);
                                        employeeLogger.info("Trainer project modified  successfully");
                                    } catch (HibernateException hibernateException) {
                                        employeeLogger.info(hibernateException.getMessage());
                                    }
                                    break;
                           }
                           break;
                   
                           case 3:
                               try {
                                   employeeLogger.info("Enter id:");   
                                   String employeeId = input.next();
                                   employeeLogger.info(employeeServiceImpl.getTrainer(employeeId).toString());
                                   break;
                               } catch (HibernateException hibernateException) {
                                   employeeLogger.info(hibernateException.getMessage());
                               }
                               break;
                   
                           case 4:
                               try {
                                   employeeLogger.info("Enter id:");   
                                   String employeeId = input.next();
                                   employeeServiceImpl.removeTrainer(employeeId);
                                   employeeLogger.info("Trainer deleted  successfully"); 
                               } catch (HibernateException hibernateException) {
                                   employeeLogger.info(hibernateException.getMessage());
                               }
                               break;     
                       
                           case 5:        
                               /*try {
                                   employeeLogger.info("Unassigned trainers:");  
                                   employeeServiceImpl.getUnAssignedTrainer(); 
                               } catch (HibernateException hibernateException) {
                                   employeeLogger.info(hibernateException.getMessage());
                               }*/  
                               try {
                                   employeeLogger.info("Unassigned trainees:"); 
                                   List<Trainee> trainees = employeeServiceImpl.getUnAssignedTrainee(); 
                                   for (Trainee trainee:trainees) {
                                       employeeLogger.info( trainee.getEmployeeId()+trainee.getName());
                                   }
                               } catch (HibernateException hibernateException) {
                                       employeeLogger.info(hibernateException.getMessage());
                               } 
                               employeeLogger.info("Enter the trainer id:");
                               String trainerId = input.next();
                               employeeLogger.info("Enter the number of trainees:"); 
                               int numberOfTrainees = input.nextInt();                                 
                               for (int count = 1; count <= numberOfTrainees; count++) {
                                   employeeLogger.info("Enter the trainee id:");
                                   String traineeId = input.next();
                                   try {
                                       employeeServiceImpl.assignTrainee(trainerId, traineeId);
                                       employeeLogger.info("Trainer is assigned with trainee");
                                   } catch (HibernateException hibernateException) {
                                       employeeLogger.info(hibernateException.getMessage());
                                   }
                               }     
                               employeeLogger.info("Trainees assigned successfuly");   
                               break;

                           case 6:
                               isContinue = false;
                               break;

                           default:
                               break;
                       }
                    }           
                    break;
         
                case 2:   
                    boolean flag = true;
                    while(flag) {   
                        employeeLogger.info("Press 1 to add trainee"
                        +"\n Press 2 to update trainee"
                        +"\n Press 3 to view trainee"
                        +"\n Press 4 to delete trainee"
                        +"\n Press 5 to exit");
                        int userChoice = input.nextInt();
                        switch (userChoice) {
                            case 1:
                                getEmployeeInputs(userRole);
                                employeeLogger.info("Trainee added successfully ");
                                break;
                           
                              case 2:
                                employeeLogger.info("press 1 to update name, 2 to update designation, 3 to update salary, 4 to update project");
                                int updateChoice = input.nextInt();
                                switch (updateChoice) {
                                case 1:
                                    try {
                                        employeeLogger.info("Enter employee id:");
                                        String employeeId = input.next();
                                        employeeLogger.info("Enter new name :");
                                        String newName = input.next();
                                        employeeServiceImpl.modifyTraineeName(employeeId, newName);
                                        employeeLogger.info("Trainee name modified  successfully");
                                    } catch (HibernateException hibernateException) {
                                        employeeLogger.info(hibernateException.getMessage());
                                    }
                                    break;
     
                                case 2:
                                    try {
                                        employeeLogger.info("Enter employee id:");
                                        String employeeId = input.next();
                                        employeeLogger.info("Enter new designation :");
                                        String newDesignation = input.next();
                                        employeeServiceImpl.modifyTraineeDesignation(employeeId, newDesignation);
                                        employeeLogger.info("Trainee designation modified  successfully");
                                    } catch (HibernateException hibernateException) {
                                        employeeLogger.info(hibernateException.getMessage());
                                    }
                                    break;
                   
                                case 3:
                                    try {
                                        employeeLogger.info("Enter employee id:");
                                        String employeeId = input.next();
                                        employeeLogger.info("Enter new designation :");
                                        float newSalary = input.nextFloat();
                                        employeeServiceImpl.modifyTraineeSalary(employeeId, newSalary);
                                        employeeLogger.info("Trainee salary modified  successfully");
                                    } catch (HibernateException hibernateException) {
                                        employeeLogger.info(hibernateException.getMessage());
                                    }
                                    break;
 
                               case 4:
                                    try {
                                        employeeLogger.info("Enter employee id:");
                                        String employeeId = input.next();
                                        employeeLogger.info("Enter new task :");
                                        String newTask = input.next();
                                        employeeServiceImpl.modifyTask(employeeId, newTask);
                                        employeeLogger.info("Trainee task modified  successfully"); 
                                    } catch (HibernateException hibernateException) {
                                        employeeLogger.info(hibernateException.getMessage());
                                    }
                                    break;
                            }
                            break;
                          
                            case 3:
                                try {
                                    employeeLogger.info("Enter id:");   
                                    String employeeId = input.next();
                                    employeeLogger.info(employeeServiceImpl.getTrainee(employeeId).toString());
                                } catch (HibernateException hibernateException) {
                                    hibernateException.getMessage();
                                }
                                break;
                   
                            case 4:
                                try {
                                    employeeLogger.info("Enter id:");   
                                    String employeeId = input.next();
                                    employeeServiceImpl.removeTrainee(employeeId);
                                    employeeLogger.info("Trainee deleted  successfully");
                                } catch (HibernateException hibernateException) {
                                    hibernateException.getMessage();
                                }
                                break;

                            case 5:
                                flag = false;
                                break;

                            default:
                                break;   
                        }  
                    }    
                    break;

                case 3:
                    condition = false;
                    break;

                default:
                    break;
            }  
 
        }   
    }
    
    /**
     * <p>
     * This method is the main method 
     * </p> 
     *
     * @return - void
     *
     */    
    public static void main(String[] args) {

        EmployeeController employeeController = new EmployeeController();

        String log4jPath = "D:\\log4j\\log4j.properties";
        PropertyConfigurator.configure(log4jPath);
        employeeController.init();
        
    }
} 
 