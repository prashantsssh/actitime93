package webDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetPosition 
{
	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		Point oldpos = driver.manage().window().getPosition();
		System.out.println("Old position of the browser is:"+oldpos);
		Point pos= new Point(100,100);
		driver.manage().window().setPosition(pos);
		Point newpos = driver.manage().window().getPosition();
		System.out.println("New position is:"+newpos);
	}
}
