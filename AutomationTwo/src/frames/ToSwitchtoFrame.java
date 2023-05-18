package frames;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToSwitchtoFrame
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//Navigating to URL
		driver.get("https://jqueryui.com/draggable/");
		//Switching inside the frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
	
		driver.switchTo().frame(frame);
		//Identifying the source
		WebElement box = driver.findElement(By.id("draggable"));
		//performing drag and drop using coordinate
		Actions action = new Actions(driver);
		action.dragAndDropBy(box, 100, 100).perform();
		//switching back to parent window
		driver.switchTo().defaultContent();
		//Clicking on API documentation on parent window- 
		driver.findElement(By.linkText("API documentation")).click();
	}
}
