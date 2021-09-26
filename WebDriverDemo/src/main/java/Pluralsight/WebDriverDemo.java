package Pluralsight;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Rohit\\Downloads\\geckodriver-v0.29.1-win32.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://www.pluralsight.com");
	}
}
