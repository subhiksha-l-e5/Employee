package com.element5.employee.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Trainee.class)
public abstract class Trainee_ extends com.element5.employee.model.Employee_ {

	public static volatile SingularAttribute<Trainee, String> task;
	public static volatile SingularAttribute<Trainee, Boolean> isActive;
	public static volatile SingularAttribute<Trainee, String> trainerId;

	public static final String TASK = "task";
	public static final String IS_ACTIVE = "isActive";
	public static final String TRAINER_ID = "trainerId";

}

