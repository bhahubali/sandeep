package actiTime;



import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

class Copyscreenshot

{
public static void main(String[] args) 
{
WebDriver driver=new FirefoxDriver();
driver.get("http://www.naukri.com/");
String mTitle=driver.getTitle();
Set<String> allWH=driver.getWindowHandles();
for(String wh:allWH)
{
driver.switchTo().window(wh);
String title=driver.getTitle();
if(mTitle.equals(title))
{
System.out.println("Main Browser is "+mTitle);
}
else
{
System.out.println(title+" - child browser is closed");
driver.close();
}
}
}	}
	