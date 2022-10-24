@data_table
Feature: DataTable Feature

@datatable_step_demo
  Scenario Outline: Create new Customer with email <Username>
    Given Open facebook application
     When Input to Username and Password
      | Username   | Password   | Address   | 
      | <Username> | <Password> | <Address> | 
      And Click to Submit button
     Then Verify submited infor displayed
      | Username   | Address   | 
      | <Username> | <Address> | 
     When Open Customer page
      And Input to Customer Name textbox <Customer Name>
      And Input to City textbox <City>
      And Input to other required fields
      | Phone      | Email                  | 
      | 0904444555 | automationfc@gmail.com | 
      And Close application
  
    Examples: 
      | Username                 | Password | Customer Name | City   | Address | Phone      | 
      | automationtest@gmail.com | 123456   | Vivian        | Ha Noi | Le Loi  | 0904444555 | 
  
  @datatable_scenario  @data_driven_testing
  Scenario Outline: Data table in Scenario
    Given Open facebook application
     When Input to Username Textbox with "<Username>"
      And Input to Password Textbox with "<Password>"
      And Click to Submit button
      And Close application
  
    Examples: 
      | Username               | Password | 
      | automation01@gmail.com | 123456   | 
      | automation02@gmail.com | 123456   | 
      | automation03@gmail.com | 123456   | 
      | automation04@gmail.com | 123456   | 
      
  @datatable_step
  Scenario Outline: Create new Customer with email <Username>
    Given Open facebook application
     When Input to Username and Password
     
      | Username               | Password | 
      | automation01@gmail.com | 123456   | 
      | automation02@gmail.com | 123456   | 
      | automation03@gmail.com | 123456   | 
      
      And Click to Submit button
      And Close application
  
    Examples: 
      | Username                 | Password | 
      | automationtest@gmail.com | 123456   | 
  