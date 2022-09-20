package javaSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

 public class DropDownDemo extends BaseClass {
	
 @Test(priority=1)
 public void dropDown() {
	System.out.println(" Select the option in Dropdown list.");
	driver.get("https://demo.guru99.com/test/newtours/register.php");
	driver.manage().window().maximize();
	//WebElement dropdown = driver.findElement(By.name("country"));
	Select countryDD = new Select(driver.findElement(By.name("country")));
	
	countryDD.selectByValue("ANGOLA");
	
	
	countryDD.selectByIndex(8);
	
	countryDD.selectByVisibleText("ANDORRA");
 }
  @Test(priority=2)
  public void deSelect() {
	  System.out.println("Deselect the option in dropdown");
	  driver.get("https://jsbin.com/osebed/2 ");
	  
	  Select optionlist = new Select(driver.findElement(By.id("fruits")));
	  optionlist.deselectAll();
	  System.out.println("optionlist is Empty");
 
	
	
 }
	
	

}
