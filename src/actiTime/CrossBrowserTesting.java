package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/*   Selenium Class 37: 
                Writing Selenium Test Cases Part-5 
              ------------------------------------------------------------
                10) Write a Test Case for Positive and Negative Testing 
               Test Steps: i) Launch the Browser 
                           ii) Navigate to "http://www.gcrit.com/build3/admin/" 
                           iii) Enter "Username" 
                           iv) Enter "Password" 
                            v) Click "Login" Button 
              ------------------------------------------------ 
               Verification Point/s Capture the URL after Login to Application then compare with expected. 
               Expected URL: "http://www.gcrit.com/build3/admin/index.php"
              ---------------------------------------------- 
             Input for Positive Testing: i) Username: admin 
                                        ii) Password: admin@123
               ---------------------------------------------- 
              Input for Negative Testing: i) Username: admin1 
                                          ii) Password: admin@1234 
              ----------------------------------------------*/
public class CrossBrowserTesting {
	public static WebDriver driver;
	public static String Username;
	public static String password;
	public static int Iteration;

	public static void main(String[] args) {
		for(int i=1;i<=2;i++)
		{
			
			if(i==1)
			{
				Username="admin";
				password="admin@123";
				Iteration=1;
			}
			
			else if(i==2)
			{
				Username="admin12";
				password="admin@123";
			   Iteration=2;
			}
		
	     WebDriver driver=new FirefoxDriver();
         driver.get("http://www.gcrit.com/build3/admin/");
         driver.findElement(By.name("username")).sendKeys(Username);
         driver.findElement(By.name("password")).sendKeys(password);
         driver.findElement(By.id("tdb1")).click();
         
         String url=driver.getCurrentUrl();
         if(url.contains("http://www.gcrit.com/build3/admin/index.php"))
         {
       	  System.out.println("Admin login succesfull-passed");
         }
         else
         {
       	  System.out.println("Admin login unSuccesfull-failed");
         }
         driver.close();
		

	}
	}
}
