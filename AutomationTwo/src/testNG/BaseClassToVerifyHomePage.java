package testNG;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import POM.HomePage;
import POM.LoginPage;
//This class is connected with the Class 'ToVerifyHomePageForTestng' of the same package.
public class BaseClassToVerifyHomePage 
{
	WebDriver driver;
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("The database connection has been established.");
	}
	@BeforeClass
	public void bcConfig()
	{
		driver=new ChromeDriver();
		System.out.println("The brower has been launched.");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("The URL has been navigated.");
	}
	@BeforeMethod
	public void bmconfig()
	{
		LoginPage login=new LoginPage(driver);
		login.loginAction("admin", "manager");
		System.out.println("Login is successful.");
	}
	@AfterMethod
	public void amconfig()
	{
		HomePage homepage=new HomePage(driver);
		homepage.logoutAction();
		System.out.println("Logout is successful.");
	}
	@AfterClass
	public void acConfig()
	{
		driver.quit();
		System.out.println("The browser is closed.");
	}
	@AfterSuite
	public void asConfig()
	{
		System.out.println("The database has been closed successfully.");
	}
}
