package base;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
public ChromeDriver driver;

@BeforeMethod
public void setup() {
	driver=new ChromeDriver();
	driver.get("https://katalon-demo-cura.herokuapp.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
}
@AfterMethod
public void close() {
driver.quit();	
}		
}
 