package TestNg;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.Test;

public class A7_ExcelDataFinding3 {
	@Test
	public void f() {

		try {
			FileInputStream fileInputStream = new FileInputStream("C:\\Sudhahar\\Selenium2015\\Z_SeleniumUsedExcel\\ExcelFindData1.xls");
			HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
			HSSFSheet ws = workbook.getSheetAt(0);

			Row row=ws.getRow(0);
			String name=row.getCell(0).getStringCellValue();
			System.out.println(name);

			Row row1=ws.getRow(1);
			String name1=row.getCell(1).getStringCellValue();
			System.out.println(name1);
			
			Row row2=ws.getRow(1);
			String name2=row.getCell(2).getStringCellValue();
			System.out.println(name2);
			

		}
		catch(Exception e) 
		{
			System.out.println("Not executed");
		}

	}
}
