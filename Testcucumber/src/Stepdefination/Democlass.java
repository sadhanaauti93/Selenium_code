package Stepdefination;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Democlass {
	@Given("^Browser is opned(\\d+)$")
	public void browser_is_opned(int arg1) throws Throwable 
	{
	   	    //throw new PendingException();
	}
	@Given("^Link is opened(\\d+)$")
	public void link_is_opened(int arg1) throws Throwable 
	{
	   	    //throw new PendingException();
	}
	@When("^Enter correct credentials(\\d+)$")
	public void enter_correct_credentials(int arg1) throws Throwable 
	{
	    	    //throw new PendingException();
	}
	@When("^Clicked on submit button(\\d+)$")
	public void clicked_on_submit_button(int arg1) throws Throwable 
	{
	   
	    //throw new PendingException();
	}
	@Then("^Application should be navigated to home page(\\d+)$")
	public void application_should_be_navigated_to_home_page(int arg1) throws Throwable 
	{
	      //throw new PendingException();
	}
	@Then("^Home page is displayed correctly(\\d+)$")
	public void home_page_is_displayed_correctly(int arg1) throws Throwable 
	{
	    	    //throw new PendingException();
	}
}
