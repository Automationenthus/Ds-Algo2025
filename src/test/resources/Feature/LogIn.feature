#Feature: Login Functionality
 #
 #Background: Verify that the user is able to login to the portal with credentials
    #Given User is in the ds-algo launch page
    #When User click the get started button in dsalgo launch page
 #
 #Scenario Outline: Verify user enters valid username and password
    #
    #When The user gets valid data  '<Sheetname>' and <RowNumber> for the login page
   #
    #
     #Examples: 
      #| Sheetname   | RowNumber |
      #| Valid_Login |         1 |
   #
#
#Scenario Outline: Verify user receives validation message when username and password fields are blank during Login
    #Given The user clicks the Sign In link
    #When The user gets data from excel sheet '<Username1>' and <Passowrd1> for the login page
    #Then The error message appears below Username and Password textbox like "Please fill out this field."
#Examples: 
#|Username1|Passowrd1|
#|||
 #
 #Scenario: Verify that the user gets error message when giving invalid username and password
 #Given The user clicks the Sign In link 
 #When The user enters invalid username and password
 #Then The user should get the error message "Invalid Username and Password"
 #
 #Scenario: Verify that user able to navigate to get started page
  #Given The user clicks the Sign In link
 #When The user clicks numpy ninja button on the top left
 #Then The user should get navigate to get started home page
 #
 #Scenario: Verify that user able to go to Register page 
 #Given The user clicks the Sign In link
 #When The user clicks Register link
 #Then The user should navigate to Register page
 #
#
 #
#
 #
  #
 #
 