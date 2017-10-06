package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookMukesh {

	public static void main(String[] args) throws InterruptedException {
		/*WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("u_0_7")).sendKeys("panyam");
		driver.findElement(By.id("u_0_9")).sendKeys("selenoium");	
		
		//driver.findElement(By.id("u_0_c")).sendKeys("selenoium");	
		
		driver.findElement(By.id("u_0_c")).sendKeys("999999999");	
		Select sel=new  Select(driver.findElement(By.id("day")));
		sel.selectByValue("3");
		Select sel1=new  Select(driver.findElement(By.id("month")));
	       sel1.selectByVisibleText("May");
	       Select sel2=new Select(driver.findElement(By.id("year")));
	       sel2.selectByValue("2015");
		
	       
	       driver.findElement(By.id("u_0_5")).click();
	       
	       driver.findElement(By.id("u_0_p")).click();*/
	       
	
		/*WebDriver driver=new FirefoxDriver();
		driver.get("http://www.seleniumhq.org/");
		driver.findElement(By.xpath(".//*[@id='menu_download']/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.xpath(".//*[@id='menu_about']/a")).click();
		Thread.sleep(3000);
		driver.navigate().back();*/
		
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get("https://accounts.google.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath(".//*[@id='identifierNext']/content/span")).click();
		String Errormessage=driver.findElement(By.xpath(".//*[@id='view_container']/form/div[2]/div/div[1]/div[1]/div/div[2]/div[2]")).getText();
		
		System.out.println(Errormessage);
	*/
		
		/*WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.findElement(By.className("gb_P")).click();
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.className("gb_70")).click();
		Thread.sleep(3000);
		driver.navigate().back();*/
		
	    WebDriver driver=new FirefoxDriver();
	     driver.get("http://www.tupaki.com/");
	     Thread.sleep(3000);
	     driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[3]/a")).click();
	     Thread.sleep(3000);
	     driver.navigate().back();
	     driver.findElement(By.xpath("html/body/div[1]/div/div/ul/li[2]")).click();
	     Thread.sleep(3000);
	     driver.navigate().back();
	     
	     
	}

}
