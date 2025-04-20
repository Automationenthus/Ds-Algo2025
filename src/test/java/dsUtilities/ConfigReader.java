package dsUtilities;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {

	private static Properties properties = new Properties();

	static {

		try {
			InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("Config/config.properties");
			properties.load(input);
		} catch (IOException e) {
			throw new RuntimeException("Failed to load config file", e);
		}
	}

	public static String getBrowser() {
		return properties.getProperty("browser");
	}

	public static String getUrl() {
		return properties.getProperty("baseurl");
	}
}
