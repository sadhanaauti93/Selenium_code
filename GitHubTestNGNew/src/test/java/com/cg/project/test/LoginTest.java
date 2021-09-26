package com.cg.project.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import com.cg.project.pagebeans.LoginPageBean;
import com.cg.project.utils.DriverUtils;

public class LoginTest {
	
	private WebDriver driver;
	private LoginPageBean pageBean;

	@Parameters(value = {"browserName"})
	@BeforeMethod
	public void setUpTestEnv(String browserName) {
		driver = DriverUtils.getWebDriver(browserName);
		driver.get("https://github.com/login");
		pageBean=PageFactory.initElements(driver, LoginPageBean.class);
	}
	
	@Test(dataProvider = "loginMockDataProvider")
	public void testLoginFeatureForInvalidcredential(String userName , String password) {
		pageBean.setLogin(userName);
		pageBean.setPassword(password);
		pageBean.signIn();
		String expectedError="Incorrect username or password.";
		Assert.assertEquals(expectedError	, pageBean.getErrorMessage());
	}
	
	@AfterMethod
	public void  tearDownTestEnv() {
		driver.quit(); 
		driver=null;
	}
	
	@DataProvider
	public Object[] [] loginMockDataProvider(){
		return DriverUtils.getLoginMockData();
	}

}