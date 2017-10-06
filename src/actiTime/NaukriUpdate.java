package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NaukriUpdate {

	public static void main(String[] args) throws InterruptedException {
	WebDriver d=new FirefoxDriver();
	d.get("https://www.naukri.com/");
	d.findElement(By.xpath(".//*[@id='login_Layer']")).click();
	d.findElement(By.xpath(".//*[@id='eLogin']")).sendKeys("reddysandeep356@gmail.com");
	d.findElement(By.xpath(".//*[@id='pLogin']")).sendKeys("9035422431");
	d.findElement(By.xpath(".//*[@id='lgnFrm']/div[8]/button")).click();
	//d.findElement(arg0)
	Thread.sleep(5000);
	d.findElement(By.xpath(".//*[@id='colL']/div[2]/div[1]/a[1]")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath(".//*[@id='uploadLink']")).click();
	Thread.sleep(5000);
	d.findElement(By.xpath(".//*[@id='attachCV']")).sendKeys("S:\\Project Folder\\sandeep Exp Resume Automation\\ResumeSandeep.doc");
	
	//d.findElement(By.)
	d.findElement(By.xpath(".//*[@type='button']")).click();
	
	
	}

}
