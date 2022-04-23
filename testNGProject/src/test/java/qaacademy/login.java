package qaacademy;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageobjects.samplelocators;
import resources.base;

public class login extends base{
	public WebDriver driver;
	
	@Test
	public void tester() throws IOException
	{
		
		driver=initializedriver();
		driver.get(prop.getProperty("URL"));
		
	Assert.assertTrue(false);
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
