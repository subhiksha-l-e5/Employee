package com.element5.employee.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Trainer.class)
public abstract class Trainer_ extends com.element5.employee.model.Employee_ {

	public static volatile ListAttribute<Trainer, Trainee> trainees;
	public static volatile SingularAttribute<Trainer, String> project;
	public static volatile SingularAttribute<Trainer, Boolean> isActive;

	public static final String TRAINEES = "trainees";
	public static final String PROJECT = "project";
	public static final String IS_ACTIVE = "isActive";

}

