package testNG;

import org.testng.annotations.Test;

//@Test annotated Class
public class ClassA 
{
	//@Test annotated method
	@Test
	public void demo1()
	{
		System.out.println("Hello");
	}
	@Test
	public void demo2()
	{
		System.out.println("Hi");
	}
	//Here methods will execute on the basis of their alphabetical order
}
