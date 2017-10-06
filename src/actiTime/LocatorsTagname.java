package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsTagname {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.findElement(By.linkText("Images")).click();

		
	}

}
