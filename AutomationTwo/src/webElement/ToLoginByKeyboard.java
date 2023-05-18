package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLoginByKeyboard 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");	
		driver.findElement(By.id("username")).sendKeys("admin");
	/*	driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.name("pwd")).sendKeys(Keys.ENTER); */
		
		WebElement password = driver.findElement(By.name("pwd"));
		password.sendKeys("manager");
		password.sendKeys(Keys.ENTER);
	}
}
