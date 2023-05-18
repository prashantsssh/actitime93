package _____practice_____;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramThirtyNine
{
	public static void main(String[] args) throws IOException 
	{
		FileInputStream fis = new FileInputStream("./testData/propertyData.properties");//Here ./ represents current project
		Properties property = new Properties();
		property.load(fis);
		String urlFromPropertyFile = property.getProperty("url");
		String usernameFromPropertyFile = property.getProperty("username");
		String passwordFromPropertyFile = property.getProperty("password");
		
		System.out.println("The Url of the application is->"+urlFromPropertyFile);
		System.out.println("The username is->"+usernameFromPropertyFile);
		System.out.println("The password is->"+passwordFromPropertyFile);
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(urlFromPropertyFile);
		driver.findElement(By.name("username")).sendKeys(usernameFromPropertyFile);
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.sendKeys(passwordFromPropertyFile);
		passwordTextField.sendKeys(Keys.ENTER);
	//	driver.findElement(By.xpath("//div[text()='Login ']")).click();
	}
}
