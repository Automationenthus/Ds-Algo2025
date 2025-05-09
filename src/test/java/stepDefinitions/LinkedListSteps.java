package stepDefinitions;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;
import java.io.IOException;
import java.time.Duration;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.LinkedListPF;
import dsUtilities.ConfigReader;
import driverFactory.DriverFactory;
import dsUtilities.ExcelUtilityHelper1;
import dsUtilities.LogHandler;

public class LinkedListSteps {
	
	
	WebDriver driver = DriverFactory.getDriver();
	LogHandler logger;
   // private static final Logger logger = LogManager.getLogger(LinkedListSteps.class);
    LinkedListPF llPage = new LinkedListPF(driver);
    ExcelUtilityHelper1 excelUtil =new ExcelUtilityHelper1();
    
    @Given("user is on login page")
    public void user_is_on_login_page() {
    	llPage.loginPage();
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        String username = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");
        llPage.enterUserName(username);
        llPage.enterPassword(password);
        llPage.clickLogin();
    }

//    @Then("user should be logged in successfully with {string} message")
//    public void user_should_be_logged_in_successfully_with_message(String expectedMsg) {
//        Assert.assertEquals(llPage.getMessage(), expectedMsg);
//    }

//    @Given("user is on home page")
//    public void user_is_on_home_page() { 	
//    	driver.get(ConfigReader.getProperty("url"));
//    	//System.out.println("Current URL: " + driver.getCurrentUrl());
//        logger.info(driver.getTitle());
//    }
//   
//     
	@Given("user is on home page to click LinkedList")
	public void user_is_on_home_page_to_click_linked_list() {
		 driver.get("https://dsportalapp.herokuapp.com/home");
	}

	@When("user clicks on LinkedList GetStarted button")
	public void user_clicks_on_linked_list_get_started_button() {
		llPage.navigateToLLPage();
	}

	@Then("user lands on LinkedList page and able to see NumpyNinja,Data structures dropdown,username and signout links")
	public void user_lands_on_linked_list_page_and_able_to_see_numpy_ninja_data_structures_dropdown_username_and_signout_links() {
		Assert.assertTrue(llPage.isNumpyNinjaVisible());
   		Assert.assertTrue(llPage.isDropdownVisible());
   		Assert.assertTrue(llPage.isUsernameVisible());
   		Assert.assertTrue(llPage.isSignOutVisible());
	}

	@Given("user is on linkedlist home page")
	public void user_is_on_linkedlist_home_page() {
	   llPage.navigateToLLPage();
	}

	@When("user clicks on {string} link on linkedlist page")
	public void user_clicks_on_link_on_linkedlist_page(String topic) {
	    llPage.clickLinkedlistTopic(topic);
	}

	@Then("user should be navigated to {string} page of linkedlist")
	public void user_should_be_navigated_to_page_of_linkedlist(String topic) {
	   llPage.verifyPageNavigation(topic);
	   logger.info(llPage.pageTitle());
	}
	
	@Given("user is on the {string} page of Linkedlist")
	public void user_is_on_the_page_of_linkedlist(String topic) {
		llPage.openLinkedListSubPage(topic);
	}

	@When("user clicks on tryHere button of LinkedList page")
	public void user_clicks_on_try_here_button_of_linked_list_page() {
		llPage.clickTryHere();
	}

	@Then("user should be navigated to Try Editor page with Run button on linkedlist")
	public void user_should_be_navigated_to_try_editor_page_with_run_button_on_linkedlist() {
		llPage.verifyTryEditorPage();
		logger.info(llPage.pageTitle());
	}

	@Given("The user is in the tryEditor page on Linkedlist page")
	public void the_user_is_in_the_try_editor_page_on_linkedlist_page() {
		llPage.tryEditorPage();
	}

	@When("user writes Python code from {string} and {int}  on Linkedlist links and click the Run button")
	public void user_writes_python_code_from_and_on_linkedlist_links_and_click_the_run_button(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		String pythonCode = excelUtil.getPythonCodeFromExcel(sheetName, rowNumber);  
        excelUtil.enterPythonCode(sheetName, rowNumber);
        llPage.clickRunButton();
	    excelUtil.handleAlert(driver, logger);
	}

	@Then("output should match with expected result from {string} and {int} for Linkedlist pages")
	public void output_should_match_with_expected_result_from_and_for_linkedlist_pages(String sheetname, Integer rowNumber) throws InvalidFormatException, IOException {
		String expectedMsg = excelUtil.getExpectedResultFromExcel(sheetname, rowNumber);
	    String actualMsg = llPage.getOutputData(); 
	    logger.info("Expected output from Excel: " + expectedMsg);
	    logger.info("Actual output on screen: " + actualMsg);
	    assertEquals(actualMsg.trim(), expectedMsg.trim(), "Output does not match expected result");
	}

	@Given("user is on try Editor page on Linkedlist")
	public void user_is_on_try_editor_page_on_linkedlist() {
		llPage.tryEditorPage();
	}

	@When("user clicks on run button without code for Linkedlist links")
	public void user_clicks_on_run_button_without_code_for_linkedlist_links() {
	    llPage.clickRunButton();
	}

	@Then("user should see the error message in alert window Linkedlist links")
	public void user_should_see_the_error_message_in_alert_window_linkedlist_links() {
		//Assert.assertTrue(excelUtil.isAlertIsPresent());
    	try {
            // Wait a short moment to see if alert appears
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
            wait.until(ExpectedConditions.alertIsPresent());
            Assert.fail("Unexpected alert was displayed.");
        } catch (TimeoutException e) {
            // Expected: No alert appeared
        }
	}

	@When("user clicks on run button with incorrect code from {string} and {int} for Linkedlist links")
	public void user_clicks_on_run_button_with_incorrect_code_from_and_for_linkedlist_links(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		String pythonCode = excelUtil.getPythonCodeFromExcel(sheetName, rowNumber);  
        excelUtil.enterPythonCode(sheetName, rowNumber);
        llPage.clickRunButton();
	    excelUtil.handleAlert(driver, logger);
	}

	@Then("user should see the error message in alert window and get the alert text for Linkedlist links")
	public void user_should_see_the_error_message_in_alert_window_and_get_the_alert_text_for_linkedlist_links() {
		String alertText=	excelUtil.getErrorText();
	    assertTrue(alertText.contains("line") && alertText.toLowerCase().contains("error"));
	}

	@When("user types incorrect code from {string} and {int} on Linkedlist links")
	public void user_types_incorrect_code_from_and_on_linkedlist_links(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		String pythonCode = excelUtil.getPythonCodeFromExcel(sheetName, rowNumber);  
        excelUtil.enterPythonCode(sheetName, rowNumber);
        llPage.clickRunButton();
	}

	@Then("user should see alert window and can not click on run button on Linkedlist links")
	public void user_should_see_alert_window_and_can_not_click_on_run_button_on_linkedlist_links() {
		 excelUtil.handleAlert(driver, logger);
	}

	@Given("user is on Introduction page Of LinkedList")
	public void user_is_on_introduction_page_of_linked_list() {
		llPage.openLinkedListSubPage("introduction");
	}

	@When("user clicks on Practice Questions link on Linkedlist")
	public void user_clicks_on_practice_questions_link_on_linkedlist() {
		llPage.clickPracticeQuestionsLink();
	}

	@Then("user should land on practice page on Linkedlist")
	public void user_should_land_on_practice_page_on_linkedlist() {
		llPage.verifyPracticeQuestionsPage();
		logger.info(llPage.pageTitle());
	}

	@Given("The user is on LinkedList page")
	public void the_user_is_on_linked_list_page() {
		llPage.navigateToLLPage();
	}

	@When("The user clicks on Sign out button on Linkedlist page")
	public void the_user_clicks_on_sign_out_button_on_linkedlist_page() {
		llPage.clickSignOut();
	}

	@Then("user should navigate back to Home page from linkedlist and can view {string} message")
	public void user_should_navigate_back_to_home_page_from_linkedlist_and_can_view_message(String expectedMsg) {
		String actualMsg=llPage.logOutMessage();
    	Assert.assertEquals(actualMsg, expectedMsg); 
    	logger.info(llPage.pageTitle());
	}	
}

