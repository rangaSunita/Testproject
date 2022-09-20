package javaSeleniumTest;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class SeleniumWait extends BaseClass {
	
	
	@Test
	public void implicitlyWait() {
		System.out.println("Here we are implementing implicitlyWait");
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 WebElement firstname = driver.findElement(By.xpath("//input[@name='firstName']"));
	      firstname.sendKeys("Sunita");
		
	}
	
	@Test
	public void explicitlyWait() {
		System.out.println("Here we are implementing ExplicitlyWait");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/dynamic_controls");
		WebElement removebtn = driver.findElement(By.xpath("//button[(text()='Remove')]"));
		removebtn.click();
		WebElement add= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[(text()='Add')]")));
		add.click();
		
	}
	

}
