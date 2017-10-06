package actiTime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Guru99 {

    public static void main(String[] args) throws InterruptedException {
        // TODO Auto-generated method stub
        System.setProperty("webdriver.gecko.driver","c:\\geckodriver.exe");
        WebDriver d = new FirefoxDriver();
        d.get("http://demo.guru99.com/selenium/upload/");
        Thread.sleep(5000);
        //WebElement w = d.findElement(By.xpath("//*[@class='upload_txt']"));
        WebElement w = d.findElement(By.id("uploadfile_0"));
        w.sendKeys("D:\\Arrweek.java");
        d.findElement(By.xpath("//*[@name='terms']")).click();
        d.findElement(By.xpath("//*[@id='submitbutton']")).click();
    }

}