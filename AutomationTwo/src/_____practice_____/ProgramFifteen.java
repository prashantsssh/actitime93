package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramFifteen 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.cssSelector("input[name='q']")).sendKeys("CSK");
		
		String productname="SONY Alpha ILCE-7M4 Full Frame Mirrorless Camera Body Featuring Eye AF and 4K movie recording";
		String productprice="₹2,13,490";
		WebDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https://www.flipkart.com/search?q=sony+dslr+camera&sid=jek%2Cp31%2Ctrv&as=on&as-show=on&otracker=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_na&otracker1=AS_QueryStore_OrganicAutoSuggest_1_7_na_na_na&as-pos=1&as-type=RECENT&suggestionId=sony+dslr+camera%7CDSLR+%26+Mirrorless&requestId=2a2aa172-3efb-42d5-9300-5939f1b24156&as-backfill=on");
		String price = driver1.findElement(By.xpath("//div[text()='"+productname+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='"+productprice+"']")).getText();
		System.out.println(price);
		
		WebDriver driver2= new ChromeDriver();
		driver2.manage().window().maximize();
		driver2.get("https://www.selenium.dev/");
		driver2.findElement(By.linkText("About Selenium")).click();
	/*	WebElement link = driver2.findElement(By.linkText("About Selenium"));
		link.click();	*/
		
		WebDriver driver3= new ChromeDriver();
		driver2.manage().window().maximize();
		driver3.get("https://demo.actitime.com/login.do");
		driver3.findElement(By.id("username")).sendKeys("admin");
		WebElement password = driver3.findElement(By.name("pwd"));
		password.sendKeys("manager");
		password.sendKeys(Keys.ENTER);
		
	}
}
