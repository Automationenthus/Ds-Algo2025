package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LinkedList {

	/*
	WebDriver driver;
	
	//constructor
 public LinkedList(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
 }
	    
 @FindBy(xpath = "//a[@href='linked-list']") 
 private WebElement getLinkedList;
 
	    @FindBy(linkText = "NumpyNinja")
		WebElement numpylink;
	    
	    @FindBy(xpath = "//div[@class='navbar-nav']/div/a[text()='Data Structures']")
		WebElement dropDown;

		
		@FindBy(xpath = "//div[contains(@class,'dropdown-menu')]//a")
		List <WebElement> options;
		
		@FindBy(xpath = "//div[@id='navbarCollapse']/div[2]/ul/a[2]")
		WebElement usernamelink;
		

		@FindBy(linkText = "Sign out")
		WebElement signOutLink;


	    @FindBy(linkText = "Introduction")
	    private WebElement clickIntroduction;

	    @FindBy(linkText = "Creating Linked LIst")
	    private WebElement clickCreatingLinkedLIst;
	    
	    @FindBy(linkText = "Types of Linked List")
	    private WebElement clickTypesOfLinkedList;
	    
	    @FindBy(linkText = "Implement Linked List in Python")
	    private WebElement clickImplementLinkedListInPython;

	    @FindBy(linkText = "Traversal")
	    private WebElement clickTraversal;

	    @FindBy(linkText = "Insertion")
	    private WebElement clickInsertionn;

	    @FindBy(linkText = "Deletion")
	    private WebElement clickDeletion;

	    

	    @FindBy(linkText = "Practice Questions")
	    private WebElement practiceQuestionsLink;
	    
	    @FindBy(linkText = "Try here>>>")
		WebElement tryHereLink;

		@FindBy(xpath = "//div[@class='input']/div")
		WebElement codeEditor;
		
	    @FindBy(xpath = "//button[text()='Run']")
		private WebElement runButton;

        @FindBy(id = "output")
		private WebElement outputArea;

	    
	    public void getLinkedList() {
	    	getLinkedList.click();
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
	    
	    public void clickIntroduction() {
	    	clickIntroduction.click();
	    }
	    
	    public void clickImplementLinkedListInPython() {
	    	clickImplementLinkedListInPython.click();
	    }

	    public void clickTypesOfLinkedList() {
	    	clickTypesOfLinkedList.click();
	    }

	    public void clickTraversal() {
	    	clickTraversal.click();
	    }

	    public void clickInsertionn() {
	    	clickInsertionn.click();
	    }

	    public void clickDeletion() {
	    	clickDeletion.click();
	    }

	   
	    public void clickPracticeQuestions() {
	        practiceQuestionsLink.click();
	    }
	     
	    
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
	    
	    
	    public void dropdown() {
			dropDown.click();

		}
		public void selectDropdown(String option) {
			Actions actions = new Actions(driver);
			actions.moveToElement(dropDown).perform();

			for (WebElement item : options) {
				if (item.getText().equalsIgnoreCase(option)) {
					item.click();
					return;
				}

			}
		}
	
	*/
}
