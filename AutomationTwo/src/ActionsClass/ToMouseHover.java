package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToMouseHover 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.myntra.com/");
		
		WebElement element = driver.findElement(By.linkText("BEAUTY"));
		//Here beauty is written as 'Beauty' in html script but we are writting the whole word in CAPS ON as to use moveToElement function we have to write text as it is written in front end.
		
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}
}
