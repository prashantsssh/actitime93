package webDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseParentWindow 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		Thread.sleep(5000);
		driver.close();
	//	driver.quit();
	}
}
