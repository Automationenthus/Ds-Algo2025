package testRunner;


//import org.junit.runner.RunWith;
//import org.junit.runner.RunWith;


import org.junit.runner.RunWith;

import org.testng.annotations.DataProvider;
//import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class) //Junit execution

@CucumberOptions(
	    plugin = {
	        "pretty", 
	        "html:target/CucumberReport/TestResult.html",
	        "json:target/CucumberReport/TestResult.json", 
	        "io.qameta.allure.cucumber7jvm.AllureCucumber7Jvm",
	        "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
	    }, 
	    monochrome = false,
	    features = { "src/test/resources/Feature/" },
	    glue = { "stepDefinitions", "dsalgoHooks" }
	)
	public class DsalgoRunner extends AbstractTestNGCucumberTests {
	    @Override
	    @DataProvider(parallel = false)
	    public Object[][] scenarios() {
	        return super.scenarios();
	    }
	}

