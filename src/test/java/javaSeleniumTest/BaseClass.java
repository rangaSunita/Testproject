package javaSeleniumTest;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
 
@test 
public class BaseClass {

	
    WebDriver driver;
	
	 @BeforeTest
	    public void setup() {
		 System.out.println ("Started Before Method");
	
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	System.out.println ("Completed Before Method");
	
	}
	
	
	
   
     @AfterTest
     public void stopDriver() {
    	 System.out.println ("stopDriver");
    driver.close();
    
     }
		
	

		
	}

