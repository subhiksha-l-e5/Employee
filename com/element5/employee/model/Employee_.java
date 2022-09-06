package com.element5.employee.model;

import java.time.LocalDate;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SingularAttribute<Employee, LocalDate> dateOfJoining;
	public static volatile SingularAttribute<Employee, Long> mobileNumber;
	public static volatile SingularAttribute<Employee, String> companyName;
	public static volatile SingularAttribute<Employee, String> name;
	public static volatile SingularAttribute<Employee, String> employeeId;
	public static volatile SingularAttribute<Employee, String> emailId;
	public static volatile SingularAttribute<Employee, Integer> id;
	public static volatile SingularAttribute<Employee, String> designation;
	public static volatile SingularAttribute<Employee, Float> salary;

	public static final String DATE_OF_JOINING = "dateOfJoining";
	public static final String MOBILE_NUMBER = "mobileNumber";
	public static final String COMPANY_NAME = "companyName";
	public static final String NAME = "name";
	public static final String EMPLOYEE_ID = "employeeId";
	public static final String EMAIL_ID = "emailId";
	public static final String ID = "id";
	public static final String DESIGNATION = "designation";
	public static final String SALARY = "salary";

}

