package testRunner;

//import org.junit.runner.RunWith;
import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
	
//@RunWith(Cucumber.class) //Junit execution

		@CucumberOptions(
				plugin = {"pretty", "html:target/arc.html"}, //reporting purpose
				monochrome=false,  //console output color
				//tags from feature file
				features = {"src/test/resources/feature"}, //location of feature files
				glue={"stepDefinitions","dsUtilities"} )//location of step definition files


		public class DsalgoRunner extends AbstractTestNGCucumberTests{
			
			@Override
		    @DataProvider(parallel = false)
		    public Object[][] scenarios() {
						
				return super.scenarios();
		    }

}


