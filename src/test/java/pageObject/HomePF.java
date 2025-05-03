package pageObject;

//import java.time.Duration;
//
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.FindBy;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePF {
	WebDriver driver;
//	public HomePF(WebDriver driver) {
//		this.driver=driver;
//		PageFactory.initElements( driver,this);
//	}
//		
//	@FindBy(linkText = "Sign in")
//	WebElement signInLink;
//	
//	public void signIn() {
//		signInLink.click();
//
//	}
//	
//	@FindBy(xpath ="input[@name='username']")
//	WebElement inputUserName;
//	
//	@FindBy(xpath ="input[@name='password']")
//	WebElement inputPassword;
//	
//	@FindBy(xpath = "//input[@type='submit']")
//	WebElement loginBtn;
//	
//	@FindBy(xpath = "//div[contains(@class,'alert-primary')]")
//	WebElement sucessMessage;
//
//	
//	WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
//	public void enterUserName(String username) {
//		wait.until(ExpectedConditions.visibilityOf(inputUserName));
//		inputUserName.sendKeys(username);
//	
//	}
//	public void enterPassword(String password) {
//		wait.until(ExpectedConditions.visibilityOf(inputPassword));
//		inputPassword.sendKeys(password);
//	}
//	
//	public void clickLogin() {
//		
//		loginBtn.click();
//	}
//	
//
//	public String getTitle() {
//		String title=driver.getTitle();
//		return title;
//	}
//	
//	public String getMessage() {
//		String loginMessage=sucessMessage.getText();
//		return loginMessage;
//	}
//	
}
