package TestNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.JXLException;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;

import org.testng.annotations.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class A4_ExcelValueValidation_ProfilenameJXL {
  
	static Workbook Wb;
	static Sheet Ws;
	
	@DataProvider(name="login")
	public static Object[][] loginData()throws IOException, JXLException {
		Object[][] arrayObject = getExcelData("C:\\Users\\jsudhahar.WSDOMAINS\\Desktop\\Today\\SETCTEST.xls","Sheet1");
		return arrayObject;
	}

	private static String[][] getExcelData(String filename,String sheetName) throws IOException, JXLException 
	{
		String[][] arrayval=null;
		FileInputStream file=new FileInputStream(filename);

		Wb = Workbook.getWorkbook(file);
		Ws = Wb.getSheet(sheetName);

		int totalNoOfRows = Ws.getRows();
		int totalNoOfCols = Ws.getColumns();

		arrayval=new String[totalNoOfRows-1][totalNoOfCols];

		for (int i=1;i<totalNoOfRows;i++) {

			for (int j=0; j<totalNoOfCols;j++) {
				arrayval[i-1][j] = Ws.getCell(j, i).getContents();
			}
		}

		return arrayval;
	}
		
	
			
			
		
		
		
		/*FileInputStream file=new FileInputStream(filename);
		Wb = Workbook.getWorkbook(file);
		Ws = Wb.getSheet(sheetName);
		int totalNoOfRows = Ws.getRows();
		int totalNoOfCols = Ws.getColumns();

		arrayval=new String[totalNoOfRows-1][totalNoOfCols];

		for (int i=1;i<totalNoOfRows;i++) {

			for (int j=0; j<totalNoOfCols;j++) {
				arrayval[i-1][j] = Ws.getCell(j, i).getContents();
			}*/
		


	@Test
  public void f() throws IOException {
		
		
		
		
  }
}
