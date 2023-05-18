package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByTextFuntion 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Automation.html");
		
		String header = driver.findElement(By.xpath("//h1[text() = 'Selenium Class']")).getText();
		System.out.println(header);
		
		WebElement header1 = driver.findElement(By.xpath("//h1[text() = 'Selenium Class']"));
		System.out.println(header1);
	}
}