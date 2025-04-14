Feature: This feature file contain scenario for the Arrays module

Background: The user sign in to dsAlgo Portal 

Scenario: Verify that user is able to navigate to "Arrays in Python" page
  Given The user is in the "Array" page after Sign in
  When The user clicks "Arrays in Python" button
  Then The user should be redirected to "Arrays in Python" page

Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays in Python" page
  Given The user is on the "Arrays in Python" page
  When The user clicks "Try Here" button in Arrays in Python page
  Then The user should be redirected to a page having an try Editor with a Run button to test

Scenario: Verify that user receives error when click on Run button without entering code for "Arrays in Python" page
  Given The user is in the tryEditor page
  When The user clicks the Run Button without entering the code in the Editor
  Then The user should able to see an error message in alert window

Scenario: Verify that user receives error for invalid python code for "Arrays in Python" page
  Given The user is in the tryEditor page
  When The user write the invalid code in Editor and click the Run Button
  Then The user should able to see an error message in alert window

Scenario: Verify that user is able to see output for valid python code for "Arrays in Python" page
  Given The user is in the tryEditor page
  When The user write the valid code in Editor and click the Run Button
  Then The user should able to see output in the console

Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Arrays in Python" page
  Given The user is on the "Arrays in Python" page
  When The user clicks "Practice Questions" button
  Then The user should be redirected to "Practice" page

Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Arrays in Python" page
  Given The user is on the "Practice" page
  When The user clicks the "Search the array" link
  Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons

Scenario: Verify that user receives error for invalid python code on running "Search the array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Run Button
  Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "Search the array" question
  Given The user is on the practice question editor
  When The user write the valid code in Editor and Click the Run Button
  Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see an error message "Error occurred during submission"

Scenario: Verify that user receives Success message on submitting valid python code for "Search the array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see success message "Submission successful"

Scenario: Verify that user receives error for invalid python code on running "MaxConsecutiveOnes" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Run Button
  Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "MaxConsecutiveOnes" question
  Given The user is on the practice question editor
  When The user write the valid code in Editor and Click the Run Button
  Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "MaxConsecutiveOnes" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see an error message "Error occurred during submission"

Scenario: Verify that user receives Success message on submitting valid python code for "MaxConsecutiveOnes" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see success message "Submission successful"

Scenario: Verify that user receives error for invalid python code on running "Find numbers with even number of digit" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Run Button
  Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "Find numbers with even number of digit" question
  Given The user is on the practice question editor
  When The user write the valid code in Editor and Click the Run Button
  Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "Find numbers with even number of digit" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see an error message "Error occurred during submission"

Scenario: Verify that user receives Success message on submitting valid python code for "Find numbers with even number of digit" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see success message "Submission successful"

Scenario: Verify that user receives error for invalid python code on running "Squares of a sorted Array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Run Button
  Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "Squares of a sorted Array" question
  Given The user is on the practice question editor
  When The user write the valid code in Editor and Click the Run Button
  Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "Squares of a sorted Array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see an error message "Error occurred during submission"

Scenario: Verify that user receives success message on submitting valid python code for "Squares of a sorted Array" question
  Given The user is on the practice question editor
  When The user write the valid code in Editor and Click the Submit Button
  Then The user see success message "Submission successful"
  
 #Arrays Using List
  
  Scenario: Verify that user receives error when click on Run button without entering code for "Arrays Using List" page
  Given The user is in the tryEditor page
  When The user write the invalid code in Editor and click the Run Button
  Then The user should able to see an error message in alert window

Scenario: Verify that user receives error for invalid python code for "Arrays Using List" page
  Given The user is in the tryEditor page
  When The user write the valid code in Editor and click the Run Button
  Then The user should able to see output in the console

Scenario: Verify that user is able to see output for valid python code for "Arrays Using List" page
  Given The user is in the tryEditor page
  When The user clicks "Practice Questions" button
  Then The user should be redirected to "Practice" page

Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Arrays Using List" page
  Given The user is on the "Arrays using list" page
  When The user clicks "Practice Questions" button
  Then The user should be redirected to "Practice" page

Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Arrays Using List" page
  Given The user is on the "Practice" page
  When The user clicks the "Search the array" link
  Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons

Scenario: Verify that user receives error for invalid python code on running "Search the array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Run Button
  Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "Search the array" question
  Given The user is on the practice question editor
  When The user write the valid code in Editor and Click the Run Button
  Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see an error message "Error occurred during submission"

Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see success message "Submission successful"

Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Arrays in Python" page
  Given The user is on the "Practice" page
  When The user clicks the "Search the array" link
  Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons

Scenario: Verify that user receives error for invalid python code on running "Search the array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Run Button
  Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "Search the array" question
  Given The user is on the practice question editor
  When The user write the valid code in Editor and Click the Run Button
  Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see an error message "Error occurred during submission"

Scenario: Verify that user receives Success message on submitting valid python code for "Search the array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see success message "Submission successful"

Scenario: Verify that user receives error for invalid python code on running "MaxConsecutiveOnes" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Run Button
  Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "MaxConsecutiveOnes" question
  Given The user is on the practice question editor
  When The user write the valid code in Editor and Click the Run Button
  Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "MaxConsecutiveOnes" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see an error message "Error occurred during submission"

Scenario: Verify that user receives Success message on submitting valid python code for "MaxConsecutiveOnes" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see success message "Submission successful"

Scenario: Verify that user receives error for invalid python code on running "Find numbers with even number of digit" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Run Button
  Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "Find numbers with even number of digit" question
  Given The user is on the practice question editor
  When The user write the valid code in Editor and Click the Run Button
  Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "Find numbers with even number of digit" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see an error message "Error occurred during submission"

Scenario: Verify that user receives Success message on submitting valid python code for "Find numbers with even number of digit" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see success message "Submission successful"

Scenario: Verify that user receives error for invalid python code on running "Squares of a sorted Array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Run Button
  Then The user should able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "Squares of a sorted Array" question
  Given The user is on the practice question editor
  When The user write the valid code in Editor and Click the Run Button
  Then The user should able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "Squares of a sorted Array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see an error message "Error occurred during submission"

Scenario: Verify that user receives success message on submitting valid python code for "Squares of a sorted Array" question
  Given The user is on the practice question editor
  When The user write the invalid code in Editor and Click the Submit Button
  Then The user see success message "Submission successful"
  
  # Basic Operations in List
  
  Scenario: Verify that user is able to navigate to "Basic Operations in List" page
  Given the user is in the "Array" page after Sign in
  When the user clicks "Basic Operations in List" button
  Then the user should be redirected to "Basic Operations in List" page

Scenario: Verify that user is able to navigate to "try Editor" page for "Basic Operations in List" page
  Given the user is on the "Basic Operations in list" page
  When the user clicks the "Run Button" without entering the code in the Editor
  Then the user should be able to see an error message in alert window

Scenario: Verify that user receives error when click on Run button without entering code for "Basic Operations in List" page
  Given the user is in the tryEditor page
  When the user writes the invalid code in Editor and clicks the Run Button
  Then the user should be able to see an error message in alert window

Scenario: Verify that user receives error for invalid python code for "Basic Operations in List" page
  Given the user is in the tryEditor page
  When the user writes the valid code in Editor and clicks the Run Button
  Then the user should be able to see output in the console

Scenario: Verify that user is able to see output for valid python code for "Basic Operations in List" page
  Given the user is in the tryEditor page
  When the user clicks "Practice Questions" button
  Then the user should be redirected to "Practice" page

Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Basic Operations in List" page
  Given the user is on the "Basic Operations in list" page
  When the user clicks "Practice Questions" button
  Then the user should be redirected to "Practice" page

Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Basic Operations in List" page
  Given the user is on the "Practice" page
  When the user clicks the "Search the array" link
  Then the user should be redirected to "Question" page contains a question, and try Editor with Run and Submit buttons

Scenario: Verify that user receives error for invalid python code on running "Search the array" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Run Button
  Then the user should be able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "Search the array" question
  Given the user is on the practice question editor
  When the user writes the valid code in Editor and clicks the Run Button
  Then the user should be able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Submit Button
  Then the user should see an error message "Error occurred during submission"

Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Submit Button
  Then the user should see success message "Submission successful"

Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Arrays in Python" page
  Given the user is on the "Practice" page
  When the user clicks the "Search the array" link
  Then the user should be redirected to "Question" page contains a question, and try Editor with Run and Submit buttons

Scenario: Verify that user receives error for invalid python code on running "Search the array" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Run Button
  Then the user should be able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "Search the array" question
  Given the user is on the practice question editor
  When the user writes the valid code in Editor and clicks the Run Button
  Then the user should be able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Submit Button
  Then the user should see an error message "Error occurred during submission"

Scenario: Verify that user receives Success message on submitting valid python code for "Search the array" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Submit Button
  Then the user should see success message "Submission successful"

Scenario: Verify that user receives error for invalid python code on running "MaxConsecutiveOnes" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Run Button
  Then the user should be able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "MaxConsecutiveOnes" question
  Given the user is on the practice question editor
  When the user writes the valid code in Editor and clicks the Run Button
  Then the user should be able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "MaxConsecutiveOnes" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Submit Button
  Then the user should see an error message "Error occurred during submission"

Scenario: Verify that user receives Success message on submitting valid python code for "MaxConsecutiveOnes" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Submit Button
  Then the user should see success message "Submission successful"

Scenario: Verify that user receives error for invalid python code on running "Find numbers with even number of digit" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Run Button
  Then the user should be able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "Find numbers with even number of digit" question
  Given the user is on the practice question editor
  When the user writes the valid code in Editor and clicks the Run Button
  Then the user should be able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "Find numbers with even number of digit" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Submit Button
  Then the user should see an error message "Error occurred during submission"

Scenario: Verify that user receives Success message on submitting valid python code for "Find numbers with even number of digit" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Submit Button
  Then the user should see success message "Submission successful"

Scenario: Verify that user receives error for invalid python code on running "Squares of a sorted Array" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Run Button
  Then the user should be able to see an error message in alert window

Scenario: Verify that user is able to run valid python code for "Squares of a sorted Array" question
  Given the user is on the practice question editor
  When the user writes the valid code in Editor and clicks the Run Button
  Then the user should be able to see output in the console

Scenario: Verify that user receives error on submitting invalid python code for "Squares of a sorted Array" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Submit Button
  Then the user should see an error message "Error occurred during submission"

Scenario: Verify that user receives success message on submitting valid python code for "Squares of a sorted Array" question
  Given the user is on the practice question editor
  When the user writes the invalid code in Editor and clicks the Submit Button
  Then the user should see success message "Submission successful"
  
  #Applications of Array
  
  Scenario: User is able to navigate to "Applications of Array" page
    Given the user is in the "Array" page after Sign in
    When the user clicks the "Applications of Array" button
    Then the user should be redirected to the "Applications of Array" page

  Scenario: User receives error when clicking Run button without entering code on "Applications of Array" page
    Given the user is on the "Applications of Array" page
    When the user clicks the Run Button without entering code in the Editor
    Then the user should be able to see an error message in the alert window

  Scenario: User receives error for invalid code on "Applications of Array" page
    Given the user is in the tryEditor page
    When the user writes invalid code in the Editor and clicks the Run Button
    Then the user should be able to see an error message in the alert window

  Scenario: User sees output for valid Python code on "Applications of Array" page
    Given the user is in the tryEditor page
    When the user writes valid code in the Editor and clicks the Run Button
    Then the user should be able to see output in the console

  Scenario: User navigates to Practice Questions page from "Applications of Array" page
    Given the user is in the tryEditor page
    When the user clicks the "Practice Questions" button
    Then the user should be redirected to the "Practice" page

  Scenario: User navigates to "Search the array" page from Practice Questions on "Applications of Array"
    Given the user is on the "Practice" page
    When the user clicks the "Search the array" link
    Then the user should be redirected to the "Question" page containing the question, and try Editor with Run and Submit buttons

  Scenario: User receives error for invalid code when running "Search the array" question
    Given the user is on the practice question editor
    When the user writes invalid code in the Editor and clicks the Run Button
    Then the user should be able to see an error message in the alert window

  Scenario: User runs valid Python code for "Search the array" question
    Given the user is on the practice question editor
    When the user writes valid code in the Editor and clicks the Run Button
    Then the user should be able to see output in the console

  Scenario: User receives error on submitting invalid code for "Search the array" question
    Given the user is on the practice question editor
    When the user writes invalid code in the Editor and clicks the Submit Button
    Then the user should see an error message "Error occurred during submission"

  Scenario: User receives success message on submitting valid code for "Search the array" question
    Given the user is on the practice question editor
    When the user writes valid code in the Editor and clicks the Submit Button
    Then the user should see a success message "Submission successful"

  Scenario: User navigates to "Search the array" page from Practice Questions of "Arrays in Python"
    Given the user is on the "Practice" page
    When the user clicks the "Search the array" link
    Then the user should be redirected to the "Question" page containing the question, and try Editor with Run and Submit buttons

  Scenario: User receives error for invalid code when running "Search the array" question from Arrays in Python
    Given the user is on the practice question editor
    When the user writes invalid code in the Editor and clicks the Run Button
    Then the user should be able to see an error message in the alert window

  Scenario: User runs valid Python code for "Search the array" question from Arrays in Python
    Given the user is on the practice question editor
    When the user writes valid code in the Editor and clicks the Run Button
    Then the user should be able to see output in the console

  Scenario: User receives error on submitting invalid code for "Search the array" question from Arrays in Python
    Given the user is on the practice question editor
    When the user writes invalid code in the Editor and clicks the Submit Button
    Then the user should see an error message "Error occurred during submission"

  Scenario: User receives success message on submitting valid code for "Search the array" question from Arrays in Python
    Given the user is on the practice question editor
    When the user writes valid code in the Editor and clicks the Submit Button
    Then the user should see a success message "Submission successful"

  Scenario: User receives error for invalid code when running "MaxConsecutiveOnes" question
    Given the user is on the practice question editor
    When the user writes invalid code in the Editor and clicks the Run Button
    Then the user should be able to see an error message in the alert window

  Scenario: User runs valid Python code for "MaxConsecutiveOnes" question
    Given the user is on the practice question editor
    When the user writes valid code in the Editor and clicks the Run Button
    Then the user should be able to see output in the console

  Scenario: User receives error on submitting invalid code for "MaxConsecutiveOnes" question
    Given the user is on the practice question editor
    When the user writes invalid code in the Editor and clicks the Submit Button
    Then the user should see an error message "Error occurred during submission"

  Scenario: User receives success message on submitting valid code for "MaxConsecutiveOnes" question
    Given the user is on the practice question editor
    When the user writes valid code in the Editor and clicks the Submit Button
    Then the user should see a success message "Submission successful"

  Scenario: User receives error for invalid code when running "Find numbers with even number of digits" question
    Given the user is on the practice question editor
    When the user writes invalid code in the Editor and clicks the Run Button
    Then the user should be able to see an error message in the alert window

  Scenario: User runs valid Python code for "Find numbers with even number of digits" question
    Given the user is on the practice question editor
    When the user writes valid code in the Editor and clicks the Run Button
    Then the user should be able to see output in the console

  Scenario: User receives error on submitting invalid code for "Find numbers with even number of digits" question
    Given the user is on the practice question editor
    When the user writes invalid code in the Editor and clicks the Submit Button
    Then the user should see an error message "Error occurred during submission"

  Scenario: User receives success message on submitting valid code for "Find numbers with even number of digits" question
    Given the user is on the practice question editor
    When the user writes valid code in the Editor and clicks the Submit Button
    Then the user should see a success message "Submission successful"

  Scenario: User receives error for invalid code when running "Squares of a sorted Array" question
    Given the user is on the practice question editor
    When the user writes invalid code in the Editor and clicks the Run Button
    Then the user should be able to see an error message in the alert window

  Scenario: User runs valid Python code for "Squares of a sorted Array" question
    Given the user is on the practice question editor
    When the user writes valid code in the Editor and clicks the Run Button
    Then the user should be able to see output in the console

  Scenario: User receives error on submitting invalid code for "Squares of a sorted Array" question
    Given the user is on the practice question editor
    When the user writes invalid code in the Editor and clicks the Submit Button
    Then the user should see an error message "Error occurred during submission"

  Scenario: User receives success message on submitting valid code for "Squares of a sorted Array" question
    Given the user is on the practice question editor
    When the user writes valid code in the Editor and clicks the Submit Button
    Then the user should see a success message "Submission successful"
    
    
  # Scenario Outline: User interacts with Practice Question Editor for "<Question>" question
   # Given the user is on the practice question editor
    # When the user writes "<CodeType>" code in the Editor and clicks the "<Button>"
    # Then the user should "<ExpectedResult>"

    #Examples:
    #  | Question                          | CodeType   | Button   | ExpectedResult                                      |
    #  | "Search the array"                | invalid    | Run      | see an error message in alert window                |
    #  | "Search the array"                | valid      | Run      | see output in the console                           |
    #  | "Search the array"                | invalid    | Submit   | see an error message "Error occurred during submission" |
    #  | "Search the array"                | valid      | Submit   | see success message "Submission successful"         |
    #  | "MaxConsecutiveOnes"              | invalid    | Run      | see an error message in alert window                |
    #  | "MaxConsecutiveOnes"              | valid      | Run      | see output in the console                           |
    #  | "MaxConsecutiveOnes"              | invalid    | Submit   | see an error message "Error occurred during submission" |
    #  | "MaxConsecutiveOnes"              | valid      | Submit   | see success message "Submission successful"         |
    #  | "Find numbers with even digits"   | invalid    | Run      | see an error message in alert window                |
    #  | "Find numbers with even digits"   | valid      | Run      | see output in the console                           |
    #  | "Find numbers with even digits"   | invalid    | Submit   | see an error message "Error occurred during submission" |
    #  | "Find numbers with even digits"   | valid      | Submit   | see success message "Submission successful"         |
    #  | "Squares of a sorted Array"       | invalid    | Run      | see an error message in alert window                |
    #  | "Squares of a sorted Array"       | valid      | Run      | see output in the console                           |
    #  | "Squares of a sorted Array"       | invalid    | Submit   | see an error message "Error occurred during submission" |
    #  | "Squares of a sorted Array"       | valid      | Submit   | see success message "Submission successful"         |
    
    
    # Scenario Outline: User interacts with the tryEditor for "<Action>" on "<Page>"
   # Given the user is on the "<Page>" page
   # When the user writes "<CodeType>" code in the Editor and clicks the "<Button>"
   # Then the user should "<ExpectedResult>"

   # Examples:
   #   | Page                   | Action                | CodeType   | Button   | ExpectedResult                                    |
   #   | Applications of Array  | click Run without code | invalid    | Run      | see an error message in alert window             |
   #   | Applications of Array  | write invalid code     | invalid    | Run      | see an error message in alert window             |
   #   | Applications of Array  | write valid code       | valid      | Run      | see output in the console                        |
   #   | Applications of Array  | click Submit with invalid code | invalid    | Submit   | see an error message "Error occurred during submission" |
   #   | Applications of Array  | write valid code       | valid      | Submit   | see success message "Submission successful"      |
   #   | Applications of Array  | navigate to Practice Questions | N/A      | N/A      | be redirected to the Practice page               |
   #   | Applications of Array  | navigate to "Search the array" | N/A      | N/A      | be redirected to "Question" page                 |
    