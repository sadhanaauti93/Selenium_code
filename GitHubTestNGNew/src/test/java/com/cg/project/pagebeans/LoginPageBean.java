package com.cg.project.pagebeans;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
public class LoginPageBean {
	
	@FindBy(how = How.NAME,name = "login")
	private WebElement login;

	@FindBy(how = How.NAME,name = "password")
	private WebElement password;

	@FindBy (how = How.NAME , name="commit")
	private WebElement commit;

	@FindBy(how =How.XPATH,xpath = "/html/body/div[3]/main/div/div[2]/div/div")
	private WebElement errorMessage ;

	public String getLogin() {
		return login.getText();
	}

	public void setLogin(String login) {
		this.login.sendKeys(login);
	}

	public String getPassword() {
		return password.getText();
	}

	public void setPassword(String password) {
		this.password.sendKeys(password);;
	}
	public String getErrorMessage() {
		return errorMessage.getText();
	}
	public void signIn() {
		this.commit.submit();
	}
}