Feature: Login Functionality
 
 Background: Verify that the user is able to login to the portal with credentials
    Given User is in the ds-algo launch page
    When User click the get started button in dsalgo launch page
 
 Scenario Outline: Verify user enters valid username and password
    
    When The user gets valid data  '<sheetname>' and '<scenario>' for the login page
    Then The user is in the home page
     And The user clicks Sign Out
    Then The user should be redirected to home page with message "Logged out successfully"
   
    
     Examples: 
      | sheetname   | scenario  |
      | Login       |      valid|
   

Scenario Outline: Verify user receives validation message when username and password fields are blank during Login
    
    When The user gets blank data from excel sheet '<sheetname>' and '<scenario>' for the login page
    Then The error message appears below Username and Password textbox like Please fill out this field
    
   Examples:
 | sheetname   | scenario  |
 | Login       |blank|
 
Scenario Outline: Verify that the user gets error message when giving invalid username and password
 
 When The user gets invalid data from excel sheet '<sheetname>' and '<scenario>' for the login page
 Then The user should get the error message Invalid Username and Password
 
  Examples:
 | sheetname   | scenario  |
 | Login       | invalid|

 

 

 
  
 
 