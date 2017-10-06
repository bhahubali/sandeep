package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorsid {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();  
		driver.get("https://accounts.google.com");
		 WebElement ebox=driver.findElement(By.id("identifierId"));
		
		ebox.sendKeys("panyamsandeep250@gmail.com");
	 Thread.sleep(5000);
	 ebox.clear();
	 
	 Thread.sleep(5000);
	 ebox.sendKeys("panyamsandeep@gmail.com");
	 ebox.click();
	 Thread.sleep(5000);
	 driver.close();
	
	}

}
 