package ph.homecredit.online.exam.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import ph.homecredit.online.exam.constant.LoanStatus;
import ph.homecredit.online.exam.validator.constraints.LegalAge;
import ph.homecredit.online.exam.validator.constraints.ValidEnum;

import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author Fitzgerald Marzo
 * @since 2023-11-11
 */
//TODO Refactor this class according to the requirements
public class LoanRequest {

 @NotNull
 private String firstName;

 private String lastName;

 private String gender;

 @JsonFormat(pattern = "yyyy-MM-dd")
 @LegalAge
 private LocalDate birthDate;

 private String email;

 private String productType;

 @ValidEnum(enumClass = LoanStatus.class, message = "Invalid loan status")
 private LoanStatus loanStatus;

 private BigDecimal amount;


 //Constructors
 public LoanRequest() {
 }

 public LoanRequest(String firstName, String lastName, String gender, LocalDate birthDate, String email,
                    String productType, BigDecimal amount) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.gender = gender;
  this.birthDate = birthDate;
  this.email = email;
  this.productType = productType;
  this.amount = amount;
 }


 //Getters and Setters
 public String getFirstName() {
  return firstName;
 }

 public void setFirstName(String firstName) {
  this.firstName = firstName;
 }

 public String getLastName() {
  return lastName;
 }

 public void setLastName(String lastName) {
  this.lastName = lastName;
 }

 public String getGender() {
  return gender;
 }

 public void setGender(String gender) {
  this.gender = gender;
 }

 public LocalDate getBirthDate() {
  return birthDate;
 }

 public void setBirthDate(LocalDate birthDate) {
  this.birthDate = birthDate;
 }

 public String getEmail() {
  return email;
 }

 public void setEmail(String email) {
  this.email = email;
 }

 public String getProductType() {
  return productType;
 }

 public void setProductType(String productType) {
  this.productType = productType;
 }

 public LoanStatus getLoanStatus() {
  return loanStatus;
 }

 public void setLoanStatus(LoanStatus loanStatus) {
  this.loanStatus = loanStatus;
 }

 public BigDecimal getAmount() {
  return amount;
 }

 public void setAmount(BigDecimal amount) {
  this.amount = amount;
 }
}
