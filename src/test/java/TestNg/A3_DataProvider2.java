package TestNg;

import org.testng.annotations.Test;



import org.testng.annotations.DataProvider;
 
public class A3_DataProvider2 {
 
        @DataProvider(name="SearchProvider")
 
        public static Object[][] getDataFromDataprovider(){
 
            return new Object[][] {
 
                    { "Guru99", "India" },
 
                { "Krishna", "UK" },
 
                { "Bhupesh", "USA" }
 
                };
 
         
 
        }}