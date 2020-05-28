package com.qa.testing.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parallel {

	private WebDriver driver;
	String baseURL1 = "http://www.google.com/";
	String baseURL2 = "https://qc.track-n-trace.net/test1-qc/";

	@Parameters({ "browser" })
	@BeforeTest
	public void openBrowser(String browser) {
		try {
			if (browser.equalsIgnoreCase("Firefox")) {
				System.setProperty("webdriver.gecko.driver","./drivers/geckodriver.exe");
				driver = new FirefoxDriver();
				System.out.println("Firefox executed successfuilly");
			} else if (browser.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
				driver = new ChromeDriver();
				System.out.println("Chrome executed successfuilly");
			} else if (browser.equalsIgnoreCase("IE")) {
				System.setProperty("webdriver.ie.driver",
						"./drivers/IE/IEDriverServer.exe");
				driver = new InternetExplorerDriver();
				System.out.println("IE executed successfuilly");
			}
		
		} catch (WebDriverException e) {
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void login_TestCase() {
		driver.navigate().to(baseURL1);
        System.out.println("Test 1 Success");
	}

	@Test
	public void search_TestCase() {
		driver.navigate().to(baseURL2);
		 System.out.println("Test 2 Success");
	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
	}
}