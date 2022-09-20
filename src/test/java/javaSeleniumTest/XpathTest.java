package javaSeleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathTest extends BaseClass {
   @Test
public void googleSerch() throws InterruptedException {
	   System.out.println ("googleSerch- Started");
		
 
	driver.get("https://the-internet.herokuapp.com/login");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
      WebElement username = driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/div/label"));
         username.click();
      //WebElement login = driver.findElement(By.xpath("//i[contains(@class,'fa fa-2x fa-sign-in')]"));
      WebElement login = driver.findElement(By.xpath("//i[contains(text(),'Login')]"));
      login.click();
      System.out.println ("googleSerch- ended");
     
       
       
}

}
