package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WORKING IN SELENIUM 8.3 AND ABOVE
public class VerifyTheNewsSectionFunctionality 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FetchData fd=new FetchData();
		String url = fd.fetchDataFromExcelSheet("Sheet1", 21, 2);
		String searchQuery = fd.fetchDataFromExcelSheet("Sheet1", 32, 2);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//span[text()='News']")).click();
		driver.findElement(By.xpath("//input[@aria-label='Search for topics, locations & sources']")).sendKeys(searchQuery);
		driver.findElement(By.xpath("//button[@aria-label='Search']")).click();
		WebElement result = driver.findElement(By.xpath("//h2[contains(text(),'"+searchQuery+"')]"));
		if(result.isDisplayed())
		{
			System.out.println("Passed: Correct result is displayed.");
		}
		else
		{
			System.out.println("Failed: Incorrect result is displayed.");
		}
	}
}
