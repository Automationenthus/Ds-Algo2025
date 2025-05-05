package pageObject;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import dsUtilities.ConfigReader;
import driverFactory.DriverFactory;

public class LinkedListPF {

    WebDriver driver;

    public LinkedListPF(WebDriver driver) {
    	this.driver=driver;
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(linkText = "Sign in")
	WebElement signInLink;
    
	@FindBy(id = "id_username")
	WebElement inputUserName;
	
	@FindBy(id = "id_password")
	WebElement inputPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	WebElement loginBtn;
	
	
	@FindBy(xpath = "//div[contains(@class,'alert-primary')]")
    WebElement sucessMessage;

	public void loginPage() {
		driver.get(ConfigReader.getProperty("loginUrl"));
	}
	
	//WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	public void enterUserName(String username) {
		inputUserName.clear();
		//wait.until(ExpectedConditions.visibilityOf(inputUserName));
		inputUserName.sendKeys(username);
	
	}
	public void enterPassword(String password) {
		//wait.until(ExpectedConditions.visibilityOf(inputPassword));
		inputPassword.sendKeys(password);
	}
	
	public void clickLogin() {
		
		loginBtn.click();
	}
	public String getMessage() {
		String loginMessage=sucessMessage.getText();
		return loginMessage;
	}
	
	
	   @FindBy(xpath = "//a[@href='linked-list']") 
        private WebElement getStartlinkedListLink;
    
	
	   @FindBy(linkText = "NumpyNinja")
		WebElement numpylink;
	    
	    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
		WebElement dropDown;

		
		@FindBy(xpath = "//div[contains(@class,'dropdown-menu')]//a")
		List <WebElement> options;
		
		@FindBy(xpath = "//div[@id='navbarCollapse']/div[2]/ul/a[2]")
		WebElement usernamelink;
		
		@FindBy(linkText = "Sign out")
	    WebElement signOutLink;
	  
	@FindBy(linkText = "Introduction")
    WebElement introductionLink;

	@FindBy(linkText = "Creating Linked LIst")
    WebElement clickCreatingLinkedLIst;
    
    @FindBy(linkText = "Types of Linked List")
     WebElement clickTypesOfLinkedList;
    
    @FindBy(linkText = "Implement Linked List in Python")
     WebElement clickImplementLinkedListInPython;

    @FindBy(linkText = "Traversal")
     WebElement clickTraversal;

    @FindBy(linkText = "Insertion")
     WebElement clickInsertionn;

    @FindBy(linkText = "Deletion")
     WebElement clickDeletion;
   
    @FindBy(linkText = "Try here>>>")
	WebElement tryHereBtn;

    @FindBy(xpath = "//button[text()='Run']")
	 WebElement runButton;

    @FindBy(id = "output")
	 WebElement outputArea;
    
    
    @FindBy(linkText = "Practice Questions")
    WebElement practiceQuestionsLink;
    
    @FindBy(xpath = "//div[@role='alert']")
	WebElement logOutMsg;
    
    
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
   
//    public void clickLinkedList() {
//		getStartlinkedListLink.click();
//    }

   
    
    public void clickLinkedlistTopic(String topic) {
        Map<String, WebElement> topicMap = new HashMap<>();
        topicMap.put("introduction", introductionLink);
        topicMap.put("creating linked list", clickCreatingLinkedLIst);
        topicMap.put("types of linked list", clickTypesOfLinkedList);
        topicMap.put("implement linked list in python", clickImplementLinkedListInPython);
        topicMap.put("traversal", clickTraversal);
        topicMap.put("insertion", clickInsertionn);
        topicMap.put("deletion", clickDeletion);

        WebElement element = topicMap.get(topic.trim().toLowerCase());
        if (element == null) {
            throw new IllegalArgumentException("Unknown topic: " + topic);
        }

        element.click();
    }

    public void verifyPageNavigation(String topic) {
        String expectedPath = getUrlPathFromTopic(topic);
        String currentUrl = driver.getCurrentUrl().replaceAll("/$", "");
        Assert.assertTrue(currentUrl.toLowerCase().contains(expectedPath.toLowerCase()),
            "Expected to contain: " + expectedPath + " but got: " + currentUrl);
    }

    public void openLinkedListSubPage(String topic) { 
        String url = ConfigReader.getProperty("linkedlisturl")+ getUrlPathFromTopic(topic) + "/";
        driver.get(url);
    }
    
    public void tryEditorPage() {
		driver.get(ConfigReader.getProperty("tryEditorUrl"));	
	}

    
    public void verifyTryEditorPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/tryEditor"), "Did not navigate to Try Editor. URL: " + currentUrl);
        Assert.assertTrue(runButton.isDisplayed(), "Run button is not displayed on Try Editor page.");
    }
    
    private String getUrlPathFromTopic(String topic) {
        switch (topic.trim().toLowerCase()) {
            case "introduction":
                return "introduction";
            case "creating linked list":
                return "creating-linked-list";
            case "types of linked list":
                return "types-of-linked-list";
            case "implement linked list in python":
                return "implement-linked-list-in-python";
            case "traversal":
                return "traversal";
            case "insertion":
                return "insertion-in-linked-list";
            case "deletion":
                return "deletion-in-linked-list";
            default:
                throw new IllegalArgumentException("Unknown topic for URL mapping: " + topic);
        }
    }

    public void clickRunButton() {
        runButton.click();
    }
    public String getOutputData() { 
		  return outputArea.getText();
		  }
    
    public void clickPracticeQuestionsLink() {
        practiceQuestionsLink.click();
    }

    public void verifyPracticeQuestionsPage() {
        String url = driver.getCurrentUrl().toLowerCase();
        Assert.assertTrue(url.contains("practice"), "Not navigated to the Practice Questions page. URL: " + url);
    }
    
    public void navigateToLLPage() {
    	getStartlinkedListLink.click();
    }
    
    public void clickSignOut() {
		signOutLink.click();

	}
    public String logOutMessage() {
		return logOutMsg.getText();
	}
    
    public void clickTryHere() {
        tryHereBtn.click();
    }
    
    public String pageTitle() {
		String title=driver.getTitle();
		return title;
	}
    
	}
  


