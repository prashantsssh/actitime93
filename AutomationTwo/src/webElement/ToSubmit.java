package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSubmit 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.name("websubmit")).submit();
	//	driver.findElement(By.name("websubmit")).click(); // click() method will not send request to server.
		
	}
}
