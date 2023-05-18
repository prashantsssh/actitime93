package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyTagNameAndLogin 
{
	public static void main(String[] args) 
	{
		//Launching the browser
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//Navigating to Url
		driver.get("https://demo.actitime.com/login.do");
		
		WebElement usernameTextField = driver.findElement(By.id("username"));
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		WebElement loginButton = driver.findElement(By.xpath("//div[text()='Login ']"));
	
		String usernameTagName = usernameTextField.getTagName();
		String passwordtagname = passwordTextField.getTagName();
		String loginTagName = loginButton.getTagName();
		
		if(usernameTagName.equals("input") && passwordtagname.equals("input") && loginTagName.equals("div"))
		{
			usernameTextField.sendKeys("admin");
			passwordTextField.sendKeys("manager");
			loginButton.click();
			System.out.println("Login is successful.");
		}
		else
		{
			System.out.println("One of the tag name is mismatching.");
		}
	}
}
