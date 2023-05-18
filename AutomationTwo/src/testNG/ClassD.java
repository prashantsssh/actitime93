package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ClassD
{
	@Test
	public void a() 
	{
		System.out.println("Login");
	}
	@Test(dependsOnMethods = "a")
	public void b()
	{
		Assert.fail();
		System.out.println("Select Product");
	}
	@Test(dependsOnMethods = "b")
	public void c()
	{
		System.out.println("Add to cart");
	}
	@Test(dependsOnMethods = "c")
	public void d()
	{
		System.out.println("Payment");
	}
}
