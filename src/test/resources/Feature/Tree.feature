Feature: Tree Functionality
Background: The user sign in to dsAlgo Portal 

Scenario: Verify that user is able to navigate to "Tree" page
Given  user is on Home page 
When user clicks the Getting Started button of Tree
Then user lands on Tree page

Scenario: Verify that user is able to navigate to "Tree" page from dropdown
Given user is on Home page 
When user selects tree from dropdown
Then user lands on Tree page

Scenario Outline: Verify that user is able to navigate to "overview-of-trees" page
 Given user is on the Tree page
 When user clicks on "<Topic>" link
 Then user should be navigated to "<ExpectedPath>" page

    Examples:
      | Topic                            | ExpectedPath                    |
      | Overview of Trees                | tree                            |
      | Terminologies                    | tree/terminologies              |
      | Types of Trees                   | tree/types-of-trees             |
      | Tree Traversals                  | tree/tree-traversals            |
      | Traversals-Illustration          | tree/traversals-illustration    |
      | Binary Trees                     | tree/binary-trees               |
      | Types of Binary Trees            | tree/types-of-binary-trees      |
      | Implementation in Python         | tree/implementation-python      |
      | Binary Tree Traversals           | tree/binary-tree-traversals     |
      | Implementation of Binary Trees   | tree/implementation-binary-tree |
      | Applications of Binary Trees     | tree/applications-of-binary-trees |
      | Binary Search Trees              | tree/binary-search-trees        |
      | Implementation Of BST            | tree/implementation-bst         |
      
      
Scenario: Verify that user is able to navigate to "Practice" page
Given user is on the Tree page
When user clicks on Practice Questions link
Then user should land on practice page

Scenario Outline: Verify "Try here" button on each page fo Tree page links
Given user is on the "<Treelinks>" page
When user clicks on Try Here button
Then user should be navigated to Try Editor page with Run button

    Examples:
      | Treelinks                        |
      | overview-of-trees               |
      | terminologies                   |
      | types-of-trees                  |
      | tree-traversals                 |
      | traversals-illustration         |
      | binary-trees                    |
      | types-of-binary-trees           |
      | implementation-python          |
      | binary-tree-traversals         |
      | implementation-binary-tree     |
      | applications-of-binary-trees   |
      | binary-search-trees            |
      | implementation-bst             |
      
      
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


Scenario: Verify if user is able to navigate to Home page on clicking "SignOut " link
Given user is on the Tree page
When  user clicks on Signout button
Then  user should land on Home page and can view "Logged out successfully" message         
       


