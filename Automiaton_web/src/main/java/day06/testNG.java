package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testNG {
ChromeDriver driver;	
@BeforeMethod		
public void setup() {
	 driver=new ChromeDriver();
	driver.navigate().to("https://jqueryui.com/selectable/");
	driver.manage().window().maximize();
	}
@Test
	public void selectMulitipleItems() {
	driver.switchTo().frame(0);	
	WebElement item1 = driver.findElement(By.xpath("//li[text()=\"Item1\"]"));	
	WebElement item2= driver.findElement(By.xpath("//li[text()=\"Item1\"]"));	
	WebElement item3 = driver.findElement(By.xpath("//li[text()=\"Item1\"]"));	
	Actions builder=new Actions(driver);
	builder.keyDown(Keys.CONTROL).click(item1).click(item2)	.click(item3).perform();}	
@AfterMethod			
public void close() {
driver.quit();
}	
}	

