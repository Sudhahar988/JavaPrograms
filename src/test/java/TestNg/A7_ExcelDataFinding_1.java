package TestNg;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.eventusermodel.dummyrecord.LastCellOfRowDummyRecord;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.Test;

public class A7_ExcelDataFinding_1 {
	@Test
	public void TestFunction() throws IOException
	{
		try
		{
			File file=new File("C:\\Users\\jsudhahar.WSDOMAINS\\Desktop\\Today\\Test.xls");
			FileInputStream fi=new FileInputStream(file);
			HSSFWorkbook Wb=new HSSFWorkbook(fi);
			HSSFSheet Ws=Wb.getSheetAt(0);
			int rowcount=Ws.getLastRowNum();
			// System.out.println("********************");
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
				//System.out.println("********************");

				File File1=new File("C:\\Users\\jsudhahar.WSDOMAINS\\Desktop\\Today\\output.xls");
				FileOutputStream obj = new FileOutputStream(File1);                                                     
				Wb.write(obj);
				obj.close();
				Wb.close();
				System.out.println("Succesfully writed in excel");
			}

		}
		catch(Exception e)
		{
			System.out.println("Not executed");
		}




	}
}