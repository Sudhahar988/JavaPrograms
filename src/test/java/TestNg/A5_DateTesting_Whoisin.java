package TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.ClickAndHoldAction;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;

public class A5_DateTesting_Whoisin {

	WebDriver driver;

	WebElement username,password,signin,report,hrreport,leavereport;

	WebElement Calender;

	String profilename;
	@BeforeTest
	public void beforetest()
	{

		driver=new FirefoxDriver();
		driver.get("http://whoisin.in/");
		System.out.println("Browser Started");

	}


	@Test
	public void Testmethod() throws InterruptedException
	
	{
		String usernameid="LoginPanel_txtUserName_I";
		String passwordid="LoginPanel_txtPassword_I";
		String signinid="LoginPanel_btnLogin";
		String Profilename="html/body/form/div[4]/div[1]/div[1]/div/div/div/div[3]/div/div/div/div/div[2]/div/a";
		String Reportmenu="html/body/form/div[4]/div[1]/div[2]/div/div[2]/div[3]/ul/li/a";
		String HRReport="html/body/form/div[4]/div[1]/div[2]/div/div[2]/div[3]/ul/li/div[3]/ul/li[3]/a";
		String LeaveDetails="html/body/form/div[4]/div[1]/div[2]/div/div[2]/div[3]/ul/li/div[3]/ul/li[3]/div[2]/ul/li[4]/a";
		//String CalenderId="html/body/form/div[3]/div/table/tbody/tr/td/table/tbody/tr[42]/td[2]/table/tbody/tr/td[3]/img";
		
		username=driver.findElement(By.id(usernameid));
		username.clear();
		username.sendKeys("WS196");
		
		password=driver.findElement(By.id(passwordid));
		password.clear();
		password.sendKeys("SUDHA123");
		
		
		signin=driver.findElement(By.id(signinid));
		signin.click();
		Thread.sleep(1000);
		
		profilename=driver.findElement(By.xpath(Profilename)).getText();
		System.out.println("Profile Name is:"+profilename);
		
		Thread.sleep(1000);
		Actions act=new Actions(driver);
		report=driver.findElement(By.xpath(Reportmenu));
		act.moveToElement(report).build().perform();
		report.click();
		Thread.sleep(1000);
		
		hrreport=driver.findElement(By.xpath(HRReport));
		act.moveToElement(hrreport).build().perform();
		hrreport.click();
		Thread.sleep(1000);
		
		leavereport=driver.findElement(By.xpath(LeaveDetails));
		act.moveToElement(leavereport).build().perform();
		leavereport.click();
		Thread.sleep(2000);
		
System.out.println(123);
	
		
	 Calender=driver.findElement(By.id("img1"));
	 Calender.click();
		
		System.out.println(245);
		Thread.sleep(1000);
		
		
		
	}

	
	@AfterTest
	public void Aftertest()
	{

	}
}
