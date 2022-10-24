@parameter
Feature: Parameter Feature

#Background:
	#Given Open facebook application

@no_param
  Scenario: Senario have no parameter
    #Given Open facebook application
     When Input to Username Textbox
      And Input to Password Textbox
      And Click to Submit button
      #And Close application
  
  @param_mark
  Scenario: Senario have mark parameter 
    #Given Open facebook application
     When Input to Username Textbox with "automationtest@gmail.com"
      And Input to Password Textbox with "123456"
      And Click to Submit button
      #And Close application
  
  @param_no_mark
  Scenario: Senario have no mark parameter
    #Given Open facebook application
     When Input to Username Textbox with automationtest@gmail.com
      And Input to Password Textbox with 123456
      And Click to Submit button
      #And Close application
  
  @multiple_param
  Scenario: Senario have multiple parameter
    #Given Open facebook application
     When Input to Username with "automationtest@gmail.com" and Password with "123456"
      And Click to Submit button
      #And Close application
  
  
