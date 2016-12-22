package fr.univtln.m2dapm.stockmanagement.annotations.teachers;

/**
 * Created by toms on 12/21/16.
 */
import fr.univtln.m2dapm.stockmanagement.validators.teachers.FirstnameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by toms on 12/20/16.
 */

/**
 * Validator for FullName's firstname attribute instance ->
 *                                                          Teacher
 */
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = {FirstnameValidator.class})
public @interface ValidFirstName {

    /**
     * Default message if FullName's firstname attribute instance not consistent
     *  message captured with  Set<ConstraintViolation<IFullname>> in JPAEntities
     *              see JPAEntities/Test/.../ValidationTest.java
     * @return
     */
    // TODO gets message from ValidationMessages.properties (don't know why can't take it...)
    String message() default "La taille du prenom doit etre comprise entre 2 et 30 caracteres";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}