 package tests;

import base.BaseTest;
import pages.LoginPage;

import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginTest extends BaseTest {
@Test
public void validLogin() {
LoginPage login=new	LoginPage(driver);
login.clickMakeAppointment();
login.login("John Doe", "ThisIsNotAPassword");
}
@Test
public void invalidLogin() {
LoginPage login= new LoginPage(driver);
login.clickMakeAppointment();
login.login("wrong", "wrong");

Assert.assertTrue(login.getErrorMessage().contains("Login failed"));	
	
}		
}
