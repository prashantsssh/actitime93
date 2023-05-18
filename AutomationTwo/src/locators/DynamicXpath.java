package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath 
{
	public static void main(String[] args) 
	{
		String productprice="₹89,999";
		String productname="APPLE iPhone 14 Plus (Purple, 256 GB)";
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/search?q=iphone+14+plus&as=on&as-show=on&otracker=AS_Query_OrganicAutoSuggest_3_6_na_na_na&otracker1=AS_Query_OrganicAutoSuggest_3_6_na_na_na&as-pos=3&as-type=RECENT&suggestionId=iphone+14+plus&requestId=6b945164-5b32-42a7-8582-c44f6c42ee65&as-searchtext=iphone");
		String price = driver.findElement(By.xpath("//div[text()='"+productname+"']/ancestor::div[@class='_3pLy-c row']/descendant::div[text()='"+productprice+"']")).getText();
		System.out.println(price);
	}
}
