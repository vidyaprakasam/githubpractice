package testNGExamples;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class FirstTestNGtest {
	
	WebDriver driver;
	
	@BeforeSuite
	public void launchBrowser()
	{
		driver=new ChromeDriver();
		
		
	}

	@Test(enabled=false)
	public void test1()
	{
		System.out.println("first method");
	}
	
	
	@Test(priority=3)

	public void test2()
	{
		System.out.println("second method");
	}
	
	@Test(dependsOnMethods = "test2")
	public void test3()
	{
		System.out.println("third method");
	}
	
	@AfterSuite
	public void closeBrowser()
	{
		driver.quit();
	}
	
}
