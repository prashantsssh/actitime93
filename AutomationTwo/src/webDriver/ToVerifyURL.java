package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToVerifyURL 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");//Here we have now installed previous version of selenium as newer version is not compatible with chrome. So in previous version we need driver of each browser separately.  
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String url= driver.getCurrentUrl();
		if(url.contains("facebook"))
		{
			System.out.println("Passed:The url has been verified.");
		}
		else
			System.out.println("Failed: The url has not been verified.");
	}
}
