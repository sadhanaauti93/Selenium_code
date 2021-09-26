package Pluralsight;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverTable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\jar_exe_utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/Rohit/workspace/WebDriverDemonew/sec/main/webapp/Table.html");
		/*WebElement outertable = driver.findElement(By.tagName("table"));
		WebElement innertable = driver.findElement(By.tagName("table"));
		WebElement row = innertable.findElements(By.tagName("td")).get(0);
		System.out.println(row.getText());*/
		WebElement row = driver.findElement(By.xpath("/html/body/table/tbody/tr/td[2]/table/tbody/tr[2]/td"));
		System.out.println(row.getText());
	}
}
