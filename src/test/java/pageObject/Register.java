package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Register {
	
	WebDriver driver;
	@FindBy(xpath="//a[text()=' Register ']")WebElement RegisterLink;
	@FindBy(xpath="//a[text()='Sign in']")WebElement SignIn;
	@FindBy(xpath="//input[@id='id_username']")WebElement Username;
	@FindBy(xpath="//input[@id='id_password1']")WebElement Password;
	@FindBy(xpath="//a[text()='id_password2']")WebElement PasswordConfirmation;
	@FindBy(xpath="//input[@value='Register']")WebElement RegisterButton;
	@FindBy(xpath="//a[text()='Login ']")WebElement LoginLink;
	
	
 public Register(WebDriver driver) {
	
	this.driver = driver;
	PageFactory.initElements(driver,this);
}
 
 public void click() {
	 RegisterLink.click();
	 SignIn.click();
	 RegisterButton.click();
	 LoginLink.click();
	 
	 }
 public void enterusername(String Username_Field) {
	 
	 Username.clear();
	 Username.sendKeys(Username_Field);
	 
 }
 
 public void enterpassword(String Passowrd_1)
 {
	 Password.clear();
	 Password.sendKeys(Passowrd_1);
	 
 }
 
 public void enterpassword2(String Passowrd_2)
 {
	 PasswordConfirmation.clear();
	 PasswordConfirmation.sendKeys(Passowrd_2);
	 
 }
 
}
