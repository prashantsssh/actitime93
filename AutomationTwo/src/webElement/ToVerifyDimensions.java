package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToVerifyDimensions 
{
	public static void main(String[] args)
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Xpaths.html");
		
		WebElement textfldwithvalueA = driver.findElement(By.xpath("//input[@value='A']"));
		WebElement textfldwithvalueB = driver.findElement(By.xpath("//input[@value='B']"));
		WebElement textfldwithvalueC = driver.findElement(By.xpath("//input[@value='C']"));
		WebElement textfldwithvalueD = driver.findElement(By.xpath("//input[@value='D']"));
		WebElement textfldwithvalueE = driver.findElement(By.xpath("//input[@value='E']"));
		
		Dimension dimensionofA = textfldwithvalueA.getSize();
		Dimension dimensionofB = textfldwithvalueB.getSize();
		Dimension dimensionofC = textfldwithvalueC.getSize();
		Dimension dimensionofD = textfldwithvalueD.getSize();
		Dimension dimensionofE = textfldwithvalueE.getSize();
		
		int heightofA=dimensionofA.getHeight();
		int widthofA=dimensionofA.getWidth();
		
		int heightofB=dimensionofB.getHeight();
		int widthofB=dimensionofB.getWidth();
		
		int heightofC=dimensionofC.getHeight();
		int widthofC=dimensionofC.getWidth();
		
		int heightofD=dimensionofD.getHeight();
		int widthofD=dimensionofD.getWidth();
		
		int heightofE=dimensionofE.getHeight();
		int widthofE=dimensionofE.getWidth();
		
		if(heightofA==heightofB && heightofB==heightofC && heightofC==heightofD && heightofD== heightofE && heightofE==heightofA && widthofA==widthofB && widthofB==widthofC && widthofC==widthofD && widthofD==widthofE && widthofE==widthofA)
		{
			System.out.println("Dimensions of all textfields are equal.");
		}
		else
		{
			System.out.println("Dimensions of all textfields are not equal.");
		}
	}
}