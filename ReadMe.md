# Topic : Selenium Chrome Driver

> Chrome provides a `driver`, which can establish the `connection between Selenium WebDriver & Google Chrome` and run the Selenium test in Chrome browser.
## Now , I choose

> ChromeDriver is the communication medium that allows users to run their Selenium tests on Chrome browser. It is a standalone server that implements the open-source Selenium WebDriver Chromium Protocol. The Selenium tests interact with the ChromeDriver using the JsonWireProtocol, which translates the Selenium commands into corresponding actions on the Chrome browser.

> The sole purpose of the ChromeDriver is to launch and interact with Google Chrome. Without using ChromeDriver, it’s not possible to run Selenium tests on the chrome browser. 


```
Browser: chrome version > Version 90.0.4430.93 (Official Build) (64-bit)
Chrome Driver : Version 90.0.4430.93 (Official Build) (64-bit)
Language : Java
Tools : Eclipse
```

# Steps To Follow: 

> Step-1: Check the current version of `Chrome Browser. 

> Step-2: Download `chrome driver ` according to the version of your chrome browser. 
[Chrome Driver Link](https://chromedriver.chromium.org/downloads)
Here, you will get different options of ChromeDriver based on your operating system. Additionally, for the Windows operating system, you can `choose the Win32 version` as marked in the below image. Yes, `even if you have a 64-bit Windows installed on your system`, **the Win32 version will work fine**.

> Step-3: Download Selenium Standalone Server.jar from the official site:  [Click Here To Download .jar File For Java](https://www.selenium.dev/downloads/)

> Step-4: Lunch Eclipse and create a java project or maven based java project
   
> Step-5: Configure `WebDriver` with Eclipse.

> Now , you all set to write your first test script using `Selenium Web Driver With Eclipse`.  

# Configure Selenium WebDriver With Eclipse:

> Step-9: Launch Eclipse And Create A WorkSpace ?

> My Current Workspace Name: ` FSD-5 Workspace-Practice-Projects `

>**Step-1:** Create New Java Project In Eclipse:

 ```
File-> New -> Other -> java project 

Project Name: SeleniumChromeDriverTestOne
 ```
 **Note:**  Click `No to open perspective pup up window`. 

> **Step-2**: Copy all the libreries files , what you have downloaded to the current project.Then rightclick on the project name and  `refresh` the project .

>**Step-3:** ` How to add Selenium WebDriver Jars to the project?`

After it,

 Right click on the `project name` -> ` Click on `Build Path`  ->  `Configure Build Path` -> Click on  `Libraries`  ->  Click on  `Class Path` -> `Add Jars` -> Then Add all the `.jar files inside lib folder` -> `click ok` -> `Click on Apply and Close` .


> **Step-4:** Now Let's write `test cases`. So create ` A Class`. 
```
So Package Name:com.ecom.webapp.test 
Class Name : GoogleHomePageTest
And Check the Main Method.
```

>**Step-5:** Write The code for the `Class: FirstTestCase` .

```
//FirstTest: Is For Google Home Page Test. 
//1. Formulate A Base Test URL

//2. Locate A Web Driver BY Locating the path

//3. Set Selenium System Properties.

//4. Instsntiate Selenium Web Driver . That means Create an object of the web driver.

//5. Launch Browser

//6. Perform Test Evaluation 

//7. Close Driver 
 driver.quit();


```
# Error-1 Message:

```
Exception in thread "main" java.lang.Error: Unresolved compilation problems: 
	WebDriver cannot be resolved to a type
	ChromeDriver cannot be resolved to a type

	at com.ecom.webapp.test.GoogleHomePageTest.main(GoogleHomePageTest.java:25)
```
# Error-1: Resolved 

> Choose `Classpath` to add .jar files , while doing configuration 
build path. 


<img src="img/webdriver-error-message-1.jpg">