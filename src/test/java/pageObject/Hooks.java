package pageObject;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.Before;

public class Hooks {
    public static WebDriver driver;

    @Before
    public void setUp() {
    	System.out.println("Welcome HOOKS");
        driver = DriverFactory.getDriver();
    	System.out.println("After HOOKS");
    }
/*
    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
*/
}

