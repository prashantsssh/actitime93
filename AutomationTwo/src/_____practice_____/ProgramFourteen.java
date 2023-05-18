package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramFourteen 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone+14+plus&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off");
		String price = driver.findElement(By.xpath("//img[@alt='APPLE iPhone 14 Plus (Purple, 128 GB)']/ancestor::a[@class='_1fQZEK']/descendant::div[text()='₹79,999']")).getText();
		System.out.println(price);
	}
}
