package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WritingSeleniumTestCasespartBatchTesting {
	
	public static WebDriver driver; 
	//Launch Browser 
	public void launchBrowser(){ 
		driver = new FirefoxDriver(); 
		driver.manage().window().maximize();
		} 
	//Admin Login with Parameters 
	public void login(String Username, String Password){ 
		driver.get("http://www.gcrit.com/build3/admin/"); 
		driver.findElement(By.name("username")).sendKeys(Username); 
		driver.findElement(By.name("password")).sendKeys(Password); 
		driver.findElement(By.id("tdb1")).click(); } 
	//Close Browser 
	public void closeBrowser(){ 
		driver.close(); }

	public static void main(String[] args) {
		 WritingSeleniumTestCasespartBatchTesting  obj = new  WritingSeleniumTestCasespartBatchTesting (); 
		//Test Case 1: Verify Admin Login (Positive Test Case)
		obj.launchBrowser(); 
		obj.login("admin", "admin@123"); 
		String URL = driver.getCurrentUrl(); 
		if (URL.contains("http://www.gcrit.com/build3/admin/index.php")){ 
			System.out.println("Test Case 1:" +" Admin Login Successful - Passed");
			} 
		else { System.out.println("Test Case 1:"+" Admin Login Unsuccessful - Failed"); 
		}
		obj.closeBrowser();
		//Test Case 2: Verify Error Message in Admin Login Functionality (Negative Test Case) 
		obj.launchBrowser(); 
		obj.login("admin1", "admin@123"); 
		String ErrorMessage = driver.findElement(By.className("messageStackError")).getText(); 
		if (ErrorMessage.contains("Invalid administrator login attempt."))
		{ 
			System.out.println("Test Case 2: " + "Admin Login Unsuccessful & Showing Correct Error Message -Passed"); 
			} 
		else { System.out.println("Test Case 2: " + "Admin Login Unsuccessful & Not Showing Correct Error Message -Failed"); 
		} 
		obj.closeBrowser();
		
		//Test Case 3: Verify Redirect Functionality form Admin Interface to user Interface 
		obj.launchBrowser(); 
		obj.login("admin", "admin123"); 
		driver.findElement(By.linkText("Online Catalog")).click(); 
		String URL2 = driver.getCurrentUrl(); 
		if (URL2.equals("http://www.gcrit.com/build3/"))
		{ 
			System.out.println("Test Case 3: "+ "Redirected from Admin to User Interface - Passed"); 
			}
		else { System.out.println("Test Case 3: "+ "Not Redirected from Admin to User Interface - Failed"); 
		} 
		obj.closeBrowser();
		}
	}

	
