package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class ProgramEight 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Automation.html");
		
		WebElement username = driver.findElement(By.id("Qspiders"));
		username.sendKeys("Jack Sparrow");
		WebElement password = driver.findElement(By.name("Fahad"));
		password.sendKeys("The Sailor");
//		driver.findElement(By.linkText("Go to Selenium 2024")).click();
		WebElement link = driver.findElement(By.partialLinkText("Go to"));
		link.click();
		
	}
}
