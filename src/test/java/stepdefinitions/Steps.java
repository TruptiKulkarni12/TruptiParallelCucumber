package stepdefinitions;


import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {
	
	@Given("^I will login to the application$")
	public void i_will_login_to_the_application() throws Throwable {
	    System.out.println("inside login step");
	    //
	}

	@Given("^check existing users for tranfer$")
	public void check_existing_users_for_tranfer() throws Throwable {
	    System.out.println("inside check existing user for tranfer step");
	    //
	}

	@When("^I select a user$")
	public void i_select_a_user() throws Throwable {
	    System.out.println("inside Select a user step");
	    //
	}
	
	@When("^I select a \"([^\"]*)\"$")
	public void i_select_a(String arg1) throws Throwable {
	    System.out.println("inside Select a user step : " + arg1);
	    //
	}

	@When("^navigate to the transfer page$")
	public void navigate_to_the_transfer_page() throws Throwable {
	    System.out.println("inside navigate to transfer page step");
	    //
	}

	@When("^perform the transfer$")
	public void perform_the_transfer() throws Throwable {
	    System.out.println("inside perform the trasfer step");
	    //
	}
	
	@When("^perform the transfer for \"([^\"]*)\"$")
	public void perform_the_transfer_for(int arg1) throws Throwable {
	    System.out.println("inside perform the trasfer step : "+ arg1);
	    //
	}

	@Then("^I validate the transfer status$")
	public void i_validate_the_transfer_status() throws Throwable {
	    System.out.println("inside validate the transfer step");
	    //
	}

	@Then("^I will validate the balance$")
	public void i_will_validate_the_balance() throws Throwable {
	    System.out.println("inside validate the balance step");
	    //
	}

	@Given("^check existing name(\\d+) for tranfer$")
	public void check_existing_name_for_tranfer(int arg1) throws Throwable {
		System.out.println("inside check existing name step");	    
		//
	}


	@Then("^I validate the transfer success$")
	public void i_validate_the_transfer_success() throws Throwable {
	    System.out.println("inside validate transfer success step");
	    //
	}

}

