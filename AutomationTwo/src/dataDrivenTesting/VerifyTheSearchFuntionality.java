package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//WORKING IN SELENIUM 8.3 AND ABOVE
public class VerifyTheSearchFuntionality 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FetchData fd=new FetchData();
		String url = fd.fetchDataFromExcelSheet("Sheet1",5,2 );
		String searchQuery = fd.fetchDataFromExcelSheet("Sheet1", 6, 2);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.name("q")).sendKeys(searchQuery);
		driver.findElement(By.name("btnK")).click();
		
		String actualTitle = driver.getTitle();
		if(actualTitle.contains(searchQuery))
		{
			System.out.println("Pass: The search result page has been displayed");
		}
		else
		{
			System.out.println("Fail: The search result page has not been displayed.");
		}
		driver.quit();	
	}
}
