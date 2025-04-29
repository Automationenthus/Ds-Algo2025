package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.DataStructuresPF;
import dsUtilities.*;
//
public class DataStructuresSteps {

	
	WebDriver driver=DriverFactory.getDriver();
	DataStructuresPF ds=new DataStructuresPF(driver);
	private static final Logger logger = LogManager.getLogger(DataStructuresSteps.class);
	ExcelReader reader;

@Given("user is on home page")
public void user_is_on_home_page() {
	
	
	logger.info(driver.getTitle());
}
@When("user clicks on sigin button and enters valid username and password")
public void user_clicks_on_sigin_button_and_enters_valid_username_and_password() {
	ds.signIn();
	String username=ConfigReader.getProperty("username");
	String password=ConfigReader.getProperty("password");
	ds.enterUserName(username);
	ds.enterPassword(password);
	ds.clickLogin();
}


@Then("user should be logged in successfully with {string} message")
public void user_should_be_logged_in_successfully_with_message(String expectedMsg) {
	Assert.assertEquals(ds.getMessage(), expectedMsg);
	
	
}

@When("user clicks on DtastructureInro GetStarted button")
public void user_clicks_on_dtastructure_inro_get_started_button() {
	
	ds.getStartbtnclick();
	logger.info(ds.pageTitle());
}

@Then("user lands on data-structures-introduction page and able to see NumpyNinja,Data structures dropdown,username and signout links")
public void user_lands_on_data_structures_introduction_page_and_able_to_see_numpy_ninja_data_structures_dropdown_username_and_signout_links() {
	Assert.assertTrue(ds.isNumpyNinjaVisible());
	Assert.assertTrue(ds.isDropdownVisible());
	Assert.assertTrue(ds.isUsernameVisible());
	Assert.assertTrue(ds.isSignOutVisible());
}

@Given("user is on data-structures-introduction page")
public void user_is_on_data_structures_introduction_page() {
	ds.gotoPage();
	logger.info(ds.pageTitle());

}

@When("user ckicks on Time complexity link")
public void user_ckicks_on_time_complexity_link() {
	
	ds.timeComplexity();
}

@Then("user lands on {string} page")
public void user_lands_on_page(String expectedTitle) {
	Assert.assertEquals(ds.pageTitle(), expectedTitle);
	logger.info(ds.pageTitle());
	
	
}

@Given("user is on Time complexity page")
public void user_is_on_time_complexity_page() {
	
	ds.timeComplexityPage();
}

@When("user clicks on Practice Questions link")
public void user_clicks_on_practice_questions_link() {
	
	ds.clickOnPracticeQuest();
}

@Then("user should land on {string} page")
public void user_should_land_on_page(String expectedText) {
	
	Assert.assertTrue(ds.getPageURL().contains(expectedText));
	logger.info(ds.pageTitle());
}

@When("user clicks on try here link")
public void user_clicks_on_try_here_link() {
	ds.clickOnTryHere();
	
}

@Then("user should land on {string} page with  Run button")
public void user_should_land_on_page_with_run_button(String expectedText) {
	Assert.assertTrue(ds.getPageURL().contains(expectedText));
	logger.info(ds.pageTitle());
	Assert.assertTrue(ds.runButtonDisplayed());
	
}
@Given("user is on try Editor page")
public void user_is_on_try_editor_page() {
	
	ds.tryEditorPage();
	logger.info(ds.pageTitle());
}

@When("user clicks on run button without code")
public void user_clicks_on_run_button_without_code() {
	//ds.clearEditor();
	ds.clickOnRunBtn();
}

@Then("user should see the error message in alert window")
public void user_should_see_the_error_message_in_alert_window() {
	
	if(ds.isAlertIsPresent()) {
		Alert alert=driver.switchTo().alert();
		logger.info(alert.getText());
	}
	
	else {
		
		logger.info("no alert found");
	}
		
}

@When("user writes Python code from {string} and {int}")
public void user_writes_python_code_from_and(String sheetname, Integer rownumber) throws InterruptedException {
	
	 reader=new ExcelReader("src/test/resources/TestData/PythonCode.xlsx");
	 List<Map<String, String>> allRowsData = reader.readAllRows(sheetname);
	 String codeToEnter=allRowsData.get(rownumber).get("Pcode");
	 ds.editor(codeToEnter);
	  ds.clickOnRunBtn();
	 if(ds.isAlertIsPresent()) {
			Alert alert=driver.switchTo().alert();
			logger.info(alert.getText());
		}
		
		else {
			
			logger.info("no alert found");
		}
}

@Then("output should match with expected result {string}")
public void output_should_match_with_expected_result(String expectedResult) {
	String actualResult=ds.getOutputData();
	Assert.assertTrue(actualResult.contains(actualResult));
	logger.info(actualResult);
	
	
}



}	

