package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WritingSeleniumTestCasespart3 {

	public static void main(String[] args) {
		WebDriver driver=new  FirefoxDriver();
		//**********************************************************/*
		
		/*Selenium Class 35
		 * 
		 * 5) Verify Customer Login to gcrShop user Interface... 
-------------------------------------------------------------- 
              Test Steps: 
	                     i) Launch the Browser 
                         ii) Navigate to "www.gcrit.com/build3/"
                         iii) Enter "Email Address" 
                         iv) Enter "Password" 
                         v) Click "Sign In" Button 
               Verification Point/s: Verify the Existence of "Logoff" Link, if exists then pass otherwise fail. 
              Input Data: Email Address: asdfzxc123b@gmail.com
              Password: abcdxyz321*/
		
		/*driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("xyza123abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456");
		driver.findElement(By.id("tdb5")).click();
		
		if(driver.findElement(By.linkText("Log Off")).isDisplayed()==true)
		{
		System.out.println("Log Off link is Exist-paseed");
		}
		else{
			
			System.out.println("Log Off link is not Exist-failed");	
		}
		
		driver.close();*/
		
	
	//**********************Nahgative Test Cases**********************
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("login")).click();
		driver.findElement(By.name("email_address")).sendKeys("xyza123abc@gmail.com");
		driver.findElement(By.name("password")).sendKeys("123456789");
		driver.findElement(By.id("tdb5")).click();
		try{
		
		if(driver.findElement(By.linkText("Log Off")).isDisplayed()==true)
		{
		System.out.println("Log Off link is Exist-paseed");
		}}
		catch(NoSuchElementException e)
		{
			
			System.out.println("Log Off link is not Exist-failed");	
		}
		
		driver.close();
	
      	}
		}

         
	
	
	
	