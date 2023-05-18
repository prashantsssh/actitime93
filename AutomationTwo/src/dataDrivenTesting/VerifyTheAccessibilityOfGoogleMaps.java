package dataDrivenTesting;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//WORKING IN SELENIUM 8.3 AND ABOVE
public class VerifyTheAccessibilityOfGoogleMaps 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FetchData fd=new FetchData();
		String url = fd.fetchDataFromExcelSheet("Sheet1", 21, 2);
		String location = fd.fetchDataFromExcelSheet("Sheet1", 23, 2);
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		WebElement frame = driver.findElement(By.xpath("//iframe[@name='app']"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//span[text()='Maps']")).click();
		driver.findElement(By.id("searchboxinput")).sendKeys(location);
		driver.findElement(By.id("searchbox-searchbutton")).click();
		WebElement searchedLocation = driver.findElement(By.xpath("//h1[text()='Goa']"));
	//	WebElementsearchedLocation=driver.findElement(By.xpath("//h1[text()='"+location+"']"));
		if(searchedLocation.isDisplayed())
		{
			System.out.println("The relevant result is displayed.");
		}
		else
		{
			System.out.println("The relevant result is not displayed.");
		}		
	}
}
