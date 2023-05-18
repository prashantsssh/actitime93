package webDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetPageSource 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String sourcecode= driver.getPageSource();
		System.out.println(sourcecode);
		System.out.println(sourcecode.contains("actitime"));
	}
}
