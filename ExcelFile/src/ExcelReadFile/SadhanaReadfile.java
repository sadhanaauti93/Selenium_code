package ExcelReadFile;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class SadhanaReadfile {
	public void exceldatanew(){
		try {
		FileInputStream Fs = new FileInputStream("C:\\Users\\SADGHADG\\OneDrive - Capgemini\\Documents\\Selenium\\Setup\\Apachepoi\\Testexcel\\excelfile.xlsx"); 	
		XSSFWorkbook workbook = new XSSFWorkbook(Fs);
		XSSFSheet objsheet = workbook.getSheetAt(0);
		int rowcount = objsheet.getLastRowNum();

			for(int a=0; a<=rowcount; a++) {
				XSSFRow row = objsheet.getRow(a);
				int cellcount = row.getLastCellNum();
				
				for(int b=0; b<cellcount; b++) {
					String value = row.getCell(b).getStringCellValue();  
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
	SadhanaReadfile objt = new SadhanaReadfile();
	objt.exceldatanew();
	}
}
