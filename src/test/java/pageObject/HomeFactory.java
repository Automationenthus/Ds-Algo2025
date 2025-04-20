package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import driverFactory.DriverFactory;
import dsUtilities.ConfigReader;
import io.cucumber.java.Before;

public class HomeFactory {
	WebDriver driver;

	public HomeFactory(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void launchURL() {
		driver.get(ConfigReader.getUrl());
	}

	@FindBy(xpath = "//a[text()=' Register ']")
	WebElement RegisterLink;

	public void reg_linkclick() {
		RegisterLink.click();
	}
}
