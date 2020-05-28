package TestNg;

import org.testng.annotations.Test;

	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.IOException;
	import java.util.Date;

	import org.apache.poi.hssf.usermodel.HSSFCell;
	import org.apache.poi.hssf.usermodel.HSSFRow;
	import org.apache.poi.hssf.usermodel.HSSFSheet;
	import org.apache.poi.hssf.usermodel.HSSFWorkbook;

	public class A7_ExcelDataFinding2 {
		public static void main(String[] args) 
		{
			
			try {
				FileInputStream fileInputStream = new FileInputStream("C:\\Sudhahar\\Selenium2015\\Z_SeleniumUsedExcel\\ExcelFindData2.xls");
				HSSFWorkbook workbook = new HSSFWorkbook(fileInputStream);
				HSSFSheet worksheet = workbook.getSheetAt(0);
				HSSFRow row1 = worksheet.getRow(0);
				HSSFCell cellA1 = row1.getCell((short) 0);
				String a1Val = cellA1.getStringCellValue();
				HSSFCell cellB1 = row1.getCell((short) 1);
				String b1Val = cellB1.getStringCellValue();
				HSSFCell cellC1 = row1.getCell((short) 2);
				
				String c1Val = cellB1.getStringCellValue();
				//boolean c1Val = cellC1.getBooleanCellValue();
				//HSSFCell cellD1 = row1.getCell((short) 3);
				//Date d1Val = cellD1.getDateCellValue();

				System.out.println("A1: " + a1Val);
				System.out.println("B1: " + b1Val);
				
			//	System.out.println("D1: " + d1Val);
			} 
			catch (Exception e) 
			{
				System.out.println("Not Executed");
			
			}
		}
	}

