package framework;
import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {
	WebDriver driver;
	String browsername; //String is java defined class
	String applicationlink;
	
	public void  DriverSetting() //DriverSetting
	{
		// Read browser name and link excel
		try 
		{
			FileInputStream Fs = new FileInputStream("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(Fs);
			XSSFSheet objsheet = workbook.getSheet("sheet2");
			XSSFRow row = objsheet.getRow(1);
			browsername = row.getCell(0).getStringCellValue();   	//Value identify//getsheet --> identify the string
			applicationlink = row.getCell(1).getStringCellValue();
			workbook.close();
			Fs.close();
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
		if(browsername.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Chromedriver\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			//Code to open firefox browser
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.MINUTES);
		driver.get(applicationlink);
	}
	public WebElement elementfiner(By objby) {
		WebElement temp = driver.findElement(objby);
		return temp;
	}
}


