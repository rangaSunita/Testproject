package javaSeleniumTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioAndCheckBoxDemo extends BaseClass {
	
	@Test
	public void radioButton() {
		System.out.println("How to click Radio Button.");
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement option1 = driver.findElement(By.id("vfb-7-1"));
		option1.click();
		Assert.assertEquals(option1.isSelected(), true);
		WebElement option3 = driver.findElement(By.id("vfb-7-3"));
		option3.click();
		Assert.assertEquals(option3.isSelected(), true);
	}
	
	@Test
	public void checkBoxBtn() {
		System.out.println("Check Button select in selenium");
		driver.get("https://demo.guru99.com/test/radio.html");
		WebElement checkbtn1 = driver.findElement(By.id("vfb-6-0"));
		checkbtn1.click();
		Assert.assertEquals(checkbtn1.isSelected(), true);
		WebElement checkbtn3 = driver.findElement(By.id("vfb-6-2"));
		checkbtn3.click();
		Assert.assertEquals(checkbtn3.isSelected(), true);
		
		
	}

}
