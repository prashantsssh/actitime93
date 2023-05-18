package ActionsClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LeftClick
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.google.com");
		
		WebElement textfield = driver.findElement(By.name("q"));
		WebElement searchbutton = driver.findElement(By.name("btnK"));
		
		Actions action = new Actions(driver);
	/*	action.sendKeys(textfield, "Aaj Tak").perform();
		action.moveByOffset(237, 177).click(searchbutton).perform();  */
		
		action.sendKeys(textfield, "AAj Taj").moveByOffset(237, 177).click(searchbutton).perform();
	}
}
