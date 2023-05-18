package webDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetSize 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		Dimension oldDim = driver.manage().window().getSize();
		System.out.println("Old dimension is"+oldDim);
		
		Dimension dim = new Dimension(700,100);
		driver.manage().window().setSize(dim);
		
		Dimension newdim = driver.manage().window().getSize();
		System.out.println("New dimension is:"+newdim);
	}
}
