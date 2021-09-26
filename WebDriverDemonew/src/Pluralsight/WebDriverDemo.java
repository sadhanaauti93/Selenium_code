package Pluralsight;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.URL;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverDemo {

	private static final TimeUnit Seconds = null;
	private static long Times;

	public static void main(String[] args){//throws Exception {
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\Rohit\\Downloads\\geckodriver.exe");
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Rohit\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","D:\\jar_exe_utility\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//WebDriver driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),
				//new DesiredCapabilities(Firefox :VISTA());//chrome());  		//Combination of HUB and NODE
		driver.get("http://www.google.com");
		
		WebElement serchField = driver.findElement(By.xpath("/html/body/div[2]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));				//("lst-ib")
		serchField.sendKeys("pluralsight");
		serchField.submit();
		
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText("Images")));
		
		WebElement imagesLink = driver.findElements(By.linkText("Images")).get(0);
		imagesLink.click();
		
		WebElement imageElement = driver.findElement(By.cssSelector("a[class = rg_l"));
		WebElement imageLink = imageElement.findElements(By.tagName("img")).get(0);
		imageLink.click();
		
		
	}
}


	







