package Inhertiance;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.w3c.dom.stylesheets.LinkStyle;

public class MainClassOfInhertience 
{

	public static void main(String[] args) {
		
				String[] strvalue={"ram","kannan"};
		

		
		for(int j=0;j<strvalue.length;j++)
		{
			System.out.println("value is"+strvalue[j]);
			String text="ram";
			if(text.equalsIgnoreCase(strvalue[j]))
			{
				System.out.println("Pass");
			}
			else
			{
				System.out.println("Fail");
			}
			
		}
		
		
		//if(text.equalsIgnoreCase(anotherString))
	}
}
