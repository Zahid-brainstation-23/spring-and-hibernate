package com.mvc.validator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class FirstNameValidatorImpl implements ConstraintValidator<FirstNameValidator, String> {
	private String fistNamePrefixt;
	@Override
	public void initialize(FirstNameValidator firstNameValidator) {
	this.fistNamePrefixt = firstNameValidator.value();
	}

	@Override
	public boolean isValid(String theFistName, ConstraintValidatorContext validator) {
		
		if(theFistName==null) {
			return true;
		}
		return theFistName.startsWith(fistNamePrefixt);
		
	}

}
