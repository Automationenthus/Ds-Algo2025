package pageObject;

import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import driverFactory.DriverFactory;
import dsUtilities.ConfigReader;

public class ArraysPage {

	    WebDriver driver;

	    // Constructor 
	    
	    public ArraysPage(WebDriver driver) {
	        this.driver = driver;
	        PageFactory.initElements(driver, this);
	    }
	    // WebElements 
	    
	    
	    @FindBy(xpath = "//a[text()='Get Started' and @href='array']")
	   	    private WebElement gettingStartedArrayBtn;
	    
	    @FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")  // Dropdown button
	    WebElement dropdownMenu;

	    @FindBy(xpath = "//a[text()='Arrays']")  // Array option under the dropdown
	    WebElement arrayOption;

	    @FindBy(xpath = "//h4[contains(text(),'Array')]")
	    private WebElement arrayPageHeader;
	    
	    @FindBy(linkText = "Arrays in Python")
	    private WebElement arraysInPythonLink;

	    @FindBy(xpath = "//p[contains(text(),'Arrays in Python')]") 
	    private WebElement arraysInPythonText;
	    
	    @FindBy(linkText = "Arrays Using List")
	    private WebElement arraysUsingListLink;

	    @FindBy(linkText = "Basic Operations in Lists")
	    private WebElement basicOperationsInListLink;

	    @FindBy(linkText = "Applications of Array")
	    private WebElement applicationsOfArrayLink;

	    @FindBy(linkText = "Practice Questions")
	    private WebElement practiceQuestionsLink;
	    
	    //@FindBy(xpath = "//a[text()='Try here']")
	    @FindBy(css = "a[href='/tryEditor']")
	    private WebElement tryhereLink;
	    
	    
	  // TRY EDITOR
	    
	    @FindBy(xpath = "//form[@id='answer_form']/div/div/div/textarea")
	    private WebElement codeEditor;
	    
	    public WebElement getCodeEditor() {
	        return codeEditor;
	    }

	  

	    @FindBy(xpath = "//button[text()='Run']")
	    private WebElement runButton;

	    @FindBy(id = "output")
	    private WebElement outputArea;
	    
	    public WebElement getRunButton() {
	        return runButton;
	    }
	
	    // Question Page 
	    
	    @FindBy(xpath = "//*[contains(text(),'Search the array')]")
	    private WebElement searchTheArrayLink;

	    @FindBy(linkText = "Max Consecutive Ones")
	    private WebElement maxConsecutiveOnesLink;

	    @FindBy(linkText = "Find Numbers with Even Number of Digits")
	    private WebElement evenNumberDigitsLink;

	    @FindBy(linkText = "Squares of a Sorted Array")
	    private WebElement squaresOfSortedArrayLink;
	    
	    //QUESTION EDITOR
	    
	    @FindBy(xpath = "//strong[text()='QUESTION']")
	    private WebElement questionText;
	    
	    @FindBy(xpath = "//div[@class='input']//textarea")
	    private WebElement codeEditor1;

	    @FindBy(xpath = "//button[text()='Run']")
	    private WebElement runButton1;

	    @FindBy(xpath = "//input[@value='Submit']")
	    private WebElement submitButton;

	    @FindBy(xpath = "//pre[@id='output']")
	    private WebElement outputConsole;

	    
	    
	    
	    
	 //Actions
	    
	    public void clickDropdown() {
	        dropdownMenu.click();
	    }

	    public void selectArrayFromDropdown() {
	        arrayOption.click();
	    }
	    public void clickGettingStarted() {
	        gettingStartedArrayBtn.click();
	    }
	    
	    public boolean isArrayPageDisplayed() {
	        return arrayPageHeader.isDisplayed(); // Or driver.getTitle().contains("Array")
	    }
	    //public boolean isArrayPageDisplayed() {
	    //return driver.getTitle().contains("Array"); // Adjust the string to match the actual page title
	
	    
	    public boolean isArrayinPythonPageDisplayed() {
	        return arraysInPythonText.isDisplayed(); // Or driver.getTitle().contains("Array")
	    }
	    
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
	    
	    public void scrollToTryHere() {
	        try {
	            ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tryhereLink);
	            System.out.println("Scrolled to Try Here link successfully.");
	        } catch (Exception e) {
	            System.out.println("Failed to scroll to Try Here link: " + e.getMessage());
	        }
	    }
	    public void clickTryhere() {
	    	tryhereLink.click();
	    }
	    
	 // Navigate methods inside ArraysPage
	    
	    public void navigateToArraysPage() {
	        driver.get(ConfigReader.getProperty("arraypageurl"));
	    }

	    public void navigateToArraysInPythonPage() {
	        driver.get(ConfigReader.getProperty("arraysinppython"));
	    }

	    public void navigateToArraysUsingListPage() {
	        driver.get(ConfigReader.getProperty("arraysusinglist"));
	    }

	    public void navigateToBasicOperationsInListPage() {
	        driver.get(ConfigReader.getProperty("basicoperationsinlists"));
	    }

	    public void navigateToApplicationsOfArrayPage() {
	        driver.get(ConfigReader.getProperty("applicationsofarrays"));
	    }
 
	    public void navigateToArraysPracticeQuestions() {
	    	driver.get(ConfigReader.getProperty("arrayspracticequestion"));
	    }
	    	
	   
	    
 // Try Editor Actions 
	    
	    

	    
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
	    
//PRACTICE QUESTIONS PAGE

// Navigate methods inside PracticeQuestionPage
  
  public void navigateToQuestionEditor(String questionName) {
      try {
          WebElement questionLink = driver.findElement(By.linkText(questionName));
          questionLink.click();
      } catch (Exception e) {
          System.out.println("Failed to find or click the question: " + questionName);
          e.printStackTrace();
      }
  }
  
  public void navigateToSearchthearray() {
  	driver.get(ConfigReader.getProperty("Searchthearray"));
  }
  
  public void navigateToMaxConsecutiveOnes() {
  	driver.get(ConfigReader.getProperty("MaxConsecutiveOnes"));
  }
  
  public void navigateToFindnumberswithevennumberofdigits() {
  	driver.get(ConfigReader.getProperty("Findnumberswithevennumberofdigit"));
  }
  
  public void navigateToSquaresofasortedArray() {
  	driver.get(ConfigReader.getProperty("SquaresofasortedArray"));
  }


//Actions 


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





//visiblity methods

public void clickPracticeQuestion(String linkText) {
  WebDriver driver = DriverFactory.getDriver();
  try {
      WebElement link = driver.findElement(By.linkText(linkText));
      link.click();
  } catch (NoSuchElementException e) {
      System.out.println("Link not found: " + linkText);
  } catch (ElementNotInteractableException e) {
      System.out.println("Link not interactable: " + linkText);
  }
}

public boolean isSearchTheArrayLinkVisible() {
  try {
      return searchTheArrayLink.isDisplayed();
  } catch (NoSuchElementException e) {
      return false;
  }
}

public boolean isQuestionDisplayed() {
    try {
        return questionText.isDisplayed();
    } catch (NoSuchElementException e) {
        return false;
    }
}


public boolean isRunButton1Visible() {
  try {
      return runButton1.isDisplayed();
  } catch (NoSuchElementException e) {
      return false;  // Return false if the element is not found
  }
}

public boolean isSubmitButtonVisible() {
  try {
      return submitButton.isDisplayed();
  } catch (NoSuchElementException e) {
      return false;  // Return false if the element is not found
  }
}

//======= Actions =======



public void clearEditor1() {
    codeEditor1.clear();
}


public void enterCode1(String code) {
  codeEditor1.clear();
  codeEditor1.sendKeys(code);
}

public void clickRun() {
  runButton1.click();
}

public void clickSubmit() {
  submitButton.click();
}

public boolean isAlertIsPresent() {
  try {
      driver.switchTo().alert();
      return true;
  } catch (Exception e) {
      return false;
  }
}

public String getAlertText() {
  try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      return alertText;
  } catch (Exception e) {
      return null;
  }
}

public void acceptAlert() {
  try {
      Alert alert = driver.switchTo().alert();
      alert.accept();
  } catch (Exception e) {
      // ignore
  }
}


//==== Handle alert pop-up ====
public String getAlertTextAndAccept() {
try {
   driver.switchTo().alert();
   Alert alert = driver.switchTo().alert();
   String alertText = alert.getText();
   alert.accept();
   return alertText.trim();
} catch (Exception e) {
   throw new RuntimeException("No alert found");
}
}

public void enterpythonCode(String code) {
	 String cleanCode = code.replaceAll("^\"|\"$", "");
	 
    JavascriptExecutor js = (JavascriptExecutor) driver;
    js.executeScript("window.editor.setValue(arguments[0]);", cleanCode);
}

public String getConsoleOutput() {
	try {
        WebElement outputElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(outputConsole));
        return outputElement.getText().trim();
    } catch (Exception e) {
        System.out.println("Console output not found or empty.");
        return "";
    }
}
  
}




//public String getOutput() {
//try {
//return outputConsole.getText().trim();
//} catch (NoSuchElementException e) {
//return "No output displayed";
//}
//}




//public String getSubmissionMessage() {
//  try {
//      WebElement successMessage = driver.findElement(By.xpath("//div[contains(text(),'Submission successful')]"));
//      return successMessage.getText();
//  } catch (NoSuchElementException e) {
//      try {
//          WebElement errorMessage = driver.findElement(By.xpath("//div[contains(text(),'Error occurred during submission')]"));
//          return errorMessage.getText();
//      } catch (NoSuchElementException ex) {
//          return "No message displayed";
//      }
//  }
//}

	    
	    
	    
	  
