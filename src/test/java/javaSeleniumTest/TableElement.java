package javaSeleniumTest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TableElement  extends BaseClass{
	  
@Test
  public void getTableData() {
	System.out.println("data getting from table");
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	WebElement rc = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[5]/td[2]"));
	String value = rc.getText();
	System.out.println("this is the value "+value);
	
	
}

@Test
public void getElementsFormTable() {
	System.out.println("getting elements from table");
	driver.get("https://www.w3schools.com/html/html_tables.asp");
	driver.manage().window().maximize();
	List<WebElement> str =driver.findElements(By.xpath("//table[@id='customers']/tbody/tr[4]/td"));
	for(WebElement e: str) {
		String value = e.getText();
		System.out.println("this is the value from row 4 "+value);
		
		
	}
	
	
}
}
