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

	  HomePF homePage;

	@Given("user is on home page")
	public void user_is_on_home_page() {	 
		 String title = driver.getTitle();
		    logger.info("Page title is: " + title);
	    }

	@When("user clicks on sigin button")
	public void user_clicks_on_sigin_button() {
		homePage=new HomePF(driver);
		homePage.signIn();
	}

	@Then("user lands on {string} page")
	public void user_lands_on_page(String expectedText) {
	    String title = driver.getTitle();
	    logger.info("Page title is: " + title); 
	    Assert.assertTrue(title.toLowerCase().contains(expectedText.toLowerCase()),
	            "Expected page title to contain: " + expectedText);
	    logger.info("Verified title contains expected text: " + expectedText);
	}	

}
