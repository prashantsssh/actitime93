package dropdowns;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToFetchSelected 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		
		select.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		select.selectByVisibleText("Opel");
		Thread.sleep(2000);
		List<WebElement> selectedoptions = select.getAllSelectedOptions();
		System.out.println("The number of selected options->"+selectedoptions.size());
		for(WebElement option:selectedoptions)
		{
			System.out.println(option.getText());
		}
		String firstoption = select.getFirstSelectedOption().getText();
		System.out.println("The first option is->"+firstoption);
		
	}
}
