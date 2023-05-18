package testNG;

import org.testng.annotations.Test;

public class ClassC 
{
	//@Test annotated method
			@Test(priority=2, invocationCount = 5)
			public void qspiders()
			{
				System.out.println("Hello");
			}
			@Test(priority=3, invocationCount = 2)
			public void jspiders()
			{
				System.out.println("Hi");
			}
			@Test(priority=1, invocationCount = 8)
			public void pyspiders()
			{
				System.out.println("Bye");
			}
			//Here invocation count can be used alone or with priority also.
}
