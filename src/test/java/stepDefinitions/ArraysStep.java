package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import driverFactory.DriverFactory;
import dsUtilities.ConfigReader;

import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.ArraysPage;
import org.junit.Assert;


public class ArraysStep {
	
	WebDriver driver = DriverFactory.getDriver();
	 ArraysPage arraysPage = new ArraysPage(driver);
	 private static final Logger logger = LogManager.getLogger(ArraysStep.class);
	
	 
	 @Given("The User is in home page")
	 public void the_user_is_in_home_page() {
		 driver.get(ConfigReader.getProperty("url"));  // Navigate to base URL
	        Assert.assertTrue("Not on home page", driver.getTitle().contains("NumpyNinja"));  // Example title check
	        logger.info("User navigated to Home Page");
	 }

	 @When("User clicks sign in and enters valid username and password")
	 public void user_clicks_sign_in_and_enters_valid_username_and_password() {
		// Click the "Sign in" link
		 driver.findElement(By.linkText("Sign in")).click();

		 // Type the username from config.properties
		 String username = ConfigReader.getProperty("username");
		 driver.findElement(By.id("id_username")).sendKeys(username);

		 // Type the password from config.properties
		 String password = ConfigReader.getProperty("password");
		 driver.findElement(By.id("id_password")).sendKeys(password);

		 // Click the "Login" button
		 driver.findElement(By.xpath("//input[@value='Login']")).click();
		 
	 }

	 @Then("The user is navigated to Home page")
	 public void the_user_is_navigated_to_home_page() {
		 Assert.assertTrue("Login failed or incorrect page", driver.getTitle().contains("NumpyNinja"));
	    }
	
	 @Given("The user is on Home page")
	 public void the_user_is_on_home_page() {
		Assert.assertTrue("Login failed or incorrect page", driver.getTitle().contains("NumpyNinja"));
    }

	 @When("The user scrolls down to the Data Structures dropdown and selects Array")
	 public void the_user_scrolls_down_to_the_data_structures_dropdown_and_selects_array() {
		 
		 driver.findElement(By.xpath("//a[text()='Data Structures']")).click();

		// Scroll to the "Data Structures" dropdown using Actions class
		Actions actions = new Actions(driver);
		actions.moveToElement(driver.findElement(By.xpath("//a[text()='Data Structures']"))).perform();

		// Click the "Array" option from the dropdown directly after waiting for it to be clickable
		driver.findElement(By.xpath("//a[text()='Arrays']")).click();
	 }

	 @Then("User is navigated to Array Page")
	 public void user_is_navigated_to_array_page() {
		 try {
	            // Find the element
	            WebElement element = driver.findElement(By.xpath("//h4[text()='Array']"));
	            // Assert that the element is found
	            Assert.assertNotNull("Element not found", element);
	        } catch (NoSuchElementException e) {
	            // Fail the test if the element is not found
	            Assert.fail("Element not found: " + e.getMessage());
	        }
		 //Assert.assertTrue("User is not on the Array Page",
			//	    driver.findElement(By.linkText("Array")).isDisplayed());//
	 }


@Given("The user is in the Array page after Sign in")
public void the_user_is_in_the_array_page_after_sign_in() {
	 arraysPage.navigateToArraysPage();
}

@When("The user clicks Arrays in Python button")
public void the_user_clicks_arrays_in_python_button() {
arraysPage.clickArraysInPython();
  }

@Then("The user should be redirected to Arrays in Python page")
public void the_user_should_be_redirected_to_arrays_in_python_page() {
String pageTitle = DriverFactory.getDriver().getTitle();
Assert.assertTrue("User is not on Arrays in Python page", pageTitle.contains("Arrays in Python"));
//Assert.assertTrue("Not on Arrays in Python page", arraysPage.isArraysInPythonPageDisplayed());

 }

@Given("The user is on the Arrays in Python page")
public void the_user_is_on_the_arrays_in_python_page() {
	arraysPage.navigateToArraysInPythonPage();
}

@When("The user scrolls down and clicks Try Here button in Arrays in Python page")
public void the_user_scrolls_down_and_clicks_try_here_button_in_arrays_in_python_page() {
	arraysPage.scrollToTryHere();     // Optional but good to ensure visibility
    arraysPage.clickTryhere();        // Click the link
}


@Then("The user IS redirected to a page having an try Editor with a Run button to test")
public void the_user_is_redirected_to_a_page_having_an_try_editor_with_a_run_button_to_test() {
	Assert.assertTrue("Run button not visible", arraysPage.isRunButtonVisible());
	 driver.navigate().back();
}

//@Given("The user is in the Arrays tryEditor page")
//public void the_user_is_in_the_arrays_try_editor_page() {
//	driver.get(ConfigReader.getProperty("arraysinppython"));
//	 arraysPage.isRunButtonVisible();
//	}
//
//
//@When("The user clicks on the Run button without entering the code in the Editor")
//public void the_user_clicks_on_the_run_button_without_entering_the_code_in_the_editor() {
//  arraysPage.clickRunButton();
//  }
//
//@Then("The user should see an error message in alert window")
//public void the_user_should_see_an_error_message_in_alert_window() {
//	 String output = arraysPage.getEditorOutput();  // get text from output area
//	    Assert.assertTrue("No error message shown on the page", output.toLowerCase().contains("error"));
//	}
//
//@When("The user gives the invalid code in Editor and click the Run Button")
//public void the_user_gives_the_invalid_code_in_editor_and_click_the_run_button() {
//	arraysPage.enterCode("hello"); 
//	arraysPage.clickRunButton();
//	
//}
//
//
//	@When("The user gives the valid code in Editor and click the Run Button")
//	public void the_user_gives_the_valid_code_in_editor_and_click_the_run_button() {
//		arraysPage.enterCode("print(\"hello\");	"); 
//		arraysPage.clickRunButton();
//	}
//
//	@Then("The user should see output in the console")
//	public void the_user_should_see_output_in_the_console() {
//		try {
//	        String output = arraysPage.getEditorOutput();  // get output from the editor
//
//	        Assert.assertNotNull("Output is null", output);  // make sure output is not null
//	        Assert.assertFalse("Output is empty", output.trim().isEmpty());  // make sure it's not empty
//
//	        System.out.println("Output in console: " + output);  // print to console
//
//	    } catch (Exception e) {
//	        Assert.fail("Something went wrong while getting the output: " + e.getMessage());
//	    }
//	}
//	
//
//@Given("The user is on the Arrays tryEditor page")
//public void the_user_is_on_the_arrays_try_editor_page() {
//	driver.get(ConfigReader.getProperty("arraystryeditor"));
//	 arraysPage.isRunButtonVisible();
//	}
//
//@When("The user clicks the browser back button")
//public void the_user_clicks_the_browser_back_button() {
//	 DriverFactory.getDriver().navigate().back(); 
//}
//
//@Then("The user navigates back to the Arrays in Python page")
//public void the_user_navigates_back_to_the_arrays_in_python_page() {
//	String pageTitle = DriverFactory.getDriver().getTitle();
//	Assert.assertTrue("User is not on Arrays in Python page", pageTitle.contains("Arrays in Python"));
//}
//
//
//
//@Given("The user is on the practice question editor for {string}")
//public void the_user_is_on_the_practice_question_editor_for(String questionName) {
//	 arraysPage.navigateToQuestionEditor(questionName);
//	}
//
//@When("The user writes the {string} code in Editor and Click the {string}")
//public void the_user_writes_the_code_in_editor_and_click_the(String codeType, String buttonType) {
//	
//	
//	reader = new ExcelReader("src/test/resources/TestData/PythonCode.xlsx");
//	List<Map<String, String>>  allRowsData = reader.readAllRows("SheetName"); // <-- give your sheet name here
//
//    int rownumber = getRowNumberForCodeType(codeType);
//    String codeToEnter = allRowsData.get(rownumber).get("pCode");
//
//    arraysPage.editor(codeToEnter);
//
//    if(buttonType.equalsIgnoreCase("Run")) {
//        arraysPage.clickRun();
//    } else if(buttonType.equalsIgnoreCase("Submit")) {
//        arraysPage.clickSubmit();
//    }
//}
//
//@Then("The user should see {string}")
//public void the_user_should_see(String string) {
//	public void the_user_should_see(String expectedResult) {
//        if(ds.isAlertIsPresent()) {
//            String alertText = ds.getAlertText();
//            logger.info("Alert Text: " + alertText);
//            ds.acceptAlert();
//        } else {
//            String consoleOutput = ds.getConsoleOutput();
//            logger.info("Console Output: " + consoleOutput);
//        }
//    }
//	
//	 // 🔥 Place your helper method here inside the same class
//    private int getRowNumberForCodeType(String codeType) {
//        if (codeType.equalsIgnoreCase("valid")) {
//            return 0; // Example: Row 0 for valid code
//        } else if (codeType.equalsIgnoreCase("invalid")) {
//            return 1; // Example: Row 1 for invalid code
//        } else {
//            throw new IllegalArgumentException("Invalid codeType: " + codeType);
//        }
//    }
//
//@Then("The user should see \"an error message \"Error occurred during submission\"\"")
//public void the_user_should_see_an_error_message_error_occurred_during_submission() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
//
//@Then("The user should see \"success message \"Submission successful\"\"")
//public void the_user_should_see_success_message_submission_successful() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}

@When("The user clicks Practice Questions button")
public void the_user_clicks_practice_questions_button() {
     arraysPage.clickPracticeQuestions();
}

@Then("The user is redirected to Practice page")
public void the_user_is_redirected_to_practice_page() {
	arraysPage.isSearchTheArrayLinkVisible();
}


@Given("The user is on the Arrays Practice Question page")
public void the_user_is_on_the_arrays_practice_question_page() {
arraysPage.navigateToArraysPracticeQuestions();

}


@When("The user clicks {string} link")
public void the_user_clicks_link(String questionLink) {
    System.out.println("Clicking on: " + questionLink); // Debugging step
    arraysPage.clickPracticeQuestion(questionLink);
}



@Then("The user should be redirected to Question page contains a question, and try Editor with Run and Submit buttons")
public void the_user_should_be_redirected_to_question_page_contains_a_question_and_try_editor_with_run_and_submit_buttons() {
	Assert.assertTrue("Run button missing",   arraysPage.isRunButton1Visible());
    Assert.assertTrue("Submit button missing",arraysPage.isSubmitButtonVisible());
    }


@When("The user clicks Arrays using List button")
public void the_user_clicks_arrays_using_list_button() {
arraysPage.clickArraysUsingList();
}

@Then("The user should be redirected to Arrays using List page")
public void the_user_should_be_redirected_to_arrays_using_list_page() {
String pageTitle = DriverFactory.getDriver().getTitle();
Assert.assertTrue("User is not on Arrays Using List page", pageTitle.contains("Arrays Using List"));
    //Assert.assertTrue("Not on Arrays in Python page", arraysPage.isArrayinPythonPageDisplayed());
}

@Given("The user is on the Arrays using List page")
public void the_user_is_on_the_arrays_using_list_page() {
	arraysPage.navigateToArraysUsingListPage();
}

@When("The user scrolls down and clicks Try Here button in Arrays Using List page")
public void the_user_scrolls_down_and_clicks_try_here_button_in_arrays_using_list_page() {
	try {
	    arraysPage.scrollToTryHere();  // Optional but good to ensure visibility
	    arraysPage.clickTryhere();     // Click the link
	} catch (Exception e) {
	    System.out.println("Error while trying to scroll and click Try Here: " + e.getMessage());
	    e.printStackTrace();  // Optional: prints full error trace
	}
}

@Then("The user navigates back to the Arrays Using List page")
    public void the_user_navigates_back_to_the_arrays_using_list_page() {
	 driver.navigate().back();
	String pageTitle = DriverFactory.getDriver().getTitle();
	Assert.assertTrue("User is not on Arrays using List page", pageTitle.contains("Arrays using List"));
	//Assert.assertTrue("Not on Arrays in Python page", arraysPage.isArraysInPythonPageDisplayed());
	}

@Given("The user is on the Arrays Using List page")
public void the_user_is_on_the_arrayys_using_list_page() {
	arraysPage.navigateToArraysUsingListPage();
}


@When("The user clicks Basic Operations in List button")
public void the_user_clicks_basic_operations_in_list_button() {
arraysPage.clickBasicOperationsInList();
}

@Then("The user should be redirected to Basic Operations in List page")
public void the_user_should_be_redirected_to_basic_operations_in_list_page() {
	String pageTitle = DriverFactory.getDriver().getTitle();
	Assert.assertTrue("User is not on Basic Operations in List page", pageTitle.contains("Basic Operations in List"));
	//Assert.assertTrue("Not on Arrays in Python page", arraysPage.isArraysInPythonPageDisplayed());
	 }

@Given("The user is on the Basic Operations in List page")
public void the_user_is_on_the_basic_operations_in_list_page() {
	arraysPage.navigateToBasicOperationsInListPage();
}

@When("The user scrolls down and clicks Try Here button in Basic Operations in List page")
public void the_user_scrolls_down_and_clicks_try_here_button_in_basic_operations_in_list_page() {
	arraysPage.scrollToTryHere();     // Optional but good to ensure visibility
    arraysPage.clickTryhere();        // Click the link
}
    
    @Then("The user navigates back to the Basic Operations in List page")
    public void the_user_navigates_back_to_the_basic_operations_in_list_page() {
    	 driver.navigate().back();
    	String pageTitle = DriverFactory.getDriver().getTitle();
    	Assert.assertTrue("User is not on Basic Operations in List page", pageTitle.contains("Basic Operations in List"));
    	//Assert.assertTrue("Not on Arrays in Python page", arraysPage.isArraysInPythonPageDisplayed());

    	 }

	@When("The user clicks Applications of Array button")
	public void the_user_clicks_applications_of_array_button() {
	    arraysPage.clickApplicationsOfArray();
	}

	@Then("The user should be redirected to Applications of Array page")
	public void the_user_should_be_redirected_to_applications_of_array_page() {
		String pageTitle = DriverFactory.getDriver().getTitle();
		Assert.assertTrue("User is not on Applications of Array page", pageTitle.contains("Applications of Array"));
		//Assert.assertTrue("Not on Arrays in Python page", arraysPage.isArraysInPythonPageDisplayed());
		 }
	

	@Given("The user is on the Applications of Array page")
	public void the_user_is_on_the_applications_of_array_page() {
		arraysPage.navigateToApplicationsOfArrayPage();
    }


	    @When("The user clicks Try Here button in Applications of Array page")
	    public void the_user_clicks_try_here_button_in_applications_of_array_page() {
	    	 arraysPage.clickTryhere();        // Click the link
	    }

@Then("The user navigates back to the Applications of Array page")
	        public void the_user_navigates_back_to_the_applications_of_array_page() {
	 driver.navigate().back();
	String pageTitle = DriverFactory.getDriver().getTitle();
	Assert.assertTrue("User is not on Applications of Array page", pageTitle.contains("Applications of Array"));
	//Assert.assertTrue("Not on Arrays in Python page", arraysPage.isArraysInPythonPageDisplayed());
	 }       
	     
}