package _____practice_____;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramTwo 
{
	public static void main(String[] args) throws InterruptedException, MalformedURLException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		URL url = new URL("https://www.google.co.in/");
		driver.navigate().to(url);
		driver.manage().window().maximize();
		driver.manage().window().minimize();
	}
}
