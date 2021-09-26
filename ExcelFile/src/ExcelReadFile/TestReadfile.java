package ExcelReadFile;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class TestReadfile 
{
	public void dataread()
	{
		try
		{
			FileInputStream Fs = new FileInputStream("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\testfile.xlsx");
			XSSFWorkbook workbook = new XSSFWorkbook(Fs);
			XSSFSheet objsheet = workbook.getSheetAt(0);  //Value identify   //getSheet --> identify the string
			int rowcount = objsheet.getLastRowNum();  //Find the last row  //Return Type is "Int"	//starting 0

			for(int i = 0; i<=rowcount;i++) 
			{
				XSSFRow row = objsheet.getRow(i);
				int cellcount = row.getLastCellNum();		//Find the last cell  //Return Type is "int"

				for(int j=0; j<cellcount;j++)
				{
					String value = row.getCell(j).getStringCellValue();   //"datatype" IN cell verfiy the data eg.String,int etc 
					System.out.println(value);
				}
			}
			workbook.close();
			Fs.close();
		}
		catch(Exception e)
		{ 
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		TestReadfile  obj = new TestReadfile ();
		obj.dataread();
	}
}

