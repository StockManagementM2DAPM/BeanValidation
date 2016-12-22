package fr.univtln.m2dapm.stockmanagement.validators.teachers;

import fr.univtln.m2dapm.stockmanagement.annotations.teachers.ValidFirstName;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by toms on 12/22/16.
 */
public class FirstnameValidator implements ConstraintValidator<ValidFirstName, String> {

    @Override
    public void initialize(ValidFirstName validFirstName) {
    }

    @Override
    public boolean isValid(String firstname, ConstraintValidatorContext constraintValidatorContext) {
        if(firstname == null)
        {
            return false;
        };
        if((firstname.length() < 2 )||(firstname.length() > 31))
        {
            return false;
        };
        return true;
    }
}
