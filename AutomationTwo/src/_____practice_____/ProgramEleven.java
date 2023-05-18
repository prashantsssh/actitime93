package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramEleven 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Automation.html");
		String header = driver.findElement(By.xpath("//h1[text()='Selenium Class']")).getText();
		System.out.println(header);
		Thread.sleep(3000);
		driver.get("file:///C:/Users/admin/Desktop/Xpaths.html");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Babu");
		Thread.sleep(3000);
		driver.navigate().to("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
}
