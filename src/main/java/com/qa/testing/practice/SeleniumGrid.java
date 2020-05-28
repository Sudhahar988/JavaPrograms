package com.qa.testing.practice;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.*;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
 
public class SeleniumGrid {
	
	public static WebDriver driver;
	public String URL = "http://www.mi.com";
	public String Node = "http://192.168.1.57:4444/wd/hub";
	@BeforeTest
	public void beforetest() throws MalformedURLException, InterruptedException
	{
					 	
		   /* String  BaseURL,NodeURL;
		    BaseURL="http://www.google.com";
		    NodeURL="http://localhost:4444/wd/hub";
		    File file = new File("D:\\SmartPoint_Sudhahar\\AutomationVerzion_Build\\Automation2018\\com.qa.testing\\drivers\\chromedriver.exe");
		    System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
		    DesiredCapabilities capa =DesiredCapabilities.chrome();
		    capa.setBrowserName("chrome");
		    capa.setPlatform(Platform.ANY);
		    driver=new RemoteWebDriver(new URL(NodeURL),capa);
		    DesiredCapabilities cap =DesiredCapabilities.chrome();
		    System.setProperty("webdriver.chrome.driver","D:\\SmartPoint_Sudhahar\\AutomationVerzion_Build\\Automation2018\\com.qa.testing\\drivers\\chrome\\chromedriver.exe");
		    
		    //cap = DesiredCapabilities.chrome();
		    cap.setVersion("55.0.2");
		    cap.setBrowserName("chrome");
		    cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		    
		    
		    //cap = DesiredCapabilities.chrome();
		    //cap.setPlatform(org.openqa.selenium.Platform.WINDOWS);
		    driver = new RemoteWebDriver(new URL(NodeURL),cap);*/
		
		System.setProperty("webdriver.chrome.driver", "E:\\Workspace\\OPQAutomation\\RfxcelOPQAutomation\\drivers\\chromedriver.exe");
		DesiredCapabilities cap = DesiredCapabilities.chrome();
		cap.setPlatform(Platform.WIN8_1);
		driver = new RemoteWebDriver(new URL(Node), cap);
		driver.manage().window().maximize();
		driver.navigate().to(URL);
		Thread.sleep(5000);
		driver.quit();
		
		}
		
		@Test
		public void Test()
		{
			  driver.get("http://www.google.com");
		}
	
		
}