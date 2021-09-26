package Pluralsight;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDrivercheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\jar_exe_utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rohit/workspace/WebDriverDemonew/sec/main/webapp/Checkbox.html");
		WebElement checkbox = driver.findElement(By.id("lettuceCheckbox"));
		checkbox.click();  
		checkbox.click(); 
	}
}
