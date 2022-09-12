package javaSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 
@test 
public class TestBrowserCommand {

	@Test
	public void googleSerch() throws InterruptedException {
	
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	
	  @Test
	 public void setup() {
	driver = new ChromeDriver();
	driver.get("https://www.OrangeHRM.com");
	Thread.sleep(3000);
	System.out.println("Title of the page " + driver.getTitle());
	
	String CurrentUrl = driver.getCurrentUrl();
	System.out.println("this is CurrentUrl "+ CurrentUrl);
	}
	
	driver.navigate().back();
	driver.navigate().refresh();
	
   
      @Test
     public void tearDown(); {
    driver.close();
    
     }
		
	}
}
