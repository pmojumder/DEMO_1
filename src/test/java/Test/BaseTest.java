package Test;

import org.testng.annotations.BeforeMethod;

import Generic.DriverUtils;

public class BaseTest {

	@BeforeMethod
	public void basetest()
	{
		DriverUtils.createDriver();
	}
	
}
