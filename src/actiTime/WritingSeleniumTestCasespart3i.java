package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WritingSeleniumTestCasespart3i {

	public static void main(String[] args) {
		 /* 6) Verify "Admin Loin" Functionality in gcrShop Admin Interface (www.gcrit.com/build3/admin 
        --------------------------------------------------------------  
        Test Steps: i) Launch the Browser 
                    ii) Navigate to "www.gcrit.com/build3/admin/" 
                    iii) Enter "Username"   
                    iv) Enter "Password" 
                    v) Click "Login" Button 
        Verification Point/s Capture the URL after Login to Application then compare with expected 
        Expected URL: http://www.gcrit.com/build3/admin/index.php 
        Input Data: i) Username: admin ii) Password: admin@123

*/
	        WebDriver driver=new FirefoxDriver();
	        driver.get("http://www.gcrit.com/build3/admin/");
	        driver.findElement(By.name("username")).sendKeys("admin");
	        driver.findElement(By.name("password")).sendKeys("admin@123");
	        driver.findElement(By.id("tdb1")).click();
	        
	        String url=driver.getCurrentUrl();
	        
	        if(url.contains("http://www.gcrit.com/build3/admin/index.php"))
	        {
	        	System.out.println("url is matched-passed");
	        	
	        }
	        else
	        {
	        	System.out.println("url is does not match-failed");
	        }
	        
             driver.close();
	}

}
