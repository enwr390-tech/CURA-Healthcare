package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
WebDriver driver;
public LoginPage(WebDriver d){
this.driver=d;	
}
public void clickMakeAppointment() {
	driver.findElement(By.id("btn-make-appointment")).click();
}
public void login(String user,String pass) {
driver.findElement(By.xpath("//input[@name='username']")).sendKeys(user);
driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys(pass);
driver.findElement(By.id("btn-login")).click();
}
public String getErrorMessage() {
return driver.findElement(By.xpath("//p[contains(text(),'Login failed!')]")).getText();	
}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}


