package webDriver;

import org.openqa.selenium.edge.EdgeDriver;

public class ToVerifyTheTitle 
{
	public static void main(String[] args) 
	{
		  EdgeDriver driver= new EdgeDriver();
		  driver.get("https://www.selenium.dev/");
		  String title= driver.getTitle();
		  System.out.println("The title of the oppened page is->"+title);
		  if(title.equals("Selenium"))
		  {
			  System.out.println("Passed: The title is verified.");
		  }
		  else
			  System.out.println("Failed: The title is not verified");
	}
}
