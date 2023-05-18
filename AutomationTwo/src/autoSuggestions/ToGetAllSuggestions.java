	package autoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToGetAllSuggestions
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Launching the browser
		ChromeDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		//Navigating to the URL
		driver.get("https://www.google.com/");
		//Identifying the google text box and passing the text
		driver.findElement(By.name("q")).sendKeys("Bhai jaan");
		Thread.sleep(2000);
		//finding all autosuggestions
		List<WebElement> autosuggestions = driver.findElements(By.xpath("//span[contains(text(), 'hai')]"));
		//printing the number of auto suggestions in the console
		System.out.println("The number of auto suggestions are->"+(autosuggestions.size()-1));
		//printing all autosuggestions
		for(WebElement suggestion:autosuggestions)
		{
			System.out.println(suggestion.getText());
		}
		
	}
}
