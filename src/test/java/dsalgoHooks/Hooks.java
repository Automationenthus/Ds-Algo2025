package dsalgoHooks;

import org.openqa.selenium.WebDriver;
import driverFactory.DriverFactory;
import dsUtilities.ConfigReader;
import io.cucumber.java.Before;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;


import java.util.HashSet;
import java.util.Set;

public class Hooks {
    WebDriver driver;

    @Before
    public void setup(Scenario scenario) {
       
    	ConfigReader.initProperties();   // Step 1: Load config
        
        String browser = System.getProperty("browser"); // Step 2: Read from command line

        // Step 3: Fall back to config.properties if not specified
        if (browser == null || browser.isEmpty()) {
            browser = ConfigReader.getProperty("browser");
        }

        // Step 3: Override per scenario with tag-based setup
        Set<String> tags = new HashSet<>(scenario.getSourceTagNames());
        if (tags.contains("@chrome")) {
            browser = "chrome";
        } else if (tags.contains("@firefox")) {
            browser = "firefox";
        } else if (tags.contains("@edge")) {
            browser = "edge";
        } else if (tags.contains("@safari")) {
            browser = "safari";
        }

        // Step 4: Initialize driver with selected browser
        driver = DriverFactory.initDriver(browser); //start driver
        
     // ✅ Step 5: Navigate to URL from config
        String url = ConfigReader.getProperty("url"); 
        if (url == null || url.isEmpty()) {
            throw new RuntimeException("URL not specified in config.properties");
        }
        driver.get(url);
    }

    @After
    public void tearDown() {
        DriverFactory.quitDriver();
    }
}

