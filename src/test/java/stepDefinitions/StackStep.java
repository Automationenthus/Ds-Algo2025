
package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StackStep {
	
//	@Given("The user is in the Home page after Sign in")
//	public void the_user_is_in_the_home_page_after_sign_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks the Getting Started button in Stack Panel")
//	public void the_user_clicks_the_getting_started_button_in_stack_panel() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user be directed to Stack Data Structure Page")
//	public void the_user_be_directed_to_stack_data_structure_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user select Stack item from the drop down menu\"")
//	public void the_user_select_stack_item_from_the_drop_down_menu() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is in the Stack Page")
//	public void the_user_is_in_the_stack_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Operations in stack button")
//	public void the_user_clicks_operations_in_stack_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be redirected to Operations in stack page")
//	public void the_user_should_be_redirected_to_operations_in_stack_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is on the Operations in Stack page")
//	public void the_user_is_on_the_operations_in_stack_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Try Here button in Operations in Stack page")
//	public void the_user_clicks_try_here_button_in_operations_in_stack_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user is redirected to a page having a try Editor with a Run button to test")
//	public void the_user_is_redirected_to_a_page_having_a_try_editor_with_a_run_button_to_test() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is in the Stacks tryEditor page")
//	public void the_user_is_in_the_stacks_try_editor_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Run button without entering the code in the stacks tryEditor")
//	public void the_user_clicks_run_button_without_entering_the_code_in_the_stacks_try_editor() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user is able to see an error message in alert window")
//	public void the_user_is_able_to_see_an_error_message_in_alert_window() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user writes the invalid code in stacks tryEditor and clicks the Run Button")
//	public void the_user_writes_the_invalid_code_in_stacks_try_editor_and_clicks_the_run_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user writes the valid code in stacks tryEditor and clicks the Run Button")
//	public void the_user_writes_the_valid_code_in_stacks_try_editor_and_clicks_the_run_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user is able to see output in the console")
//	public void the_user_is_able_to_see_output_in_the_console() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Practice Question button in stack")
//	public void the_user_clicks_practice_question_button_in_stack() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be redirected to Practice page in stack")
//	public void the_user_should_be_redirected_to_practice_page_in_stack() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Implementation button")
//	public void the_user_clicks_implementation_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be redirected to Implementation page")
//	public void the_user_should_be_redirected_to_implementation_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is on the Implementation page")
//	public void the_user_is_on_the_implementation_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Try Here button in Implementation page")
//	public void the_user_clicks_try_here_button_in_implementation_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is in the Stack page after Sign in")
//	public void the_user_is_in_the_stack_page_after_sign_in() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Application button")
//	public void the_user_clicks_application_button() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Then("The user should be redirected to Application page")
//	public void the_user_should_be_redirected_to_application_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@Given("The user is on the Application page")
//	public void the_user_is_on_the_application_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Try Here button in Application page")
//	public void the_user_clicks_try_here_button_in_application_page() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}
//
//	@When("The user clicks Practice Questionb button in stack")
//	public void the_user_clicks_practice_questionb_button_in_stack() {
//	    // Write code here that turns the phrase above into concrete actions
//	    throw new io.cucumber.java.PendingException();
//	}





}
