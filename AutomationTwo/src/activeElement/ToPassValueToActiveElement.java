package activeElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToPassValueToActiveElement 
{
	public static void main(String[] args) 
	{
		//Launching the browser
				ChromeDriver driver= new ChromeDriver();
				driver.manage().window().maximize();
				//Navigating to the URL
				driver.get("https://www.facebook.com/");
				driver.switchTo().activeElement().sendKeys("Kuch bhi");
	}
}
