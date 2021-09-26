package Stepdefination;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Testclass {
	@Given("^Browser is opned$")
	public void Driversetting()
	{
		System.out.println("Methos 1");
	}
	@When("^Enter correct credentials$")
	public void navigate()
	{
		System.out.println("Methos 2");
	}
	@Then("^Application should be navigated to home page$")
	public void Verfication()
	{
		System.out.println("Methos 3");
	}
}
