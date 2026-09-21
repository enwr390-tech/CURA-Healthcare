package day02;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver v=new ChromeDriver();
		v.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		v.manage().window().maximize();
		//click on make appointement button
//		v.findElement(By.id("btn-make-appointment")).click();
//		v.findElement(By.name("username")).sendKeys("John Doe");
//		v.findElement(By.name("password")).sendKeys("ThisIs Not");
//		v.findElement(By.id("btn-login")).click();
	//	v.findElement(By.linkText("info@katalon.com")).click();
	v.findElement(By.partialLinkText("infor@"))	.click();
		//tag
	String titel = v.findElement(By.tagName("h2")).getText();
	System.out.println(titel);	
	//يستنى 	
	v.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
	
	
	
	//closebrowser	
	v.close()	;
	//او
	//v.quit();

		
		
		
		
	}

}
