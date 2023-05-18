package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramTwentyThree 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Automation.html");
		
		Rectangle locationofusername = driver.findElement(By.id("Qspiders")).getRect();
		Rectangle locationofpassword = driver.findElement(By.id("Jspiders")).getRect();
		
		int distanceofusernamefrommargin = locationofusername.getY();
		int heightofusername = locationofusername.getHeight();
		int totalheightofusernamefrommargin=distanceofusernamefrommargin+heightofusername;
		
		int distanceofpasswordfrommargin = locationofpassword.getY();
		
		if(totalheightofusernamefrommargin<=distanceofpasswordfrommargin)
		{
			System.out.println("The username and password text fields are not overlapping.");
		}
		else
		{
			System.out.println("The username and password text fields are overlapping.");
		}
	}
}
