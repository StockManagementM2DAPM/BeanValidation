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
@Target({FIELD, PARAMETER})
@Retention(RUNTIME)
@Constraint(validatedBy = {LastnameValidator.class})
public @interface ValidLastName {
    String message() default "La taille du nom doit etre comprise entre 2 et 30 caracteres";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}