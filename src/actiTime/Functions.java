package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Functions {
	

	public static void main(String[] args) {
		    
	 WebDriver driver=new FirefoxDriver();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	 driver.get("https://accounts.google.com");
	 driver.findElement(By.id("identifierId")).sendKeys("reddysandeep356@gmail.com");
	 driver.findElement(By.className("RveJvd snByac")).click();
	 driver.findElement(By.id("whsOnd zHQkBf")).sendKeys("9035422431");
	 driver.findElement(By.className("RveJvd snByac")).click();
	 
	 
	 
		 }
	

}
