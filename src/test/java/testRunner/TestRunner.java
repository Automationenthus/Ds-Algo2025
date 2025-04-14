package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"C:\\Workspace\\Ds-Algo2025\\src\\test\\resources"}, // Path to feature files
        glue = {"stepDefinitions"}, // Path to step definition files
        
        plugin={"pretty",
      		  "html:target/report.html",
      		  "json:target/report.json",
      		  "junit:target/report.xml",
      		  "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
      		  "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
      		  //"timeline:test-output-thread/"
      		 }
)
public class TestRunner {
    // This class will run the Cucumber tests
}