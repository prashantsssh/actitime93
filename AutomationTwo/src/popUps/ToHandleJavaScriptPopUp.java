package popUps;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleJavaScriptPopUp 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
		
		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		
		driver.findElement(By.id("promtButton")).click();
	
		/*	driver.switchTo().alert().sendKeys("Qspiders");
		driver.switchTo().alert().accept();	*/
		
		Alert alert = driver.switchTo().alert();
		Thread.sleep(2000);
		alert.sendKeys("QSpiders");
		alert.accept();
	}
}
