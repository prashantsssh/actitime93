package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramTwentyOne 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Xpaths.html");
		
		WebElement textfieldA = driver.findElement(By.xpath("//input[@value='A']"));
		WebElement textfieldB = driver.findElement(By.xpath("//input[@value='B']"));
		WebElement textfieldC = driver.findElement(By.xpath("//input[@value='C']"));
		WebElement textfieldD = driver.findElement(By.xpath("//input[@value='D']"));
		WebElement textfieldE = driver.findElement(By.xpath("//input[@value='E']"));
		
		Dimension dimensionofA = textfieldA.getSize();
		Dimension dimensionofB = textfieldB.getSize();
		Dimension dimensionofC = textfieldC.getSize();
		Dimension dimensionofD = textfieldD.getSize();
		Dimension dimensionofE = textfieldE.getSize();
		
		int heightofA=dimensionofA.getHeight();
		int widthofA = dimensionofA.getWidth();
		
		int heightofB=dimensionofB.getHeight();
		int widthofB = dimensionofB.getWidth();
		
		int heightofC=dimensionofC.getHeight();
		int widthofC = dimensionofC.getWidth();
		
		int heightofD=dimensionofD.getHeight();
		int widthofD = dimensionofD.getWidth();
		
		int heightofE=dimensionofE.getHeight();
		int widthofE = dimensionofE.getWidth();
		
		if(heightofA==heightofB && heightofB==heightofC && heightofC==heightofD && heightofD==heightofE && heightofE==heightofA && widthofA==widthofB && widthofB==widthofC && widthofC==widthofD && widthofD==widthofE && widthofE==widthofA)
		{
			System.out.println("Dimensions of all text fields are equal.");
		}
		else
		{
			System.out.println("Dimensions of all text fields are not equal.");
		}
	}
}