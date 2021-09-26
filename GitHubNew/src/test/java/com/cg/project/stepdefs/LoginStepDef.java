package com.cg.project.stepdefs;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.cg.project.pagebeans.LoginPageBean;
import com.cg.project.utils.DriverUtil;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class LoginStepDef {
	private WebDriver driver;
	private LoginPageBean pageBean;
	@Before
	public void setUpScenarioEnv() {
		driver = DriverUtil.getDriver();
		pageBean = PageFactory.initElements(driver, LoginPageBean.class);	
	}
	@Given("User is on GitHub login Page")
	public void user_is_on_GitHub_login_Page() {
	   driver.get("https://github.com/login");
	}
	@When("user enter Invalid credential and click submit button")
	public void user_enter_Invalid_credential_and_click_submit_button() {
		pageBean.setLogin("WrongUsername");
		pageBean.setPassword("WrongPassword");
		pageBean.signIn();
	}
	@Then("{string} Message should display")
	public void message_should_display(String string) {
		String expectedErrorMessage= string;
		String actualErrorMessage= pageBean.getErrorMessage();
		Assert.assertEquals(expectedErrorMessage, actualErrorMessage);
		Assert.fail();
	}
	
	@When("user enter valid credential and click submit Button")
	public void user_enter_valid_credential_and_click_submit_Button() {
		pageBean.setLogin("sadhanaauti93");
		pageBean.setPassword("Anterwali@13s");
		pageBean.signIn();
	}
	@Then("user should successfully Sigin on his Github Account")
	public void user_should_successfully_Sigin_on_his_Github_Account() {
		String message=pageBean.getErrorMessage();
		System.out.println("GitHub Screen asing for "+ message);
	}
	
	@After
	public void tearDownScenarioEnv(Scenario scenario) {
		if(scenario.isFailed()) {
			byte [] screenShot= ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
			scenario.embed(screenShot, "image/png", "");
		}
		//driver.close();
		driver= null;
	}
}