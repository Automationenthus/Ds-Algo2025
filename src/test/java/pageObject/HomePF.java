package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePF {
	WebDriver driver;
	public HomePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements( driver,this);
	}
		
	@FindBy(linkText = "Sign in")
	WebElement signInLink;
	
	public void signIn() {
		signInLink.click();

	}

}
