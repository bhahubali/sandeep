package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Seenu {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("sreenivas.pallam");
		driver.findElement(By.id("pass")).sendKeys("Sreenu680");
		driver.findElement(By.id("loginbutton")).click();
	    

	}

}
