package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WritingSeleniumTestCasespart3ii {
	static String ErrorMessage;

	public static void main(String[] args) {
		
		/*7) Test Case: Verify Admin Login, Error Messages in gcrShop Admin Interface 
        ------------------------------------------------------------------ 
        Test Steps: i) Launch the Browser 
                    ii) Navigate to "www.gcrit.com/build3/admin/" 
                    iii) Enter "Username" 
                    iv) Enter "Password" 
                    v) Click "Login" Button 
                 
         Verification Point/s
                     i) Capture the URL after Login to Application then compare with expected 
                     ii) Capture the Error Message and compare with Expected 

        Expected URL:i) http://www.gcrit.com/build3/admin/index.php 
            	     ii) Error: Invalid administrator login attempt. 
                 
        Test Data for Positive Scenario: 
                	 i) Username: admin 
                     ii) Password: admin@123
       --------------------------------------------- 
       Test Data for Negative Scenario 1: 
                	  i) Username: Valid Username
                      ii) Password: Invalid Password
      --------------------------------------------- 
       Test Data for Negative Scenario 2: 
                	    i) Username: Invalid Username 
                        ii) Password: Valid Password 
       --------------------------------------------- 
       Test Data for Negative Scenario 3: 
            	         i) Username: Invalid Username 
                         ii) Password: Invalid Password 
       --------------------------------------------- 
       Test Data for Negative Scenario 4: 
                	   i) Username: Blank 
                       ii) Password: Valid / Invalid Password 
       --------------------------------------------- 
       Test Data for Negative Scenario 5: 
                	    i) Username: Valid / Invalid Username 
                        ii) Password: Blank 
        --------------------------------------------- 
       Test Data for Negative Scenario 6:
                    	 i) Username: Blank 
                         ii) Password: Blank
		*/

	
	
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.gcrit.com/build3/admin/");
    driver.findElement(By.name("username")).sendKeys("admin1");
    driver.findElement(By.name("password")).sendKeys("admin@123");
    driver.findElement(By.id("tdb1")).click();
    
    String url=driver.getCurrentUrl();
    
    if(!url.contains("http://www.gcrit.com/build3/admin/index.php"))
    {
    	 ErrorMessage=driver.findElement(By.className("messageStackError")).getText();
    	 System.out.println("ErrorMessage");
    }
    
    if(url.contains("http://www.gcrit.com/build3/admin/index.php"))
    {
    	System.out.println("Admin Login Succesful-passed");
    	
    }
    else if(ErrorMessage.contains("Error Error: Invalid administrator login attempt."))
    {
    	System.out.println("url is does not match-failed ,but showing coorect errormessage");
    }
    else
    {
    	System.out.println("Admin Login unsuccesful,and not showing correct error message");
    }
    
     driver.close();
}

}
//Note: Whenever we insert multiple verification points ina Test case then we use multiple Conditional statements or else if structure.
	
	


