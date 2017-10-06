package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class hemanth {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		WebDriver d = new FirefoxDriver();
		d.get("http://automationpractice.com/");
		String a =d.getTitle();
		System.out.println(a);
		d.findElement(By.partialLinkText("Sign")).click();
		Thread.sleep(5000);
		d.findElement(By.id("email_create")).sendKeys("reddysandeep356@gmail.com");
		d.findElement(By.xpath(".//*[@id='SubmitCreate']")).click();
		Thread.sleep(5000);
		d.findElement(By.id("id_gender1")).click();
		Thread.sleep(5000);
		d.findElement(By.xpath(".//*[@id='customer_firstname']")).sendKeys("panyam");
		d.findElement(By.xpath(".//*[@id='customer_lastname']")).sendKeys("sandeep");
		Select sel1=new Select(d.findElement(By.xpath(".//*[@class='form-control']")));
		sel1.selectByIndex(2);
		
		
		
	}

}
