package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassF 
{
	@Test(enabled=false)
	public void a()
	{
		System.out.println("Login");
	}
	@Test
	public void b()
	{
		System.out.println("Select Product");
	}
	@Test(invocationCount = 0)
	public void c()
	{
		System.out.println("Add to cart");
	}
	@Test
	public void d()
	{
		System.out.println("Payment");
	}
	//Here using enabled=false will stop the execution of particular method the method and it will not be considered. 
	//Invocation count=0 will stop the method from just invoking, however it will be considered by test suite.    
}
