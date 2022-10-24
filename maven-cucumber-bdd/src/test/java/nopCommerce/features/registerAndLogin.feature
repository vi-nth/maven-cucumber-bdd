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
    
 
  
