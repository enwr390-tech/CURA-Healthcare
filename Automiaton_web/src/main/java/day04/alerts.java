package day04;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/web/alerts.html#");
		driver.manage().window().maximize();	
//////////simple alerts
//driver.findElement(By.id("alert")).click();	
//String alerttext = driver.switchTo().alert().getText();
//System.out.println(alerttext);	
//driver.switchTo().alert().accept();		
///////////conformation alert		
//driver.findElement(By.id("confirm")).click();		
///driver.switchTo().alert().dismiss();		
///////////promet
		
driver.findElement(By.id("double-prompt")).click();		
String text = driver.switchTo().alert().getText();		
System.out.println(text);		
driver.switchTo().alert().sendKeys("text");		
	
	
		
		
		
	}

}
