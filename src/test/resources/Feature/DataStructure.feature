#
#Feature: To test DataStructuresIntroduction functionality
#
#Background: 
#Given user is on home page
#When user clicks on sigin button and enters valid username and password
#Then user should be logged in successfully with "You are logged in" message
#
  #
#Scenario: verify user clicks on login link he should be navigated to login page 
  #Given user is on home page
  #When user clicks on sigin button
  #Then user lands on "Login" page
  #
#
#Scenario: Verify that user is able to navigate to "Data Structures - Introduction" page
#Given user is on home page 
#When user clicks on DtastructureInro GetStarted button
#Then user lands on data-structures-introduction page and able to see NumpyNinja,Data structures dropdown,username and signout links
#
#
#
#Scenario: Verify that by clicking NumpyNinja link user should be navigated to dsalgo portal
#Given user is on data-structures-introduction page
#When user clicks on NumpyNinja
#Then user lands on dsalgo portal
#
#Scenario Outline: User selects an item from the Data Structures dropdown
#Given user is on data-structures-introduction page
#When user select "<Option>" from the Data Structures dropdown
#Then user should be navigated to the <ExpectedPath> page
#
  #Examples:
    #| Option       | ExpectedPath     |
    #| Arrays       | array            |
    #| Linked List  | linked-list      |
    #| Stack        | stack            |
    #| Queue        | queue            |
    #| Tree         | tree             |
    #| Graph        | graph            |
    #
#Scenario: Verify that user is able to navigate to "Time Complexity" page
#Given user is on data-structures-introduction page
#When  user ckicks on Time complexity link
#Then  user lands on "Time Complexity" page
    #
#Scenario: Verify that user is able to navigate to "Practice" page
#Given user is on Time complexity page 
#When user clicks on Practice Questions link
#Then user should land on "practice" page
#
#Scenario: Verify that user is able to navigate to "try Editor" page
#Given  user is on Time complexity page 
#When user clicks on try here link
#Then user should land on "tryEditor" page with  Run button
#
#Scenario: Verify that user recieves error messgae on click on run button without entering code
#Given user is on try Editor page
#When user clicks on run button without code 
#Then user should see the error message in alert window 
#
#Scenario: Verify that user recieves error messgae on click on run button with incorrect code
#Given user is on try Editor page
#When user clicks on run button with incorrect code 
#Then user should see the error message in alert window 
#
#Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
#Given user is on try Editor page with alert window
#When  user does not click on ok button 
#Then  user can not perform any operation
#
#Scenario: Verify that user can type in editor by clicking "ok" button on alert window
#Given user is on try Editor page with alert window
#When user does click on ok button 
#Then  user can  perform any operation
#
 #Scenario Outline: Verify that Python code runs and output matches expected
    #Given user is on try Editor page
    #When user writes Python code from "<sheetname>" and <rownumber>
    #Then output should match with expected result "<expectedOutput>"
#
    #Examples:
      #| sheetname   | rownumber |expectedOutput|
      #| pythoncode  | 0       |hello|
      #
#
#Scenario: Verify that user is able to navigate to "Time Complexity" page  by clicking browser back button
#Given user is on try Editor page 
#When  user clicks on browser back button 
#Then user should navigate to Time Complexity page
    #
    #
#Scenario: Verify if user is able to navigate to Home page on clicking "SignOut " link
#Given user is on Time complexity page 
#When  user clicks on Signout button
#Then  user should land on Home page and can view "Logged out successfully" message    
#		
#=======
#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
#@tag
#Feature: Title of your feature
  #I want to use this template for my feature file
#
  #@tag1
  #Scenario: Title of your scenario
    #Given I want to write a step with precondition
    #And some other precondition
    #When I complete action
    #And some other action
    #And yet another action
    #Then I validate the outcomes
    #And check more outcomes
#
  #@tag2
  #Scenario Outline: Title of your scenario outline
    #Given I want to write a step with <name>
    #When I check for the <value> in step
    #Then I verify the <status> in step
#
    #Examples: 
      #| name  | value | status  |
      #| name1 |     5 | success |
      #| name2 |     7 | Fail    |
#
