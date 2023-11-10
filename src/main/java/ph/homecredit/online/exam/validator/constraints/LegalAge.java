package ph.homecredit.online.exam.validator.constraints;

import ph.homecredit.online.exam.validator.BirthDateValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * @author Fitzgerald Marzo
 * @since 2023-11-11
 */
@Constraint(validatedBy = BirthDateValidator.class)
@Target({TYPE, FIELD, ANNOTATION_TYPE})
@Retention(RUNTIME)
@Documented
public @interface LegalAge {

  String message() default "Invalid date of birth";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}