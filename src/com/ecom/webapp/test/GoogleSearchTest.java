package com.ecom.webapp.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {

	public static void main(String[] args) {

		//1. Formulate A Base Test URL
        final  String siteURL = "https://www.google.com/";
        //2. Locate A Web Driver BY Locating the path 
        final String driverPath ="driver\\chromedriver.exe"; //absolute path 
        
       
        //3. Set Selenium System Properties.
        System.setProperty("webdriver.chrome.driver",driverPath);
		//4. Instantiate Selenium Web Driver . That means Create an object of the web driver.
        WebDriver driver = new ChromeDriver();
        //5. Launch Browser
        driver.get(siteURL);
        
        
        //6.Find Element
        WebElement searchBox = driver.findElement(By.name("q"));
        
        //7. Add Text to searchbox
        searchBox.sendKeys("Selenium Documentation");
        
        //8.Submit Text : That means Enter
        searchBox.submit();
        
        //9.Open Link
         WebElement refLink = driver.findElement(By.cssSelector("#rso > div:nth-child(1) > div > div > div > div > div.yuRUbf > a"));
        //10. Click on link
         refLink.click();
         
		//11.Perform Test Evaluation 
         
        String expectedTitle = "Selenium Documentation - Google Search";
        
        if (expectedTitle.equals(driver.getTitle())) {
       	 System.out.println("Test is Passed !");
        }else {
       	 System.out.println("Test is Failed !");
        }
        
        System.out.println("Actual :: " + driver.getTitle());
        System.out.println("Expected :: " + expectedTitle);
        
      //12.Close Driver 
        driver.close();
	}

}
