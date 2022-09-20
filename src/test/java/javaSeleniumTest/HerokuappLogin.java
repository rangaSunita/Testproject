package javaSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HerokuappLogin {

	@Test
public void googleSerch() throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
	driver = new ChromeDriver();
		
 
		driver.get("https://the-internet.herokuapp.com/login");
       Thread.sleep(3000);
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       WebElement Username = driver.findElement(By.id("username"));
       Username.sendKeys("tomsmith");
       WebElement Passward = driver.findElement(By.id("password"));
       Passward.sendKeys("SuperSecretPassword!");
       WebElement Login = driver.findElement(By.xpath("//*[@id='login']/button/i"));
       Login.click();
       driver.navigate().back();
       WebElement Linkbtn = driver.findElement(By.xpath("//*[@id=\'page-footer\']/div/div/a"));
       Linkbtn.click();
       driver.navigate().refresh();
       
       driver.quit();
       
}      
}
