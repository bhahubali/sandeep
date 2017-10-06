package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locatorsname {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
    driver.get("https://www.google.co.in");
    driver.findElement(By.className("gb_b gb_5b")).click();
    
   
    
    
    
	}

}
