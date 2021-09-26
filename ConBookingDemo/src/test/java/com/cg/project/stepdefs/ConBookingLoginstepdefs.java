package com.cg.project.stepdefs;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import com.cg.projec.Registration.Registrationpage;
import com.cg.project.utils.Driverutils;
import com.cg.project.utils.Driverutils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ConBookingLoginstepdefs {
	private WebDriver driver;	
	private Registrationpage regpage;
	@Before
	public void setupsenarion() {
		driver = Driverutils.getDriver();  //driver1 = ConBookinDriverutils.getDriver();
		regpage = PageFactory.initElements(driver, Registrationpage.class);
	}
	@Before
	@Given("Launch the application browser")
	public void launch_the_application_browser() {
		driver=Driverutils.getDriver();
		regpage=PageFactory.initElements(driver, Registrationpage.class);
	}
	@When("Open the web page ConferenceRegistartion.html in the browser.")
	public void open_the_web_page_ConferenceRegistartion_html_in_the_browser() {
		driver.get("file://C://Users//admin//Desktop//ConferenceRegistartion.html");
	}
	@Then("Verify the title {string} of the page.")
	public void verify_the_title_of_the_page(String string) {
		String acttitlemsg=driver.getTitle();
		String exptitlemsg=string;
		Assert.assertEquals(acttitlemsg, exptitlemsg);
		System.out.println("Sucessfully displayed Page: "+ acttitlemsg);
	}
	@Then("Click on Next without First Name")
	public void click_on_Next_without_First_Name() {
		regpage.Clicknxt();
	}
	@Then("Verify that the message {string}")
	public void verify_that_the_message(String string) throws Throwable  {
		try {
		String expmsg=string;
		System.out.println(string);	
		Alert alt=driver.switchTo().alert();
		String msg=alt.getText();
 		Thread.sleep(1000);
	
		Assert.assertEquals(expmsg,msg);
		System.out.println("Pass Assertion==> " + msg);
		Thread.sleep(1000);
		alt.accept();
		}catch (NoAlertPresentException e) {
			e.getMessage();
		}
	}
	@Then("Enter First Name")
	public void enter_First_Name() {
		regpage.setWithoutFirstnamemsg("Auti");
	}
	@Then("Click on Next without Last Name")
	public void click_on_Next_without_Last_Name() {
		regpage.Clicknxt();
	}
	@Then("Enter Last Name")
	public void enter_Last_Name() {
		regpage.SetLastname("Sadhana");
	}
	@Then("Click on without Email")
	public void click_on_without_Email() {
		regpage.Clicknxt();
	}
	@Then("Enter Email")
	public void enter_Email() {
		regpage.setEmail("sadhanaauti93@gmail.com");
	}
	@Then("Click next without Contact number")
	public void click_next_without_Contact_number() {
		regpage.Clicknxt();
	}
 	@Then("Click on Next with Invalid Contact number")
	public void click_on_Next_with_Invalid_Contact_number() throws Throwable {
		//regpage.setContactno("000");
		//regpage.Clicknxt();
		System.out.println("Invalid number");
		}
	@Then("Enter Valid Contact number")
	public void enter_Valid_Contact_number() {
		regpage.setContactno("9158376359");
	}
	@Then("Click on Next without Number of people attending")
	public void click_on_Next_without_Number_of_people_attending() {
		regpage.Clicknxt();
	}
	@Then("Select Number of people attending")
	public void select_Number_of_people_attending() {
		regpage.setNoOfpeopleAttnd("4");
	}
	@Then("Click on Next without Building Name & Room No")
	public void click_on_Next_without_Building_Name_Room_No() {
		regpage.Clicknxt();
	}
	@Then("Enter Building Name & Room No")
	public void enter_Building_Name_Room_No() {
     	regpage.setBuildingroom("Capgemini");
	}
	@Then("Click on Next without Area name")
	public void click_on_Next_without_Area_name() {
		regpage.Clicknxt();
	}
	@Then("Enter Area name")
	public void enter_Area_name() {
		regpage.setAreaname("Pune");
	}
	@Then("Click on Next with Select City")
	public void click_on_Next_with_Select_City() {
		regpage.Clicknxt();
	}
	@Then("Select City")
	public void select_City() {
		regpage.setCity("Pune");
	}
	@Then("Click without State")
	public void click_without_State() {
		regpage.Clicknxt();
	}
	@Then("Select State")
	public void select_State() {
		regpage.setState("Maharashtra");
	}
	@Then("Click Next without full-Access\\(member) or Select Conference full-Access\\(non-member)")
	public void click_Next_without_full_Access_member_or_Select_Conference_full_Access_non_member() {
		regpage.Clicknxt();
	}
	@Then("Select Conference full-Access\\(member) or Select Conference full-Access\\(non-member)")
	public void select_Conference_full_Access_member_or_Select_Conference_full_Access_non_member() {
		regpage.setMembershipstatus();
	}
	@Then("Click on the link Next")
	public void click_on_the_link_Next() throws Throwable {
		Thread.sleep(2000);
		regpage.Clicknxt();
	}
		@Then("Verify that you are then navigated to next page PaymentDetails.html")
	public void verify_that_you_are_then_navigated_to_next_page_PaymentDetails_html() {	
	String Expurl="file:///C:/Users/admin/Desktop/PaymentDetails.html";	
	String acturl=driver.getCurrentUrl();
	Assert.assertEquals(Expurl, acturl);
	System.out.println("Navigate to next page sucsessfully==> "+acturl);
	}
	@Then("Verify the title {string} of the page")	public void verify_the_title_of_the_page1(String string) {
		String acttitlemsg=driver.getTitle();
		String exptitlemsg=string;
		Assert.assertEquals(acttitlemsg, exptitlemsg);
		System.out.println("Sucessfully Displayed Page: "+ acttitlemsg);
	}
	@Then("Click on the Make Payment without Card Holder Name")
	public void click_on_the_Make_Payment_without_Card_Holder_Name() {
		regpage.Clickregister();
	}
	@Then("Enter Card Holder Name")
	public void enter_Card_Holder_Name() {
		regpage.setCardfstname("Auti");
	}
		@Then("Click on the Make Payment without Card Holder LastName")
	public void click_on_the_Make_Payment_without_Card_Holder_LastName() {
	    regpage.Clickregister();
	}
	@Then("Enter Card Holder LastName")
	public void enter_Card_Holder_LastName() {
        regpage.SetLastname("Sadhana");
	}
	@Then("Click on the Make Payment without Card Number")
	public void click_on_the_Make_Payment_without_Card_Number() {
		regpage.Clickregister();
	}
	@Then("Enter Debit card Number")
	public void enter_Debit_card_Number() {
		regpage.setCardno("56732387");
	}
		@Then("Click on the Make Payment without Cvv Number")
	public void click_on_the_Make_Payment_without_Cvv_Number() {
        regpage.Clickregister();
	}
	@Then("Enter Cvv Number")
	public void enter_Cvv_Number() {
        regpage.setCardcvv("042");
	}
	@Then("Click on the Make Payment without Card expiration month")
	public void click_on_the_Make_Payment_without_Card_expiration_month() {
		regpage.Clickregister();
	}
	@Then("Enter Card expiration month")
	public void enter_Card_expiration_month() {
		regpage.setCardmonth("11");
	}
	@Then("Click on the Make Payment without Card expiration year")
	public void click_on_the_Make_Payment_without_Card_expiration_year() {
		regpage.Clickregister();
	}
	@Then("Enter Card expiration year")
	public void enter_Card_expiration_year() {
		regpage.setCardyear("27");
	}
	@Then("Click on Make Payment button")
	public void click_on_Make_Payment_button() {
		regpage.Clickregister();
	}
	@Then("Verify that the alert box displays the message {string}")
	public void verify_that_the_alert_box_displays_the_message(String string) throws Throwable {
		try {
			String expmsg=string;
			System.out.println(string);	
			Alert alt=driver.switchTo().alert();
			String msg=alt.getText();
	 		Thread.sleep(1000);
		
			Assert.assertEquals(expmsg,msg);
			System.out.println("Pass Assertion==> " + msg);
			Thread.sleep(1000);
			alt.accept();
			}catch (NoAlertPresentException e) {
				e.getMessage();
			}
	}
		@After
	public void tearDown() {
		driver.quit();
		driver=null;	
	}	
}
