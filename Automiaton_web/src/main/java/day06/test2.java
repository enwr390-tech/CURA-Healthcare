package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test2 {
	ChromeDriver driver;	

	@BeforeMethod		
	public void setup() {
		ChromeDriver driver =new ChromeDriver();	
		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");	
		driver.manage().window().maximize()	;}
@Test
public void selectMulitipleItems() {
//sing sindle ddl
	WebElement course = driver.findElement(By.id("course"));	
	Select dd=new Select(course);
	//dd.deselectByIndex(1);
	//dd.deselectByVisibleText("Java");	
	dd.deselectByValue("java");
	
	//mult ddl	
	WebElement ide = driver.findElement(By.id("ide"));
	Select dd1 =new Select(ide);
	dd1.deselectByIndex(1);
	dd1.deselectByIndex(2);	
	dd1.deselectByIndex(3);	
	dd1.deselectByIndex(1);		
}
@AfterMethod			
public void close() {
driver.quit();}
	
	
	
	
	
	
	
}
