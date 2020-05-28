package TestNg;

import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
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

public class A5_Getdatainwebsite_Whoisin {


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


	@DataProvider
	public Object[][] getData() throws IOException, InterruptedException
	{


		//Direct value passing
		
		/*Object[][] obj = new Object[3][2];
		obj[0][0]="9585732022";
		obj.[0][1]="SUDHA123";

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
		
		Object[][] obj=new Object[Ws.getLastRowNum()+1][3];
		for(int rowcountval=0;rowcountval<=Ws.getLastRowNum();rowcountval++)
		{
			Row row=Ws.getRow(rowcountval);
			
			obj[rowcountval][0] =row.getCell(0).getStringCellValue();
			obj[rowcountval][1]=row.getCell(1).getStringCellValue();
			obj[rowcountval][2]=row.getCell(2).getStringCellValue();
			
			
			System.out.println(obj[rowcountval][0]);
			System.out.println(obj[rowcountval][1]);
		System.out.println(obj[rowcountval][2]);	
Wb.close();
		}
		return obj;

	}
	@Test(dataProvider="getData")
	public void testmethodfun(String username1,String password1,String profilename)
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
			
			
			
			
		}catch(Exception e)
		{
			System.out.println("login failed");


		}
		nameval=driver.findElement(By.xpath(".//*[@id='UserNameId']")).getText();
		System.out.println(nameval);
		
		if(nameval.equalsIgnoreCase(profilename))
		{
		System.out.println("pass");	
		}
		else
		{
			System.out.println("fail");
		}
		
		
		
	}
}
