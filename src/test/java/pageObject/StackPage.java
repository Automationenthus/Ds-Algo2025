package pageObject;

import java.util.NoSuchElementException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsUtilities.ConfigReader;

public class StackPage {
	
	//CheckoutPage checkoutPage = new CheckoutPage(); (to initiate page factory)

	//PageFactory.initElements(driver, checkoutPage ); (to initiate page factory)
	
 WebDriver driver;
	
	//constructor
 public StackPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
 }
		//  WebElements 
 
 @FindBy(xpath = "//a[text()='Get Started' and @href='stack']")
    private WebElement gettingStartedStackBtn;

 @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")  // Dropdown button
 WebElement dropdownMenu;
 
 @FindBy(xpath = "//a[text()='Stack']")  // Array option under the dropdown
 WebElement StackOption;
 
 @FindBy(xpath = "//h4[contains(text(),'Array')]")
 private WebElement StackPageHeader;
 
 //@FindBy(xpath = "//a[text()='Try here']")
 @FindBy(css = "a[href='/tryEditor']")
 private WebElement tryhereLink;
 
 
 
 
 
	    @FindBy(linkText = "Operations in Stack")
	    private WebElement operationsInStackLink;

	    @FindBy(linkText = "Implementation")
	    private WebElement implementationLink;

	    @FindBy(linkText = "Applications")
	    private WebElement applicationsLink;

	    @FindBy(linkText = "Practice Questions")
	    private WebElement practiceQuestionsLink;
	    
	    //Actions
	    
	    public void clickDropdown() {
	        dropdownMenu.click();
	    }
	    
	    public void selectArrayFromDropdown() {
	    	StackOption.click();
	    }
	    
	    public void clickGettingStarted() {
	    	gettingStartedStackBtn.click();
	    }
	    
	    public boolean isStackPageDisplayed() {
	        return StackPageHeader.isDisplayed(); 
	        //public boolean isArrayPageDisplayed() {
		    //return driver.getTitle().contains("Array");
	    }
	    
	    public void scrollToTryHere() {
	        try {
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryhereLink);
	            System.out.println("Scrolled to Try Here link successfully.");
	        } catch (Exception e) {
	            System.out.println("Failed to scroll to Try Here link: " + e.getMessage());
	        }
	    }
	    
	    public void clickOperationsInStack() {
	        operationsInStackLink.click();
	    }

	    public void clickImplementation() {
	        implementationLink.click();
	    }

	    public void clickApplications() {
	        applicationsLink.click();
	    }

	    public void clickPracticeQuestions() {
	        practiceQuestionsLink.click();
	    }
	   
	    public void clickTryhere() {
	    	tryhereLink.click();
	    }
	    
	 //  Try Editor Elements and Actions 
	    
	    @FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	    private WebElement codeEditor;

	    @FindBy(xpath = "//button[text()='Run']")
	    private WebElement runButton;

	    @FindBy(id = "output")
	    private WebElement outputArea;
	    
	    
	    //TryEditor Actions 
	    public void enterCode(String code) {
	        try {
	            codeEditor.clear();
	            codeEditor.sendKeys(code);
	        } catch (Exception e) {
	            System.out.println("Failed to enter code in the editor: " + e.getMessage());
	        }
	    }

	    public void clickRunButton() {
	        runButton.click();
	    }

	    public String getEditorOutput() {
	        return outputArea.getText();
	    }

   
public boolean isRunButtonVisible() {
    try {
        return runButton.isDisplayed();
    } catch (NoSuchElementException e) {
        return false;  // Return false if the element is not found
    }
}

//Navigate methods inside ArraysPage

public void navigateToStackPage() {
    driver.get(ConfigReader.getProperty("Stackurl"));
}

public void navigateToOperationsinStackPage() {
    driver.get(ConfigReader.getProperty("OperationsinStackurl"));
}

public void navigateToImplementationPage() {
    driver.get(ConfigReader.getProperty("Implementationurl"));
}

public void navigateToApplicationsPage() {
    driver.get(ConfigReader.getProperty("Applicationsurl"));
}

public void navigateToStackstryeditorPage() {
    driver.get(ConfigReader.getProperty("Stackstryeditorurl"));
}

public void navigateTostackspracticequestion() {
	driver.get(ConfigReader.getProperty("stackspracticequestionurl"));
}
	


}

