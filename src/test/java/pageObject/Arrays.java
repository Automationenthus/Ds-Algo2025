package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Arrays {

	    WebDriver driver;

	    // Constructor 
	    
	    public Arrays(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    // WebElements 
	    
	    @FindBy(linkText = "Arrays in Python")
	    private WebElement arraysInPythonLink;

	    @FindBy(linkText = "Arrays Using List")
	    private WebElement arraysUsingListLink;

	    @FindBy(linkText = "Basic Operations in Lists")
	    private WebElement basicOperationsInListLink;

	    @FindBy(linkText = "Applications of Array")
	    private WebElement applicationsOfArrayLink;

	    @FindBy(linkText = "Practice Questions")
	    private WebElement practiceQuestionsLink;
	    
	 //Actions
	    
	    public void clickArraysInPython() {
	        arraysInPythonLink.click();
	    }

	    public void clickArraysUsingList() {
	        arraysUsingListLink.click();
	    }

	    public void clickBasicOperationsInList() {
	        basicOperationsInListLink.click();
	    }

	    public void clickApplicationsOfArray() {
	        applicationsOfArrayLink.click();
	    }

	    public void clickPracticeQuestions() {
	        practiceQuestionsLink.click();
	    }
	    
	    //  Practice Question Links 
	    @FindBy(linkText = "Search the array")
	    private WebElement searchTheArrayLink;

	    @FindBy(linkText = "Max Consecutive Ones")
	    private WebElement maxConsecutiveOnesLink;

	    @FindBy(linkText = "Find Numbers with Even Number of Digits")
	    private WebElement evenNumberDigitsLink;

	    @FindBy(linkText = "Squares of a Sorted Array")
	    private WebElement squaresOfSortedArrayLink;

	    // Actions 
	    public void clickSearchTheArray() {
	        searchTheArrayLink.click();
	    }

	    public void clickMaxConsecutiveOnes() {
	        maxConsecutiveOnesLink.click();
	    }

	    public void clickEvenNumberDigits() {
	        evenNumberDigitsLink.click();
	    }

	    public void clickSquaresOfSortedArray() {
	        squaresOfSortedArrayLink.click();
	    }
	    
	    
 // Try Editor Elements and Actions 
	    
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
	    
	    
	    
	    
	    
	  
