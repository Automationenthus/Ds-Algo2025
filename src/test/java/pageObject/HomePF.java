package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import driverFactory.DriverFactory;
import dsUtilities.ConfigReader;
import io.cucumber.java.Before;

public class HomePF {
	WebDriver homef_driver;

	public HomePF(WebDriver hooks_driver) {
		this.homef_driver = hooks_driver;
		PageFactory.initElements(homef_driver, this);
	}


	@FindBy(xpath = "//button[text()='Get Started']")WebElement Launch_getstarted;
	@FindBy(xpath ="//a[text()='Sign in']")WebElement Home_signin;

	

	public void validate_launchtitle() {
		String Actual_title = homef_driver.getTitle();
		String Expected_title = "Numpy Ninja";
		Assert.assertEquals(Actual_title, Expected_title);
	}
	public void launchgetstarted() {
		
		Launch_getstarted.click();
	}
	
	public  String validate_hometitle( ) {
		String Actual_title = homef_driver.getTitle();
		String Expected_title = "NumpyNinja";
		Assert.assertEquals(Actual_title, Expected_title);
		return Actual_title;
	}
}
