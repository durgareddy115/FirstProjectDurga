package qaacademy;

import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pageobjects.samplelocators;
import resources.base;

public class homepage extends base{
	public WebDriver driver;
	
	@Test
	public void sample() throws IOException
	{
		
		driver=initializedriver();
		driver.get(prop.getProperty("URL"));
		samplelocators se=new samplelocators(driver);
		se.radio1().click();
		se.radio1().isSelected();
		se.radio2().click();
		System.out.println(se.radio2().getText());
		se.radio3().click();
		System.out.println(se.radio3().getText());
		System.out.println("im added");
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
	}

}
