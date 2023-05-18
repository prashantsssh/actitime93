package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramTen 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/admin/Desktop/Xpaths.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[2]/input[2]")).sendKeys("Motu");
		driver.findElement(By.xpath("//div[1]/input[2]")).sendKeys("Chotu");
		driver.findElement(By.xpath("//input[@value='D']")).sendKeys("Bhalu");
	}
}
