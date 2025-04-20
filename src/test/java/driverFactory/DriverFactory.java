package driverFactory;

import dsUtilities.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();

	public static WebDriver getDriver() {
		if (driver.get() == null) {
			createDriver();
		}
		return driver.get();
	}

	private static void createDriver() {
		String browser = ConfigReader.getBrowser();
		switch (browser.toLowerCase()) {
		case "chrome":
			driver.set(new ChromeDriver());
			break;
		default:
			throw new IllegalArgumentException("Unsupported browser: " + browser);
		}
	}

	public void quitDriver() {
		if (driver.get() != null) {
			driver.get().quit();
			driver.remove();
		}
	}
}
