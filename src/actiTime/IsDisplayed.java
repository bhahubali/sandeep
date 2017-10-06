package actiTime;

import org.omg.Messaging.SyncScopeHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IsDisplayed {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		//gettitle()
		//getcurrenturl()
		//getpagesource()
		
		String title=driver.getTitle();
	    String url=driver.getCurrentUrl();
	    String WindowHandle=driver.getWindowHandle();
	    System.out.println( title);
	    System.out.println( url);
	    System.out.println( WindowHandle);
	    String pagesource=driver.getPageSource();
	    System.out.println(pagesource);
	    driver.close();
		
		
	}

}
