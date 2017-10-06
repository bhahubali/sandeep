package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browsernavigationcommands {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		//navigate().to()
		//navigate().back()
		//navigate().forward()
		
		/*driver.get("https://www.google.co.in");
		System.out.println(driver.getCurrentUrl());
		
		System.out.println(driver.getTitle());
		driver.navigate().to("https://in.yahoo.com/");
		
		System.out.println(driver.getTitle());
		driver.navigate().back();
		System.out.println(driver.getTitle());
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		driver.close();*/

		//commands/methods on Elements
		
		  //1)findElement()
		//2)findElements()
		//3)Sendkeys()
		//4)click()
		//5)clear()
		//6)getText()
		//7)getAttribute()
		
		
		driver.get("https://accounts.google.com");
		WebElement email=driver.findElement(By.id("identifierId"));
		boolean a=email.isDisplayed();
		System.out.println(a);
		a=email.isDisplayed();
		
		email.sendKeys("sandeep123");
		
		String emailAdress=email.getAttribute("value");
		System.out.println( emailAdress);
		email.clear();
		email.sendKeys("sandeep");
		
		
		
		
		
		
		
	}

}
