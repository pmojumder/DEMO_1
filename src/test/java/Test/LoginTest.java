package Test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Generic.DriverUtils;
import POM.LoginPage;

public class LoginTest extends BaseTest{

@Test
public void test()
{
	LoginPage lp=new LoginPage();
	DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/");
	lp.enterUsername("Admin");
	lp.enterPassword("admin123");
	lp.buttonLogin();
	
}

}
