package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramNineteen 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Xpaths.html");
		Thread.sleep(1500);
		WebElement etextfield = driver.findElement(By.xpath("//input[@value='E']"));
		etextfield.clear();
		Thread.sleep(1500);
		etextfield.sendKeys("Gappu");
	
		WebDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("file:///C:/Users/admin/Desktop/Xpaths.html");
		Dimension dim = driver1.findElement(By.xpath("//input[@value='E']")).getSize();
		int height=dim.getHeight();
		int width=dim.getWidth();
		System.out.println("The dimensions of A textfield is->"+dim);
		System.out.println("The height of A textfield is->"+height);
		System.out.println("The width of A textfield is->"+width);
	}
}
