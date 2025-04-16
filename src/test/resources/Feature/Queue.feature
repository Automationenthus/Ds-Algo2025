Feature: This feature file contain scenario for the Queue module

  Background: The user sign in to dsAlgo Portal

  Scenario: Verify that user is able to navigate to "Queue" page
    Given The user is on Home page after logged in
    When The user clicks the "Get Started" button of "Queue"
    Then The user should land on Queue page of dsportalapp

  Scenario: Verify that user is able to navigate to "Queue" page
    Given The user is on Home page after logged in
    When The user select Queue item from the drop down menu
    Then The user should land on Queue page of dsportalapp

  Scenario: Verify that "user name " and "Sign out" button are present on top of the page or not
    Given The user is on "Queue" page
    When The user lands on Queue page
    Then The user should be able to view username and signout button on top of the page

  Scenario: Verify that NumpyNinja link and DataStructures dropdown are present on top of the page or not
    Given The user is on "Queue" page
    When The user lands on Queue page
    Then The user should be able to view NumpyNinja, DataStructures dropdown and able to perform actions on that

  Scenario: Verify that user is able to navigate to "Implementation of Queue in Python" page
    Given The user is on "Implementation of Queue in Python" page
    When The user clicks on "Implementation of Queue in Python" link
    Then The user should land on "Implementation of Queue in Python"

  Scenario: Verify that user is able to navigate to "Practice" page
    Given user is on "Implementation of Queue in Python" page Of Queue
    When user clicks on Practice Questions link
    Then user should land on practice page

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Implementation of Queue in Python" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of Implementation of Queue in Python and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on " tryEditor" page of "Implementation of Queue in Python" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on"try Editor" page of "Implementation of Queue in Python" page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Implementation of Queue in Python" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on "tryEditor" page with alert window open of "Implementation of Queue in Python" page

    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Implementation of Queue in Python" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Implementation using collections.deque" page
    Given The user is on "Implementation using collections.deque" page
    When The user clicks on "Implementation using collections.deque" link
    Then The user should land on "Implementation using collections.deque"

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Implementation using collections.deque" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of "Implementation using collections.deque" Representations and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on "tryEditor" page of "Implementation using collections.deque" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on "try Editor" page of Implementation using collections.deque page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Implementation using collections.deque" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on " tryEditor" page with alert window open of "Implementation using collections.deque" page

    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Implementation using collections.deque" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Implementation using array" page
    Given The user is on "Implementation using array" page
    When The user clicks on "Implementation using array" link
    Then The user should land on "Implementation using array"

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Implementation using array" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of "Implementation using array"  and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on " tryEditor" page of "Implementation using array" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on"try Editor" page of "Implementation using array" page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Implementation using array" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on " tryEditor" page with alert window open of "Implementation using array" page

    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Implementation using array" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Queue Operations" page
    Given The user is on "Queue Operations" page
    When The user clicks on "Queue Operations" link
    Then The user should land on "Queue Operations"

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Queue Operations" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of "Queue Operations"  and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on " tryEditor" page of "Queue Operations" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on"try Editor" page of "Queue Operations" page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Queue Operations" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    Given The user is on tryEditor page with alert window open of "Queue Operations" page
    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Queue Operations" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify if user is able to navigate to Home page on clicking "SignOut " link
    Given The user is on Queue page
    When The user clicks on Signout button
    Then Then user should be navigate back to "Home" page and "Logged out successfully" message should be displayed on home page
