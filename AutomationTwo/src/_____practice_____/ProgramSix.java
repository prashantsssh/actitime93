package _____practice_____;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramSix 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		String parentid = driver.getWindowHandle();
		driver.findElement(By.linkText("actiTIME Inc.")).click();
	
		Set<String> allids = driver.getWindowHandles();
		for(String id:allids)
		{
			driver.switchTo().window(id);
			if(!id.equals(parentid))
			{
				Thread.sleep(3000);
				driver.close();
			}
		}
	}
}
