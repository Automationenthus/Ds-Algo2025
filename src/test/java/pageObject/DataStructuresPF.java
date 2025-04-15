package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DataStructuresPF {
	WebDriver driver;

	public DataStructuresPF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h5[text()='Data Structures-Introduction']/../a[text()='Get Started']")
	WebElement getStartedBtn; //getstaredbutton

	@FindBy(linkText = "NumpyNinja")
	WebElement numpylink;

	@FindBy(linkText = "Sign out")
	WebElement signOutLink;

	@FindBy(xpath = "//div[@role='alert']")
	WebElement logOutMsg;

	@FindBy(xpath = "//div[@id='navbarCollapse']/div[2]/ul/a[2]")
	WebElement usernamelink;


	@FindBy(linkText = "Time Complexity")
	WebElement timeComplexityLink;



	@FindBy(xpath = "//div[@class='navbar-nav']/div/a[text()='Data Structures']")
	WebElement dropDown;

	@FindBy(xpath = "//div[contains(@class,'dropdown-menu')]//a")
	List <WebElement> options;

	@FindBy(linkText = "Practice Questions")
	WebElement practiceQuestLink;

	@FindBy(linkText = "Try here>>>")
	WebElement tryHereLink;

	@FindBy(xpath = "//div[@class='input']/div")
	WebElement codeEditor;


	@FindBy(xpath = "//button[text()='Run']")
	WebElement runBtn;

	@FindBy(xpath = "//pre[@id='output']")
	WebElement outputText;

	public void getStartbtnclick() {
		getStartedBtn.click();
	}
	public boolean isNumpyNinjaVisible() {
		return numpylink.isDisplayed();
	}

	public boolean isDropdownVisible() {
		return dropDown.isDisplayed();
	}

	public boolean isUsernameVisible() {
		return usernamelink.isDisplayed();
	}

	public boolean isSignOutVisible() {
		return signOutLink.isDisplayed();
	}
	public void numpyNinjaClick() {
		numpylink.click();
	}

	public void signOut() {
		signOutLink.click();

	}

	public void timeComplexity() {
		timeComplexityLink.click();

	}

	public void dropdown() {
		dropDown.click();

	}
	public void selectFromDropdown(String option) {
		Actions actions = new Actions(driver);
		actions.moveToElement(dropDown).perform();

		for (WebElement item : options) {
			if (item.getText().equalsIgnoreCase(option)) {
				item.click();
				return;
			}

		}
	}


	public void clickOnPracticeQuest() {

		practiceQuestLink.click();
	}


	public void clickOnTryHere() {
		tryHereLink.click();

	}
	public void clearEditor() {
		codeEditor.clear();
	}

	public void editor(String code) {
		clearEditor();
		codeEditor.sendKeys(code);

	}

	public void clickOnRunBtn() {
		runBtn.click();

	}
	public boolean output() {
		return outputText.isDisplayed();
	}

	public String logOutMessage() {
		return logOutMsg.getText();
	}


}
