package TestNg;

import jxl.*;
import jxl.read.biff.BiffException;
import jxl.Cell;
import jxl.CellType;
import jxl.Sheet;
import jxl.Workbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import jxl.Cell;

import org.testng.annotations.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A5_CellandRows_Whoisin {


	WebDriver driver;
	WebElement username,password,login;
	String nameval;

	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Started");
	}

	@BeforeTest
	public void beforetest()
	{
		try
		{
			driver=new FirefoxDriver();
			driver.get("http://whoisin.in/");
		}
		catch(Exception e)
		{
			System.out.println("Url is incorrect");
		}
	}



	/*public Object[][] getData() throws IOException, InterruptedException
	{

		String[][] arrayExcelData = null;
		File file=new File("C:\\Sudhahar\\Selenium2015\\Z_SeleniumUsedExcel\\ExcelInput1.xls");
		FileInputStream fi=new FileInputStream(file);
		 HSSFWorkbook Wb=new HSSFWorkbook(fi);
		 Sheet sh = Wb.getSheet(Sheet1);
		
		int totalNoOfCols = Ws.getColumns();
		int totalNoOfRows = Ws.getRows();
		
		arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
		
		for (int i= 1 ; i < totalNoOfRows; i++) {

			for (int j=0; j < totalNoOfCols; j++) {
				arrayExcelData[i-1][j] = Ws.getCell(j, i).getContents();
			
				
				Wb.close();
			
			}
		}
		return arrayExcelData;}
*/
	
	@DataProvider(name="empLogin")
	public Object[][] loginData() {
		Object[][] arrayObject = getExcelData("C:\\Sudhahar\\Selenium2015\\Z_SeleniumUsedExcel\\ExcelIRowsAndCell.xls","Sheet1");
		return arrayObject;
	}

	public String[][] getExcelData(String fileName, String sheetName) {
		String[][] arrayExcelData = null;
		try {
			FileInputStream fs = new FileInputStream(fileName);
			Workbook wb = Workbook.getWorkbook(fs);
			Sheet sh = wb.getSheet(sheetName);

			int totalNoOfCols = sh.getColumns();
			int totalNoOfRows = sh.getRows();
			
			arrayExcelData = new String[totalNoOfRows-1][totalNoOfCols];
			
			for (int i= 1 ; i < totalNoOfRows; i++) {

				for (int j=0; j < totalNoOfCols; j++) {
					arrayExcelData[i-1][j] = sh.getCell(j, i).getContents();
				}
			}
			}catch(Exception e)
		{
				
		}return arrayExcelData;
	}
		
	@Test(dataProvider="empLogin")
	public void testmethodfun(String username1,String password1)
	{
		try
		{			
			String usernameinput="LoginPanel_txtUserName_I";
			String passwordinput="LoginPanel_txtPassword_I";
			String Xpath="LoginPanel_btnLogin_CD";


			username=driver.findElement(By.id(usernameinput));
			username.clear();
			username.sendKeys(username1);
			Thread.sleep(1000);

			password=driver.findElement(By.id(passwordinput));
			password.clear();
			password.sendKeys(password1);
			Thread.sleep(1000);

			login=driver.findElement(By.id(Xpath));
			login.click();


				Alert alert=driver.switchTo().alert();
			alert.accept();
			
			
			nameval=driver.findElement(By.xpath(".//*[@id='UserNameId']")).getText();
			System.out.println();
			
			
		}catch(Exception e)
		{
			System.out.println("login failed");


		}
	}
}
