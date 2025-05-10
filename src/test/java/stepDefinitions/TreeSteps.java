
package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import driverFactory.DriverFactory;
import dsUtilities.ConfigReader;
import dsUtilities.ExcelReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DataStructuresPF;
import pageObject.TreePF;

public class TreeSteps {
	
	WebDriver driver=DriverFactory.getDriver();
	private static final Logger logger = LogManager.getLogger(DataStructuresSteps.class);
	ExcelReader reader=new ExcelReader("src/test/resources/TestData/PythonCode.xlsx");
	 TreePF treePage=new TreePF(driver);
	 DataStructuresPF ds=new DataStructuresPF(driver);
	 
	 @Given("user is signed into dsalgoapp")
	 public void user_is_signed_into_dsalgoapp() {
		 
		 ds.signIn();
			String username=ConfigReader.getProperty("username");
			String password=ConfigReader.getProperty("password");
			ds.enterUserName(username);
			ds.enterPassword(password);
			ds.clickLogin();
	 }

	 @When("user cliks on TreeGetStarted button")
	 public void user_cliks_on_tree_get_started_button() {
		 treePage.clickOnGetStartBtn();
	 }
	 @Then("user lands  on the {string} page")
	 public void user_lands_on_the_page(String ExpectedTitle) {
		 
		 String actualTitle=treePage.getPageTitle();
		 Assert.assertEquals(actualTitle, ExpectedTitle);
	 }


	 @Given("user is on Tree page")
	 public void user_is_on_tree_page() {
		 logger.info(treePage.getPageTitle());
	 }

	 @Then("user  able to see NumpyNinja,Data structures dropdown,username and signout links on page")
	 public void user_able_to_see_numpy_ninja_data_structures_dropdown_username_and_signout_links_on_page() {
		 Assert.assertTrue(ds.isNumpyNinjaVisible());
		    Assert.assertTrue(ds.isDropdownVisible());
			Assert.assertTrue(ds.isUsernameVisible());
			Assert.assertTrue(ds.isSignOutVisible());
		 
	 }


	@When("user clicks on {string} link")
	public void user_clicks_on_link(String topic) {
		treePage.clickTopic(topic);
	}

	@Then("user should be navigated to {string} page")
	public void user_should_be_navigated_to_page(String expectedtitle) {
		String actualtitle=treePage.getPageTitle();
		Assert.assertEquals(actualtitle, expectedtitle);
		
	}
	
	@Given("user is on the overview of tree page")
	public void user_is_on_the_overview_of_tree_page() {
		
		treePage.clickOnOverviewOfTree();
	}

	@When("user clicks on {string} and Try Here button")
	public void user_clicks_on_and_try_here_button(String links) {
		
		treePage.clickOnTreeLinks(links);
		treePage.clickOnTryhere();
	}

	@Then("user should be navigated to Try Editor page with title {string} and  Run button")
	public void user_should_be_navigated_to_try_editor_page_with_title_and_run_button(String expectedTitle) {
		
		String actualTitle=treePage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@When("user clicks on the Practice Questions link")
	public void user_clicks_on_the_practice_questions_link() {
		
		treePage.clickOnPracticeQuestions();
	}

	@Then("user should land on {string}")
	public void user_should_land_on(String expectedTitle) {
		String actualTitle=treePage.getPageTitle();
		Assert.assertEquals(actualTitle, expectedTitle);
		logger.info("test passed:" +actualTitle + "matches with" +expectedTitle);
	}
	@Given("user is on the try Editor page")
	public void user_is_on_the_try_editor_page() {
		treePage.clickOnOverviewOfTree();
		ds.clickOnTryHere();
		logger.info(ds.pageTitle());
	}

	@When("user clicks on the run button without code")
	public void user_clicks_on_the_run_button_without_code() {
		ds.clickOnRunBtn();
		
	}

	@Then("user should see  error message in alert window")
	public void user_should_see_error_message_in_alert_window() {
		Assert.assertTrue(ds.isAlertIsPresent());
	}
	@When("user clicks on the run button with incorrect code from {string} and {int}")
	public void user_clicks_on_the_run_button_with_incorrect_code_from_and(String sheetname, Integer rownumber) {
		List<Map<String, String>> allRowsData1= reader.readAllRows(sheetname);
		String codeToEnter=allRowsData1.get(rownumber).get("Pcode");
		ds.editor(codeToEnter);
		  ds.clickOnRunBtn();
	}

	@Then("user should see  error message in alert window and get the alert text")
	public void user_should_see_error_message_in_alert_window_and_get_the_alert_text() {
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		logger.info("Alert message:" +text);
		alert.accept();
		
	}

	@When("user writes correct Python code from {string} and {int}")
	public void user_writes_correct_python_code_from_and(String sheetname, Integer rownumber) {
		
		 List<Map<String, String>> allRowsData = reader.readAllRows(sheetname);
		 String codeToEnter=allRowsData.get(rownumber).get("Pcode");
		 ds.editor(codeToEnter);
		  ds.clickOnRunBtn();

	}

	@Then("output should match with the expected result {string}")
	public void output_should_match_with_the_expected_result(String expectedResult) {
		
		String actualResult=ds.getOutputData();
		Assert.assertEquals(actualResult, expectedResult);
		logger.info("console result:" +actualResult);
	}
	
	@When("user clicks on the browser back button")
	public void user_clicks_on_the_browser_back_button() {
		
		String title=ds.navigateBack();
		logger.info(title);
	}

	@Then("user should lands on {string} page")
	public void user_should_lands_on_page(String expectedTitle) {
		String actualTitle=ds.laningPageValidation();
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	@When("user clicks on the Signout button")
	public void user_clicks_on_the_signout_button() {
		ds.signOut();
	}

	@Then("user should land on Home page and can see {string} message")
	public void user_should_land_on_home_page_and_can_see_message(String ExpectedMsg) {
		String actualMsg=ds.logOutMessage();
		Assert.assertEquals(actualMsg, ExpectedMsg);
	}




}



