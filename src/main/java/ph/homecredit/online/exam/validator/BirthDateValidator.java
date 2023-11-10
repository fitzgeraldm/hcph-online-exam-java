package ph.homecredit.online.exam.validator;

import ph.homecredit.online.exam.validator.constraints.LegalAge;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.time.LocalDate;

/**
 * @author Fitzgerald Marzo
 * @since 2023-11-11
 */
public class BirthDateValidator implements ConstraintValidator<LegalAge, LocalDate> {

  @Override
  public boolean isValid(final LocalDate valueToValidate, final ConstraintValidatorContext context) {

    //TODO Write your code here
    return true;
  }
}