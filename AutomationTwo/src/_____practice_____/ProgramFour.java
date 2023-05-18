package _____practice_____;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramFour 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in");
		String googleid = driver.getWindowHandle();
		System.out.println("Id for google page-"+googleid);
		
		driver.navigate().to("https://www.facebook.com/");
		String fbid = driver.getWindowHandle();
		System.out.println("Id for facebook page->"+fbid);
		
	}
}
