package com.mvc.validator;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;


@Constraint(validatedBy =FirstNameValidatorImpl.class )
@Target({ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface FirstNameValidator {
	public String value() default "Md";
	public String message() default "first name should start with Md";
	  Class<?>[] groups() default {};
	    Class<? extends Payload>[] payload() default {};

}
