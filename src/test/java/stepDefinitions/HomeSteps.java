package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import driverFactory.DriverFactory;
import dsalgoHooks.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePF;

public class HomeSteps {

	private static final Logger logger = LogManager.getLogger(HomeSteps.class);

	WebDriver driver = DriverFactory.getDriver();
	// WebDriver driver = Hooks.driver; // Get the WebDriver from Hooks

	HomePF homePage = new HomePF(Hooks.driver);

	@Given("User is in the ds-algo launch page")
	public void user_is_on_home_page() {
		
		String title = driver.getTitle();
		logger.info("Page title is: " + title);
	}

	@When("User click the get started button in dsalgo launch page")
	public void user_clicks_getstarted_launch_page() {
		homePage.launchgetstarted();
	}

	@Then("User should be navigated to the home page")
	public void user_lands_on_Home_page() {
	    homePage.validate_hometitle();
	    //logger.info("Verified title contains expected text: " + Actual_title);
	}

}
