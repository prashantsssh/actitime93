package _____practice_____;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramSeven 
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String parentid = driver.getWindowHandle();
		
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		Set<String> allids = driver.getWindowHandles();
		for(String id:allids)
		{
			driver.switchTo().window(id);
			{
				if(!id.equals(parentid))
				{
					System.out.println("The title of child browser is->"+driver.getTitle());
				}
			}
		}
		driver.switchTo().window(parentid);
		System.out.println("The tilte of parent browser is->"+driver.getTitle());
	}
}
