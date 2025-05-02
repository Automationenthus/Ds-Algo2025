//
//package stepDefinitions;
//
//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
//import org.junit.Assert;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.interactions.Actions;
//
//import driverFactory.DriverFactory;
//import dsUtilities.ConfigReader;
//import dsUtilities.ExcelReader;
//import io.cucumber.java.en.Given;
//import io.cucumber.java.en.Then;
//import io.cucumber.java.en.When;
//import pageObject.StackPage;
//
//public class StackStep {
//	
//	WebDriver driver = DriverFactory.getDriver();
//	 StackPage stackpage = new StackPage(driver);
//	 private static final Logger logger = LogManager.getLogger(ArraysStep.class);
//	 ExcelReader reader;
//	
//	 @Given("The user is on the Home page")
//	 public void the_user_is_on_the_home_page() {
//		 driver.get(ConfigReader.getProperty("url"));
//		 logger.info("User navigated to Home Page");
//	 }
//	
//
//@When("The user scrolls down to the Data Structures dropdown and selects Stack")
//public void the_user_scrolls_down_to_the_data_structures_dropdown_and_selects_stack() {
//	driver.findElement(By.xpath("//a[text()='Data Structures']")).click();
//
//	// Scroll to the "Data Structures" dropdown using Actions class
//	Actions actions = new Actions(driver);
//	actions.moveToElement(driver.findElement(By.xpath("//a[text()='Data Structures']"))).perform();
//
//	// Click the "Array" option from the dropdown directly after waiting for it to be clickable
//	//driver.findElement(By.xpath("//a[text()='Stack']")).click();
//	stackpage.selectArrayFromDropdown();
// }
//
//
//@Then("User is navigated to Stack Page")
//public void user_is_navigated_to_stack_page() {
//	Assert.assertTrue("Stack page is not displayed.", stackpage.isStackPageDisplayed());
//}
//
//@Given("The user is in the Stack Page")
//public void the_user_is_in_the_stack_page() {
//    stackpage.navigateToStackPage();
//}
//
//@When("The user clicks Operations in stack button")
//public void the_user_clicks_operations_in_stack_button() {
//    stackpage.clickOperationsInStack();
//}
//
//@Then("The user should be redirected to Operations in stack page")
//public void the_user_should_be_redirected_to_operations_in_stack_page() {
//	String pageTitle = DriverFactory.getDriver().getTitle();
//	Assert.assertTrue("User is not on Operations in stack page", pageTitle.contains("Operations in stack"));
//}
//
//@Given("The user is on the Operations in Stack page")
//public void the_user_is_on_the_operations_in_stack_page() {
//	stackpage.navigateToOperationsinStackPage();
//}
//
//@When("The user scrolls down and clicks Try Here button in Operations in Stack page")
//public void the_user_scrolls_down_and_clicks_try_here_button_in_operations_in_stack_page() {
//	stackpage.scrollToTryHere();     // Optional but good to ensure visibility
//	stackpage.clickTryhere();        // Click the link
//}
//
//@Then("The user is redirected to a page having a Stacks try Editor with a Run button to test")
//public void the_user_is_redirected_to_a_page_having_a_stacks_try_editor_with_a_run_button_to_test() {
//	Assert.assertTrue("Run button not visible", stackpage.isRunButtonVisible());
//	 driver.navigate().back();
//}
//
//@Given("The user is in the Stacks tryEditor page")
//public void the_user_is_in_the_stacks_try_editor_page() {
//    stackpage.navigateToStackstryeditorPage();
//}
//
//@When("The user clicks Run button without entering the code in the stacks tryEditor")
//public void the_user_clicks_run_button_without_entering_the_code_in_the_stacks_try_editor() {
//	stackpage.clickRunButton();
//	
//}
//
//@Then("The user is able to see an error message in alert window")
//public void the_user_is_able_to_see_an_error_message_in_alert_window() {
//	String output = stackpage.getEditorOutput();  // Fetches output text
//    if (output == null || output.trim().isEmpty()) {
//        // No feedback — likely a bug
//        throw new AssertionError("Bug: No feedback (error message, alert, or output) shown for empty code.");
//    } else {
//        System.out.println("Output shown: " + output);
//        // Optionally assert it contains an error keyword
//    }
//}
//
//
//@When("The user writes the invalid code from <row number> in stacks tryEditor and clicks the Run Button")
//public void the_user_writes_the_invalid_code_from_row_number_in_stacks_try_editor_and_clicks_the_run_button() {
//	ExcelReader excelreader = new ExcelReader("src/test/resources/testdata/DsAlgo_PracticeuestionCode.xlsx");
//	String raw = excelreader.readAllRows("Pythoncode").get(2).get("Code");
//	String code = raw.replace("\\n", "\n");
//	stackpage.enterCode(code);
//	stackpage.clickRunButton();
//
//	}
//
//@When("The user writes the valid code from <row number> in stacks tryEditor and clicks the Run Button")
//public void the_user_writes_the_valid_code_from_row_number_in_stacks_try_editor_and_clicks_the_run_button() {
//	ExcelReader excelreader = new ExcelReader("src/test/resources/testdata/DsAlgo_PracticeuestionCode.xlsx");
//	String raw = excelreader.readAllRows("Pythoncode").get(3).get("Code");
//	String code = raw.replace("\\n", "\n");
//
//	stackpage.enterCode(code);
//	stackpage.clickRunButton();
//
//	}
//
//@Then("The user is able to see output in the console")
//public void the_user_is_able_to_see_output_in_the_console() {
//	try {
//        String output = stackpage.getEditorOutput();  // get output from the editor
//
//        Assert.assertNotNull("Output is null", output);  // make sure output is not null
//        Assert.assertFalse("Output is empty", output.trim().isEmpty());  // make sure it's not empty
//
//        System.out.println("Output in console: " + output);  // print to console
//
//    } catch (Exception e) {
//        Assert.fail("Something went wrong while getting the output: " + e.getMessage());
//    }
//}
//
//@When("The user clicks Practice Question button in stack")
//public void the_user_clicks_practice_question_button_in_stack() {
//    stackpage.clickPracticeQuestions();
//}
//
////@Then("The user should be redirected to Practice page in stack")
////public void the_user_should_be_redirected_to_practice_page_in_stack() {
////    // Write code here that turns the phrase above into concrete actions
////    throw new io.cucumber.java.PendingException();
////}
//
//@When("The user clicks Implementation button")
//public void the_user_clicks_implementation_button() {
//	stackpage.clickImplementation();
//}
//
//@Then("The user should be redirected to Implementation page")
//public void the_user_should_be_redirected_to_implementation_page() {
//	String pageTitle = DriverFactory.getDriver().getTitle();
//	Assert.assertTrue("User is not on Implementation page", pageTitle.contains("Implementation"));
//
//}
//
//@Given("The user is on the Implementation page")
//public void the_user_is_on_the_implementation_page() {
//    stackpage.navigateToImplementationPage();
//}
//
//@When("The user clicks Try Here button in Implementation page")
//public void the_user_clicks_try_here_button_in_implementation_page() {
//	stackpage.clickTryhere(); 
//}
//
//
//@When("The user clicks Application button")
//public void the_user_clicks_application_button() {
//   stackpage.clickApplications();
//}
//
//@Then("The user should be redirected to Application page")
//public void the_user_should_be_redirected_to_application_page() {
//	String pageTitle = DriverFactory.getDriver().getTitle();
//	Assert.assertTrue("User is not on Applications page", pageTitle.contains("Applications"));
//}
//
//@Given("The user is on the Application page")
//public void the_user_is_on_the_application_page() {
//    stackpage.navigateToApplicationsPage();
//}
//
//@When("The user clicks Try Here button in Application page")
//public void the_user_clicks_try_here_button_in_application_page() {
//	stackpage.clickTryhere(); 
//}
//
//@When("The user clicks Practice Questionb button in stack")
//public void the_user_clicks_practice_questionb_button_in_stack() {
//    stackpage.clickPracticeQuestions();
//}
//
//
//
//}