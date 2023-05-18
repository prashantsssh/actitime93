package _____practice_____;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class ProgramThirty 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		driver.findElement(By.id("email")).sendKeys("prashant.sssh@gmail.com");
		WebElement continuebutton = driver.findElement(By.xpath("//button[contains(text(),'Continue')]"));
		
		FluentWait wait = new FluentWait(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofMillis(100));
		wait.until(ExpectedConditions.elementToBeClickable(continuebutton));
		wait.ignoring(NoSuchElementException.class);
		continuebutton.click(); 
		
	}
}
