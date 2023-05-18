package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramThirteen 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/s?k=iphone+14+plus&crid=DR29OS660TXP&sprefix=iphone+14+plu%2Caps%2C304&ref=nb_sb_noss_2");
		String text = driver.findElement(By.xpath("//span[text()='Apple iPhone 14 Plus (256 GB) - Blue']/../../../..//span[text()='94,900']")).getText();
		System.out.println(text);
	}
}
