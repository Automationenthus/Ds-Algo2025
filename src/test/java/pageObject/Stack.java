package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Stack {
	
	//CheckoutPage checkoutPage = new CheckoutPage(); (to initiate page factory)

	//PageFactory.initElements(driver, checkoutPage ); (to initiate page factory)
	
 WebDriver driver;
	
	//constructor
 public Stack(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
 }
		//  WebElements 

	    @FindBy(linkText = "Operations in Stack")
	    private WebElement operationsInStackLink;

	    @FindBy(linkText = "Implementation")
	    private WebElement implementationLink;

	    @FindBy(linkText = "Applications")
	    private WebElement applicationsLink;

	    @FindBy(linkText = "Practice Questions")
	    private WebElement practiceQuestionsLink;
	    
	    //Actions
	    
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
	   
	    
	 //  Try Editor Elements and Actions 
	    
	    @FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	    private WebElement codeEditor;

	    @FindBy(xpath = "//button[text()='Run']")
	    private WebElement runButton;

	    @FindBy(id = "output")
	    private WebElement outputArea;
	    
	    public void enterCode(String code) {
	        codeEditor.clear();
	        codeEditor.sendKeys(code);
	    }

	    public void clickRunButton() {
	        runButton.click();
	    }

	    public String getEditorOutput() {
	        return outputArea.getText();
	    }
	}
   
