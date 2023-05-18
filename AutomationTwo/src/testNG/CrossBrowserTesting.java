package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserTesting 
{
	WebDriver driver;
	@Parameters("browser")
	@Test
	public void demo(String browser)
	{
		if(browser.equals("edge"))
		{
			driver=new EdgeDriver();
		}
		if(browser.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	}
	
}
