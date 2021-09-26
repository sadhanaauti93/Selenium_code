package com.cg.project.stepdefs;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.cg.project.utils.DriverUtil;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class GoogleSearchStepDef {
	private WebDriver driver;
	@Before
	public void setUpScenarionEnv() {
		driver = DriverUtil.getDriver();
	}
	
	@Given("User should open Giigle Home Page")
    public void user_should_open_Giigle_Home_Page() {
        //throw new io.cucumber.java.PendingException();
		driver.get("http://www.google.co.in");
    }
	@When("User entered {string} in search box And click on submit button")
    public void user_entered_in_search_box_And_click_on_submit_button(String string) {
        //throw new io.cucumber.java.PendingException();
		 WebElement  searchElement = driver.findElement(By.name("q"));
		 WebElement submitBtn = driver.findElement(By.name("btnK"));
		 searchElement.sendKeys(string);
		 submitBtn.submit();
    }
	@Then("Multiple Links should be displayed on {string} topic")
    public void multiple_Links_should_be_displayed_on_topic(String string) {
        //throw new io.cucumber.java.PendingException();
		 String expectedTitle = string +" - Google Search";
		 String actualTitle = driver.getTitle();
		 Assert.assertEquals(expectedTitle, actualTitle);
	
    }
    @Given("User should open Google Home Page")
    public void user_should_open_Google_Home_Page() {
        //throw new io.cucumber.java.PendingException();
    }
    @When("User entered {string} in search box")
    public void user_entered_in_search_box(String string) {
        //throw new io.cucumber.java.PendingException();
    }
    @When("click on submit button")
    public void click_on_submit_button() {
        //throw new io.cucumber.java.PendingException();
    }
    @Then("google should display map between {string} and also display the distance in KM")
    public void google_should_display_map_between_and_also_display_the_distance_in_KM(String string) {
        //throw new io.cucumber.java.PendingException();
        
    }@Given("User should open Google translator page")
    public void user_should_open_Google_translator_page() {
        //throw new io.cucumber.java.PendingException();
    }
    @When("User entered {string} into {string} language and select {string} language")
    public void user_entered_into_language_and_select_language(String string, String string2, String string3) {
        //throw new io.cucumber.java.PendingException();
    }
    @Then("Google translator should display {string} into {string} language")
    public void google_translator_should_display_into_language(String string, String string2) {
        //throw new io.cucumber.java.PendingException();
    }
    @After
	public void tearDownSecnarionEnv() {
			driver.quit();
			driver = null;
    }
}

