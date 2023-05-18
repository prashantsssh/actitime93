package _____practice_____;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomepage 
{
	public ActitimeHomepage(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy (linkText = "Logout")
	public WebElement logoutButton;
	
	public void LogoutAction()
	{
		logoutButton.click();
	}
	
	
}
