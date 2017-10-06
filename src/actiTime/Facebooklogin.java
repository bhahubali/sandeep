package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebooklogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get(" https://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("9491971494");
	driver.findElement(By.id("pass")).sendKeys("9441951494");
	driver.findElement(By.id("u_0_r")).click();
	Thread.sleep(5000);
	//driver.findElement(By.class("_54nh")).click();
	
	
	
	
	}

	
	

}
