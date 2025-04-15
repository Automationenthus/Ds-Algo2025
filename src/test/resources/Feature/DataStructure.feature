Feature: To test DataStructuresIntroduction functionality

Background: User sign into dsalgo portal

Scenario: Verify that user is able to navigate to "Data Structures - Introduction" page
Given  user is on the Home page  
When user clicks on GetStarted button
Then user lands on data-structures-introduction page and able to see NumpyNinja,Data structures dropdown,username and signout links



Scenario: Verify that by clicking NumpyNinja link user should be navigated to dsalgo portal
Given user is on data-structures-introduction page
When user clicks on NumpyNinja
Then user lands on dsalgo portal

Scenario Outline: User selects an item from the Data Structures dropdown
Given user is on data-structures-introduction page
When user select "<Option>" from the Data Structures dropdown
Then user should be navigated to the <ExpectedPath> page

  Examples:
    | Option       | ExpectedPath     |
    | Arrays       | array            |
    | Linked List  | linked-list      |
    | Stack        | stack            |
    | Queue        | queue            |
    | Tree         | tree             |
    | Graph        | graph            |
    
Scenario: Verify that user is able to navigate to "Time Complexity" page
Given user is on data-structures-introduction page
When  user ckicks on Time complexity link
Then  user lands on Time complexity page
    
Scenario: Verify that user is able to navigate to "Practice" page
Given user is on Time complexity page 
When user clicks on Practice Questions link
Then user should land on practice page

Scenario: Verify that user is able to navigate to "try Editor" page
Given  user is on Time complexity page 
When user clicks on try here link
Then user should land on try Editor page with  Run button

Scenario: Verify that user recieves error messgae on click on run button without entering code
Given user is on try Editor page
When user clicks on run button without code 
Then user should see the error message in alert window 

Scenario: Verify that user recieves error messgae on click on run button with incorrect code
Given user is on try Editor page
When user clicks on run button with incorrect code 
Then user should see the error message in alert window 

Scenario: Verify  that user canot type in editor without clicking "ok" button on alert window
Given user is on try Editor page with alert window
When  user does not click on ok button 
Then  user can not perform any operation

Scenario: Verify that user can type in editor by clicking "ok" button on alert window
Given user is on try Editor page with alert window
When user does click on ok button 
Then  user can  perform any operation

Scenario: Verify that user can see output  by clicking run button with writing correct python  code
Given user is on try Editor page
When user clicks on run button with correct code 
Then user can see output on console

Scenario: Verify that user is able to navigate to "Time Complexity" page  by clicking browser back button
Given user is on try Editor page 
When  user clicks on browser back button 
Then user should navigate to Time Complexity page
    
    
Scenario: Verify if user is able to navigate to Home page on clicking "SignOut " link
Given user is on Time complexity page 
When  user clicks on Signout button
Then  user should land on Home page and can view "Logged out successfully" message    
		