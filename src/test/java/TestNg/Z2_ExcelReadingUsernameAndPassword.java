package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;



public class Z2_ExcelReadingUsernameAndPassword 
{

	public static void main(String[] args) throws IOException
	{
		Z2_ExcelReadingUsernameAndPassword data=new Z2_ExcelReadingUsernameAndPassword();
		data.data();
	}
	public static Object[][] data() throws IOException

	{
		FileInputStream file=new FileInputStream("C:\\Sudhahar\\Selenium2015\\Z_SeleniumUsedExcel\\2016\\Uesrname.xls");
		HSSFWorkbook wb=new HSSFWorkbook(file);
		HSSFSheet ws=wb.getSheetAt(0);
		int rowcount=ws.getLastRowNum();
		System.out.println("Array allocate value is :"+rowcount);
		Object[][] obj=new Object[rowcount+1][2];
		for(int rowcountval=0;rowcountval<=rowcount;rowcountval++)
		{
			Row row=ws.getRow(rowcountval);
			
			for(int i=0;i<=rowcountval;i++)
			{
				for(int j=0;j<=2;j++)
				{
					obj[i][j]=row.getCell(j).getStringCellValue();
					System.out.println(obj[i][j]);
				}
				
			}
			
			/*obj[rowcountval][0]=row.getCell(0).getStringCellValue();
			obj[rowcountval][1]=row.getCell(1).getStringCellValue();	
			System.out.println(obj[rowcountval][0]);
			System.out.println(obj[rowcountval][1]);*/
		}	
		return obj;
	}}



