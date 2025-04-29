Feature: Arrays in Python

Background: The user sign in to dsAlgo Portal

 Given The User is in home page
 When User clicks sign in and enters valid username and password
 Then The user is navigated to Home page

Scenario: Scroll down in dropdown and select "Array"
    Given The user is on Home page
    When The user scrolls down to the Data Structures dropdown and selects Array
    Then User is navigated to Array Page


#Arraysin Python

  Scenario: Verify that user is able to navigate to "Arrays in Python" page
  Given The user is in the Array page after Sign in
  When The user clicks Arrays in Python button
  Then The user should be redirected to Arrays in Python page
  
  Scenario: Verify that the user is able to scroll down and click Try Here button
    Given The user is on the Arrays in Python page
  When The user scrolls down and clicks Try Here button in Arrays in Python page
  Then The user IS redirected to a page having an try Editor with a Run button to test

#Scenario: Verify that user receives error when click on Run button without entering code for "Arrays in Python" page
  #Given The user is in the Arrays tryEditor page
  #When The user clicks on the Run button without entering the code in the Editor
  #Then The user should see an error message in alert window

#Scenario: Verify that user receives error for invalid python code for "Arrays in Python" page
  #Given The user is in the Arrays tryEditor page
  #When The user gives the invalid code in Editor and click the Run Button
  #Then The user should see an error message in alert window
#
#Scenario: Verify that user is able to see output for valid python code for "Arrays in Python" page
  #Given The user is in the Arrays tryEditor page
  #When The user gives the valid code in Editor and click the Run Button
  #Then The user should see output in the console
#
#Scenario: Navigate back to Arrays in Python page from tryEditor
  #Given The user is on the Arrays tryEditor page
  #When The user clicks the browser back button
  #Then The user navigates back to the Arrays in Python page
  #
  
Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Arrays in Python" page
  Given The user is on the Arrays in Python page
  When The user clicks Practice Questions button
  Then The user is redirected to Practice page

Scenario Outline: Verify that user is able to navigate to a question page from Practice Question page of "Arrays in Python"
  Given The user is on the Arrays Practice Question page
  When The user clicks "<question_link>" link
  Then The user should be redirected to Question page contains a question, and try Editor with Run and Submit buttons

Examples:
  | question_link                           |
  | Search the array                        |
  | Max Consecutive Ones                      |
  | Find Numbers with Even Number of Digits  |
  | Squares of a Sorted Array               |

#Scenario Outline: User actions on practice question editor for "<Question>"
    #Given The user is on the practice question editor for "<Question>"
    #When The user writes the "<CodeType>" code in Editor and Click the "<Button>"
    #Then The user should see "<ExpectedResult>"
#
    #Examples:
      #| Question                            | CodeType | Button  | ExpectedResult                              |
      #| Search the array                     | invalid  | Run     | an error message in alert window            |
      #| Search the array                     | valid    | Run     | output in the console                       |
      #| Search the array                     | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Search the array                     | valid    | Submit  | success message "Submission successful"     |
      #| Max Consecutive Ones                  | invalid  | Run     | an error message in alert window            |
      #| Max Consecutive Ones                  | valid    | Run     | output in the console                       |
      #| Max Consecutive Ones                  | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Max Consecutive Ones                  | valid    | Submit  | success message "Submission successful"     |
      #| Find Numbers with Even Number of Digits | invalid | Run    | an error message in alert window            |
      #| Find Numbers with Even Number of Digits | valid   | Run    | output in the console                       |
      #| Find Numbers with Even Number of Digits | invalid | Submit | an error message "Error occurred during submission" |
      #| Find Numbers with Even Number of Digits | valid   | Submit | success message "Submission successful"     |
      #| Squares of a Sorted Array           | invalid  | Run     | an error message in alert window            |
      #| Squares of a Sorted Array           | valid    | Run     | output in the console                       |
      #| Squares of a Sorted Array           | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Squares of a Sorted Array           | valid    | Submit  | success message "Submission successful"     |
      #
     #
     #
      #Arrays Using List
#
  #Scenario: Verify that user is able to navigate to "Arrays Using List" page
  #Given The user is in the Array page after Sign in
  #When The user clicks Arrays using List button
  #Then The user should be redirected to Arrays using List page
  #
  #Scenario: Verify that the user is able to scroll down and click Try Here button
  #Given The user is on the Arrays using List page
  #When The user scrolls down and clicks Try Here button in Arrays Using List page
  #Then The user IS redirected to a page having an try Editor with a Run button to test
  #
#
#Scenario: Verify that user receives error when click on Run button without entering code for "Arrays Using List" page
  #Given The user is in the Arrays tryEditor page
  #When The user clicks on the Run button without entering the code in the Editor
  #Then The user should see an error message in alert window
#
#Scenario: Verify that user receives error for invalid python code for "Arrays Using List" page
  #Given The user is in the Arrays tryEditor page
  #When The user gives the invalid code in Editor and click the Run Button
  #Then The user should see an error message in alert window
#
#Scenario: Verify that user is able to see output for valid python code for "Arrays Using List" page
  #Given The user is in the Arrays tryEditor page
  #When The user gives the valid code in Editor and click the Run Button
  #Then The user should see output in the console
  #
 # Scenario: Navigate back to Arrays Using List page from tryEditor
 # Given The user is on the Arrays tryEditor page
  #When The user clicks the browser back button
  #Then The user navigates back to the Arrays Using List page
  #
#
#Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Arrays Using List" page
  #Given The user is on the Arrayys Using List page
  #When The user clicks Practice Questions button
  #Then The user is redirected to Practice page
#
#Scenario Outline: Verify that user is able to navigate to a question page from Practice Question page of "Arrays Using List"
  #Given The user is on the Arrays Practice Question page
  #When The user clicks "<question_link>" link
  #Then The user should be redirected to Question page contains a question, and try Editor with Run and Submit buttons
#
#Examples:
  #| question_link                           |
  #| Search the array                        |
  #| Max Consecutive Ones                      |
  #| Find Numbers with Even Number of Digits  |
  #| Squares of a Sorted Array                |
#
#Scenario Outline: User actions on practice question editor for "<Question>"
    #Given The user is on the practice question editor
    #When The user writes the "<CodeType>" code in Editor and Click the "<Button>"
    #Then The user should see "<ExpectedResult>"
#
    #Examples:
      #| Question                            | CodeType | Button  | ExpectedResult                              |
      #| Search the array                     | invalid  | Run     | an error message in alert window            |
      #| Search the array                     | valid    | Run     | output in the console                       |
      #| Search the array                     | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Search the array                     | valid    | Submit  | success message "Submission successful"     |
      #| Max Consecutive Ones                  | invalid  | Run     | an error message in alert window            |
      #| Max Consecutive Ones                  | valid    | Run     | output in the console                       |
      #| Max Consecutive Ones                  | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Max Consecutive Ones                  | valid    | Submit  | success message "Submission successful"     |
      #| Find Numbers with Even Number of Digits | invalid | Run    | an error message in alert window            |
      #| Find Numbers with Even Number of Digits | valid   | Run    | output in the console                       |
      #| Find Numbers with Even Number of Digits | invalid | Submit | an error message "Error occurred during submission" |
      #| Find Numbers with Even Number of Digits | valid   | Submit | success message "Submission successful"     |
      #| Squares of a Sorted Array           | invalid  | Run     | an error message in alert window            |
      #| Squares of a Sorted Array           | valid    | Run     | output in the console                       |
      #| Squares of a Sorted Array           | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Squares of a Sorted Array           | valid    | Submit  | success message "Submission successful"     |
      #
   #
      #Basic Operations in List
#
  #Scenario: Verify that user is able to navigate to "Basic Operations in List" page
  #Given The user is in the Array page after Sign in
  #When The user clicks Basic Operations in List button
  #Then The user should be redirected to Basic Operations in List page
#
#
#Scenario: Verify that the user is able to scroll down and click Try Here button
  #Given The user is on the Basic Operations in List page
  #When The user scrolls down and clicks Try Here button in Basic Operations in List page
  #Then The user IS redirected to a page having an try Editor with a Run button to test
  #
#
#Scenario: Verify that user receives error when click on Run button without entering code for "Basic Operations in List" page
  #Given The user is in the Arrays tryEditor page
  #When The user clicks on the Run button without entering the code in the Editor
  #Then The user should see an error message in alert window
#
#Scenario: Verify that user receives error for invalid python code for "Basic Operations in List" page
  #Given The user is in the Arrays tryEditor page
  #When The user gives the invalid code in Editor and click the Run Button
  #Then The user should see an error message in alert window
#
#Scenario: Verify that user is able to see output for valid python code for "Basic Operations in List" page
  #Given The user is in the Arrays tryEditor page
  #When The user gives the valid code in Editor and click the Run Button
  #Then The user should see output in the console
  #
  #Scenario: Navigate back to Basic Operations in List page from tryEditor
  #Given The user is on the Arrays tryEditor page
  #When The user clicks the browser back button
  #Then The user navigates back to the Basic Operations in List page
  #
#
#Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Basic Operations in List" page
  #Given The user is on the Basic Operations in List page
  #When The user clicks Practice Questions button
  #Then The user is redirected to Practice page
#
#Scenario Outline: Verify that user is able to navigate to a question page from Practice Question page of "Basic Operations in List"
  #Given The user is on the Arrays Practice Question page
  #When The user clicks "<question_link>" link
  #Then The user should be redirected to Question page contains a question, and try Editor with Run and Submit buttons
#
#Examples:
  #| question_link                           |
  #| Search the array                        |
  #| Max Consecutive Ones                      |
  #| Find Numbers with Even Number of Digits  |
  #| Squares of a Sorted Array                |
#
#Scenario Outline: User actions on practice question editor for "<Question>"
    #Given The user is on the practice question editor
    #When The user writes the "<CodeType>" code in Editor and Click the "<Button>"
    #Then The user should see "<ExpectedResult>"
#
    #Examples:
      #| Question                            | CodeType | Button  | ExpectedResult                              |
      #| Search the array                     | invalid  | Run     | an error message in alert window            |
      #| Search the array                     | valid    | Run     | output in the console                       |
      #| Search the array                     | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Search the array                     | valid    | Submit  | success message "Submission successful"     |
      #| Max Consecutive Ones                  | invalid  | Run     | an error message in alert window            |
      #| Max Consecutive Ones                  | valid    | Run     | output in the console                       |
      #| Max Consecutive Ones                  | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Max Consecutive Ones                  | valid    | Submit  | success message "Submission successful"     |
      #| Find Numbers with Even Number of Digits | invalid | Run    | an error message in alert window            |
      #| Find Numbers with Even Number of Digits | valid   | Run    | output in the console                       |
      #| Find Numbers with Even Number of Digits | invalid | Submit | an error message "Error occurred during submission" |
      #| Find Numbers with Even Number of Digits | valid   | Submit | success message "Submission successful"     |
      #| Squares of a Sorted Array           | invalid  | Run     | an error message in alert window            |
      #| Squares of a Sorted Array           | valid    | Run     | output in the console                       |
      #| Squares of a Sorted Array           | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Squares of a Sorted Array           | valid    | Submit  | success message "Submission successful"     |
      #
#Applications of Array
#
#Scenario: Verify that user is able to navigate to "Applications of Array" page
  #Given The user is in the Array page after Sign in
  #When The user clicks Applications of Array button
  #Then The user should be redirected to Applications of Array page
#
#Scenario: Verify that the user is able to scroll down and click Try Here button
    #Given The user is on the Applications of Array page
  #When The user clicks Try Here button in Applications of Array page
  #Then The user IS redirected to a page having an try Editor with a Run button to test
  #
  #
#Scenario: Verify that user receives error when click on Run button without entering code for "Applications of Array" page
  #Given The user is in the Arrays tryEditor page
  #When The user clicks on the Run button without entering the code in the Editor
  #Then The user should see an error message in alert window
#
#Scenario: Verify that user receives error for invalid python code for "Applications of Array" page
  #Given The user is in the Arrays tryEditor page
  #When The user gives the invalid code in Editor and click the Run Button
  #Then The user should see an error message in alert window
#
#Scenario: Verify that user is able to see output for valid python code for "Applications of Array" page
  #Given The user is in the Arrays tryEditor page
  #When The user gives the valid code in Editor and click the Run Button
  #Then The user should see output in the console
  #
  #Scenario: Navigate back to Applications of Array page from tryEditor
  #Given The user is on the Arrays tryEditor page
  #When The user clicks the browser back button
  #Then The user navigates back to the Applications of Array page
#
#Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Applications of Array" page
  #Given The user is on the Applications of Array page
  #When The user clicks Practice Questions button
  #Then The user is redirected to Practice page
#
#Scenario Outline: Verify that user is able to navigate to a question page from Practice Question page of "Applications of Array"
  #Given The user is on the Arrays Practice Question page
  #When The user clicks "<question_link>" link
  #Then The user should be redirected to Question page contains a question, and try Editor with Run and Submit buttons
#
#Examples:
  #| question_link                           |
  #| Search the array                        |
  #| Max Consecutive Ones                      |
  #| Find Numbers with Even Number of Digits  |
  #| Squares of a Sorted Array                |
  #
   #Scenario Outline: User actions on practice question editor for "<Question>"
    #Given The user is on the practice question editor
    #When The user writes the "<CodeType>" code in Editor and Click the "<Button>"
    #Then The user should see "<ExpectedResult>"
#
    #Examples:
      #| Question                            | CodeType | Button  | ExpectedResult                              |
      #| Search the array                     | invalid  | Run     | an error message in alert window            |
      #| Search the array                     | valid    | Run     | output in the console                       |
      #| Search the array                     | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Search the array                     | valid    | Submit  | success message "Submission successful"     |
      #| Max Consecutive Ones                  | invalid  | Run     | an error message in alert window            |
      #| Max Consecutive Ones                  | valid    | Run     | output in the console                       |
      #| Max Consecutive Ones                  | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Max Consecutive Ones                  | valid    | Submit  | success message "Submission successful"     |
      #| Find Numbers with Even Number of Digits | invalid | Run    | an error message in alert window            |
      #| Find Numbers with Even Number of Digits | valid   | Run    | output in the console                       |
      #| Find Numbers with Even Number of Digits | invalid | Submit | an error message "Error occurred during submission" |
      #| Find Numbers with Even Number of Digits | valid   | Submit | success message "Submission successful"     |
      #| Squares of a Sorted Array           | invalid  | Run     | an error message in alert window            |
      #| Squares of a Sorted Array           | valid    | Run     | output in the console                       |
      #| Squares of a Sorted Array           | invalid  | Submit  | an error message "Error occurred during submission" |
      #| Squares of a Sorted Array           | valid    | Submit  | success message "Submission successful"     |
      #
