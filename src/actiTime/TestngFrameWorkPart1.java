package actiTime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestngFrameWorkPart1 {

	
		/*Class Notes: 
		 Selenium Class 40: Introduction to TestNG Testing Framework 
		 ----------------------------------------------------------- 
		 1) Introduction to TestNG Testing Framework 
		 2) Install TestNG and write first TestNG Test Case
		 3) Create multiple Test Case and Run 
		  ----------------------------------------------------------- 
		 1) Introduction to TestNG Testing Framework
		  ----------------------------------------------------------- 
		  In Selenium with Java there are two Testing frameworks available, 
		      i) JUnit 
		      ii) TestNG 
		  --------------------------------
		   Note: Java - JUnit, TestNG 
		         C#.NET - NUnit, haskell 
		         PHP - Behat + Mink 
		         Ruby - Rspect, Test::Unit 
		         Python - Pyunit, Py.test Etc... 
		  ------------------------------------------ 
		  TestNG Framework Features... 
		  > TestNG is a Testing Framework designed to simplify a broad range of Testing needs from Unit Testing to System Testing 
		  > Initially developed for Unit Testing, now used for all levels of Testing. 
		  > TestNG is an Open Source framework, where NG stands for Next Generation. 
		  > TestNG inspired by JUnit (Java Platform) and NUnit (.NET platform) but introduced some new functionalities 
		  ----------------------------------------------------------- 
		  Advantages of TestNG 
		  -------------------- 
		  i) TestNG Annotations are easy to create Test Cases... 
		  ii) Test Cases can be grouped and prioritized more easily
		  iii) Supports Parameterization 
		  iv) Execute multiple Programs / classes using xml 
		  v) Generate Test Reports vi) Parallel Test Execution 
		  ----------------------------------------------------------- 
		  2) Install TestNG and write first TestNG / Test Cases... 
		  ----------------------------------------------------------- 
		  In Eclipse IDE 
		  > Help Menu 
		  > Select "Install New Software" 
		  > Click "Add" > Enter Name as "TestNG" 
		  > Enter URL as "http://beust.com/eclipse/" 
		  > Click "OK" Then "TestNG will be populated... 
		  > Select "TestNG" > Next > Next > accept the agreement > Finish
		  
		  Write First TestNG Program / Test Case....
		   Manual Test Case: 
		   Test Case Name: Verify Page Title (Google) 
		   
		   Test Steps: 
		   i) Launch the Browser 
		   ii) Navigate to Google Home page (https://www.google.co.in/) 
		   ----------------------------------- 
		   Verification Point/s Capture the Page Title and Compare with expected 
		   
		   Expected: Google
		   ------------------------------------------------ 
		   TestNG Test Case 
		   ------------------------------- 
		   Note: 
		        i) main method is not used in TestNG Programs... 
		        ii) TestNG program contains methods only that contain @Test (Annotation) 
		        iii) If we don't write @Test Annotation then the method is not going to be executed 
		        ---------------------------------------- 
		        public class Class2 {
		         @Test public void verifyTitle(){
		          System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe"); 
		          WebDriver driver = new ChromeDriver(); 
		          driver.get("https://www.google.co.in/"); 
		          Assert.assertEquals("Google", driver.getTitle()); 
		          driver.close(); 
		          } 
		          }
		     -----------------------------------------------------------
		  */
	
		  @Test 
		  public void verifyTitle()
		  { 
			  System.setProperty("webdriver.chrome.driver", "V:/Softwares_Donload/chromedriver.exe"); 
			  WebDriver driver = new ChromeDriver(); 
			  driver.get("https://www.google.co.in/"); 
			  Assert.assertEquals("Google", driver.getTitle()); 
			  driver.close(); 
			  } 
		  }
	
	


