package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.*;
import org.testng.Assert;

import dsUtilities.ConfigReader;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class QueuePF {

    WebDriver driver;

    public QueuePF(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    @FindBy(xpath = "//a[@href='queue']")
    private WebElement getStartQueue;
    
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
    
    @FindBy(linkText = "Implementation of Queue in Python")
    WebElement implementationOfQueueInPython;

    @FindBy(linkText = "Implementation using collections.deque")
    WebElement implementationUsingCollectionsDeque;

    @FindBy(linkText = "Implementation using array")
    WebElement implementationUsingArray;

    @FindBy(linkText = "Queue Operations")
    WebElement queueOperations;

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
	
//  public void getStartbtnclick() {
//	getStartQueue.click();
//}
    
    public void clickQueueTopic(String topic) {
        Map<String, WebElement> topicMap = new HashMap<>();
        topicMap.put("Implementation of Queue in Python", implementationOfQueueInPython);
        topicMap.put("Implementation using collections.deque", implementationUsingCollectionsDeque);
        topicMap.put("Implementation using array", implementationUsingArray);
        topicMap.put("Queue Operations", queueOperations);

        WebElement element = topicMap.get(topic);
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

    public void openQueueSubPage(String topic) {
        //String subPageUrl = "https://dsportalapp.herokuapp.com/queue/" + getUrlPathFromTopic(topic) + "/";
        String url = ConfigReader.getProperty("queueUrl")+ getUrlPathFromTopic(topic) + "/";
       // driver.get(subPageUrl);
        driver.get(url);
    }

    public void verifyTryEditorPage() {
        String currentUrl = driver.getCurrentUrl();
        Assert.assertTrue(currentUrl.contains("/tryEditor"), "Did not navigate to Try Editor. URL: " + currentUrl);
        Assert.assertTrue(runButton.isDisplayed(), "Run button is not displayed on Try Editor page.");
    }
    
    public void tryEditorPage() {
		driver.get(ConfigReader.getProperty("tryEditorUrl"));	
	}

    private String getUrlPathFromTopic(String topic) {
        switch (topic.toLowerCase()) {
            case "implementation of queue in python":
                return "implementation-lists";
            case "implementation using collections.deque":
                return "implementation-collections";
            case "implementation using array":
                return "Implementation-array";
            case "queue operations":
                return "QueueOp";
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
    
    public void navigateToQueuePage() {
    	getStartQueue.click();
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
