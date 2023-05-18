package popUps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload2 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://fineuploader.com/demos.html");
		driver.findElement(By.xpath("//input[@title='file input']")).sendKeys("C:\\Selenium\\Automation\\testData\\png-transparent-spider-man-heroes-download-with-transparent-background-free-thumbnail.png");
		
	}
}
