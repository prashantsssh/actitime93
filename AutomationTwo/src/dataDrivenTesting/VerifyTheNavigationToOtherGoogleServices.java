package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WORKING IN SELENIUM 8.3 AND ABOVE
public class VerifyTheNavigationToOtherGoogleServices 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FetchData fd= new FetchData();
		String url = fd.fetchDataFromExcelSheet("Sheet1", 13, 2);
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//span[text()='Gmail']")).click();
	}
}
