package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Dillep {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		/*driver.get("https://www.google.co.in");
		driver.navigate().to("https://www.google.co.in");
		
		driver.get("https://www.facebook.com/");
		driver.navigate().back();
		driver.navigate().forward();
		String Message=driver.getCurrentUrl();
		System.out.println(Message);
		String Title=driver.getTitle();
		System.out.println(Title);
		driver.quit();*/
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("testing");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("selenium");
		
		
		

	}

}
