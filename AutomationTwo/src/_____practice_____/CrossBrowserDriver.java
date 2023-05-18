package _____practice_____;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CrossBrowserDriver 
{
	public static void main(String[] args) 
	{
		CrossBrowser.testing(new ChromeDriver());
		System.out.println("Successfully tested in Chrome");
		CrossBrowser.testing(new FirefoxDriver());
		System.out.println("Successfully tested in Firefox");
		CrossBrowser.testing(new EdgeDriver());
		System.out.println("Successfully tested in Microsoft Edge");
	}
}
