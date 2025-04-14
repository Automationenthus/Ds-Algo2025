Feature: This feature file contain scenario for the Stack module

Background: The user sign in to dsAlgo Portal  

Scenario: Verify that user is able to navigate to "Stack" data structure page
Given The user is in the Home page after Sign in	"The user clicks the ""Getting Started"" button in Array Panel 
When The user select Array item from the drop down menu"	
Then The user be directed to "Stack" Data Structure Page

Scenario: Verify that user is able to navigate to "Operations in Stack" page	
Given The user is in the "Array" page after Sign in	
When The user clicks "Operations in stack" button	
Then The user should be redirected to "Operations in stack" page


Scenario: Verify that user is able to navigate to "try Editor" page for "Operations in Stack" page	
Given The user is on the "Operations in Stack" page	
When The user clicks "Try Here" button in Operations in Stack page	
Then The user should be redirected to a page having an try Editor with a Run button to test


Scenario: Verify that user receives error when click on Run button without entering code for "Operations in Stack" page	
Given The user is in the tryEditor page	
When The user clicks the Run Button without entering the code in the Editor	
Then The user should able to see an error message in alert window



Scenario: Verify that user receives error for invalid python code for "Operations in Stack" page	
Given The user is in the tryEditor page	
When The user write the invalid code in Editor and click the Run Button	
Then The user should able to see an error message in alert window


Scenario: Verify that user is able to see output for valid python code for "Operations in Stack" page
Given The user is in the tryEditor page	
When The user write the valid code in Editor and click the Run Button	
Then The user should able to see output in the console



Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Operations in Stack" page	
Given The user is on the "Arrays in Python" page	
When The user clicks "Practice Questions" button	
Then The user should be redirected to "Practice" page

Scenario: Verify that user is able to navigate to "Implementation" page	
Given The user is in the "Array" page after Sign in	
When The user clicks "Implementation" button	
Then The user should be redirected to "Implementation" page


Scenario: Verify that user is able to navigate to "try Editor" page for "Implementation" page	
Given The user is on the "Implementation" page	
When The user clicks "Try Here" button in Arrays in Python page	
Then The user should be redirected to a page having an try Editor with a Run button to test


Scenario: Verify that user receives error when click on Run button without entering code for "Implementation" page	
Given The user is in the tryEditor page	
When The user clicks the Run Button without entering the code in the Editor	
Then The user should able to see an error message in alert window


Scenario: Verify that user receives error for invalid python code for "Implementation" page	
Given The user is in the tryEditor page	
When The user write the invalid code in Editor and click the Run Button	
Then The user should able to see an error message in alert window


Scenario: Verify that user is able to see output for valid python code for "Implementation" page
Given The user is in the tryEditor page	
When The user write the valid code in Editor and click the Run Button	
Then The user should able to see output in the console


Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Implementation" page
Given The user is on the "Implementation" page	
When The user clicks "Practice Questions" button	
Then The user should be redirected to "Practice" page

Scenario: Verify that user is able to navigate to "Application" page	
Given The user is in the "Array" page after Sign in
When The user clicks "Application" button	
Then The user should be redirected to "Application" page


Scenario: Verify that user is able to navigate to "try Editor" page for "Application" page	
Given The user is on the "Application" page	
When The user clicks "Try Here" button in Arrays in Python page	
Then The user should be redirected to a page having an try Editor with a Run button to test

Scenario: Verify that user receives error when click on Run button without entering code for "Application" page	
Given The user is in the tryEditor page	
When The user clicks the Run Button without entering the code in the Editor
Then The user should able to see an error message in alert window


Scenario: Verify that user receives error for invalid python code for "Application" page	
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run Button	
Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for "Application" page	
Given The user is in the tryEditor page	
When The user write the valid code in Editor and click the Run Button	
Then The user should able to see output in the console


Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Application" page
Given The user is on the "Application" page	
When The user clicks "Practice Questions" button	
Then The user should be redirected to "Practice" page
