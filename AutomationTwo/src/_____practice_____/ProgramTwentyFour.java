package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramTwentyFour 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		String tooltiptext = driver.findElement(By.id("keepLoggedInCheckBox")).getAttribute("title");
		if(tooltiptext.contains("not select"))
		{
			System.out.println("The tool tip text is verified.");
		}
		else
		{
			System.out.println("The tool tip text is not verified.");
		}
		driver.quit();
		WebDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com/");
		WebElement image = driver1.findElement(By.xpath("//img[@src='https://rukminim1.flixcart.com/image/200/200/xif0q/tablet/r/4/m/-original-imagj72vqsfqgzpf.jpeg?q=70']"));
		String altText = image.getAttribute("alt");
		System.out.println(altText);
		if(altText.contains("Apple"))
		{
			System.out.println("Alt text of image is veified.");
		}
		else
		{
			System.out.println("Alt text of image is not verified.");
		}
	}
}
