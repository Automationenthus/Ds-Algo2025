package pageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TreePF {
	
	WebDriver driver;
	
	public TreePF(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(xpath = "//h5[text()='Tree']/../a[text()='Get Started']")
	WebElement treeGetStart;
	
	@FindBy(xpath = "//div[@class='navbar-nav']/div/a[text()='Data Structures']")
	WebElement dropDown;
	
	@FindBy(xpath = "//div[@class='dropdown-menu show']/a[text()='Tree']")
	WebElement selectTreeItem;
	
	@FindBy(xpath = "//a[@class='list-group-item']")
	List<WebElement>treeTopicLinks;
	
	public void clickOnGetStartBtn() {
		treeGetStart.click();
	}
  
	
	public void clickOnDropdown() {
		
		dropDown.click();
	}
	
	public void selectItemFromDropdown() {
		
		selectTreeItem.click();
	}
	
	public String clickAllLTreeLinks() {
		
		for(WebElement link:treeTopicLinks) {
			
			link.click();
			String actualUrl=driver.getCurrentUrl();
			return actualUrl;
		}
		return null;
	}
}
