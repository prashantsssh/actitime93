package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToClear 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Xpaths.html");
		
		WebElement ctextfield = driver.findElement(By.xpath("//input[@value='C']"));
		ctextfield.clear();
		Thread.sleep(3000);
		ctextfield.sendKeys("Gappu");
	}
}
