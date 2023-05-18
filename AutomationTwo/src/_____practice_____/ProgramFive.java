package _____practice_____;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramFive
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.linkText("actiTIME Inc.")).click();
		
		Set<String> allids = driver.getWindowHandles();
		for(String id:allids)
		{
			System.out.println(id);
		}
		
	}
}
