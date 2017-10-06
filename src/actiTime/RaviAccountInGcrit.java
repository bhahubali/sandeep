package actiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RaviAccountInGcrit {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.gcrit.com/build3/create_account.php");

		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
		driver.findElement(By.name("firstname")).sendKeys("chintakuntla");
		
		driver.findElement(By.name("lastname")).sendKeys("ravi");
		
		driver.findElement(By.xpath(".//*[@id='dob']")).sendKeys("06/25/1993");
		
		driver.findElement(By.name("email_address")).sendKeys("ravicv@gmail.com");
		driver.findElement(By.name("company")).sendKeys("stagsoftware");
		
		driver.findElement(By.name("street_address")).sendKeys("dilshipnagar");
		
		driver.findElement(By.name("postcode")).sendKeys("560027");
		
		driver.findElement(By.name("city")).sendKeys("Hyderabad");
		
		driver.findElement(By.name("state")).sendKeys("Telangana");
		Select select=new Select(driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[4]/table/tbody/tr[6]/td[2]/select")));
		
		select.selectByVisibleText("India");
		
		
		
		driver.findElement(By.name("telephone")).sendKeys("9704306663");
		
		driver.findElement(By.name("newsletter")).click();
		

		driver.findElement(By.name("password")).sendKeys("9999999999");
		

		driver.findElement(By.name("confirmation")).sendKeys("9999999999");
		driver.findElement(By.id("tdb4")).click();
		
		
		
		
		
		
	}

}
