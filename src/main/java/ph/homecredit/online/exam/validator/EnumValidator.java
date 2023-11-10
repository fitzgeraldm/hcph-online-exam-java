package ph.homecredit.online.exam.validator;

import ph.homecredit.online.exam.validator.constraints.ValidEnum;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Fitzgerald Marzo
 * @since 2023-11-11
 */
public class EnumValidator implements ConstraintValidator<ValidEnum, String> {

  private List<String> acceptedValues;

  @Override
  public void initialize(ValidEnum constraintAnnotation) {
    acceptedValues = Stream.of(constraintAnnotation.enumClass().getEnumConstants())
        .map(Enum::name)
        .collect(Collectors.toList());
  }

  @Override
  public boolean isValid(String value, ConstraintValidatorContext context) {
    if (Objects.isNull(value)) {
      return true;
    }
    return acceptedValues.contains(value);
  }
}
