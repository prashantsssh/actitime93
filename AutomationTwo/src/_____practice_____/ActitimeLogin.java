package _____practice_____;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeLogin 
{
	WebDriver driver;//We are declaring here WebDriver driver to use it in dynamic xpath below. This is optional and should be used if we want to use dynamic xpath in this class
	public ActitimeLogin(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);// In place of this keyword we can also use name of the current class i.e ActitimeLogin
	}
	@FindBy(id="username")
	public WebElement usernameTextField;
	
	@FindBy(name="pwd")
	public WebElement passwordTextField;
	
	@FindBy(xpath = "//div[text()='Login ']")
	public WebElement loginButton;
	
	public void loginAction(String username, String password)
	{    
		usernameTextField.sendKeys(username);
		passwordTextField.sendKeys(password);
		loginButton.click();
	}
	//Here below we are creating a method for dynamic xpath and here we are using findElement to perform this action
	public String verifyHomePageTitle(String text)
	{
		return driver.findElement(By.xpath("//input[text()='"+text+"']")).getText();
	}
}
