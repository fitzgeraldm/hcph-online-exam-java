package ph.homecredit.online.exam.dto;


import ph.homecredit.online.exam.constant.LoanStatus;

import java.math.BigDecimal;

/**
 * @author Fitzgerald Marzo
 * @since 2023-11-11
 */
//TODO Refactor this class according to the requirements
public class LoanResponse {

  private String firstName;

  private String lastName;

  private String gender;

  private String birthDate;

  private String email;

  private String productType;

  private LoanStatus loanStatus;

  private BigDecimal amount;

  //Constructors
  public LoanResponse() {
  }

  public LoanResponse(String firstName, String lastName, String gender, String birthDate, String email,
                      String productType, LoanStatus loanStatus, BigDecimal amount) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.gender = gender;
    this.birthDate = birthDate;
    this.email = email;
    this.productType = productType;
    this.loanStatus = loanStatus;
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

  public String getBirthDate() {
    return birthDate;
  }

  public void setBirthDate(String birthDate) {
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


  //Builder
  public static LoanResponse builder() {
    return new LoanResponse();
  }

  public LoanResponse firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  public LoanResponse lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  public LoanResponse gender(String gender) {
    this.gender = gender;
    return this;
  }

  public LoanResponse birthDate(String birthDate) {
    this.birthDate = birthDate;
    return this;
  }

  public LoanResponse email(String email) {
    this.email = email;
    return this;
  }

  public LoanResponse productType(String productType) {
    this.productType = productType;
    return this;
  }

  public LoanResponse loanStatus(LoanStatus loanStatus) {
    this.loanStatus = loanStatus;
    return this;
  }

  public LoanResponse amount(BigDecimal amount) {
    this.amount = amount;
    return this;
  }

  public LoanResponse build() {
    LoanResponse loanResponse = new LoanResponse();
    loanResponse.setFirstName(firstName);
    loanResponse.setLastName(lastName);
    loanResponse.setGender(gender);
    loanResponse.setBirthDate(birthDate);
    loanResponse.setEmail(email);
    loanResponse.setProductType(productType);
    loanResponse.setLoanStatus(loanStatus);
    loanResponse.setAmount(amount);
    return loanResponse;
  }
}
