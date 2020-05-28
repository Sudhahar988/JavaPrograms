package Learningprgms;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Autotextbox 
{
public static void main(String[] args) throws InterruptedException {
	// TODO Auto-generated method stub
	String textToSelect = "headlines today";
	WebDriver driver;

	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");	
	driver=new ChromeDriver();	
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get("https://www.google.co.in/");
	Thread.sleep(2000);
	WebElement autoOptions= driver.findElement(By.id("fakebox-input"));
	autoOptions.sendKeys("he");

	List<WebElement> optionsToSelect = driver.findElements(By.xpath("//div[@class='sbqs_c']"));

	for(WebElement option : optionsToSelect){
	    System.out.println(option);
	    if(option.getText().equals(textToSelect)) {
	        System.out.println("Trying to select: "+textToSelect);
	        option.click();
	        break;
	    }
	}
}
}
