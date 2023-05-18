package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformBrowserHistory 
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("http://www.google.co.in/");
		Thread.sleep(2000);
		driver.navigate().to("http://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
	}
}
