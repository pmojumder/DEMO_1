package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Generic.DriverUtils;

public class BasePage {

	WebDriver driver;
	BasePage()
	{
		driver=DriverUtils.getDriver();
		PageFactory.initElements(driver,this);
	}
}
