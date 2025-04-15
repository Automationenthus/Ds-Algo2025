Feature: This feature file contain scenario for the LinkedList module

  Background: The user sign in to dsAlgo Portal

  Scenario: Verify that user is able to navigate to "LinkedList" page
    Given The user is on Home page after logged in
    When The user clicks the "Get Started" button of "LinkedList"
    Then The user should land on LinkedList page of dsportalapp

  Scenario: Verify that user is able to navigate to "LinkedList" page
    Given The user is on Home page after logged in
    When The user select LinkedList item from the drop down menu
    Then The user should land on LinkedList page of dsportalapp

  Scenario: Verify that "user name " and "Sign out" button are present on top of the page or not
    Given The user is on "LinkedList" page
    When The user lands on LinkedList page
    Then The user should be able to view username and signout button on top of the page

  Scenario: Verify that NumpyNinja link and DataStructures dropdown are present on top of the page or not
    Given The user is on "LinkedList" page
    When The user lands on LinkedList page
    Then The user should be able to view NumpyNinja, DataStructures dropdown and able to perform actions on that

  Scenario: Verify that user is able to navigate to "Introduction" page
    Given The user is on "Introduction" page
    When The user clicks on "Introduction" link
    Then The user should land on "Introduction"

  Scenario: Verify that user is able to navigate to "Practice" page
    Given user is on "Introduction" page Of LinkedList
    When user clicks on Practice Questions link
    Then user should land on practice page

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Introduction" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of "Introduction" and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on " tryEditor" page of "Introduction" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on"try Editor" page of "Introduction" page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Introduction" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on "tryEditor" page with alert window open of "Introduction" page

    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Introduction" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Creating Linked LIst" page
    Given The user is on "Creating Linked LIst" page
    When The user clicks on "Creating Linked LIst" link
    Then The user should land on "Creating Linked LIst"

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Creating Linked LIst" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of "Creating Linked LIst" and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on "tryEditor" page of "Creating Linked LIst" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on "try Editor" page of Creating Linked LIst page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Creating Linked LIst" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on " tryEditor" page with alert window open of "Creating Linked LIst" page

    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Creating Linked LIst" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Types of Linked List" page
    Given The user is on "Types of Linked List" page
    When The user clicks on "Types of Linked List" link
    Then The user should land on "Types of Linked List"

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Types of Linked List" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of "Types of Linked List"  and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on " tryEditor" page of "Types of Linked List" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on"try Editor" page of "Types of Linked List" page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Types of Linked List" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on " tryEditor" page with alert window open of "Types of Linked List" page

    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Types of Linked List" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Types of Linked List" page
    Given The user is on "Implement Linked List in Python" page
    When The user clicks on "Implement Linked List in Python" link
    Then The user should land on "Implement Linked List in Python"

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Implement Linked List in Python" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of "Implement Linked List in Python"  and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on " tryEditor" page of "Implement Linked List in Python" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on"try Editor" page of "Implement Linked List in Python" page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Implement Linked List in Python" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on " tryEditor" page with alert window open of "Implement Linked List in Python" page

    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Implement Linked List in Python" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Types of Linked List" page
    Given The user is on "Traversal" page
    When The user clicks on "Traversal" link
    Then The user should land on "Traversal"

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Traversal" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of "Traversal"  and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on " tryEditor" page of "Traversal" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on"try Editor" page of "Traversal" page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Traversal" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on " tryEditor" page with alert window open of "Traversal" page

    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Traversal" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Types of Linked List" page
    Given The user is on "Insertion" page
    When The user clicks on "Insertion" link
    Then The user should land on "Insertion"

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Insertion" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of "Insertion"  and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on " tryEditor" page of "Insertion" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on"try Editor" page of "Insertion" page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Insertion" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on " tryEditor" page with alert window open of "Insertion" page

    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Insertion" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify that user is able to navigate to "Types of Linked List" page
    Given The user is on "Deletion" page
    When The user clicks on "Deletion" link
    Then The user should land on "Deletion"

  Scenario: Verify that user is able to navigate to "try Here" page
    Given The user is on "Deletion" page
    When The user clicks on "Try here" link
    Then The user should land on  to "try Editor" page of "Deletion"  and should see Run button

  Scenario: Verify that user recieves error messgae on click on run button with incorrect code
    Given The user is on " tryEditor" page of "Deletion" page
    When The user clicks on run button by writing incorrect pyhton code
    Then The user should see the error message in alert window along with line number

  Scenario: Verify that user recieves error messgae on click on run button without entering code
    Given The user is on"try Editor" page of "Deletion" page
    When The user clicks on run button without  writing code in editor
    Then The user should see the error message in alert window

  Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
    Given The user is on " tryEditor" page with alert window open of "Deletion" page
    When The user did not clicks on "ok" button on alert window
    Then The user should not able to perform any other operation on page

  Scenario: Verify that user can type in editor by clicking "ok" button on alert window
    GivenThe user is on " tryEditor" page with alert window open of "Deletion" page
    When The user clicks on "ok" button on alert window
    Then The user should be able to edit code on editor and perform other operations as well

  Scenario: Verify that user is able to see output for valid python code for "Deletion" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console

  Scenario: Verify if user is able to navigate to Home page on clicking "SignOut " link
    Given The user is on "LinkedList" page
    When The user clicks on Signout button
    Then Then user should be navigate back to "Home" page and "Logged out successfully" message should be displayed on home page
