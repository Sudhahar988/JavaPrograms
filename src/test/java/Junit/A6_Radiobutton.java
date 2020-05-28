package Junit;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A6_Radiobutton {

	
	WebDriver driver;
	List<WebElement> Radiobutton;

	@Before
	public void startmethod(){
		try{
		System.out.println("Start execution");
		
//		to open IE bowser
//		System.setProperty("webdriver.ie.driver","F:\\workspace\\Drivers\\IEDriverServer.exe");
//		driver = new InternetExplorerDriver();
		
//		to open chrome browser
		//System.setProperty("webdriver.chrome.driver","C:\\Sudhahar\\Selenium2015\\Selenium Jar and Driver\\chromedriver.exe");
	    driver=new FirefoxDriver();
	    
	    
//	     driver = new FirefoxDriver();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		}
	
    @Test
	public void TestMethod(){
    	try{
    	WebDriverWait wait = new WebDriverWait(driver, 10);
    	System.out.println("Testing the application");
    	driver.get("http://www.nngroup.com/articles/checkboxes-vs-radio-buttons");
    	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    	Radiobutton=driver.findElements(By.xpath("//input[@type='radio']"));
    	System.out.println(Radiobutton.size());
    	try
    	{
    		for(int i=0;i<=7;i++)
    		{
    			
    			Radiobutton.get(i).click();
    			System.out.println(i);
    			Thread.sleep(1000);
    		}
    	}
    	catch(Exception e)
    	{
    		
    	}
    	}
    	catch(Exception e){
        System.out.println(e.getMessage());	
    	}
    }
}
