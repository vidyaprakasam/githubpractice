package mockexample;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Summary:Verify the popup and proceed to the next page in the new 1 counter
		 * page Action: Precondition:User must be logged in Teststeps:Click on the
		 * billing tab Let the select counter pop up Click on the new 1 counter verify
		 * search page is present.
		 */
		WebDriver driver = new ChromeDriver();
		driver.get("https://healthapp.yaksha.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String name = "admin";
		String pass = "pass123";
		String expectedTitle = "DanpheHealth";
		String expectedURL = "https://healthapp.yaksha.com/Home/Index#/";
		WebElement username = wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//input[@name='Username']"))));
		WebElement password = driver.findElement(By.xpath("//input[@name='password']"));
		WebElement signinbtn = driver.findElement(By.xpath("//button[text()='Sign in']"));
		username.sendKeys(name);
		password.sendKeys(pass);
		signinbtn.click();
		
		//Click on the billing tab
		
	WebElement billing=	driver.findElement(By.partialLinkText("Billing"));
	billing.click();


	By modal=By.xpath("//div[@class='counter-item']");
	wait.until(ExpectedConditions.visibilityOfElementLocated(modal));
	
	  WebElement
	  new1counter=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[@class='counter-item'][1]/h5[contains(text(),'New-1')]"))));
	 

//h5[contains(normalize-space(.),'New-1')]/span[normalize-space(text())='Click to Activate']

new1counter.click();



WebElement searchElement=driver.findElement(By.xpath("//label[text()='Search OPD Patients:']"));
if(searchElement.isDisplayed())
{
	System.out.println("search page available");
}

	}

}
