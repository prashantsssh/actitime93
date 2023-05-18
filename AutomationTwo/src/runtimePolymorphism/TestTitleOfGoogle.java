package runtimePolymorphism;

import org.openqa.selenium.WebDriver;

public class TestTitleOfGoogle 
{
	public static void test(WebDriver driver)
	{
		driver.get("https://www.google.co.in/");
		
		String title = driver.getTitle();
		
		if(title.contains("Google"))
		{
			System.out.println("Passed. The title has been verified.");
		}
		else
		{
			System.out.println("Failed. The title has been not verified.");
		}
		driver.quit();
	}
}
