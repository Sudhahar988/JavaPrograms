package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;

public class Driver extends A4_ExcelValueValidation_ProfilenameJXL{
		WebDriver driver;
		WebElement username,password,login;
		String nameval;
		HSSFWorkbook Wb;
		HSSFSheet Ws;
		Row rows;
	
	@DataProvider()
	public Object[][] getData() throws IOException, InterruptedException
	{		
		File file=new File("C:\\Sudhahar\\Selenium2015\\Z_SeleniumUsedExcel\\ExcelInput1.xls");
		FileInputStream fi=new FileInputStream(file);
		Wb=new HSSFWorkbook(fi);
		Ws=Wb.getSheetAt(0);
		int rowcount=Ws.getLastRowNum();
		
		Object[][] data=new Object[rowcount][3];
		for(int row=1;row<=rowcount;row++)
		{
			rows=Ws.getRow(row);
			// 1st row
			data[row-1][0]=rows.getCell(0).getStringCellValue();
			data[row-1][1]=rows.getCell(1).getStringCellValue();
			data[row-1][2]=rows.getCell(2).getStringCellValue();

		}
		return data;

	}

}
