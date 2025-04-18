package dsUtilities;

import io.cucumber.java.Before;
import dsUtilities.ConfigReader;
import dsUtilities.DriverFactory;
import io.cucumber.java.After;
import org.openqa.selenium.WebDriver;

public class Hooks {
    WebDriver driver;

    @Before
    public void setUp() {
        ConfigReader.initProperties(); // Read the config
        driver = DriverFactory.initDriver(); // Start browser
		/*
		 * String url = ConfigReader.getProperty("url"); if (url == null) { throw new
		 * RuntimeException("URL is missing in config.properties"); } driver.get(url);
		 */
        driver.get(ConfigReader.getProperty("url")); // Open DSAlgo URL
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver(); // Close browser
    }
}