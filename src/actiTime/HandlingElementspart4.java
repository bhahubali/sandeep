package actiTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingElementspart4 {

	public static void main(String[] args) throws InterruptedException {
		
		//Handling webtable/Html table
		//Handling Frames
	
	//*******************Handling HTML Table*********
		//check displayed status
		//>Get Cell value
		//>Return rows Count
		//>Return cells count
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.close();
		
	
		/*driver.get("file:///C:/Users/VijayaKumar/Desktop/html%20%20practice/tables.html");
		boolean displayStatus=driver.findElement(By.id("t01")).isDisplayed();
		System.out.println(displayStatus);
		
		WebElement  abc=driver.findElement(By.id("t01"));
		List <WebElement> rows=abc.findElements(By.tagName("tr"));
		int rowcount=rows.size();
		System.out.println("Rows count is:"+rowcount);
		
		List<WebElement> cells= abc.findElements(By.tagName("td"));
		int cellscount=cells.size();
		System.out.println("CellsCount is:"+cellscount);
		
		//System.out.println(" coulms count is:"+ cells.size()/rows.size());
		
		
		String cellValue=driver.findElement(By.xpath(".//*[@id='t01']/tbody/tr[3]/td[2]")).getText();
		System.out.println(cellValue);
		
		
		String cellValue1=driver.findElement(By.xpath(".//*[@id='t01']/tbody/tr[4]/td[1]")).getText();
		System.out.println(cellValue1);
		driver.close();
		
		*/
		
		//***************Handling Frames**********************
		
		
	     //>Html Frames are used to dived the Browser into Multiple Section, Where Each Section can load a Seperate HTML Document
		//> Frames are Section Of Webpage Displayed on Top Window>
		//>Whenever We Acesss  The Page Then Focus On The Top Window
		
		//Note: If it is Manual Testing We no Need to focus on Frames we can operate elements  inn any frame directly
		// In Test automation using Selenium WebDriver First we need to Switch to a frame then We Can Access Elements in that frame
		

		driver.get("http://seleniumhq.github.io/selenium/docs/api/java/index.html");
		//driver.findElement(By.linkText("org.openqa.selenium")).click();
		//Switch from top window is done in two ways 
		//i)Using Frame Index
		//ii)Using  Frame Name
		//--------------------------------------
		//i)Using Frame Index
		//Syntax: driver.switchTo().frame(int index)
		//ii) Using Frame Name
		//Syntax:driver.switchTo().frame("String Frame Name");
		
		//swith from the top window to 3rd frame using frame Index
		//**********************i)Using Frame  Index*****************
		//driver.switchTo().frame(2);
		//driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		
		//******************ii) Using Frame Name*********************
		
		
		//driver.switchTo().frame("classFrame");
		//driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		
		
		//*****************************Test Requirement***************
		/*i)Launch The Webpage That Has multiple Frames
		ii)operate an element in the 3rd  frame
		iii) operate an element in the first frame*/
		
		
		//************//steps for selenium webDriver test Script*****
		/*i)Launch The Webpage That Has multiple Frames
        ii)swith from the top window to 3rd frame 
        iii) Access the Element
        iv)Back to TOP Window(default)
        v)swith from the top window to 3rd frame 
        vi)Access the Element*/
		
		
		//*****Using Frame Name****
		
	     driver.switchTo().frame("classFrame");
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame("packageListFrame");
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		
		
		
	        //*****************Using Frame Index*****
		/*driver.switchTo().frame(2);
		driver.findElement(By.linkText("org.openqa.selenium")).click();
		
		driver.switchTo().defaultContent();
		
		driver.switchTo().frame(O);
		driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
		driver.close();
		*/
		
		
		
		//************Assignement****************
		
      
		
		
		
	driver.get("https://www.google.co.in");

	driver.findElement(By.xpath(".//*[@id='gbwa']/div[1]/a")).click();
	
	//driver.findElement(By.xpath(".//*[@id='gb23']/span[2]")).click();
		
		
	}

}
