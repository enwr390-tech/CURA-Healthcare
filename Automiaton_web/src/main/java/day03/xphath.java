package day03;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xphath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();	
		driver.get("https://katalon-demo-cura.herokuapp.com/");	
		driver.manage().window().maximize()	;
		//اول طريقة
		//driver.findElement(By.xpath("//a[@id=\"btn-make-appointment\"] ")).click();
		//ثاني طريقة
		driver.findElement(By.xpath("//a[text()=\"Make Appointment\"]")).click();
		//driver.findElement(By.xpath("//a[contains(@id,"Appointment")]")).click();
		//driver.findElement(By.xpath("//a[contains(text(),"Make")]
		//driver.findElement(By.xpath("//a[starts-with(@,"btn")]
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
