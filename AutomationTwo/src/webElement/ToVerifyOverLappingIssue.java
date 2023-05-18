package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyOverLappingIssue
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Automation.html");
		
		Rectangle usernameTextFieldRect = driver.findElement(By.id("Qspiders")).getRect();
		Rectangle passwordTextFieldRect = driver.findElement(By.id("Jspiders")).getRect();
		
		int yCoordinateofUsername = usernameTextFieldRect.getY();
		int heightofUserame = usernameTextFieldRect.getHeight();
		
		int endYofUsername= yCoordinateofUsername+heightofUserame;
		
		int startYofPassword= passwordTextFieldRect.getY();
		
		if(startYofPassword>=endYofUsername)
		{
			System.out.println("The textfields are not overlapping.");
		}
		else
		{
			System.out.println("The textfields are overlapping.");
		}
	}
}
