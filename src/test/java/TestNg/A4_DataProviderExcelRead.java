package TestNg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class A4_DataProviderExcelRead {

	@BeforeClass
	public void before()
	{
		System.out.println("Excel Finding");
		System.out.println("***********************");
	}
	@Test
	public void f() {

		try
		{

			File file=new  File("C:\\Sudhahar\\Selenium2015\\Z_SeleniumUsedExcel\\ExcelFindData1.xls");
			FileInputStream fi=new FileInputStream(file);
			HSSFWorkbook wb=new HSSFWorkbook(fi); 		//workbook object   // Hssfworkbook used for .xlsx finding //Xssframeworkbooksheet used in .xls
			HSSFSheet ws=wb.getSheetAt(0); 		 		//index value representse the sheet number.
			int rwcount=ws.getLastRowNum();             //last row number finding in excel in sheet

			for(int rwiteration=0;rwiteration<=rwcount;rwiteration++)
			{
				Row row=ws.getRow(rwiteration);
				String name=row.getCell(0).getStringCellValue();
				String lastname=row.getCell(1).getStringCellValue();
				String password=row.getCell(2).getStringCellValue();
				boolean eligility=row.getCell(3).getBooleanCellValue();

				String Name=name.toUpperCase();
				String Lastname=lastname.toUpperCase();
				String Password=password.toUpperCase();


				System.out.println(Name);
				System.out.println(Lastname);
				System.out.println(Password);
				System.out.println(eligility);


			}
			wb.close();
			System.out.println("***********************");
			System.out.println("Testing Completed");
		}
		catch(Exception e)
		{
			System.out.println("Not Executed");
		}
	}
}
