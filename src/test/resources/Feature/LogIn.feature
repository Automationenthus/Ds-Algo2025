Feature: Login Functionality
 
 Scenario Outline: Login with invalid crdentials
 Given User is on Dsportal login page
 When User enters invalid "Username1" and "Passowrd1" 
 Then User should get proper warning message
 
Examples: 
|Username1|Passowrd1|
|automatione|Numpy@ninja20|
|    |Numpy@ninja2025|
|automation||

 
 Scenario Outline: Verify that user able to see validation message when trying to login with empty fields
 Given User is on Dsportal login page
 When The user clicks login button after leaving the "Username1" textbox and "Passowrd1" textbox empty
 Then The error message "Message" appears below Username textbox

Examples:
 |Username1|Passowrd1|Message|
 |||Please fill out this field|

 
 Scenario: Verify that the user able to navigate to register page after click register button
 Given User is on Dsportal login page
 When The user clicks the register button from login page
 Then The user should get navigae to register page
 
 Scenario: Verify that user able to navigate to get started page
  Given User is on Dsportal login page
 When The user clicks numpy ninja button on the top left
 Then The user should get navigate to get started home page
 
 Scenario: Verify that user able to see all the menus 
 When The user clicks datastructure button on the top left
 Then The user should see all six menus
 
Scenario Outline: Login is working with valid crdentials
 Given User is on login page
 When User enters valid "Username1" and "Password1" and clicks login button
 Then User is navigated to home page
Examples: 
|Username1|Password1|
|automationenthu|Numpy@ninja2025|
 
 Scenario: Verify user is able to see username in the home page after successful login
 Given user is on the login page
 When User clicks login button with valid credentials
 Then User should see the username on the right side top of the home page
 
  
 
 