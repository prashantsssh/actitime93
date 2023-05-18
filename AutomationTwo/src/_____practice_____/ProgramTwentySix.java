package _____practice_____;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramTwentySix {

	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys("bhai jaan");
		Thread.sleep(2000);
		
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//span[contains(text(), 'hai')]"));
		System.out.println("Number of autosuggestions->"+(autosuggestions.size()-1));
		for(WebElement suggestion:autosuggestions)
		{
			System.out.println(suggestion.getText());
		}
		System.out.println("============Now clicking on desired result============");
		for(WebElement suggestion:autosuggestions)
		{
			if(suggestion.getText().contains("shayari"))
			{
				suggestion.click();
			}
		}
		System.out.println("Desired result is displayed.");
		System.out.println("============Now accessing active element method===========");
		ChromeDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.facebook.com/");
		driver1.switchTo().activeElement().sendKeys("Kuch bhi");
	}
	

}
