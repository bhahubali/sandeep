package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Googleverify {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("panyamsandeep250@gmail.com");
		//driver.findElements(By.className("CwaK9")).click();
	    driver.findElement(By.name("password")).sendKeys("sandeep250");
	    driver.close();
		
	}

}
