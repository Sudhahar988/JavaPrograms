package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.Rows;
import org.apache.poi.ss.usermodel.Row;

public class A3_DataProvider11 {

	public static Object[][] getData() throws IOException    
	{


		//Direct value passing
		
		/*Object[][] obj = new Object[3][2];
		obj[0][0]="9585732022";
		obj[0][1]="SUDHA123";

		obj[1][0]="9585732022";
		obj[1][1]="password2";

		obj[2][0]="WS196";
		obj[2][1]="SUDHA123";*/

		//Excel use to passing

		

			File file=new File("C:\\Sudhahar\\Selenium2015\\Z_SeleniumUsedExcel\\ExcelInput1.xls");
			FileInputStream fi=new FileInputStream(file);
			HSSFWorkbook Wb=new HSSFWorkbook(fi);
			HSSFSheet Ws=Wb.getSheetAt(0);
			//int rowcount=Ws.getLastRowNum();
			
			Object[][] obj=new Object[Ws.getLastRowNum()+1][2];
			for(int rowcountval=0;rowcountval<=Ws.getLastRowNum();rowcountval++)
			{
				Row row=Ws.getRow(rowcountval);
				
				obj[rowcountval][0] =row.getCell(0).getStringCellValue();
				obj[rowcountval][1]=row.getCell(1).getStringCellValue();
				//obj[rowcountval][2]=row.getCell(0).getStringCellValue();
				
				
				System.out.println(obj[rowcountval][0]);
				System.out.println(obj[rowcountval][1]);
Wb.close();
			}


		 
		return obj;

	}
	
	public static void main(String[] args) throws IOException, InterruptedException
	{
		getData();
	//	System.out.println(username);
		//System.out.println(password);
		//System.out.println();
		
	}
	
	
}
