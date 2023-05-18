package runtimePolymorphism;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver 
{
	public static void main(String[] args) 
	{
		TestTitleOfGoogle.test(new ChromeDriver());
		System.out.println("Successfull tested in Chrome.");
		TestTitleOfGoogle.test(new FirefoxDriver());
		System.out.println("Successfully tested in firefox.");
		TestTitleOfGoogle.test(new EdgeDriver());
		System.out.println("Successfull tested in Edge.");
		
	}
}
