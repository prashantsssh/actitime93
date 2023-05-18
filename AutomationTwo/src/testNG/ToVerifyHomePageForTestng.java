package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import POM.HomePage;
import POM.LoginPage;
//This class is connected with the Class 'BaseClassToVerifyHomePage' of this package
public class ToVerifyHomePageForTestng extends BaseClassToVerifyHomePage
{
	@Test
	public void verifyTitle()
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		String actualTitle = driver.getTitle();
		
		if(actualTitle.contains("Enter"))
		{
			System.out.println("Pass: The title has been verified.");
		}
		else
		{
			System.out.println("Fail: The title has not been verified.");
		}
		
	}
}
