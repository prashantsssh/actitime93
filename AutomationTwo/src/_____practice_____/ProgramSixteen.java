package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramSixteen
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		String verify = driver.findElement(By.xpath("//span[@class='errormsg']")).getText();
		if (verify.equals("Username or Password is invalid. Please try again."))
		{
			System.out.println("Verified.");
		}
		else
		{
			System.out.println("Failed");
		}
	}
}
