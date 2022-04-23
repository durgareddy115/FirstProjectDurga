package pageobjects;
 
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class samplelocators {
	WebDriver driver;
	public samplelocators(WebDriver driver) {
        this.driver = driver;
      
		
    }
	By radiobutton1=By.xpath("//input[@value='radio1']");
	By radiobutton2=By.xpath("//input[@value='radio2']");
	By radiobutton3=By.xpath("//input[@value='radio3']");
	public WebElement radio1()
	{
		return driver.findElement(radiobutton1);
	}
	public WebElement radio2()
	{
		return driver.findElement(radiobutton2);
	}
	public WebElement radio3()
	{
		return driver.findElement(radiobutton3);
	}
	
	}
	

