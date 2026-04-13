package testNGExamples;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SecondTestNGtest {
	
	@Test(groups= {"apple"})
	public void test4()
	{
		System.out.println("fourth method");
	}
	
	
	@Test(groups={"apple"})

	public void test5()
	{
		System.out.println("fifth method");
	}
	
	@Test()
	@Parameters("Name")
	public void test6(String name)
	{
		System.out.println("sixth method"+name);
	}
	

}
