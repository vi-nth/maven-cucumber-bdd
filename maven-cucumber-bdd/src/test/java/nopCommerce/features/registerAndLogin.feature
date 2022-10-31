@register
Feature: Register and Login

@register_login
  Scenario: Register to system and login
   
    When Navigate to Register Page
    And Input valid value to Register form
    And Click to Register button
    Then Verify Register successful message is displayed
    
    When Click to Logout Link
    And Navigate To Login Page
    And Input valid value to Login form
    And Click Login button
    Then My Account link is displayed
    
@register_login_dynamic
  Scenario Outline: Register to system and Login by dynamic feature
  
    Given Navigate to "Register" Page
     When Click to "female" Radio button
      And Input "FirstName" textbox with value "<First name>"
      And Input "LastName" textbox with value "<Last name>"
      And Select "DateOfBirthDay" with value "<Date of birth day>"
      And Select "DateOfBirthMonth" with value "<Date of birth month>"
      And Select "DateOfBirthYear" with value "<Date of birth year>"
      And Input "Email" textbox with value "<Email>"
      And Input "Company" textbox with value "<Company name>"
      And Click to "Newsletter" checkbox
      And Input "Password" textbox with value "<Password>"
      And Input "ConfirmPassword" textbox with value "<Confirm password>"
      And Click to "register-button" button
     Then Successful resgister message displayed with "Your registration completed"
     When Click to "My account" textlink
     Then The valid displayed at "FirstName" with value "<First name>" 
     Then The valid displayed at "LastName" with value "<Last name>" 
     Then The valid displayed at "DateOfBirthDay" dropdown with value "<Date of birth day>" 
     Then The valid displayed at "DateOfBirthMonth" dropdown with value "<Date of birth month>" 
     Then The valid displayed at "DateOfBirthYear" dropdown with value "<Date of birth year>" 
     Then The valid displayed at "Email" with value "<First name>" 
     Then The valid displayed at "Company" with value "<Company name>" 
   
     Then The "Newsletter" checkbox is checked
  
    Examples: 
      | Gender | First name | Last name | Date of birth day | Date of birth month | Date of birth year | Email   | Company name | Newsletter | Password | Confirm password | 
      | Female | Anna       | Nguyen    | 2                | April               | 1992               | anna123 | ABC Company  | Newsletter | 123456   | 123456           |
    
    
 
  
