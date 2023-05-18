package testNG;

import org.testng.annotations.Test;

public class OrderOfExecutionFromSameClass extends BaseClass
{
	@Test
	public void toOrderIphone13()
	{
		System.out.println("Iphone 13 has been ordered successfully.");
	}
	@Test
	public void toOrderIphone14()
	{
		System.out.println("Iphone 14 has been ordered successfully.");
	}
}
