package Junit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class B4_Alert {

	WebDriver driver;
	WebElement alerttest,alert,username,password,button;


	@Before
	public void startmethod()
	{

		System.out.println("Start execution");

		driver=new FirefoxDriver();
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		System.out.println("Testing the application");
		driver.get("http://www.whoisin.in/");
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);



		//System.out.println(e.getMessage());

	}

	@Test
	public void Testmethod() throws InterruptedException

	{
		alerttest=driver.findElement(By.id("LoginPanel_btnLogin_CD"));
		alerttest.click();
		Thread.sleep(10000);
		Alert alt= driver.switchTo().alert();
		//alt.dismiss();
		alt.accept();

		username=driver.findElement(By.id("LoginPanel_txtUserName_I"));
		username.clear();
		//username.sendKeys("WS196");
		username.sendKeys("WS196");
		Thread.sleep(10000);
		password=driver.findElement(By.id("LoginPanel_txtPassword_I"));
		password.clear();
		password.sendKeys("SUDHA123");
		Thread.sleep(10000);
		button=driver.findElement(By.id("LoginPanel_btnLogin_CD"));
		button.click();
		Thread.sleep(10000);


	}
}


