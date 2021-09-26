package FrameworkNew;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UtilityNew {
	WebDriver driver;
	String browsername;
	String Applicationlink;
	public void driversetting() {
	try
	{
	FileInputStream Fs = new FileInputStream("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx");
	XSSFWorkbook workbook = new XSSFWorkbook(Fs);
	XSSFSheet objsheet = workbook.getSheet("sheet2");
	XSSFRow row = objsheet.getRow(1);
	browsername = row.getCell(0).getStringCellValue();
	Applicationlink = row.getCell(1).getStringCellValue();
	workbook.close();
	Fs.close();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	if(browsername.equalsIgnoreCase("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else if(browsername.equalsIgnoreCase("firefox"))
	{
		//
	}
	    driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get(Applicationlink);
	}
	public WebElement finderpath(By objby1) {
		WebElement temp = driver.findElement(objby1);
		return temp;
	}
}
