package com.cg.projec.Registration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class Registrationpage {
	private WebDriver driver;

	@FindBy(xpath="//a[contains(text(),' Next ')]")
	private WebElement Nextbtm;

	@FindBy(id ="txtFirstName")
	private WebElement WithoutFirstnamemsg;

	@FindBy(id="txtLastName")
	private WebElement lastname;

	@FindBy(id="txtEmail")
	private WebElement Email;

	@FindBy(id="txtPhone")
	private WebElement contactno;

	@FindBy(xpath="//select[contains(@name,'size')]")
	private WebElement noOfpeopleAttnd;

	@FindBy(id="txtAddress1")
	private WebElement Buildingroom;

	@FindBy(id="txtAddress2")
	private WebElement Areaname;

	@FindBy(xpath="//select[contains(@name,'city')]")
	private WebElement City;

	@FindBy(xpath="//select[contains(@name,'state')]")
	private WebElement State;

	@FindBy(xpath="//input[@value='member']")
	private WebElement membershipstatus;
	
	@FindBy(xpath="//h4[contains(text(),'Payment Details')]")
	private WebElement VerifyPaymentpage;
	
	@FindBy(xpath="//input[@value='Register']")
	private WebElement Registerbtm;
	
	@FindBy(id="txtFirstName")
	private WebElement Cardfstname;
	
	@FindBy(id="txtLastName")
	private WebElement cardlastname;
	
	@FindBy(id="txtDebit")
	private WebElement cardno;
	
	@FindBy(id="txtCvv")
	private WebElement cardcvv;
	
	@FindBy(id="txtMonth")
	private WebElement cardmonth;
	
	@FindBy(id="txtYear")
	private WebElement cardyear;

	//=====================================================================

	public String getVerifyPaymentpage() {
		return VerifyPaymentpage.getText();
	}

	public WebElement getCardfstname() {
		return Cardfstname;
	}

	public void setCardfstname(String cardfstname) {
		this.Cardfstname.sendKeys(cardfstname);
	}

	public WebElement getCardlastname() {
		return cardlastname;
	}

	public void setCardlastname(String cardlastname) {
		this.cardlastname.sendKeys(cardlastname);
	}

	public WebElement getCardno() {
		return cardno;
	}

	public void setCardno(String cardno) {
		this.cardno.sendKeys(cardno);
	}

	public WebElement getCardcvv() {
		return cardcvv;
	}

	public void setCardcvv(String cardcvv) {
		this.cardcvv.sendKeys(cardcvv);
	}

	public WebElement getCardmonth() {
		return cardmonth;
	}

	public void setCardmonth(String cardmonth) {
		this.cardmonth.sendKeys(cardmonth);
	}

	public WebElement getCardyear() {
		return cardyear;
	}

	public void setCardyear(String cardyear) {
		this.cardyear.sendKeys(cardyear);
	}

	public void setVerifyPaymentpage(WebElement verifyPaymentpage) {
		VerifyPaymentpage = verifyPaymentpage;
	}

	public WebElement getWithoutFirstnamemsg() {
		return WithoutFirstnamemsg;
	}

	public void setWithoutFirstnamemsg(String withoutFirstnamemsg) {
		this.WithoutFirstnamemsg.sendKeys(withoutFirstnamemsg);;
	}

	public void Clicknxt() {
		this.Nextbtm.click();
	}
	
	public void Clickregister() {
		this.Registerbtm.click();
	}

	public void SetLastname(String lastname) {
		this.lastname.sendKeys(lastname);
	}
	
	public WebElement getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		this.Email.sendKeys(email);
	}

	public WebElement getContactno() {
		return contactno;
	}

	public void setContactno(String contactno) {
		this.contactno.sendKeys(contactno);
	}

	public WebElement getNoOfpeopleAttnd() {
		return noOfpeopleAttnd;
	}

	public void setNoOfpeopleAttnd(String noOfpeopleAttnd1) {
		Select sel=new Select(noOfpeopleAttnd);
		sel.selectByVisibleText(noOfpeopleAttnd1);
	}

	public WebElement getBuildingroom() {
		return Buildingroom;
	}

	public void setBuildingroom(String buildingroom) {
		this.Buildingroom.sendKeys(buildingroom);
	}

	public WebElement getAreaname() {
		return Areaname;
	}

	public void setAreaname(String areaname) {
		this.Areaname.sendKeys(areaname);
	}

	public WebElement getCity() {
		return City;
	}

	public void setCity(String city1) {
		Select sel=new Select(City);
		sel.selectByVisibleText(city1);
	}

	public WebElement getState() {
		return State;
	}

	public void setState(String state1) {
		Select sel=new Select(State);
		sel.selectByVisibleText(state1);
	}

	public WebElement getMembershipstatus() {
		return membershipstatus;
	}

	public void setMembershipstatus() {
		this.membershipstatus.click();
	}
}










