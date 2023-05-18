package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramNine 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Automation.html");
		
		driver.findElement(By.id("Qspiders")).sendKeys("Jack Sparrow");
		driver.findElement(By.name("Fahad")).sendKeys("The sailor");
	
		driver.findElement(By.className("Selenium")).click();
	}
}
