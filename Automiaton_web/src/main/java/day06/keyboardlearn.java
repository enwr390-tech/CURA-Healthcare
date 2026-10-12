package day06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class keyboardlearn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
	////	
driver.switchTo().frame(0);	
WebElement item1 = driver.findElement(By.xpath("//li[text()=\"Item1\"]"));	
WebElement item2= driver.findElement(By.xpath("//li[text()=\"Item1\"]"));	
WebElement item3 = driver.findElement(By.xpath("//li[text()=\"Item1\"]"));	
Actions builder=new Actions(driver);
builder.keyDown(Keys.CONTROL).click(item1).click(item2)	.click(item3).perform();	
		
		
		
		
		
		
		
		
		
		
		
		 
		
		
		
	}

}
