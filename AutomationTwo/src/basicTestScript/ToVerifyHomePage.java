package basicTestScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import POM.HomePage;
import POM.LoginPage;
import POM.HomePage;
public class ToVerifyHomePage
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		
	/*	login.usernameTextField.sendKeys("admin");
		
		driver.navigate().refresh();
		
		login.usernameTextField.sendKeys("manager");
	*/
		LoginPage login=new LoginPage(driver);
		login.loginAction("admin", "manager");
		
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
		HomePage homepage=new HomePage(driver);
		homepage.logoutAction();
		driver.quit();
}
}