package TestNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.*;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class A5_Whoisin {


	WebDriver driver;
	WebElement username,password,login;

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


	@DataProvider
	public Object[][] getData1() throws IOException
	{
		
		
		
			File file=new File("C:\\Users\\jsudhahar.WSDOMAINS\\Desktop\\Today\\Test.xls");
			FileInputStream fi=new FileInputStream(file);
			HSSFWorkbook Wb=new HSSFWorkbook(fi);
			HSSFSheet Ws=Wb.getSheetAt(0);
			int rowcount=Ws.getLastRowNum();
			
			Object[][] obj=new Object[rowcount][2];
			for(int rowcountval=1;rowcountval<=rowcount;rowcountval++)
			{
				Row row=Ws.getRow(rowcountval);
				obj[rowcountval][0]=row.getCell(0).getStringCellValue();
				obj[rowcountval][1]=row.getCell(1).getStringCellValue();
				
			}
		
			
		
		return obj;
		
	}
	@Test(dataProvider="getData")
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


			/*	Alert alert=driver.switchTo().alert();
			alert.accept();
			 */
		}catch(Exception e)
		{
			System.out.println("login failed");


		}
	}
}