package actiTime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.sun.jna.platform.win32.WinDef.BOOLByReference;

public class ElementHandlingPart3 {

	public static void main(String[] args) throws InterruptedException {
	//Handling Radio Button
		//operating Radio Button
		//1)check displayed status
		//2)check enabled status
		//3)check selected status
		WebDriver driver=new FirefoxDriver();
		boolean status;
		/*driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=l6hr280pgm45kbhev6d0o19k20");
		boolean a=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).isDisplayed();
		System.out.println(a);
		
         a=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).isEnabled();
         System.out.println(a);
         a=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[2]")).isSelected();
         System.out.println(a);
        
         driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).click();
         a=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]")).isSelected();
         System.out.println(a);
         
         */
		//2nd syntax
		/*WebElement radioButton=driver.findElement(By.xpath(".//*[@id='bodyContent']/form/div/div[2]/table/tbody/tr[1]/td[2]/input[1]"));
		
		status= radioButton.isDisplayed();
		System.out.println(status);//true
		
		status=radioButton.isEnabled();
		System.out.println(status);//true
		
		status=radioButton.isSelected();
		System.out.println(status);//false
		
		radioButton.click();
		status=radioButton.isSelected();
		System.out.println(status);//true
		
		driver.close();
		*/
		
		//****Handling Drop Down Box*****
		//Operation On The Element
		//1) check Displayed Status
		//2)check Enabled status
		//3)select an item
		//4)return items count
		
		
		/*driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=l6hr280pgm45kbhev6d0o19k20");
		System.out.println(driver.findElement(By.name("country")).isDisplayed());//true
		
		System.out.println(driver.findElement(By.name("country")).isEnabled());//true
		Select dropDown=new Select(driver.findElement(By.name("country")));
		
		//dropDown.selectByIndex(1);
		dropDown.selectByVisibleText("India");
		List <WebElement> e=dropDown.getOptions();
		System.out.println(e.size());
		driver.close();*/
		
		
		
		//****Handling Check Box
		//1)Check Displayed status
		//2)check Enabled Status
		//3)check Selected Status
		//4)unselect
		
		
		//driver.get("http://www.gcrit.com/build3/create_account.php?osCsid=l6hr280pgm45kbhev6d0o19k20");
		//THEREis no checkboxes Created in Html Format
		
		//*********Image,Image BUTTON,IMAGE LINK********
		
		
		driver.get("https://www.google.co.in");
		String imageTitle=driver.findElement(By.id("hplogo")).getAttribute("title");
		System.out.println(imageTitle);
		
		Thread.sleep(5000);
		
		driver.navigate().to("http://newtours.demoaut.com/");
		driver.findElement(By.name("login")).click();
		Thread.sleep(5000);
		
		driver.navigate().to("http://www.seleniumhq.org/");
		driver.findElement(By.xpath(".//*[@id='choice']/tbody/tr/td[2]/center/a/img")).click();
		
         }

}
