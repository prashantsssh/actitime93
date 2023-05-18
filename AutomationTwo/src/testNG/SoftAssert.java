package testNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SoftAssert 
{
	@Test
	public void demo()
	{
	int actualResult=123;
	int expectedResult=420;
	//Here we can use any data type to compare.
	org.testng.asserts.SoftAssert sa = new org.testng.asserts.SoftAssert();
	sa.assertEquals(actualResult, expectedResult);
	sa.assertAll();
	//Here SoftAssert allows the execution of even if exception is their at a line, by passing control to next line. However, with the use of assertAll() it will show the exception without passing the control to next line. 
	System.out.println("Passed");
	
}}
