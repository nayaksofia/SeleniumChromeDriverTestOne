package com.ecom.webapp.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonSourceURLTest {
	
	// Amazon Source Url Test 

	public static void main(String[] args) {
		//1. Formulate A Base Test URL
        final  String siteURL = "https://www.amazon.com/";
        //2. Locate A Web Driver BY Locating the path 
        final String driverPath ="driver\\chromedriver.exe"; //absolute path 
        
       
        //3. Set Selenium System Properties.
        System.setProperty("webdriver.chrome.driver",driverPath);
		//4. Instantiate Selenium Web Driver . That means Create an object of the web driver.
        WebDriver driver = new ChromeDriver();
        //5. Launch Browser
        driver.get(siteURL);
        
        //Perform Test Evaluation  
        if (siteURL.equals(driver.getCurrentUrl())) {
       	 System.out.println("Test is Passed !");
        }else {
       	 System.out.println("Test is Failed !");
        }
        
        System.out.println("Actual :: " + driver.getCurrentUrl());
        System.out.println("Expected :: " + siteURL);
        
        //Close Driver 
        driver.close();

	}

}
