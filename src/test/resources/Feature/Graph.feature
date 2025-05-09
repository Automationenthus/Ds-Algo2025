
#Feature: Graph Module Functionality
#
#Background: The user navigates to the app and logs in
  #Given User is in the ds-algo launch page
  #When User click the get started button in dsalgo launch page
  #Then The user gets valid data  "<Username1>" and "<Passowrd1>" for the login page
#  And The user clicks the Sign In link
#
#Scenario Outline: The user logs in and accesses Graph module
  #When The user gets valid data  "<Username1>" and "<Passowrd1>" for the login page
  #Then The user navigate to home page
#
#Examples:
  #| Username1         | Passowrd1        |
  #| Automation_enthus | Numpy@ninja2025  |
#
#
  #Scenario: Verify that user is able to navigate to Graph page
    #Given The user is in the Home page after logged in
    #When The user clicks the Getting Started button of Graph
    #Then The user should land on Graph page of dsportalapp
#
  #Scenario: Verify that user is able to navigate to Graph page
    #Given The user is in the Home page after logged in
    #When The user select Graph item from the drop down menu
    #Then The user should land on Graph page of dsportalapp
#
  #Scenario: Verify that user name and Sign out button are present on top of the page or not
    #Given The user is on Graph page
    #When The user lands on Graph page
    #Then The user should be able to view username and sign out button on top of the page
#
  #Scenario: Verify that NumpyNinja link and DataStructures dropdown are present on top of the page or not
    #Given The user is on Graph page
    #When The user lands on Graph page
    #Then The user should be able to view NumpyNinja and DataStructures dropdown and able to perform actions on that
#
  #Scenario: Verify that user is able to navigate to Graph page
    #Given The user is on Graph page
    #When The user clicks on Graph link
    #Then The user should land on navigate to Graph page of Graph
#
  #Scenario: Verify that user is able to navigate to Practice page
    #Given user is on Graph page Of Graph
    #When user clicks on Practice Questions link of Graph page
    #Then user should land on practice page of Graph page
#
  #Scenario: Verify that user is able to navigate to tryEditor page
    #Given The user is on Graph page
    #When The user clicks on tryEditor link of Graph page
    #Then The user should land on to tryEditor page of Graph and should see Run button
#
  #Scenario: Verify that user receives error message on click on run button with incorrect code
    #Given The user is on tryEditor page of Graph page
    #When The user clicks on run button by writing incorrect python code
    #Then The user should see the error message in alert window along with line number
#
  #Scenario: Verify that user receives error message on click on run button without entering code
    #Given The user is on tryEditor page of Graph page
    #When The user clicks on run button without writing code in editor
    #Then The user should see the error message in alert window
#
  #Scenario: Verify that user cannot type in editor without clicking ok button on alert window
    #Given The user is on tryEditor page with alert window open of Graph page
    #When The user did not clicks on ok button on alert window
    #Then The user should not able to perform any other operation on page
#
  #Scenario: Verify that user can type in editor by clicking ok button on alert window
    #Given user is on tryEditor page with alert window open of Graph page
    #When The user clicks on ok button on alert window
    #Then The user should be able to edit code on editor and perform other operations as well
#
  #Scenario: Verify that user is able to see output for valid python code for Graphs page
    #Given The user is in the tryEditor page on Graph page
    #When The user write the valid code in Editor and click the Run button
    #Then The user should able to see output in the console
#
  #Scenario: Verify that user is able to navigate to Graph Representations page
    #Given The user is on Graph Representations page
    #When The user clicks on Graph Representations link
    #Then The user should land on navigate to Graph Representations page of Graph
#
  #Scenario: Verify that user is able to navigate to tryEditor page
    #Given The user is on Graph Representations page
    #When The user clicks on tryEditor link of Graph Representations page
    #Then The user should land on to try Editor page of Graph Representations and should see Run button
#
  #Scenario: Verify that user receives error message on click on run button with incorrect code
    #Given The user is on tryEditor page of Graph Representations page
    #When The user clicks on run button by writing incorrect python code
    #Then The user should see the error message in alert window along with line number
#
  #Scenario: Verify that user receives error message on click on run button without entering code
    #Given The user is on tryEditor page of Graph Representations page
    #When The user clicks on run button without writing code in editor
    #Then The user should see the error message in alert window
#
  #Scenario: Verify that user cannot type in editor without clicking ok button on alert window
    #Given The user is on tryEditor page with alert window open of Graph Representations page
    #When The user did not clicks on ok button on alert window
    #Then The user should not able to perform any other operation on page
#
  #Scenario: Verify that user can type in editor by clicking ok button on alert window
    #Given user is on tryEditor page with alert window open of Graph Representations page
    #When The user clicks on ok button on alert window
    #Then The user should be able to edit code on editor and perform other operations as well
#
  #Scenario: Verify that user is able to see output for valid python code for Graph Representations page
    #Given The user is in the tryEditor page
    #When The user write the valid code in Editor and click the Run button
    #Then The user should able to see output in the console
#
  #Scenario: Verify if user is able to navigate to Home page on clicking SignOut link
    #Given The user is on Graph page
    #When The user clicks on Sign out button
    #Then user should be navigate back to Home page and Logged out successfully message should be displayed on home page

Feature: Graph feature in DSAlgo

  Background: 
    Given user is on login page
    When user enters valid username and password
    Then user should be logged in successfully with "You are logged in" message

  Scenario: Verify that user is able to navigate to "Graph" page
    Given user is on home page to click Graph
    When user clicks on Graph GetStarted button
    Then user lands on Graph page and able to see NumpyNinja,Data structures dropdown,username and signout links

  Scenario: Verify that user is able to navigate to "Graph" page
    Given user is on graph page
    When user clicks on graph of graph Page
    Then user lands on "graph" page of graph
    
    Scenario: Verify user able be navigate to "tryEditor" page 
    Given user is on Graph of Graph page
    When user clicks on Tryhere link on Graph Page
    Then user should be directed to "tryEditor" page with Run button
  
   Scenario Outline: Verify that user is able to see output for valid python code for Graph page
    Given The user is in the tryEditor page on Graph page
    When user writes Python code from "<sheetname>" and <rownumber> and click the Run button
    Then output should match with expected result from "<sheetname>" and <rownumber>

   Examples:
      | sheetname   | rownumber |
      | pythoncode  | 0         |
         
                 
  Scenario: Verify that user cannot click on run button without entering code on Graph page
    Given The user is in the tryEditor page on Graph page
    When user clicks on run button without code on Graph page
    Then user cannot able click on run button on Graph page

  Scenario Outline: Verify that user recieves error messgae on click on run button with incorrect code on Graph page
    Given The user is in the tryEditor page on Graph page
    When user clicks on run button with incorrect code from "<sheetname>" and <rownumber> on Graph page
    Then user should see the error message in alert window and get the alert text on Graph page

    Examples: 
      | sheetname  | rownumber |
      | pythoncode |         1 |

  Scenario Outline: Verify that user canot perform any operations without clicking ok button on alert window on Graph page
    Given The user is in the tryEditor page on Graph page
    When user types incorrect code from "<sheetname>" and <rownumber> on Graph page
    Then user should see alert window and can not click on run button on Graph page

    Examples: 
      | sheetname  | rownumber |
      | pythoncode |         1 |
      
  
Scenario: Verify that user is able to navigate to "GraphReprasentions" page
    Given user is on Graph of Graph page
    When user clicks on GraphReprasentions of grapg Page
    Then user lands on "GraphReprasentions" of graph Page
    
     Scenario: Verify user able be navigate to "tryEditor" page 
    Given user is on GraphReprasentions of Graph page
    When user clicks on Tryhere link on GraphReprasentions Page
    Then user should be directed to "tryEditor" page with Run button on GraphReprasentions page
    
    Scenario Outline: Verify that user is able to see output for valid python code for Graph page
    Given The user is in the tryEditor page on GraphReprasentions page
    When user writes Python code from "<sheetname>" and <rownumber> and click the Run button
    Then output should match with expected result from "<sheetname>" and <rownumber>

   Examples:
      | sheetname   | rownumber |
      | pythoncode  | 0         |
         
    
    Scenario: Verify that user cannot click on run button without entering code on GraphReprasentions page
    Given The user is in the tryEditor page on GraphReprasentions page
    When user clicks on run button without code on Graph page
    Then user cannot able click on run button on Graph page

  Scenario Outline: Verify that user recieves error messgae on click on run button with incorrect code on GraphReprasentions page
    Given The user is in the tryEditor page on Graph page
    When user clicks on run button with incorrect code from "<sheetname>" and <rownumber> on GraphReprasentions page
    Then user should see the error message in alert window and get the alert text on GraphReprasentions page

    Examples: 
      | sheetname  | rownumber |
      | pythoncode |         1 |

  Scenario Outline: Verify that user canot perform any operations without clicking ok button on alert window on GraphReprasentions page
    Given The user is in the tryEditor page on GraphReprasentions page
    When user types incorrect code from "<sheetname>" and <rownumber> on GraphReprasentions page
    Then user should see alert window and can not click on run button on GraphReprasentions page

    Examples: 
      | sheetname  | rownumber |
      | pythoncode |         1 |
       
    Scenario: Verify user is able to navigate to Graph page and click on "Practice" Questions
    Given user is in tryEditor page and navigates to GraphReprasentions page
    When user clicks on Practice Questions in graph representations page
    Then user should land on graph "Practice" page

  Scenario: Verify if user is able to navigate to Home page on clicking SignOut link
    Given The user is on Graph page
    When The user clicks on Sign out button on Graph Page
    Then user should navigate back to Home page from Graph and can view "Logged out successfully" message

