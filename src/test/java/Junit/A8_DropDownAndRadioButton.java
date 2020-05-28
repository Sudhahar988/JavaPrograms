package Junit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A8_DropDownAndRadioButton {


	WebDriver driver;
	WebElement language,firstname,lastname,username;
	List<WebElement> Radiobutton;
	@Before
	public void startmethod(){
		try{
			System.out.println("Start execution");

			driver=new FirefoxDriver();
			WebDriverWait wait = new WebDriverWait(driver, 10);
			System.out.println("Testing the application");
			driver.get("https://in.edit.yahoo.com/registration?.pd=&intl=in&origIntl=&done=https%3A%2F%2Fwww.yahoo.com&src=0&wl=&wlcr=&_asdk_embedded=&create_alias=&.scrumb=&last=&partner=yahoo_default&domain=&yahooid=&lang=en-IN&fsredirect=1&fs=RE0JulqHafADP8n_n1oFi7lY6Xw96WqouGYzWA.YgNcb3_CyETZ2acw9Ymm5EZkHHWqH.kNU");
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	@Test
	public void TestMethod(){
		try{
			
			
			language=driver.findElement(By.id("country-lang"));
			org.openqa.selenium.support.ui.Select sel=new org.openqa.selenium.support.ui.Select(language);
			sel.selectByIndex(10);
			firstname=driver.findElement(By.id("first-name"));
			firstname.sendKeys("sudhahar");
			Thread.sleep(1000);
			
			lastname=driver.findElement(By.id("last-name"));
			lastname.sendKeys("jagadeesan");
			Thread.sleep(1000);
			
			
			username=driver.findElement(By.id("user-name"));
			username.sendKeys("jagadeesan89898989");
			Thread.sleep(1000);
			
			
			
			//user-name  
			
			
			
			
			
//
//			Radiobutton=driver.findElements(By.xpath("//input[@type='radio']"));
//			System.out.println(Radiobutton.size());
//			try
//			{
//				for(int i=0;i<=7;i++)
//				{
//
//					Radiobutton.get(i).click();
//					System.out.println(i);
//					Thread.sleep(1000);
//				}
//			}
//			catch(Exception e)
//			{
//
//			}
		}
		catch(Exception e){
			System.out.println(e.getMessage());	
		}
	}

}
