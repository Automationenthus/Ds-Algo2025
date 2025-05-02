package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsUtilities.ConfigReader;
import junit.framework.Assert;

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
	@FindBy(xpath = "//div[contains(text(), 'Invalid Username and Password')]")WebElement Invalid_Crendentials;
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

	public void logout_button() {
		Signout.click();
		
	}
	
	public String loged_out_message(String logedoutmsg) {
		
		String expected_message = "Logged out successfully";
		String actual_Message = LogedOut_message.getText();
		Assert.assertEquals(actual_Message, expected_message);
		return actual_Message;
	}
		
	@SuppressWarnings("deprecation")
	public boolean isUsernameRequired() {
		return Login_Username.getAttribute("Please fill out this field") != null; 
	}
	
	public boolean isPasswordRequired() {
		return Login_Password.getAttribute("required") != null;
	}
	
	public String getInvalidLoginMessage() {
		
		return Invalid_Crendentials.getText();
		
	}
}
