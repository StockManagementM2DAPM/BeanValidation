package fr.univtln.m2dapm.stockmanagement.validators.equipments;

import fr.univtln.m2dapm.stockmanagement.annotations.equipments.Description;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by toms on 12/22/16.
 */
public class ObjectDescriptionValidator implements ConstraintValidator<Description, String> {
    @Override
    public void initialize(Description description) {

    }

    @Override
    public boolean isValid(String desc, ConstraintValidatorContext constraintValidatorContext) {
        if ((desc == null) |(desc.length() < 10) | (desc.length() > 200)){
            return false;
        }
        return true;
    }
}
