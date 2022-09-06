package javaSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestTestNg02 {
	
	@Test
	public void googleSerch() {
	
	WebDriver driver;
	WebDriverManager.chromedriver().setup();
	
	driver = new ChromeDriver();
	driver.get("https://www.google.com");
    WebElement serchBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input"));
    
    serchBox.sendKeys("Google text");
    serchBox.sendKeys(Keys.ENTER);
    driver.close();
    
    
	}
}

