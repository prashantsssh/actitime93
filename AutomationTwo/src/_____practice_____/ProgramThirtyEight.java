package _____practice_____;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramThirtyEight 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.oracle.com/in/java/technologies/javase/javase8-archive-downloads.html");
		driver.findElement(By.xpath("//a[text()=' jdk-8u202-linux-arm32-vfp-hflt.tar.gz']")).click();
		WebElement downloadButton = driver.findElement(By.xpath("//a[text()='Download jdk-8u202-linux-arm32-vfp-hflt.tar.gz']"));
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeAsyncScript("arguments[0].click()", downloadButton);
	
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver1.get("https://www.selenium.dev/");
		WebElement readmore = driver1.findElement(By.xpath("//a[@href='/documentation/webdriver/']"));
		
		JavascriptExecutor js1= (JavascriptExecutor)driver1;
		js1.executeScript("arguments[0].scrollIntoView(false)", readmore);
	
		
		WebDriver driver2=new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver2.get("https://www.selenium.dev/");
		JavascriptExecutor js2= (JavascriptExecutor)driver2;
		js2.executeScript("window.scrollBy(0,5000)");
		Thread.sleep(3000);
		js2.executeScript("window.scrollTo(0,200)");
		
		
		
	}
}
