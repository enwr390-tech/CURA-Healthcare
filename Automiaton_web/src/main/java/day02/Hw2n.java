package day02;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Hw2n {
public static void main(String[] args) {
	///
ChromeDriver driver=new ChromeDriver();	
driver.get("https://katalon-demo-cura.herokuapp.com/");	
driver.manage().window().maximize();
///
driver.findElement(By.id("btn-make-appointment")).click();
driver.findElement(By.id("txt-username")).sendKeys("John Doe");
driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
driver.findElement(By.id("btn-login")).click();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
WebElement findElement = driver.findElement(By.id("combo_facility"));
Select v=new Select(findElement);
v.selectByVisibleText("Tokyo CURA Healthcare Center");
//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(11));
driver.findElement(By.id("chk_hospotal_readmission")).click();
driver.findElement(By.id("radio_program_medicare")).click();
driver.findElement(By.id("txt_visit_date")).sendKeys("20/08/2026");
driver.findElement(By.id("txt_comment")).sendKeys("Automation test appointmant note");
driver.findElement(By.id("btn-book-appointment")).click();
//


}
}