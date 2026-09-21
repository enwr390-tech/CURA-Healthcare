import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class draganddrob {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		driver.manage().window().maximize();	
	///////
	driver.switchTo().frame(0);
	WebElement draggable = driver.findElement(By.id("draggable"));	
	WebElement droppable = driver.findElement(By.id("draggable"));		
	Actions dd= new Actions(driver);
	dd.dragAndDrop(draggable, droppable).perform();	
		
		
	}

}
