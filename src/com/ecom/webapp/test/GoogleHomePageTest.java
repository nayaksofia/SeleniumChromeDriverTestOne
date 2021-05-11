package com.ecom.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleHomePageTest {

	public static void main(String[] args) {
	
		//1. Formulate A Base Test URL
        final  String siteURL = "https://www.google.com/";
        
		//2. Locate A Web Driver BY Locating the path
        
         final String driverPath ="driver\\chromedriver.exe";
       
        //3. Set Selenium System Properties.
        
         System.setProperty("webdriver.chrome.driver",driverPath);
		
         //4. Instantiate Selenium Web Driver . That means Create an object of the web driver.
        
             WebDriver driver = new ChromeDriver();
         
         
		//5. Launch Browser
         
         driver.get(siteURL);

		//6. Perform Test Evaluation 
         
        String expectedTitle = "Google";
        
        if (expectedTitle.equals(driver.getTitle())) {
       	 System.out.println("Test is Passed !");
        }else {
       	 System.out.println("Test is Failed !");
        }
        
		//7. Close Driver 
         driver.close();


	}

}
