package TestNg;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

import com.steadystate.css.util.Output;

public class A7_ExcelDataFinding4 {
	@Test
	public void TestFunction() throws IOException 
	{
		try
		{
			File file=new File("C:\\Sudhahar\\Selenium2015\\Z_SeleniumUsedExcel\\ExcelFindData3.xls");
			FileInputStream fi=new FileInputStream(file);
			HSSFWorkbook Wb=new HSSFWorkbook(fi);
			HSSFSheet Ws=Wb.getSheetAt(0);
			int rowcount=Ws.getLastRowNum();
			System.out.println("********************");
			for(int rowcountval=1;rowcountval<=rowcount;rowcountval++)
			{
				Row row=Ws.getRow(rowcountval);

				String Name=row.getCell(0).getStringCellValue();
				String Lastname=row.getCell(1).getStringCellValue();
				long RollNo=(long) row.getCell(2).getNumericCellValue();
				String Sex=row.getCell(3).getStringCellValue();
				long phone= (long) row.getCell(4).getNumericCellValue();
				
								
				System.out.println("Name:"+Name);
				System.out.println("Lastname:"+Lastname);
				System.out.println("RollNo:"+RollNo);
				System.out.println("Sex:"+Sex);
				System.out.println("Phone:"+phone);
				System.out.println("********************");
				
				//obj.write
				/*File fileout=new File("C:\\Sudhahar\\Selenium2015\\Z_SeleniumUsedExcel\\OutPut\\Output.xls");
				
				FileOutputStream fO = new FileOutputStream(fileout);
				HSSFWorkbook WBB=new  HSSFWorkbook();
				HSSFSheet WSS=WBB.getSheetAt(0);*/
				
				
				} 
			
		}
		catch(Exception e)
		{
			System.out.println("Not executed"); 
		}
		
		
		
		
		
	}
}
