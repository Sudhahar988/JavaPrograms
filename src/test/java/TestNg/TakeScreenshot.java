package TestNg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TakeScreenshot 

{WebDriver driver; 

	@BeforeTest
	public void beforetest()
	{
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://whoisin.in");
	}
	
	@Test
	public void test() throws IOException
	{
		
		 File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);  
	     FileUtils.copyFile(scrFile, new File("C:\\Users\\Public\\Pictures\\failure.png"));  
	}
	
	@AfterTest
	public void Aftertest()
	{
		driver.quit();
	}
}
