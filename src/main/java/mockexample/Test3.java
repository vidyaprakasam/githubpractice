package mockexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		/*
		 * Summary:Perform the keyboard operation to open the popup and verify if the
		 * popup is displayed or not
		 * 
		 * preconditions:User should be on searchpatient page actions: 1.Click on the
		 * blank space below the serach opd patients section 2.Hit Alt+N through the
		 * keyboard to open the add new patient popup expectation:Verify the form should
		 * popup with"Add new patient" as the title of the form
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
	
By textbox=By.xpath("//input[@id='srch_PatientList']");
wait.until(ExpectedConditions.presenceOfElementLocated(textbox));
Robot robot=new Robot();
robot.keyPress(KeyEvent.VK_ALT);
robot.keyPress(KeyEvent.VK_N);
robot.keyRelease(KeyEvent.VK_N);
robot.keyRelease(KeyEvent.VK_ALT);


	
	
}

}
