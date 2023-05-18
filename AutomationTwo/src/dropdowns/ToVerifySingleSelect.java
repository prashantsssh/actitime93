package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToVerifySingleSelect 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement monthelement = driver.findElement(By.id("month"));
		Select select = new Select(monthelement);
		boolean multiple = select.isMultiple();
		
		if(multiple)
		{
			System.out.println("The dropdown is multiple select.");
		}
		else
		{
			System.out.println("The dropdown is single select.");
		}
	}
}
