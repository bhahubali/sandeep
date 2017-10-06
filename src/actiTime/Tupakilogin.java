package actiTime;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Tupakilogin {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		 driver.get("http://gcrit.com/");
	    driver.findElement(By.xpath("html/body/div[1]/div/div/div[2]/div/ul/li[1]/a")).click();
	    driver.findElement(By.id("username")).sendKeys("abcde");
	    Thread.sleep(3000);
	    driver.findElement(By.id("password")).sendKeys("abcde");
	    Thread.sleep(3000);
	    driver.findElement(By.className("submit")).click();
	   
	    driver.close();
		/*Scanner s1=new Scanner(System.in);
		Scanner s2=new Scanner(System.in);
		System.out.println("Enter The First String");
		String a1=s1.nextLine();
		System.out.println("Enter The First String");
		String a2=s1.nextLine();
		System.out.println("Before swap");
		System.out.println(a1);
		System.out.println(a2);
		
		System.out.println("After swap");
	    a1=a1+a2;
	    a2=a1.substring(0, 6);
	    a1=a1.substring(6);
	    System.out.println(a1);
	System.out.println(a2);
	s1.close();
	s2.close();
	*/
	}

}
