package testRunner;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

	


	@RunWith(Cucumber.class)
	@CucumberOptions(
	    features = {"src/test/resources/Feature/Home.feature",
	     "src/test/resources/Feature/login.feature"},
	    glue = {"stepDefinitions","dsalgoHooks"},
	    plugin = {"pretty", "html:target/report.html"},
	    monochrome = true
	)
	public class DsalgoRunner  {
	}


