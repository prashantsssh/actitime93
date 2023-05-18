package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramTwentyFive 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		WebElement username = driver.findElement(By.name("username"));
		WebElement password = driver.findElement(By.name("pwd"));
		WebElement login = driver.findElement(By.xpath("//div[text()='Login ']"));
		
		String usernametagname = username.getTagName();
		String passwordtagname = password.getTagName();
		String logintagname = login.getTagName();
		
		if(usernametagname.contains("input") && passwordtagname.contains("input") && logintagname.contains("div"))
		{
			username.sendKeys("admin");
			password.sendKeys("manager");
			login.click();
			System.out.println("Login is successful.");
		}
		else
		{
			System.out.println("One of the tagname is missing.");
		}
	}
}
