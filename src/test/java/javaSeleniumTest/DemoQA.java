package javaSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


@Test
public class DemoQA {
	

	public void googleSerch() throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
	driver = new ChromeDriver();
	driver.get("https://demoqa.com/text-box");
	
	Thread.sleep(3000);
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	
	WebElement FullName = driver.findElement(By.id("userName"));
	 FullName.sendKeys("Sunita Ranga");
	 WebElement Email = driver.findElement(By.id("userEmail"));
	 Email.sendKeys("abc123@gmail.com");
	 WebElement CurrentAddress = driver.findElement(By.xpath("//*[@id=\'currentAddress\']"));
	 CurrentAddress.sendKeys("Morris Rd 13897, Atlanta(GA)");
	 Thread.sleep(3000);
	

	 
	 WebElement SubmitBtn = driver.findElement(By.id("submit"));
	 SubmitBtn.submit();
	 WebElement textbox = driver.findElement(By.className("border col-md-12 col-sm-12"));
      System.out.println(textbox.getText());
	
	
	
}

}
