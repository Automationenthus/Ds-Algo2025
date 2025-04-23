package stepDefinitions;

/*import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;*/

public class LinkedList {
	/*
	@Given("The user is on Home page after logged in")
	public void the_user_is_on_home_page_after_logged_in() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks the Get Started button of LinkedList")
	public void the_user_clicks_the_get_started_button_of_linked_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on LinkedList page of dsportalapp")
	public void the_user_should_land_on_linked_list_page_of_dsportalapp() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user select LinkedList item from the drop down menu")
	public void the_user_select_linked_list_item_from_the_drop_down_menu() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on LinkedList page")
	public void the_user_is_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user lands on LinkedList page")
	public void the_user_lands_on_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be able to view username and Sign out button on top of the page")
	public void the_user_should_be_able_to_view_username_and_sign_out_button_on_top_of_the_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be able to view NumpyNinja, DataStructures dropdown and able to perform actions on that")
	public void the_user_should_be_able_to_view_numpy_ninja_data_structures_dropdown_and_able_to_perform_actions_on_that() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on Introduction page")
	public void the_user_is_on_introduction_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on Introduction link")
	public void the_user_clicks_on_introduction_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on Introduction")
	public void the_user_should_land_on_introduction() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("user is on Introduction page Of LinkedList")
	public void user_is_on_introduction_page_of_linked_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("user clicks on Practice Questions link")
	public void user_clicks_on_practice_questions_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should land on practice page")
	public void user_should_land_on_practice_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on tryEditor link")
	public void the_user_clicks_on_try_editor_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on to tryEditor page of Introduction and should see Run button")
	public void the_user_should_land_on_to_try_editor_page_of_introduction_and_should_see_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page of Introduction page")
	public void the_user_is_on_try_editor_page_of_introduction_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on run button by writing incorrect python code")
	public void the_user_clicks_on_run_button_by_writing_incorrect_python_code() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should see the error message in alert window along with line number")
	public void the_user_should_see_the_error_message_in_alert_window_along_with_line_number() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on run button without writing code in editor")
	public void the_user_clicks_on_run_button_without_writing_code_in_editor() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should see the error message in alert window")
	public void the_user_should_see_the_error_message_in_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page with alert window open of Introduction page")
	public void the_user_is_on_try_editor_page_with_alert_window_open_of_introduction_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user did not clicks on ok button on alert window")
	public void the_user_did_not_clicks_on_ok_button_on_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should not able to perform any other operation on page")
	public void the_user_should_not_able_to_perform_any_other_operation_on_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on ok button on alert window")
	public void the_user_clicks_on_ok_button_on_alert_window() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should be able to edit code on editor and perform other operations as well")
	public void the_user_should_be_able_to_edit_code_on_editor_and_perform_other_operations_as_well() {
	   
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is in the tryEditor page")
	public void the_user_is_in_the_try_editor_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user write the valid code in Editor and click the Run button")
	public void the_user_write_the_valid_code_in_editor_and_click_the_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should able to see output in the console")
	public void the_user_should_able_to_see_output_in_the_console() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on Creating Linked LIst page")
	public void the_user_is_on_creating_linked_l_ist_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on Creating Linked LIst link")
	public void the_user_clicks_on_creating_linked_l_ist_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on Creating Linked LIst")
	public void the_user_should_land_on_creating_linked_l_ist() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on to tryEditor page of Creating Linked LIst and should see Run button")
	public void the_user_should_land_on_to_try_editor_page_of_creating_linked_l_ist_and_should_see_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page of Creating Linked LIst page")
	public void the_user_is_on_try_editor_page_of_creating_linked_l_ist_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page with alert window open of Creating Linked LIst page")
	public void the_user_is_on_try_editor_page_with_alert_window_open_of_creating_linked_l_ist_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on Types of Linked List page")
	public void the_user_is_on_types_of_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on Types of Linked List link")
	public void the_user_clicks_on_types_of_linked_list_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on Types of Linked List")
	public void the_user_should_land_on_types_of_linked_list() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on to tryEditor page of Types of Linked List and should see Run button")
	public void the_user_should_land_on_to_try_editor_page_of_types_of_linked_list_and_should_see_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page of Types of Linked List page")
	public void the_user_is_on_try_editor_page_of_types_of_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page with alert window open of Types of Linked List page")
	public void the_user_is_on_try_editor_page_with_alert_window_open_of_types_of_linked_list_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on Implement Linked List in Python page")
	public void the_user_is_on_implement_linked_list_in_python_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on Implement Linked List in Python link")
	public void the_user_clicks_on_implement_linked_list_in_python_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on Implement Linked List in Python")
	public void the_user_should_land_on_implement_linked_list_in_python() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on to tryEditor page of Implement Linked List in Python and should see Run button")
	public void the_user_should_land_on_to_try_editor_page_of_implement_linked_list_in_python_and_should_see_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page of Implement Linked List in Python page")
	public void the_user_is_on_try_editor_page_of_implement_linked_list_in_python_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on run button by writing incorrect pyhton code")
	public void the_user_clicks_on_run_button_by_writing_incorrect_pyhton_code() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page with alert window open of Implement Linked List in Python page")
	public void the_user_is_on_try_editor_page_with_alert_window_open_of_implement_linked_list_in_python_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on Traversal page")
	public void the_user_is_on_traversal_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on Traversal link")
	public void the_user_clicks_on_traversal_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on Traversal")
	public void the_user_should_land_on_traversal() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on to tryEditor page of Traversal and should see Run button")
	public void the_user_should_land_on_to_try_editor_page_of_traversal_and_should_see_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page of Traversal page")
	public void the_user_is_on_try_editor_page_of_traversal_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page with alert window open of Traversal page")
	public void the_user_is_on_try_editor_page_with_alert_window_open_of_traversal_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on Insertion page")
	public void the_user_is_on_insertion_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on Insertion link")
	public void the_user_clicks_on_insertion_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on Insertion")
	public void the_user_should_land_on_insertion() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on to tryEditor page of Insertion and should see Run button")
	public void the_user_should_land_on_to_try_editor_page_of_insertion_and_should_see_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page of Insertion page")
	public void the_user_is_on_try_editor_page_of_insertion_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page with alert window open of Insertion page")
	public void the_user_is_on_try_editor_page_with_alert_window_open_of_insertion_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on Deletion page")
	public void the_user_is_on_deletion_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on Deletion link")
	public void the_user_clicks_on_deletion_link() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on Deletion")
	public void the_user_should_land_on_deletion() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("The user should land on to tryEditor page of Deletion and should see Run button")
	public void the_user_should_land_on_to_try_editor_page_of_deletion_and_should_see_run_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page of Deletion page")
	public void the_user_is_on_try_editor_page_of_deletion_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Given("The user is on tryEditor page with alert window open of Deletion page")
	public void the_user_is_on_try_editor_page_with_alert_window_open_of_deletion_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("The user clicks on Sign out button")
	public void the_user_clicks_on_sign_out_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("user should be navigate back to Home page and Logged out successfully message should be displayed on home page")
	public void user_should_be_navigate_back_to_home_page_and_logged_out_successfully_message_should_be_displayed_on_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

*/

}

