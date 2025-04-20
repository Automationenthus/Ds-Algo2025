package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

	WebDriver driver;
	@FindBy(xpath="//input[@name ='username']")WebElement Login_Username;
	@FindBy(xpath = "//input[@name ='password']")WebElement Login_Password;
	@FindBy(xpath = "//a[text() ='Register!']")WebElement Login_Register;

	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void login_user(String Username1) {
		Login_Username.clear();
		Login_Username.sendKeys(Username1);
		
	}
	
	public void login_passowrd(String Password1) {
		
		Login_Password.sendKeys(Password1);
	}
	
	public void login_reg() {
		Login_Register.click();
		
	}
	
	
}
