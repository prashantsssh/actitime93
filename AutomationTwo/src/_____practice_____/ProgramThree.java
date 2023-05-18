package _____practice_____;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgramThree
{
	public static void main(String[] args) 
	{
		ChromeDriver driver = new ChromeDriver();
		Dimension dim = driver.manage().window().getSize();
		int height= dim.getHeight();
		int width= dim.getWidth();
		System.out.println(dim);
		System.out.println("The width of the browser is->"+width);
		System.out.println("The height of the browser is->"+height);
		Point pos = driver.manage().window().getPosition();
		System.out.println(pos);
		int x=pos.getX();
		int y=pos.getY();
		System.out.println("The x coordinate is->"+x);
		System.out.println("The y coordinate is->"+y);
		
		System.out.println("========Setting new dimensions and position=========");
//		driver.manage().window().setSize(new Dimension(700,500));
		Dimension newdim = new Dimension(700,500);
		driver.manage().window().setSize(newdim);
		System.out.println("New size->"+newdim);
		
		Point newpos = new Point(200,120);
		driver.manage().window().setPosition(newpos);
		System.out.println("New position->"+newpos);
		
		
		
	}
}
