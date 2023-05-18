package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;
//To demonstrate working of groups
public class ClassE 
{
	@Test(groups = "smoke")
	public void a()
	{
		System.out.println("Login");
	}
	@Test(groups = "regression")
	public void b()
	{
		System.out.println("Select Product");
	}
	@Test(groups = "regression")
	public void c()
	{
		System.out.println("Add to cart");
	}
	@Test(groups = "smoke")
	public void d()
	{
		System.out.println("Payment");
	}
}
