package fr.univtln.m2dapm.stockmanagement.annotations.equipments;

import fr.univtln.m2dapm.stockmanagement.validators.equipments.ObjectNameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by toms on 12/22/16.
 */

/**
 * Validator for Information's name attribute instance ->
 *              BoardMark ChalkBox Computer Equipment SlideProjector Classroom School
 */
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = {ObjectNameValidator.class})
public @interface Name {

    /**
     * Default message if Information's name attribute instance not consistent
     *  message captured with  Set<ConstraintViolation<IInformation>> in JPAEntities
     *              see JPAEntities/Test/.../ValidationTest.java
     * @return
     */
    // TODO gets message from ValidationMessages.properties (don't know why can't take it...)
    String message() default "Le nom de l'objet doit contenir entre 4 et 200 caracteres";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
