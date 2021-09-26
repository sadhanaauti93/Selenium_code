package Pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WebdriverSelectItem {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\jar_exe_utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rohit/workspace/WebDriverDemonew/sec/main/webapp/SelectItem.html");
		WebElement selectElement = driver.findElement(By.id("Select1"));
		Select select = new Select(selectElement);
		select.selectByVisibleText("Maybe");
	}

}
