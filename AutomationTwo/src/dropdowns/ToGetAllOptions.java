package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetAllOptions 
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
		List<WebElement> alloptions = select.getOptions();
		System.out.println("The number of options->"+alloptions.size());
		for(WebElement option:alloptions)
		{
			System.out.println(option.getText());
		}
	}
}
