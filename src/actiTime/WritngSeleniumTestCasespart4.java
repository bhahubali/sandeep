package actiTime;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WritngSeleniumTestCasespart4 {

	public static void main(String[] args) throws IOException {
		
		
		 /*  
			Selenium Class 36: Writing Selenium Test Cases Part-4
			------------------------------------------------------------
			i) Data Driven Testing :- Testing The Same Functionality With Multiple Sets of Test Data
			    Why Data Driven Testing :-positive and negative testing is the primary purpose of data driven testing
			                              *checking the Relability of the system By Executing The  Same operation again and again
			                              
            ii) Batch Testing:-Executing Series of Test Cases
             purpose of Batch Testing:- Without Human User  Interaction  we Can Execute Series of Tests it is not possiblie in Manual Testing
            ------------------------------------------------------------
            8) Data Driven Testing for Admin Login in gcrShop Admin Interface (By Reading Test data from a from Text File) 
            Test Steps: i) Launch the Browser 
                        ii) Navigate to "http://www.gcrit.com/build3/admin/" 
                        iii) Enter "Username" 
                        iv) Enter "Password" 
                        v) Click "Login" Button 
            --------------------------------------- 
            Verification Points: Capture the URL and Compare with expected 
            Expected URL: http://www.gcrit.com/build3/admin/index.php 
            Input Data: Ref: input.txt file

*/
		       FileReader file=new FileReader("‪C:\\Users\\VijayaKumar\\Desktop\\input.txt");
		      BufferedReader br=new BufferedReader(file);
		      
		      int count=0;
		      int Iteration=0;
		      String line;
		      
		      while ((line= br.readLine())!=null)
		    		  {
		    	      count= count+1;
		    	      Iteration=Iteration+1;
		    	       if(count > 1)
		    	       {
		    	    	   String[] inputData=line.split(",",2);
		    	       }
		    		  }
		      
	          WebDriver driver=new FirefoxDriver();
	          driver.get("http://www.gcrit.com/build3/admin/");
	          driver.findElement(By.name("username")).sendKeys("admin");
	          driver.findElement(By.name("password")).sendKeys("admin@123");
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


