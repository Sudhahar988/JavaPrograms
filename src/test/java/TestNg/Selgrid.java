package TestNg;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Selgrid {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		
		RemoteWebDriver driver;	
		//WebElement element;
		
		DesiredCapabilities cap=DesiredCapabilities.firefox();
		cap.setBrowserName("firefox");
		driver=new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"),cap);
		
		driver.get("https://www.google.com");
		driver.quit();

	}

}
