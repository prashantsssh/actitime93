package testNG;

import org.testng.annotations.Test;

//Run this program with the Class-'OrderOfExecutionFromDifferentClass' to get the desired result.

public class OrderOfExecutionFromDifferentClass extends BaseClass
{
	@Test
	public void toOrderIphone12()
	{
		System.out.println("Iphone 12 has been ordered successfully.");
	}
}

