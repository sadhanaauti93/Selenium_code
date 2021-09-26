package com.cg.project.utils;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
public class DriverUtils {
	private static Properties properties;	
	static {
		try {
			properties = new Properties();
			properties.load(new FileInputStream(new File(".\\Resources\\Config.properties")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}	
	
	public static WebDriver  getWebDriver(String browserName) {
		if(browserName.equals("chrome")) {
			String driveName = properties.getProperty("chromeDriverName");
			String driverPath= properties.getProperty("chromeDriverPath");
			System.setProperty(driveName,driverPath);
			ChromeOptions chromeOptions = new ChromeOptions();
			//chromeOptions.addArguments("--headless");
			chromeOptions.addArguments("--start-maximized");
			WebDriver driver = new ChromeDriver(chromeOptions);
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			return driver;
		}
		else if(browserName.equals("firefox")) {
			String driveName = properties.getProperty("firefoxDriverName");
			String driverPath= properties.getProperty("firefoxDriverPath");
			System.setProperty(driveName,driverPath);
			WebDriver driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
			return driver;
		}
		return null;
	}
	
	public static Object [] [] getLoginMockData(){
		Object obj[][]=null;	
		
		try(Workbook book=WorkbookFactory.create(new File(properties.getProperty("mockDataFilePath")))){	
			
			Sheet sheet=book.getSheet(properties.getProperty("loginMockData"));
			System.out.println((sheet.getLastRowNum()+1)+"   "+sheet.getRow(0).getLastCellNum());
			
			obj=new Object[sheet.getLastRowNum()+1][sheet.getRow(0).getLastCellNum()];

			for(int i=0;i<=sheet.getLastRowNum();i++)
				for(int j=0;j<sheet.getRow(i).getLastCellNum();j++)
					obj[i][j]=sheet.getRow(i).getCell(j).toString();
		}
		catch (IOException e) {
			e.printStackTrace();
		} catch (EncryptedDocumentException e) {
			e.printStackTrace();
		}
		return obj;	
	}
}