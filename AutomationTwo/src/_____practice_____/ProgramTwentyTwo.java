package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramTwentyTwo 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Automation.html");
		Point usernametextfield = driver.findElement(By.id("Qspiders")).getLocation();
		Point passwordtextfield = driver.findElement(By.id("Jspiders")).getLocation();
		
		int Xcoordinateofusername = usernametextfield.getX();
		int Ycoordinateofusername = usernametextfield.getY();
		
		int Xcoordinateofpassword = passwordtextfield.getX();
		int Ycoordinateofpassword = passwordtextfield.getY();
		
		if(Xcoordinateofusername==Xcoordinateofpassword && Ycoordinateofusername==Ycoordinateofpassword)
		{
			System.out.println("The alignment of username and password textfield is perfect.");
		}
		else
		{
			System.out.println("The alignment of username and password textfield is not perfect.");
		}
	}
}