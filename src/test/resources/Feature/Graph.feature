Feature: This feature file contain scenario for the Graph module

  Background: The user sign in to dsAlgo Portal

  Scenario: Verify that user is able to navigate to "Graph" page
    Given The user is in the Home page after logged in
    When The user clicks the "Getting Started" button of "Graph"
    Then The user should  land on Graph page of dsportalapp

  Scenario: Verify that user is able to navigate to "Graph" page
    Given The user is in the Home page after logged in
    When The user select Graph item from the drop down menu
    Then The user should  land on Graph page of dsportalapp

  Scenario: Verify that "user name " and "Sign out" button are present on top of the page or not
    Given The user is on "Graph" page
    When The user lands on Graph page
    Then The  user should be able to view username and signout button on top of the page

  Scenario: Verify that NumpyNinja link and DataStructures dropdown are present on top of the page or not
    Given The user is on "Graph" page
    When The user lands on Graph page
    Then The user should be able to view NumpyNinja and DataStructures dropdown and able to perform actions on that

  Scenario: Verify that user is able to navigate to "Graph" page
    Given The user is on "Graph" page
    When The user clicks on "Graph" link
    Then The user should land on navigate to Graph page of Graph

  Scenario: Verify that user is able to navigate to "Practice" page
    Given user is on "Graph" page Of Graph
    When user clicks on Practice Questions link
    Then user should land on practice page

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Graph" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of Graph and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on " tryEditor" page of "Graph" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on"try Editor" page of "Graph" page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Graph" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on " tryEditor" page with alert window open of "Graph" page

    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Graphs" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Graph Representations" page
    Given The user is on "Graph Representations" page
    When The user clicks on "Graph Representations" link
    Then The user should land on navigate to Graph Representations page of Graph

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Graph Representations" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of Graph Representations and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on " tryEditor" page of "Graph Representations" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on"try Editor" page of "Graph Representations" page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Graph Representations" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on " tryEditor" page with alert window open of "Graph Representations" page

    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Graph Representations" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify if user is able to navigate to Home page on clicking "SignOut " link
    Given The user is on "Graph" page
    When The user clicks on Signout button
    Then Then user should be navigate back to "Home" page and "Logged out successfully" message should be displayed on home page
