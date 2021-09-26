package Pluralsight;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverRadioButton {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\jar_exe_utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rohit/workspace/WebDriverDemonew/sec/main/webapp/RadioButtonTest.html");
		
		List<WebElement> radioButtons = driver.findElements(By.name("color"));
		radioButtons.get(0).click();    //0,1,2
		
		for(WebElement radioButton : radioButtons){
			if(radioButton.isSelected()){
				System.out.println(radioButton.getAttribute("value"));
			}
		}
	}
}