package fr.univtln.m2dapm.stockmanagement.validators.equipments;



import fr.univtln.m2dapm.stockmanagement.annotations.equipments.Name;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by toms on 12/22/16.
 */
public class ObjectNameValidator implements ConstraintValidator<Name, String> {
    @Override
    public void initialize(Name nameDescription) {
    }

    /**
     * Defines conditions to have for validate Information's name attribute instance
     * @param name
     * @param constraintValidatorContext
     * @return
     */
    @Override
    public boolean isValid(String name, ConstraintValidatorContext constraintValidatorContext) {
        if (name == null || name.length() < 4 || name.length() > 200){
            return false;
        }
        return true;
    }
}
