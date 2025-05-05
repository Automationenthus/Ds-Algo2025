package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import driverFactory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.types.Duration;
import pageObject.DataStructuresPF;
import dsUtilities.*;
//
public class DataStructuresSteps {

	
	WebDriver driver=DriverFactory.getDriver();
	DataStructuresPF ds=new DataStructuresPF(driver);
	private static final Logger logger = LogManager.getLogger(DataStructuresSteps.class);
	ExcelReader reader=new ExcelReader("src/test/resources/TestData/PythonCode.xlsx");

@Given("user is on home page")
public void user_is_on_home_page() {
	
	
	logger.info(driver.getTitle());
}
//@When("user clicks on sigin button")
//public void user_clicks_on_sigin_button() {
//    // Write code here that turns the phrase above into concrete actions
//    throw new io.cucumber.java.PendingException();
//}
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
	
	Assert.assertTrue(ds.isAlertIsPresent());
}
@When("user clicks on run button with incorrect code from {string} and {int}")
public void user_clicks_on_run_button_with_incorrect_code_from_and(String sheetname, Integer rownumber)throws InterruptedException {
	List<Map<String, String>> allRowsData1= reader.readAllRows(sheetname);
	String codeToEnter=allRowsData1.get(rownumber).get("Pcode");
	ds.editor(codeToEnter);
	  ds.clickOnRunBtn();

}
@Then("user should see the error message in alert window and get the alert text")
public void user_should_see_the_error_message_in_alert_window_and_get_the_alert_text() {
	
	Alert alert = driver.switchTo().alert();
	String text = alert.getText();
	logger.info(text);
	alert.accept();
}
@When("user types incorrect code from {string} and {int}")
public void user_types_incorrect_code_from_and(String sheetname, Integer rownumber) {
	List<Map<String, String>> allRowsData1= reader.readAllRows(sheetname);
	String codeToEnter=allRowsData1.get(rownumber).get("Pcode");
	ds.editor(codeToEnter);
	ds.clickOnRunBtn();
	  
}

@Then("user should see alert window and can not click on run button")
public void user_should_see_alert_window_and_can_not_click_on_run_button() {
	WebDriverWait wait=new WebDriverWait(driver, java.time.Duration.ofSeconds(10));
	try {
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        Assert.assertNotNull(alert);
        ds.clickOnRunBtn();
        Assert.assertNotNull(driver.switchTo().alert());
        alert.accept();
	}
	catch(Exception e){
		Assert.fail("alert not present");
		
	}
	//Assert.assertFalse(ds.runButtonValidation());
}


@When("user writes Python code from {string} and {int}")
public void user_writes_python_code_from_and(String sheetname, Integer rownumber) throws InterruptedException {
	
	
	 List<Map<String, String>> allRowsData = reader.readAllRows(sheetname);
	 String codeToEnter=allRowsData.get(rownumber).get("Pcode");
	 ds.editor(codeToEnter);
	  ds.clickOnRunBtn();

}

@Then("output should match with expected result {string}")
public void output_should_match_with_expected_result(String expectedResult) {
	String actualResult=ds.getOutputData();
	Assert.assertEquals(actualResult, expectedResult);
	logger.info("console result:" +actualResult);
	
	
}

@When("user clicks on browser back button")
public void user_clicks_on_browser_back_button() {
	String title=ds.navigateBack();
	logger.info(title);
}

@Then("user lands on  the {string} page")
public void user_lands_on_the_page(String expectedText) throws InterruptedException {
	String actualTitle=ds.laningPageValidation();
	Assert.assertEquals(actualTitle, expectedText);
	
	
	
}
@When("user clicks on Signout button")
public void user_clicks_on_signout_button() {
	
	ds.signOut();
}

@Then("user should land on Home page and can view {string} message")
public void user_should_land_on_home_page_and_can_view_message(String ExpectedMsg) {
	String actualMsg=ds.logOutMessage();
	Assert.assertEquals(actualMsg, ExpectedMsg);
	
}



}	

