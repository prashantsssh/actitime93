package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramEighteen 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/signup?ref_cta=Sign+up&ref_loc=header+logged+out&ref_page=%2F&source=header-home");
		Thread.sleep(5000);
		WebElement etextfield = driver.findElement(By.id("email"));
		boolean result = etextfield.isDisplayed();
		if(result)
		{
			System.out.println("The email text field is displayed.");
		}
		else
		{
			System.out.println("The email text field is missing.");
		}
		etextfield.sendKeys("prashant.sssh@gmail.com");
		Thread.sleep(3000);
		WebElement continuecheck = driver.findElement(By.xpath("(//button[contains(text(),'Continue')])[1]"));
		boolean continuebutton = continuecheck.isEnabled();
		if(continuebutton)
		{
			System.out.println("Continue button is enabled.");
		}
		else
		{
			System.out.println("Continue button is disabled.");
		}
		WebDriver driver1= new ChromeDriver();
		driver1.manage().window().maximize();
		driver1.get("https:demo.actitime.com/login.do");
		WebElement selectcheckbox = driver1.findElement(By.id("keepLoggedInCheckBox"));
		selectcheckbox.click();
		boolean selected = selectcheckbox.isSelected();
		if(selected)
		{
			System.out.println("Checkbox is selected.");
		}
		else
		{
			System.out.println("Checkbox is not selected.");
		}
		
		
		
		
		
		
	}
}
