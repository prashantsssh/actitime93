package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert 
{
	@Test
	public void demo()
	{
	String actualResult="Jack";
	String expectedResult="JackReacher";
	//Here we can use any data type to compare.
	Assert.assertEquals(actualResult, expectedResult);
	System.out.println("Passed");
}}
