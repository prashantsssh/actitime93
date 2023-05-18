package _____practice_____;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ToVerifyActitimeUsingPom
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
		ActitimeLogin login=new ActitimeLogin(driver);
		login.loginAction("admin", "manager");
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.titleContains("Enter"));
		
		String actualTitle = driver.getTitle();
		if(actualTitle.contains("Enter"))
		{
			System.out.println("Passed: The title has been verified.");
		}
		else
		{
			System.out.println("Failed: The title has been verified.");
		}
		ActitimeHomepage homepage=new ActitimeHomepage(driver);
		homepage.LogoutAction();
		driver.quit();
	}
}
