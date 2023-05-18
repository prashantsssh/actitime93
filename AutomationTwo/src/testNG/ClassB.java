package testNG;

import org.testng.annotations.Test;

public class ClassB 
{
	//@Test annotated method
		@Test(priority=-2)
		public void demo1()
		{
			System.out.println("Hello");
		}
		@Test(priority=1)
		public void demo2()
		{
			System.out.println("Hi");
		}
		//Here priority can be with minus sign as it will follow the order which is followed on Number Line.
		//If priorities of two methods are same then they will be executed in alphabetical order.
}
