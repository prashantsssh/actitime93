package dataDrivenTesting;

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

public class ToReadDataFromPropertyFile
{
	public static void main(String[] args) throws IOException 
	{
		//1.Convert the physical representation of the property file into java representation
		FileInputStream fis= new FileInputStream("./testData/propertyData.properties");
		Properties property = new Properties();
		//2.Call the load method from Properties Class to read the java representation of the file
		property.load(fis);
		//3.Call the getProperty method and pass the key to get the value6
		String urlFromPropertyFile = property.getProperty("url");
		String usernameFromPropertyFile = property.getProperty("username");
		String passwordFromPropertyFile = property.getProperty("password");
		//4.printing the value in the console
		System.out.println(urlFromPropertyFile);
		System.out.println(usernameFromPropertyFile);
		System.out.println(passwordFromPropertyFile);

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(urlFromPropertyFile);
		driver.findElement(By.id("username")).sendKeys(usernameFromPropertyFile);
		WebElement passwordtextfield = driver.findElement(By.name("pwd"));
		passwordtextfield.sendKeys(passwordFromPropertyFile);
		passwordtextfield.sendKeys(Keys.ENTER);
		/*To login as trainee use-->>username -trainee and password-trainee*/
	}
}
