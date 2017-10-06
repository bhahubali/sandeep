package actiTime;

public class Synchronization {

	public static void main(String[] args) {
		
		
	/*	Class Notes: 
	    Selenium Class 38: Introduction to Selenium IDE
	    ------------------------------------------------------ 
	    i) Synchronization in Selenium WebDriver 
        ii) Introduction to Selenium IDE
        -------------------------------------------------------- 
        i) Synchronization in Selenium WebDriver 
             1) What is Synchronization?  
             2) Why Synchronization? 
             3) When Synchronization is required? 
             4) How to Synchronize AUT and Test Tool (Selenium WebDriver) 
        -------------------------- 
           1) What is Synchronization?
        General:    
		It is a process of coordinating or matching two or more activities or devices or processes in time. 
		Test Automation: 
		It is a process of matching the speeds of AUT (Application Under Test) and Test Tool (Selenium WebDriver) in order to get proper execution.

         -------------------------- 
          2) Why Synchronization? 
          During Test Execution Test Tool gives instructions one by one with same speed, but AUT takes less time for some steps execution and more time for some steps execution, in order to keep them in sync then Synchronization is required.
          
           3) When Synchronization is Required? 
           Whenever any step takes more than Synchronization Time for Execution there Synchronization is required.
          
          NOTE:
          * Selenium Tool Default Synchronization Time is 30 Seconds.
          *  UFT Tool Default Synchronization Time is 20 seconds
          ----------------------------------
            
            4) How to Synchronize AUT and Test Tool (Selenium WebDriver) 
           Two types of Synchronization,
             a) Unconditional Synchronization 
             In this way we specify timeout value, we will make the tool to wait certain amount of time and then proceed. 
             Syntax: Thread.sleep (Time in milli Seconds) 
             ----------------------------------------------------- 
             b) Conditional Synchronization It will not work for all commands or statements, only for findElement and findElements commands / steps. 
             Syntax: driver.manage().timeouts().implicitlyWait(Time in Seconds, TimeUnit.SECONDS);
             
           -------------------------------------------------------------- 
           5) How to get the Synchronization Problem? 
           By conducting dry runs/Sample runs we can identify the Synchronization Problem. 
           --------------------------------------------------------------
            Note: default Synchronization Time is not applicable for irregular (Not Normal) Statements (ex: Capturing any value during execution)
             
              
              Example:
               
           System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
           WebDriver driver = new ChromeDriver(); 
           driver.manage().window().maximize(); 
           driver.get("https://www.google.co.in"); 
           Thread.sleep(10000); driver.findElement(By.linkText("Gmail")).click();
          } } 
            ---------------------------------------------------------- 
                    System.setProperty("webdriver.chrome.driver", "D:/chromedriver.exe");
                    WebDriver driver = new ChromeDriver(); driver.manage().window().maximize(); 
                    driver.get("https://www.google.co.in"); 
                    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS); 
                    driver.findElement(By.linkText("Gmail")).click(); 
                  } }

                 ------------------------------------------------------------------------------ 
               ii) Introduction to Selenium IDE (Integrated Development Environment) 
           ------------------------------------------------------------------------------ 
              1) Introduction to Selenium IDE: 
                > It is a Test Tool in Selenium suite to create and execute Test Cases 
                > It is a Firefox Browser plug in, works only on Firefox Browser 
                > It Provides GUI for Recording user actions on AUT using Firefox Browser, and user can edit (Insert/Update/Delete) Test Steps. 
                > Using "Page Inspector" feature we can inspect elements, or using Firebug and Firepath plug in also we can inspect elements. 
                > Selenium IDE only used as prototyping tool. 
                (* we can't develop complex Test Cases using Selenium IDE, It doesn't supporty any programming)
                 ------------------------------------------------------------------------------------------ 
                 Creating Test Cases / Test Steps in Selenium WebDriver,
                  Using Element Locators and WebDriver API Commands we can create Test Cases... 
                 One Sample Step... 
                 Click "Gmail" Link in "Google" Home Page... 
                 Syntax: driverObject.findElement(By.ElementLocator("Locator Value")).WebDriver Command/method(); 
                 Example: driver.findElement(By.linkText("Gmail")).click();
                 
                 Selenium IDE: 
                 Using Element Locators and Selenese Commands / Selenium IDE Commands. 
                 Syntax: Command + Taget + Value 
                 Command - Forms the Functionality of the Step 
                 Target - Identified the Element on the Web page 
                 Value -Input Data (This is applicable for a few commands) 
                 Example: Type id=Email abcdef@gmail.com 
                 Note: Selenium IDE Test Script default format is .html 
                 --------------------------------------- 
                 Click "Gmail" Link in "Google" Home Page... 
                 clickAndWait link=Gmail
                 ----------------------------------------------------------------------------------- 
                 2) Selenium IDE Installation 
                 > Launch "Firefox" Browser, and navigate to Google.com 
                 > In Google home page, type "Selenium IDE Download" 
                 > Go to "seleniumhq.org download page 
                 > Go to Selenium IDE Download area 
                 > Download and Install Selenium IDE 
                 > Restart the Browser... 
                 
                 ------------------------------------------------------------------
                  3) Selenium IDE Drawbacks 
                  > It supports Mozilla Firefox Browser only for creating and executing test Case 
                  > Data driven Testing is not possible 
                  > No Programming support, so we can't use programming features to enhance Test Cases...
                   > Selenium IDE is not suitable for Complex test Design 
                   ------------------------------------------------------﻿*/
	}

}
