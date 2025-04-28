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
	public static WebDriver driver;

	@Before

	public void setUp() {
		ConfigReader.initProperties();
		driver = DriverFactory.initDriver();
		String url = ConfigReader.getProperty("url");
		if (url == null || url.isEmpty()) {
			throw new RuntimeException("URL not specified in config.properties");
		}
		driver.get(url);
	}

	@After
	public void tearDown() {
		DriverFactory.quitDriver(); // Close browser
	}

}
