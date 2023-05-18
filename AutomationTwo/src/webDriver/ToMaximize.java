package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToMaximize 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.manage().window().fullscreen();
		
		//The minimize method is available in Selenium 4 onwards.
		//driver.manage().window().minimize();
	}
}
