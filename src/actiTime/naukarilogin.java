package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class naukarilogin {

	public static void main(String[] args) {
		WebDriver driver= new FirefoxDriver();
		driver.get("https://login.naukri.com");
		driver.findElement(By.id("emailTxt")).sendKeys("reddysandeep356@gmail.com");
		driver.findElement(By.id("pwd1")).sendKeys("9035422431");
		driver.findElement(By.id("sbtLog")).click();
		
		

	}

}
