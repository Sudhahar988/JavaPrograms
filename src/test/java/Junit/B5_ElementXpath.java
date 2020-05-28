package Junit;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByLinkText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;
public class B5_ElementXpath {
	public static void main(String args[]) throws Exception {
		WebDriver webdriver;
		webdriver=new FirefoxDriver();
		webdriver.get("http://newtours.demoaut.com/");
		WebElement element = webdriver.findElement(By.xpath("//div/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[4]/td[2]/font/a"));
		element.click();
		//webdriver.quit();
	}

}

