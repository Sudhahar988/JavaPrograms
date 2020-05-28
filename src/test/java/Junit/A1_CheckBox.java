package Junit;


import java.util.*;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.net.URL;
public class A1_CheckBox {
	
	
	@Test	
	public void Testmethod()
	{
		WebDriver webdriver;		
		WebElement element,checkboxvalue;
		//webdriver=new FirefoxDriver();	
		System.setProperty("webdriver.gecko.driver", "D:/test/geckodriver.exe");
		webdriver=new FirefoxDriver();
		webdriver.get("http://newtours.demoaut.com/");
		element = webdriver.findElement(By.xpath("/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a"));
		element.click();
		//checkboxvalue =webdriver.findElement(
		
		//webdriver.quit();
	}

}

