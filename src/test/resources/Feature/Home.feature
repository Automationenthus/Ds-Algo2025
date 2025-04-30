
#Feature: DS Algo Home Page
#
#
  #Background: Given user is on home page
  #
#
  #Scenario: verify user clicks on login link he should be navigated to login page 
  #Given user is on home page
  #When user clicks on sigin button
  #Then user lands on "login" page
  #
#Scenario: Valid Login
#Given user is on login page
#When user enters valid username and password
#Then user should be logged in successfully with "You are logged in" message
=======
Feature: DS Algo Home Page


Background: Verify user is able to launch the dsalgo app
Given User is in the ds-algo launch page 
When User click the get started button in dsalgo launch page
Then User should be navigated to the home page

