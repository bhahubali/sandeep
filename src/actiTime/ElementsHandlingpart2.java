package actiTime;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ElementsHandlingpart2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://accounts.google.com");
		//Handling Text Area,Error Message,Popup Window
		//a)Handling Text Area
		
String textArea=driver.findElement(By.id("headingSubtext")).getText();
System.out.println(textArea);

driver.findElement(By.className("ZFr60d CeoRYc")).click();
String ErrorMessage=driver.findElement(By.className("dEOOab RxsGPe")).getText();
System.out.println(ErrorMessage);

// Handling popup Window
		
		
		/*driver.navigate().to("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Alert alert=driver.switchTo().alert();
		Thread.sleep(5000);
		alert.accept();
		Thread.sleep(5000);
		driver.findElement(By.id("login1")).sendKeys("sandeep123");
		
	
		
	driver.findElement(By.id("password")).sendKeys("123456");
		driver.findElement(By.name("proceed")).click();*/
		
		
		//Handling Button
	/*	driver.get("https://accounts.google.com");
		driver.findElement(By.id("identifierId")).sendKeys("panyamsandeep250@gmail.com");
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		driver.findElement(By.cssSelector(".whsOnd.zHQkBf")).sendKeys("sandeep250");
		driver.findElement(By.cssSelector(".CwaK9")).click();
		//boolean enabledStatus=driver.findElement(By.className("RveJvd snByac")).isEnabled();
		//System.out.println(displayStatus);
		//System.out.println(enabledStatus);
		//String erroeMessage=driver.findElement(By.className("dEOOab RxsGPe")).getText();
		//System.out.println(erroeMessage);*/
		
		
		
	
	}

}
