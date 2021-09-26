package com.cg.project.utils;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class DriverUtil {
	public static WebDriver getDriver() {
	//1st Step
	System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\chromedriver.exe");
	//C:\Users\SADGHADG\OneDrive - Capgemini\Documents\chromedriver.exe
	WebDriver driver =new ChromeDriver() ;
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	return driver;
	
	}
}
