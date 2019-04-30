package com.springdemo.mvc.validation;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;

import javax.validation.Constraint;
import javax.validation.Payload;

//Helper class that contains logic
@Constraint(validatedBy= CourseCodeConstraintValidator.class)

// Where can we apply annotations - Here Mthods or Fields
@Target({ElementType.METHOD, ElementType.FIELD})

//How long marked annotation will be marked/used- Retain this annotation in bytecode and use it at runtime by JVM
@Retention(RetentionPolicy.RUNTIME)
public @interface CourseCode {

	//define default course code
	public String value() default "CS";
	
	//define default error message
	public String message () default "must start with CS";
	
	//define default groups
	public Class<?>[] groups() default {};
	
	//define default payloads- provide custom details about validation failure (security level, error code)
	public Class<? extends Payload>[] payload() default{}; 

}
