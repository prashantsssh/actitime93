package dropdowns;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToSelect 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.linkText("Create new account")).click();
		
		WebElement dayelement = driver.findElement(By.id("day"));
		Select select = new Select(dayelement);
		select.selectByIndex(6);
		
		WebElement monthelement = driver.findElement(By.id("month"));
		Select select1 = new Select(monthelement);
		select1.selectByVisibleText("Aug");
		
		WebElement yearelement = driver.findElement(By.id("year"));
		Select select2 = new Select(yearelement);
		select2.selectByValue("2005");
		
	}
}
