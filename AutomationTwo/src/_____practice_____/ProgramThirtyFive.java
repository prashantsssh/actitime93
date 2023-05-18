package _____practice_____;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ProgramThirtyFive 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://myntra.com");
		
		WebElement element = driver.findElement(By.linkText("BEAUTY"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		
		WebDriver driver1=new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver1.get("https://demoapp.skillrary.com/product.php?product=selenium-training/");
		
		WebElement plusButton = driver1.findElement(By.id("add"));
		Actions action1 = new Actions(driver1);
		action1.doubleClick(plusButton).perform(); 
		
		WebDriver driver2=new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver2.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
		
		WebElement rightClickButton = driver2.findElement(By.xpath("//span[text()='right click me']"));
		Actions action2 = new Actions(driver2);
		action2.contextClick(rightClickButton).perform();  
		
		WebDriver driver3=new ChromeDriver();
		driver3.manage().window().maximize();
		driver3.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver3.get("https://www.kirupa.com/html5/press_and_hold.htm");
		
		WebElement circle = driver3.findElement(By.id("item"));
		Actions action3 = new Actions(driver3);
		action3.clickAndHold(circle).perform();
		
		Thread.sleep(3000);
		
		action3.release(circle).perform(); 
		
		
		WebDriver driver4=new ChromeDriver();
		driver4.manage().window().maximize();
		driver4.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver4.get("https://www.google.com/");
		WebElement searchBox = driver4.findElement(By.name("q"));
		WebElement searchButton = driver4.findElement(By.name("btnK"));
		Actions action4 = new Actions(driver4);
	//	action4.sendKeys(searchBox, "Aaj Tak").perform();
	//	action4.moveByOffset(235, 162).click(searchButton).perform();
		action4.sendKeys(searchBox, "Aaj Tak").moveByOffset(235, 162).click(searchButton).perform();   
		
		WebDriver driver5=new ChromeDriver();
		driver5.manage().window().maximize();
		driver5.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver5.get("https://myntra.com/");
		
		Actions action5 = new Actions(driver5);
		action5.moveByOffset(1448, 41).click().perform();    
		
		WebDriver driver6=new ChromeDriver();
		driver6.manage().window().maximize();
		driver6.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver6.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source = driver6.findElement(By.id("box3"));
		WebElement destination = driver6.findElement(By.id("box103"));
		
		Actions action6 = new Actions(driver6);
		action6.dragAndDrop(source, destination).perform();    
		
		
		WebDriver driver7=new ChromeDriver();
		driver7.manage().window().maximize();
		driver7.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver7.get("http://www.selenium.dev/");
		Actions action7 = new Actions(driver7);
		action7.sendKeys(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		action7.sendKeys(Keys.PAGE_UP).perform();
		Thread.sleep(2000);
		action7.sendKeys(Keys.PAGE_DOWN).perform();		
		
		WebDriver driver8=new ChromeDriver();
		driver8.manage().window().maximize();
		driver8.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver8.get("http://www.selenium.dev/");
		
		List<WebElement> links = driver8.findElements(By.xpath("//a[@class='nav-link']"));
		Actions action8 = new Actions(driver8);
		
		action8.keyDown(Keys.CONTROL).perform();
		for(WebElement eachLink:links)
		{
			eachLink.click();
		}
		action8.keyUp(Keys.CONTROL).perform();
		
		
		
		
		

		
		
		
		
		
		
	}
}
