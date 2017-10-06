package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorsPartialLinkText {

	public static void main(String[] args) {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		driver.findElement(By.partialLinkText("a")).click();

	}

}
