package javaSeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

@Test
public class HeroKuApp {


public void googleSerch() throws InterruptedException {
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		
	driver = new ChromeDriver();
		
 
		driver.get("https://the-internet.herokuapp.com");
       Thread.sleep(3000);
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       List<WebElement> linkbtn = driver.findElements(By.xpath("//*[@id=\'content\']/ul/li[12]/a"));
      System.out.println(linkbtn.size());
    WebElement button =driver.findElement(By.xpath("//*[@id=\'content\']/ul/li[12]/a"));
    button.click();
    Thread.sleep(2000);
    WebElement element  =driver.findElement(By.xpath("//*[@id=\"page-footer\"]/div/div/a"));
    element.click();

driver.quit();

	
}

}
