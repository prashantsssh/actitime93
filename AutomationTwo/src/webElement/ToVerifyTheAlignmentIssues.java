package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTheAlignmentIssues 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Automation.html");
		
		Point usernameTextFieldPos = driver.findElement(By.id("Qspiders")).getLocation();
		Point passwordTextFieldPos = driver.findElement(By.id("Jspiders")).getLocation();
		
		int xCoordinateofUsername = usernameTextFieldPos.getX();
		int yCoordinateofUsername =  usernameTextFieldPos.getY();
		
		int xCoordinateofPassword = passwordTextFieldPos.getX();
		int yCoordinateofPassword = passwordTextFieldPos.getY();
		
		if(xCoordinateofUsername==xCoordinateofPassword && yCoordinateofUsername==yCoordinateofPassword)
		//We can use x coordinate or y coordinate alone to compare as per our requirement. 	
		{
			System.out.println("Alignment is proper.");
		}
		else
		{
			System.out.println("Alignment is not proper.");
		}
		driver.quit();	
	}
}
