package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsUtilities.ConfigReader;

public class LoginFactory {
	public LoginFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}

	WebDriver driver;
	@FindBy(linkText = "Sign in")WebElement signIn;
	@FindBy(xpath="//input[@name ='username']")WebElement Login_Username;
	@FindBy(xpath = "//input[@name ='password']")WebElement Login_Password;
	@FindBy(xpath = "//input[@value='Login']")WebElement Login_Button;
	@FindBy(xpath = "//div[contains(text(),' You are logged in')] ")WebElement LogedIn_message;
	@FindBy(xpath = "//div[contains(text(),'Logged out')]")WebElement LogedOut_message;
	@FindBy(xpath = "Invalid Username and Password")WebElement Invalid_Crendentials;
	@FindBy(xpath = "//a[text()='Sign out']")WebElement Signout;

	
	public void click_homesignin() {
		signIn.click();
		
	}
	public void login_user(String Username1) {
		Login_Username.clear();
		Login_Username.sendKeys(Username1);
		
	}
	
	public void login_passowrd(String Password1) {
		
		Login_Password.sendKeys(Password1);
	}
	
	public void login_button() {
		Login_Button.click();
		
	}
	
	public boolean is_logedin_messagedisplayed() {
		return LogedIn_message.isDisplayed();
	}
	
	
}
