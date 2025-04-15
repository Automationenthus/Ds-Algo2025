Feature: Queue

Scenario: Verify user landed on datastructure queue page
 Given User is on dsportal home page
 When User clicks queue from the data structure drop down
 Then User should be landing in dsportal queue page
 
 Scenario: Verify four links are available under the topics covered 
 Given User is on dsportal queue page 
 When User scroll down the page
 Then Four links should be available 
 
 Scenario: Verify user is able to land on implimentation of queue in phython
 Given User is on dsportal queue page
 When User clicks Implementation of queue in phython
 Then User should be landed in implementation of queue in phython page
 
 Scenario: Verify user able to land on try editor page
 Given User is on dsportal queue page
 When User clicks try here button
 Then User should be landed in try editor page
 
 Scenario: Verify user able to see error message when the code is wrong
 Given User is on the try editor page
 When User gives wrong code in try editor
 Then click run
 
 Scenario: Verify user able to see success message when the code is correct
 Given User is on the try editor page
 When User gives correct code in try editor
 Then click run
 
  
 
 
 
 