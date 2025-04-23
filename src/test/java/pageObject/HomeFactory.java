package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import driverFactory.DriverFactory;
import dsUtilities.ConfigReader;
import io.cucumber.java.Before;

public class HomeFactory {
	WebDriver homef_driver;

	public HomeFactory(WebDriver hooks_driver) {
		this.homef_driver = hooks_driver;
		PageFactory.initElements(homef_driver, this);
	}

	public void launchURL() {
		homef_driver.get(ConfigReader.getUrl());
	}
	
	@FindBy(xpath = "//button[text()='Get Started']")WebElement Launch_getstarted;
	@FindBy(xpath ="//a[text()='Sign in']")WebElement Home_signin;

	@FindBy(xpath = "//a[text()=' Register ']")
	WebElement RegisterLink;

	public void launchgetstarted() {
		
		Launch_getstarted.click();
	}
	public void click_homesignin() {
		Home_signin.click();
	}
	public void validate_hometitle() {
		String Actual_title = homef_driver.getTitle();
		String Expected_title = "NumpyNinja";
		Assert.assertEquals(Actual_title, Expected_title);
	}
}
