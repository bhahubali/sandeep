package actiTime;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest123 {
	public WebDriver d;
	
	@BeforeSuite
	public void test1(){
		d.get("http://www.gcrit.com/build3/create_account.php");
	}

  @Test(priority =1)
  public void f() {
	  System.out.println("hello");
  }
  @Test(priority =2)
  public void g() {
	  System.out.println("mama");
  }
}
