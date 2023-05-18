package _____practice_____;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramTwenty 
{
	public static void main(String[] args) 
	{
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/admin/Desktop/Xpaths.html");
		
		Dimension dim = driver.findElement(By.xpath("//input[@value='A']")).getSize();
		int height=dim.getHeight();
		int width=dim.getWidth();
		System.out.println("The dimensions of A textfield is->"+dim);
		System.out.println("The height of A textfield is->"+height);
		System.out.println("The width of A textfield is->"+width);
		
		System.out.println("===========================");
		
		Dimension dim1 = driver.findElement(By.xpath("//input[@value='B']")).getSize();
		int height1=dim1.getHeight();
		int width1=dim1.getWidth();
		System.out.println("The dimensions of B textfield is->"+dim1);
		System.out.println("The height of B textfield is->"+height1);
		System.out.println("The width of B textfield is->"+width1);
		
		System.out.println("===========================");
		
		Dimension dim2 = driver.findElement(By.xpath("//input[@value='C']")).getSize();
		int height2=dim2.getHeight();
		int width2=dim2.getWidth();
		System.out.println("The dimensions of C textfield is->"+dim2);
		System.out.println("The height of C textfield is->"+height2);
		System.out.println("The width of C textfield is->"+width2);
		
		System.out.println("===========================");
		
		Dimension dim3 = driver.findElement(By.xpath("//input[@value='D']")).getSize();
		int height3=dim3.getHeight();
		int width3=dim3.getWidth();
		System.out.println("The dimensions of D textfield is->"+dim3);
		System.out.println("The height of D textfield is->"+height3);
		System.out.println("The width of D textfield is->"+width3);
		
		System.out.println("================================================");
		
		Dimension dim4 = driver.findElement(By.xpath("//input[@value='E']")).getSize();
		int height4=dim4.getHeight();
		int width4=dim4.getWidth();
		System.out.println("The dimensions of E textfield is->"+dim4);
		System.out.println("The height of E textfield is->"+height4);
		System.out.println("The width of E textfield is->"+width4);
		
		if((dim.equals(dim1))&&(dim.equals(dim2))&&(dim.equals(dim3))&&(dim.equals(dim4)))
		{
			System.out.println("Dimensions of all text fields are equal.");
		}
		else
		{
			System.out.println("Dimensions of all textfields are not equal.");
		}
	}
}
