package Junit;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C5_ChromeDriverLink {

	public static void main(String[] args)
	{
		//Run with Chrome browser
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver","C:\\Sudhahar\\Selenium2015\\Selenium Jar and Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://whoisin.in/Default.aspx");
	}
	

}