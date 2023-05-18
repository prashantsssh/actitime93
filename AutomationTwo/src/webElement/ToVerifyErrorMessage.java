package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyErrorMessage 
{
	public static void main(String[] args) throws InterruptedException 
	{
		String expectederrormessage="Username or Password is invalid. Please try again.";
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
		Thread.sleep(5000);
		String actualerrormsg = driver.findElement(By.xpath("//span[@class='errormsg']")).getText();
		if(actualerrormsg.contains(expectederrormessage))
		{
			System.out.println("Passed. Correct error message is displayed.");
		}
		else
		{
			System.out.println("Failed. Error message is not displayed properly.");
		}
	}
}
