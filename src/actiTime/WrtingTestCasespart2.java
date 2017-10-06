package actiTime;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WrtingTestCasespart2 {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.google.co.in");
		try{
		
		boolean elementPresent=driver.findElement(By.linkText("Yahoo")).isDisplayed();
		System.out.println(elementPresent);
		if(elementPresent==false)
		{
	
			System.out.println("Gmail link Exists-passed");
	}}
		catch(NoSuchElementException e)
		{
			System.out.println("Gmail link Exists-failed");
		}
	
	driver.close();*/
		
		
         //*********************************************************************
		/*Selenium Class 34: 
			Writing Selenium Test Cases Part-2 ----------------------------------------------------------- 
			Test Case 1 - Verify Internal and External links... 
			Test Case 2 - Verify the Element displayed status.... ------------------------------------------------------- 
			Test Case 3 - Login to Indian Railway web portal ------------------------------------------------------- 
			Test Steps: i) Launch the Browser 
                        ii) Navigate to "https://www.irctc.co.in/"
                        iii) Enter "User ID"  
                        iv) Enter "Password" 
                        v) Read the captcha (verification code) and enter captcha 
                        vi) Click "Login"
                        Verification Point/s:
                        verify the "Signout" element existence after Login, if exists then Pass otherwise fail. 
                        Input Data:
                        User ID: gcreddy7 
                        Password: gld938 
                        Captcha - Dynamic Input... 
                        Expected Result: Singout Link...*/ 
		
	/*	WebDriver driver=new FirefoxDriver();
		driver.get("https://www.irctc.co.in");
		driver.findElement(By.id("usernameId")).sendKeys("gcreddy7");
		driver.findElement(By.className("loginPassword")).sendKeys("gld938 ");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter captcha");
		String captcha=scan.nextLine();
		driver.findElement(By.className("loginCaptcha")).sendKeys(captcha);//you only click enter button after typing captcha
		//Thread.sleep(10000);
		driver.findElement(By.id("loginbutton")).click();
		
		if(driver.findElement(By.xpath(".//*[@id='topnav']/li[8]/ul/li[5]/a/span")).isDisplayed())
		{
		System.out.println("Login Successful-passsed");	
		}
		else
		{
			System.out.println("Login unSuccessful-Failed");	
		}
		driver.close();
		
		
	}
	
	
}*/
		
		/*Test Case 4: 
		Customer Registration in gcrShop web portal 
		----------------------------------------------------------------
		Test Steps: i) Launch the Browser 
                    ii) Navigate to "http://www.gcrit.com/build3/" 
                    iii) Click on "create an account" Link 
                    iv) Enter all mandatory fields 
                    v) Click "Continue" Button 
                    Verification Point: Capture the conformation message after Login and compare with expected 
                    Expected message: Your Account Has Been Created!*/
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.gcrit.com/build3/");
		driver.findElement(By.linkText("create an account")).click();
		driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).click();
		driver.findElement(By.name("firstname")).sendKeys("abcdef");
		driver.findElement(By.name("lastname")).sendKeys("xyza");
		driver.findElement(By.id("dob")).sendKeys("09/23/1994");
		driver.findElement(By.name("email_address")).sendKeys("xyza123abc@gmail.com");
		driver.findElement(By.name("street_address")).sendKeys("wilsongarden");
		
		driver.findElement(By.name("postcode")).sendKeys("518155");
		

		driver.findElement(By.name("city")).sendKeys("hyderabad");
		driver.findElement(By.name("state")).sendKeys("telangana");
		Select dropdown=new Select(driver.findElement(By.name("country")));
		dropdown.selectByVisibleText("India");
		
		driver.findElement(By.name("telephone")).sendKeys("9740972134");
		driver.findElement(By.name("password")).sendKeys("123456");
		
		driver.findElement(By.name("confirmation")).sendKeys("123456");
		
		driver.findElement(By.id("tdb4")).click();
		
		
		String ConformationMessage=driver.findElement(By.tagName("h1")).getText();
		
		if(ConformationMessage.equals("Your Account Has Been Created!"))
		{
			System.out.println("coustmer registration succesfull-passed");
		}
		else
		{
			System.out.println("coustmer registration unsuccesfull-failed");
		}
		
		
		
		//driver.close();
		
		
		
	}}