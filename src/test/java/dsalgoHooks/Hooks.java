package dsalgoHooks;

import org.openqa.selenium.WebDriver;

import driverFactory.DriverFactory;
import io.cucumber.java.Before;

public class Hooks {
	public static WebDriver driver;

	@Before
	public void setUp() {
		driver = DriverFactory.getDriver();
	}
	/*
	 * @After public void tearDown() { DriverFactory.quitDriver(); }
	 */
}
