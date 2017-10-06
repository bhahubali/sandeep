package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class Webdrivercommands {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		//get()
		/*driver.get("https://www.google.co.in");*/
		
		 //getTitle()
		
        /*driver.get("https://www.icicibank.com/");
        String Title=driver.getTitle();
       System.out.println(Title);*/
		
	//getCureenturl()
		
	/*driver.get("https://www.google.co.in/");
	String bowserurl=driver.getCurrentUrl();
	System.out.println(bowserurl);*/
		
		
		//Navigate().to("url")
		
		/*driver.get("https://www.google.co.in/");
		String bowserurl=driver.getCurrentUrl();
		System.out.println(bowserurl);
		driver.get("https://in.yahoo.com/");
		String bowserUrl=driver.getCurrentUrl();
		System.out.println(bowserUrl);*/

		
		
		//navigate().back()
		
		/*driver.get("https://www.google.co.in/");
		driver.navigate().to("https://in.yahoo.com/");
		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());*/
		
		
		
		//navigate().forword();
		
		
		/*driver.get("https://www.google.co.in/");
		System.out.println(driver.getCurrentUrl());
	  driver.navigate().to("http://www.rediff.com/");
	  System.out.println(driver.getCurrentUrl());
	  driver.navigate().back();
	  System.out.println(driver.getCurrentUrl());
	  driver.navigate().forward();
	  System.out.println(driver.getCurrentUrl());*/
	
	  
	  
	  //navigate().refresh();
		
		/*driver.get("https://www.google.co.in/");
		driver.navigate().refresh();
		*/
		
	//close()
		
		/*driver.get("https://www.google.co.in/");
		driver.close();
		*/
		
	//quit();
		
		/*driver.get("https://www.google.co.in/");
		driver.get("https://in.yahoo.com/");
		driver.quit();*/
		
		
	//findElement()
		/*driver.get("https://www.google.co.in/");
		driver.findElement(By.linkText("Gmail")).click();*/
		
		//click
		//clear
		//senkeys
		//findElement()
		//FindElements()
		//
		
		//isDisplayed()-checks weather the element is displayed or not in the current webpage
		//Syntax:
		//boolean variableName=driverObject.findElement(By.ElementLoator("value")).isDisplayed();
		
		
		
		//isEnabled
		
		//checks weather the element is Enabled or not in the current webpage
		//Syntax:
		//boolean variableName=driverObject.findElement(By.ElementLoator("value")).isEnabled();
		
		
		//isSelected()
		//checks weather the element is Selected or not in the current webpage
		//Syntax:
	 //boolean variableName=driverObject.findElement(By.ElementLoator("value")).isSelected();
				
 //Note:isDisplayed() and is Enabled()commands applicable for all type of elements(ex:liks,Buttons)
//isSelected()is Applicable For only RadioButtons And CheckBoxes		
		
		
	}

}
