package fr.univtln.m2dapm.stockmanagement.annotations.teachers;

import fr.univtln.m2dapm.stockmanagement.validators.teachers.LastnameValidator;

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
 * Validator for FullName's lastname attribute instance ->
 *                                                          Teacher
 */
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = {LastnameValidator.class})
public @interface ValidLastName {

    /**
     * Default message if FullName's lastname attribute instance not consistent
     *  message captured with  Set<ConstraintViolation<ITeacher>> in JPAEntities
     *              see JPAEntities/Test/.../ValidationTest.java
     * @return
     */
    // TODO gets message from ValidationMessages.properties (don't know why can't take it...)
    String message() default "La taille du nom doit etre comprise entre 2 et 30 caracteres";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}