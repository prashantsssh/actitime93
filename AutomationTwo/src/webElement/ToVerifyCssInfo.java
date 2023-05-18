package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyCssInfo 
{
	public static void main(String[] args) 
	{	
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String color = driver.findElement(By.linkText("Create new account")).getCssValue("background-color");
		System.out.println(color);
		//Here in output we are getting 'a' which is alpha. It represents the opacity of the button. It ranges from 0 to 1 where 1 is maximum.
	}
}
