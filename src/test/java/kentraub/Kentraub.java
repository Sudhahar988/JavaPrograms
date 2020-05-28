package kentraub;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.*;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

//import com.rfxcel.uiautomation.utils.DataInputProvider;

public class Kentraub {


	WebDriver driver;
	WebElement EPCPureIdentityURI,RFIDControlInformationTagSize,RFIDControlInformationFilterValue,hexadecimalval;
	protected static Properties prop;
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Started");
	}

	@BeforeTest
	public void beforetest()
	{
		try
		{
			System.out.println("Launching IE browser"); 
			System.setProperty("webdriver.ie.driver", "D:\\SmartPoint_Sudhahar\\AutomationVerzion_Build\\Automation2018\\com.qa.testing\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
			driver.get("http://www.kentraub.net/tools/tagxlate/EPCEncoderDecoder.html");
		}
		catch(Exception e)
		{
			System.out.println("Url is incorrect");
		}
	}

	
private static String getCellValue(HSSFCell cell){
	try{								
		switch (cell.getCellType())
        {
            case HSSFCell.CELL_TYPE_STRING:
            	return cell.getStringCellValue();
            case HSSFCell.CELL_TYPE_NUMERIC:
            	return String.valueOf(cell.getNumericCellValue());
        }
	}catch(NullPointerException e){
	}
	return "";
}

@DataProvider
public static  String[][] getData() {

	String[][] data = null;
	
	try {
		
	
		FileInputStream fis = new FileInputStream(new File("D:\\test\\KenTraubInput.xls"));
		HSSFWorkbook workbook = new HSSFWorkbook(fis);
		HSSFSheet sheet = workbook.getSheetAt(0);	
		HSSFCell cell;
		
		// get the number of rows
		int rowCount = sheet.getLastRowNum();

		// get the number of columns
		int columnCount = sheet.getRow(0).getLastCellNum();
		data = new String[rowCount][columnCount];
		
		// loop through the rows
		for(int i=1; i <rowCount+1; i++){
			try {
				HSSFRow row = sheet.getRow(i);
				for(int j=0; j <columnCount; j++){ // loop through the columns
					try {
						String cellValue = "";
						//System.out.println(i+","+j);
						cell = row.getCell(j);							
						try{								
							switch (cell.getCellType())
			                {
			                    case HSSFCell.CELL_TYPE_STRING:
			                    	cellValue = cell.getStringCellValue();
			                        break;
			                    case HSSFCell.CELL_TYPE_NUMERIC:
			                    	//cellValue = String.valueOf(cell.getNumericCellValue());
			                    	cellValue = new DataFormatter().formatCellValue(cell).trim();
			                        break;
			                }
						}catch(NullPointerException e){

						}

						data[i-1][j]  = cellValue; // add to the data array
					} catch (Exception e) {
							e.printStackTrace();
					}				
				}

			} catch (Exception e) {
					e.printStackTrace();
			}
		}
		fis.close();
		workbook.close();

	} catch (Exception e) {
			e.printStackTrace();
			
	}
	
	return data;
			
	}

	
	@Test(dataProvider="getData")
	public void testmethodfun(String EPCPureIdentityURI1,String RFIDControlInformationTagSize1,String RFIDControlInformationFilterValue1)
	{
		try
		{			
			String EPCPureIdentityURIX="/html/body/div[1]/div[2]/div[2]/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/div[3]/input";
			String RFIDControlInformationTagSizeX="/html/body/div[1]/div[2]/div[2]/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/table[2]/tbody/tr/td[4]/div[1]/div[2]/select[1]";
			String RFIDControlInformationFilterValueX="/html/body/div[1]/div[2]/div[2]/table/tbody/tr/td[2]/div[2]/table/tbody/tr/td/div/table[2]/tbody/tr/td[4]/div[1]/div[2]/select[2]";
			

			EPCPureIdentityURI=driver.findElement(By.xpath(EPCPureIdentityURIX));
			EPCPureIdentityURI.clear();
			EPCPureIdentityURI.sendKeys(EPCPureIdentityURI1);
			Thread.sleep(10000);

			
			RFIDControlInformationTagSize=driver.findElement(By.xpath(RFIDControlInformationTagSizeX));
			Select sel=new Select(RFIDControlInformationTagSize); 	
			sel.selectByVisibleText(RFIDControlInformationTagSize1);
			Thread.sleep(1000);			
			
			RFIDControlInformationFilterValue=driver.findElement(By.xpath(RFIDControlInformationFilterValueX));
			Select sel1=new Select(RFIDControlInformationFilterValue); 	
			sel1.selectByVisibleText(RFIDControlInformationFilterValue1);
			Thread.sleep(1000);
			WebElement TxtBoxContent = driver.findElement(By.xpath("//div[5][@class='epc-primary']//*[@class='epc-primary-data']"));
			System.out.println(TxtBoxContent.getAttribute("value"));			
			}catch(Exception e)
		{
			System.out.println("login failed");


		}
	}
}
