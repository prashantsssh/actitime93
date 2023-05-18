package _____practice_____;

import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramOne 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		String title = driver.getTitle();
		if(title.contains("Selenium"))
		{
			System.out.println("Title is verified.");
		}
		else
		{
			System.out.println("Wrong page is opened.");
		}
		String url = driver.getCurrentUrl();
		if(url.contains("dev"))
		{
			System.out.println("Url is right.");
		}
		else
		{
			System.out.println("Url is wrong.");
		}
	/*	Thread.sleep(10000);
		driver.close();
		driver.quit();	*/
		String sourcecode = driver.getPageSource();
		System.out.println(sourcecode);
		System.out.println(sourcecode.contains("Selenium"));
	}

}
