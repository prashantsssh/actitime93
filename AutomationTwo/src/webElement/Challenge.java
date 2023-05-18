package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Challenge 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernamefield= driver.findElement(By.id("username"));
		WebElement passwordfield = driver.findElement(By.name("pwd"));
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		String usernametagname = usernamefield.getTagName();
		String passwordtagname = passwordfield.getTagName();
		String logintagname = login.getTagName();
		
		if(usernametagname.contains("input"))
		{
			usernamefield.sendKeys("admin");
		}
		if(passwordtagname.contains("input"))
		{
			passwordfield.sendKeys("manager");
		}
		if(logintagname.contains("div"))
		{
			login.click();
		}
	}
}
