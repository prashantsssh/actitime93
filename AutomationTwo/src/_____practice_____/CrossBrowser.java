package _____practice_____;

import org.openqa.selenium.WebDriver;

public class CrossBrowser 
{
		public static void testing(WebDriver driver)
		{
			driver.get("https://www.google.co.in/");
			
			String title = driver.getTitle();
			if(title.contains("Google"))
			{
				System.out.println("The title has been verified.");
			}
			else
			{
				System.out.println("Verification of title failed.");
			}
		}
	
}
