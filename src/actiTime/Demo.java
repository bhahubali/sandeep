package actiTime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
class Demo
{
public static void main(String[] args)
{
WebDriver driver=new FirefoxDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://www.yatra.com/");
driver.findElement(By.id("BE_flight_depart_date")).click();
driver.findElement(By.xpath(".//*[@id='a_2017_9_6']/span")).click();
/*DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");

//get current date time with Date()
Date date = new Date();

// Now format the date
String date1= dateFormat.format(date);

// Print the Date
System.out.println(date1);*/

}
}
		
	


