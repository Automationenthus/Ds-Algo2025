package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dsUtilities.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePF;

public class Home {
	
	  WebDriver driver = DriverFactory.getDriver();
	  HomePF homePage;

	@Given("user is on home page")
	public void user_is_on_home_page() {	 
	    System.out.println(driver.getTitle());
	    }

	@When("user clicks on sigin button")
	public void user_clicks_on_sigin_button() {
		homePage=new HomePF(driver);
		homePage.signIn();
	}

	@Then("user lands on {string} page")
	public void user_lands_on_page(String text) {
		
		Assert.assertTrue(driver.getPageSource().contains(text));
		System.out.println(driver.getTitle());
	}	

}
