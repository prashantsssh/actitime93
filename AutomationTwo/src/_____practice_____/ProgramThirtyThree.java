package _____practice_____;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ProgramThirtyThree 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demoqa.com/select-menu");
		WebElement dropdown = driver.findElement(By.id("cars"));
		
		Select select = new Select(dropdown);
		select.selectByVisibleText("Volvo");
		select.selectByVisibleText("Audi");
		
		List<WebElement> selectedoptions = select.getAllSelectedOptions();
		System.out.println("The number of selected options is->"+selectedoptions.size());
		for(WebElement option:selectedoptions)
		{
			System.out.println(option.getText());
		}
		WebElement firstoption = select.getFirstSelectedOption();
		System.out.println("The first selected option is->"+firstoption.getText());
	}
}
