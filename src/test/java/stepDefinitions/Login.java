package stepDefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomeFactory;
import dsalgoHooks.Hooks;
import pageObject.LoginFactory;

public class Login {
	
	LoginFactory login = new LoginFactory(Hooks.driver);
	

	@Given("The user clicks the Sign In link")
	public void the_user_clicks_the_sign_in_link() {
		login.click_homesignin();
	}

	@When("The user gets valid data  {string} and {string} for the login page")
	public void the_user_gets_valid_data_for_the_login_page(String username, String Password) {
		login.login_user(username);
		login.login_passowrd(Password);
		login.login_button();
	}

	@Then("The user is on home page after sign in")
	public void the_user_is_on_home_page_after_sign_in() {
		boolean isyourloggedindisplayed = login.is_logedin_messagedisplayed();
		Assert.assertTrue("User not navigated to log in page",isyourloggedindisplayed);
	}
}
/*
	@Then("The user clicks sign out")
	public void the_user_clicks_sign_out() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be navigated to home page with message {string}")
	public void the_user_should_be_navigated_to_home_page_with_message(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user enters invalid username and password")
	public void the_user_enters_invalid_username_and_password() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should get the error message {string}")
	public void the_user_should_get_the_error_message(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks numpy ninja button on the top left")
	public void the_user_clicks_numpy_ninja_button_on_the_top_left() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should get navigate to get started home page")
	public void the_user_should_get_navigate_to_get_started_home_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks Register link")
	public void the_user_clicks_register_link() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Then("The user should navigate to Register page")
	public void the_user_should_navigate_to_register_page() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
*/
