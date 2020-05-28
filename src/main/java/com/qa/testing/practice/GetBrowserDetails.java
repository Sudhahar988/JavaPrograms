package com.qa.testing.practice;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
public class GetBrowserDetails 
{

	WebDriver driver;

	 @BeforeTest
	 public void setup(){

		 System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			driver.get("http://192.168.1.48:8080/rfxcelwebdev/");
			System.out.println("Firefox executed successfuilly");
	  CheckBrowserOS();
	  driver.close();
	  
	  System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://192.168.1.48:8080/rfxcelwebdev/");
		System.out.println("Chrome executed successfuilly");
	  CheckBrowserOS();
	  driver.close();
	  
	  System.setProperty("webdriver.ie.driver","./drivers/IE/IEDriverServer.exe");
		driver = new InternetExplorerDriver();
		driver.get("http://192.168.1.48:8080/rfxcelwebdev/");
		System.out.println("IE executed successfuilly");
	  CheckBrowserOS();
	  driver.close();
	 }

	 
	 public void CheckBrowserOS() {
	  //Get Browser name and version.
	  Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
	  String browserName = caps.getBrowserName();
	  String browserVersion = caps.getVersion();
	  
	  //Get OS name.
	  String os = System.getProperty("os.name").toLowerCase();
	  System.out.println("OS = " + os + ", Browser = " + browserName + " "+ browserVersion);
	 } 
	
}
