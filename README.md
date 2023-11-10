# Coding Exam
This coding exam simulates a sample Spring microservice designed for applying loans. This exercise
is created to gain insights on your development skills and what you've learned so far during the
bootcamp.

# Getting Started

### Prerequisites
* Java 8
* Gradle
* Git

### Run Guide
* Build the project by using IntelliJ's built-in action **(Build > Build Project)** or by executing this command:
>./gradlew clean build -x test
* Run the program with active profiles: **local**
* To test your code, you may use this POSTMAN Request:
>curl --location --request POST 'localhost:9187/v1/loan' \
--header 'Content-Type: application/json' \
--data-raw '{
"firstName": "Juan",
"lastName": "Dela Cruz",
"gender": "M",
"loanStatus": "IN_PROCESS",
"birthDate": "1999-01-01",
"email": "abc@gmail.com",
"productType": "CASH_LOAN",
"amount": 20000
}'

# What to do?

###General Instructions
1. You will be modifying this project according to the requirements below.
2. Existing classes and methods that needs to be refactored have a **TODO** comment. Once done
   refactoring, you may remove the TODO comments. Aside from those, other classes should not be edited.
3. Some requirements might require you to create new classes.
4. 

###Requirements
**LoanRequest.java**
1. Use Lombok annotations to reduce boilerplate code. _5 pts._
2. Add javax validation annotations in these fields: _10 pts._
   
   Field     | Validation                                         | Error message
   ---       | ---                                                | ---
   firstName | Should not be an empty String                      | First name is required. 
   firstName | First name should be between 2 and 100 characters  | First name should be between 2 and 100 characters.
   lastName  | Should not be an empty String                      | Last name is required.
   lastName  | Last name should be between 2 and 100 characters   | Last name should be between 2 and 100 characters.
   email     | Optional. Should be a valid email                  | Email is invalid.
   amount    | Should be between 20,000 and 150,000               | Amount should be between 20,000 and 150,000

3. Gender is required and should only accept M and F values. _5 pts._
4. birthDate has a @LegalAge custom annotation that validates if customer is of legal age (18 years old and above). 
   If not, response error message:
   **Customer should be of legal age: <18 and above>** _3 pts._
   
**LoanResponse.java and V1LoanServiceImpl.java**

1. Request-Response Mapping: _15 pts._

   Response   | Source                                         
   ---        | ---                                                
   fullName   | request.firstName \<space> request.lastName
   gender     | request.gender: Male if M; Female if F
   email      | request.email  
   birthDate  | request.birthDate format: Jan 01, 1999
   loanAmount | request.amount
   loanStatus | defaulted to LoanStatus.IN_PROCESS

2. When logging the LoanRequest object (V1LoanServiceImpl.applyLoan), it should not display the birthdate and email as these are
sensitive information. _5 pts._
   
**BirthDateValidator.java**
1. Modify isValid method to correctly check if customer is of legal age. _15 pts._

**Bonus**
1. Additional points will be awarded based on code cleanliness, completeness, and consistency. _15 pts._

###Submitting your work
1. Create a git branch named: **feature/online-exam-java-\<nickname>**
2. Apply your changes 
3. Push your feature branch to the remote repository 
4. Create a merge request from your branch to develop titled: **Advanced Java Concepts Exam - \<Nickname>**

# Questions?
Feel free to raise your concerns and clarifications if something is not clear.

