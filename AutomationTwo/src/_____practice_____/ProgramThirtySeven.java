package _____practice_____;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgramThirtySeven
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://jqueryui.com/draggable/");
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(frame);
		WebElement dragBox = driver.findElement(By.id("draggable"));
		Actions action = new Actions(driver);
		action.dragAndDropBy(dragBox, 150, 200).perform();
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("API documentation")).click();
	}
}
