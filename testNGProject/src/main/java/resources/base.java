package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.time.Duration;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class base {
	public Properties prop;
	public static WebDriver driver;
	public WebDriver initializedriver() throws IOException
	{
	 prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\yeshwanth\\eclipse-workspace\\testNGProject\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browserName=prop.getProperty("browser");
		String broswerURL=prop.getProperty("URL");
		if(browserName.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\yeshwanth\\Downloads\\chromedriver_win32\\chromedriver.exe");
			 driver=new ChromeDriver();
	
		}
		else if(browserName.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\yeshwanth\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
				 driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("No browser matched");
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		return driver;
	}
		
		public String screenShot(String testCaseName,WebDriver driver) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			String destination=System.getProperty("user.dir")+"\\reports\\"+testCaseName+" .png";
					FileUtils.copyFile(source,new File(destination));
					return destination;
		}
}



