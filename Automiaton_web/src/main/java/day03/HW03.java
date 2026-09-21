package day03;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HW03 {
public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://katalon-demo-cura.herokuapp.com/");
driver.manage().window().maximize();	
/////////
driver.findElement(By.xpath("//a[text()='Make Appointment']")).click();	
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("John Doe");	
driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("ThisIsNotAPassword");	
driver.findElement(By.xpath("//button[@id='btn-login']")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
WebElement element = driver.findElement(By.xpath("//select[@id='combo_facility']"));
Select v= new Select(element);
v.selectByVisibleText("Hongkong CURA Healthcare Center");
driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']")).click()	;
driver.findElement(By.xpath("//input[@id='radio_program_medicare']")).click();	
driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys("30/09/2026");	
driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys("Automation test appointmant note");	
driver.findElement(By.xpath("//button[contains(text(),'Book']")).click();	
		
}	
}
 
