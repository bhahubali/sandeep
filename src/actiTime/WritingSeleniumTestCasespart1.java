package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WritingSeleniumTestCasespart1 {

	public static void main(String[] args) throws InterruptedException {
		//******************Test Steps:************
		
		/* i) Launch the Browser 
           ii) Navigate to wikipedia.org selenium page... 
           iii) Click "Create Account"
           iv) Capture the URL 
           v) Navigate back to Selenium Page 
           vi) Click "selenium.org" Link 
           vii) Capture the URL
           viii) Close the Browser
		*/
		/*WebDriver driver =new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		driver.findElement(By.linkText("Create account")).click();
		String url1=driver.getCurrentUrl();
		//System.out.println(url1);
		if(url1.contains("https://en.wikipedia.org"))
		{
			System.out.println("1st verification:"+ "it is an internal link -passed");
		}
		else
		{
			
			System.out.println("1st verification:"+ "it is  not an internal link failed");
		}
		
		driver.navigate().back();
		driver.findElement(By.linkText("www.seleniumhq.org")).click();
		String url2=driver.getCurrentUrl();
		
		if(url2.contains("http://www.seleniumhq.org"))
		{
			System.out.println("2nd verification:"+ "it is an internal link -passed");
		}
		else
		{
			
			System.out.println("2nd verification:"+ "it is  not an internal link failed");
		}
			
		//System.out.println(url2);
		Thread.sleep(5000);
		driver.close();*/
		
		
		
		//***********************************************************************
		//Test Cases Positive Test Case (Valid Input...) 
		/*Negative Test Case (Invalid Input...) 
		-------------------------------------------------------------- 
		Negative Test Case: 
		Note: Generally we use Invalid input for Negative Testing, suppose ther is no input data in our Test Case, 
		then use incorrect Expected Result for Negative Testing.*/
		
		//**************** Nagative Testing code********************
		
		/*WebDriver driver =new FirefoxDriver();
		driver.get("https://en.wikipedia.org/wiki/Selenium_%28software%29");
		driver.findElement(By.linkText("Create account")).click();
		String url1=driver.getCurrentUrl();
		//System.out.println(url1);
		if(url1.contains("https://en.wikipedia789.org"))
		{
			System.out.println("1st verification:"+ "it is an internal link -passed");
		}
		else
		{
			
			System.out.println("1st verification:"+ "it is  not an internal link failed");
		}
		
		driver.navigate().back();
		driver.findElement(By.linkText("www.seleniumhq.org")).click();
		String url2=driver.getCurrentUrl();
		
		if(url2.contains("http://www.seleniumhq1235.org"))
		{
			System.out.println("2nd verification:"+ "it is an internal link -passed");
		}
		else
		{
			
			System.out.println("2nd verification:"+ "it is  not an internal link failed");
		}
			
		//System.out.println(url2);
		Thread.sleep(5000);
		driver.close();*/
		
		
		
		//***********************************************************
		
		//*************Test Case 2 Verify "Gmail" Link Existnace In Google Home  Page***********
		/*2) Test Case: 
		Verify "Gmail" Link existence in Google Home Page. Test Steps:
		i) Launch the Browser 
        ii) Navigate to Google Home Page ("https://www.google.com/") 
        Verification Point Verify the Existence of "Gmail" Link 
        Input Data: NA*/
		/*
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.co.in");
		boolean linkPresent=driver.findElement(By.linkText("Gmail")).isDisplayed();
		if( linkPresent== true)
		{
		System.out.println("status:pass");
		
	    }
		else
		{
			System.out.println("status:fail");
		}
		driver.close();*/
		
		
		
		//*************************************Nagtive Senario Coding*************
		
		/*WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.co.in");
		try{
		boolean linkPresent=driver.findElement(By.linkText("Gmail1235")).isDisplayed();
		if( linkPresent== true)
		{
		System.out.println("status:pass");
		
	    }}
		catch(NoSuchElementException e)
		{
			System.out.println("status:fail");
		}
		driver.close();
		*/
	}
	}

	


