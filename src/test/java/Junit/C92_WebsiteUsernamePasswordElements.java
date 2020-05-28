package Junit;

//public class UserLogin {
//
//}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class C92_WebsiteUsernamePasswordElements {

	public static void main(String[] args)  {
		// objects and variables instantiation
		
		
		try {
		    Thread.sleep(2000);
		    
		    System.setProperty("webdriver.chrome.driver","C:\\Sudhahar\\Selenium2015\\Selenium Jar and Driver\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			String appUrl = "http://whoisin.in/";
			driver.get(appUrl);
			// enter a valid username in the email textbox
			WebElement username = driver.findElement(By.id("LoginPanel_txtUserName_I"));
			username.clear();
			username.sendKeys("WS196");
			// enter a valid password in the password textbox
			WebElement password = driver.findElement(By.id("LoginPanel_txtPassword_I"));
			password.clear();
			password.sendKeys("SUDHA123");
			// click on the Sign in button
			WebElement SignInButton = driver.findElement(By.id("LoginPanel_btnLogin"));
			SignInButton.click();
			// close the web browser
			driver.close();
			// terminate the program
			System.exit(0);
		    
		    
		} catch (InterruptedException e) {
		e.printStackTrace();
		}
		
		
		
		
		
	}

}

