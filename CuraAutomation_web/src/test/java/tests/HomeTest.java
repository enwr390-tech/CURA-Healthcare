package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;

public class HomeTest extends BaseTest {
@Test
public void bookAppointment() {
LoginPage login=new	LoginPage(driver);
login.clickMakeAppointment();
login.login("John Doe", "ThisIsNotAPassword");
HomePage home=new HomePage(driver);
home.bookAppointment("Hongkong CURA Healthcare Center", "10/10/2026", "Automation Confirmation");	
System.out.println("العنوان اللي طلع من الموقع: " + home.getHeading());
Assert.assertTrue(home.getHeading().contains("Appointment Confirmation"));	
	
}	
}
