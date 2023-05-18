package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone+14+plus&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		String price = driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 Plus (Starlight, 128 GB)']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='₹79,999']")).getText();
		System.out.println(price);
	}
}
