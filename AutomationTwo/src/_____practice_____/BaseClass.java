package _____practice_____;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass 
{
	@BeforeSuite
	public void bsconfig()
	{
		System.out.println("Database connection has been established.");
	}
	@BeforeClass
	public void bcconfig()
	{
		System.out.println("The browser should be opened.");
		System.out.println("Navigated to the url");
	}
	@BeforeMethod
	public void bmconfi()
	{
		System.out.println("Logged in successfully.");
	}
	@AfterMethod
	public void amconfig()
	{
		System.out.println("Logged out successfully.");
	}
	@AfterClass
	public void acconfig()
	{
		System.out.println("Close the browser.");
	}
	@AfterSuite
	public void asconfig()
	{
		System.out.println("Database connection has been stopped");
	}
}
