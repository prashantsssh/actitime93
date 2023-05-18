package webDriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchBackToParent 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String parentId = driver.getWindowHandle();
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> allIds = driver.getWindowHandles();
		//String finaltitle=null;
		
		for(String id:allIds)
		{
			driver.switchTo().window(id);
			if(!id.equals(parentId))
			{
			
				String title =driver.getTitle();
				System.out.println("The child browser title is:"+title);
				//finaltitle=title;
			}
		}
		driver.switchTo().window(parentId);
		String parenttitle = driver.getTitle();
		System.out.println("The parent browser title is:"+parenttitle);
		//System.out.println("The title of the child browser is:"+finaltitle);
}
}