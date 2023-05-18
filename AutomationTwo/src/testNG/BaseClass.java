package testNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BaseClass
{
	@BeforeSuite
	public void bsConfig()
	{
		System.out.println("The database connection has been established.");
	}
	@BeforeClass
	public void bcConfig()
	{
		System.out.println("The brower has been launched.");
		System.out.println("The URL has been navigated.");
	}
	@BeforeMethod
	public void bmconfig()
	{
		System.out.println("Login is successful.");
	}
	@AfterMethod
	public void amconfig()
	{
		System.out.println("Logout is successful.");
	}
	@AfterClass
	public void acConfig()
	{
		System.out.println("The browser is closed.");
	}
	@AfterSuite
	public void asConfig()
	{
		System.out.println("The database has been closed successfully.");
	}
}
