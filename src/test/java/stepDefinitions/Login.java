package stepDefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePF;
import dsalgoHooks.Hooks;
import pageObject.LoginFactory;
import dsUtilities.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import static org.junit.Assert.assertEquals;

public class Login {

	// LoginFactory login = new LoginFactory(Hooks.driver);
	LoginFactory login = new LoginFactory(Hooks.driver);
	ExcelReader reader;
	String username = null;
	String password = null;
	List<Map<String, String>> allRowsData;
	private static final Logger logger = LogManager.getLogger(Login.class);

	@When("The user gets valid data  {string} and {string} for the login page")
	public void the_user_gets_valid_data_for_the_login_page(String Sheetname, String Usecase) throws IOException {
		login.click_homesignin();

		reader = new ExcelReader("src/test/resources/TestData/Ds-AlgoTestData.xlsx");
		allRowsData = reader.readAllRows(Sheetname);
		System.out.println("After ExcelReader call");
		for (Map<String, String> row : allRowsData) {
			if (row.get("Scenario").equalsIgnoreCase(Usecase)) {
				System.out.println("Inside map loop");
				username = row.get("Username");
				password = row.get("Password");
				break;
			}
		}

		System.out.println("User name is" + username);
		System.out.println("password is" + password);

		login.login_user(username);
		login.login_passowrd(password);
		login.login_button();

	}

	@Then("The user is in the home page")
	public void User_navigated_to_home_page() {
		System.out.println("Inside home page verification");
		boolean logedin = login.is_logedin_messagedisplayed();
		Assert.assertTrue(logedin);
		logger.info(login.is_logedin_messagedisplayed());
	}

	@Then("The user clicks Sign Out")
	public void the_user_clicks_sign_out() {
		login.logout_button();
	}

	@Then("The user should be redirected to home page with message {string}")
	public void The_user_should_be_redirected_to_home_page_with_message(String message) {
		String actualMessage = login.loged_out_message(message);
		Assert.assertEquals(actualMessage, "Logged out successfully");
	}

	@When("The user gets blank data from excel sheet {string} and {string} for the login page")
	public void the_user_gets_blank_data_for_the_login_page(String Sheetname, String Usecase) throws IOException {
		login.click_homesignin();

		username = "";
		password = "";

		login.login_user(username);
		login.login_passowrd(password);
		login.login_button();

	}

	@Then("The error message appears below Username and Password textbox like Please fill out this field")
	public void The_validation_message_for_blank_credentials() {
		Assert.assertTrue(!login.isUsernameRequired());
		//Assert.assertTrue("Password field is not marked as required", login.isPasswordRequired());

	}

	@When("The user gets invalid data from excel sheet {string} and {string} for the login page")
	public void the_user_gets_invalid_data_for_the_login_page(String Sheetname, String Usecase) throws IOException {

		login.click_homesignin();

		reader = new ExcelReader("src/test/resources/TestData/Ds-AlgoTestData.xlsx");
		allRowsData = reader.readAllRows(Sheetname);

		for (Map<String, String> row : allRowsData) {
			if (row.get("Scenario").equalsIgnoreCase(Usecase)) {
				username = row.get("Username");
				password = row.get("Password");
				break;
			}
		}

		login.login_user(username);
		login.login_passowrd(password);
		login.login_button();

	}

	@Then("The user should get the error message Invalid Username and Password")
	public void The_validation_message_for_invalid_credentials() {
		String ActualLogedoutMessage = login.getInvalidLoginMessage();
		String ExpectedLogedOutMessage = "Invalid Username and Password";
		Assert.assertEquals(ActualLogedoutMessage.trim(), ExpectedLogedOutMessage);

	}
}

/*
 * @Then("The user should be navigated to home page with message {string}")
 * public void the_user_should_be_navigated_to_home_page_with_message(String
 * string) { // Write code here that turns the phrase above into concrete
 * actions throw new io.cucumber.java.PendingException(); }
 * 
 * @When("The user enters invalid username and password") public void
 * the_user_enters_invalid_username_and_password() { // Write code here that
 * turns the phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * @Then("The user should get the error message {string}") public void
 * the_user_should_get_the_error_message(String string) { // Write code here
 * that turns the phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * @When("The user clicks numpy ninja button on the top left") public void
 * the_user_clicks_numpy_ninja_button_on_the_top_left() { // Write code here
 * that turns the phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * @Then("The user should get navigate to get started home page") public void
 * the_user_should_get_navigate_to_get_started_home_page() { // Write code here
 * that turns the phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * @When("The user clicks Register link") public void
 * the_user_clicks_register_link() { // Write code here that turns the phrase
 * above into concrete actions throw new io.cucumber.java.PendingException(); }
 * 
 * @Then("The user should navigate to Register page") public void
 * the_user_should_navigate_to_register_page() { // Write code here that turns
 * the phrase above into concrete actions throw new
 * io.cucumber.java.PendingException(); }
 * 
 * }
 */
