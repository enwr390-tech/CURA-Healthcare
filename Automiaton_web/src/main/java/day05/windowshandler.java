package day05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowshandler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//array
//String[]n= {"rr","oo"};
//n[1]="oo";
//for(int i=0;i<n.length;i++) {
	//System.out.println(n[i]);
//////Lissssst
// List <Integer> Is=new ArrayList();
//Is.add(10);
//Is.add(100);
//Is.add(5);
//System.out.println(Is.get(0));
//System.out.println(Is.size());
/////for(variable:collection{body})		
//for(int num:Is)	{	
//System.out.println(num);		
//}		
/////SEEEEEt		
//Set<Integer> se=new HashSet();		
//		se.add(250);
//		se.add(4);
//		se.add(0);
//		se.add(90);
//for(int num:se)	{	
//System.out.println(num);		
//}		
//		
//List<Integer>Is=new ArrayList<Integer>(se);		
//System.out.println(Is.get(0));		
////		
		ChromeDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.w3schools.com/js/js_popup.asp");
		driver.manage().window().maximize();		
	driver.findElement(By.linkText("Try it Yourself »")).click();	
//	String title=driver.getTitle();	
//	System.out.println(title);	
//	String currentUrl = driver.getCurrentUrl();	
//	System.out.println(currentUrl);	
	//return ref numb for curent page
//String windowHandle = driver.getWindowHandle();		
//System.out.println(windowHandle);		
//return all windows		
Set<String> windowHandles = driver.getWindowHandles();		
//System.out.println(windowHandles);		
List <String>Is=new ArrayList(windowHandles);
driver.switchTo().window(Is.get(1));
String title = driver.getTitle();
System.out.println(title);
		
	}

}
