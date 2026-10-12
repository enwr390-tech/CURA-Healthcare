package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {
WebDriver driver;
public HomePage(WebDriver d) {
	this.driver=d;
}
public void bookAppointment(String facility,String date,String note) {
	WebElement element = driver.findElement(By.xpath("//select[@id='combo_facility']"));
	Select v= new Select(element);
	v.selectByVisibleText(facility);
	driver.findElement(By.xpath("//input[@id='chk_hospotal_readmission']")).click()	;
	driver.findElement(By.xpath("//input[@id='radio_program_medicare']")).click();	
	driver.findElement(By.xpath("//input[@id='txt_visit_date']")).sendKeys(date);	
	driver.findElement(By.xpath("//textarea[@id='txt_comment']")).sendKeys(note);	
	driver.findElement(By.id("btn-book-appointment")).click();
}
public String getHeading() {
	return driver.findElement(By.tagName("h2")).getText();
	}
		
}		
		
		
		
		
		
		
		
		
	


