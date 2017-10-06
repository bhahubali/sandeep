package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLinkClick {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://www.seleniumhq.org/");
	driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
	driver.navigate().back();
	driver.findElement(By.xpath(".//*[@id='menu_about']/a")).click();
	driver.findElement(By.xpath(".//*[@id='menu_about']/a")).click();
	Thread.sleep(20000);
	driver.findElement(By.xpath(".//*[@id='mainContent']/h3[1]/a")).click();
	
	driver.navigate().back();
	driver.close();
	
	}

}
