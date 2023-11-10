package ph.homecredit.online.exam.validator.constraints;

import ph.homecredit.online.exam.validator.EnumValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Fitzgerald Marzo
 * @since 2023-11-11
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EnumValidator.class)
public @interface ValidEnum {

  Class<? extends Enum> enumClass();

  String message() default "Not in specific {enumClass}";

  Class<?>[] groups() default {};

  Class<? extends Payload>[] payload() default {};
}
