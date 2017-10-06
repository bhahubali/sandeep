package actiTime;

import org.testng.annotations.Test;

public class Hemanthtest1 {
 
  @BeforeSuite
  public void login(){
	  System.out.println("login");
	  
  }
  @Test(priority = 1)
  public void register(){
	  System.out.println("register");
  }
  
 @Test(priority = 1)

 public void modify(){
		  System.out.println("register");
		  
	  }
	  
  }
  @AfterSuite
  public void logout(){
	  
	  System.out.println("logout");
  }
  }
}
