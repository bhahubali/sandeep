package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookCreateAccount {

	public static void main(String[] args) throws InterruptedException 
	  {
		
		WebDriver driver=new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath(".//*[@name='firstname']")).sendKeys("java");
		driver.findElement(By.xpath(".//*[@name='lastname']")).sendKeys("selenium");
		driver.findElement(By.xpath(".//*[@aria-label='Mobile number or email address']")).sendKeys("9999999999");
		driver.findElement(By.xpath(".//*[@name='reg_passwd__']")).sendKeys("123456");
		Select sel1=new Select(driver.findElement(By.xpath(".//*[@title='Day']")));
		sel1.selectByIndex(4);
	
		Select sel2=new Select(driver.findElement(By.id("month")));
		sel2.selectByVisibleText("Apr");
		
		Select sel3=new Select(driver.findElement(By.id("year")));
		sel3.selectByValue("2012");
		
		Thread.sleep(5000);
		
		
		driver.findElement(By.xpath(".//*[@id='u_0_7']")).click();
		
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath(".//*[@id='u_0_z']")).click();
		
		
	   driver.close();
	
	}

}
