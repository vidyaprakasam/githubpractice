package mockexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Test4 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		
/*		Firstname,middlename,lastname,age and contact number text fields are present inside the add new patient form
		Pre cond:Add new patient form should be open
		Verify whether the first name ,middle name,age,lastname,contact number are displayed in form*/
		
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
//Thread.sleep(5000);

List<By> fieldLocators = Arrays.asList(	
        By.xpath("//input[@placeholder='First Name']"),
        By.xpath("//input[@placeholder='Middle Name']"),
        By.xpath("//input[@placeholder='Last Name']"),
        By.xpath("//input[@placeholder='Age']"),
        By.xpath("//input[@placeholder='Contact Number']"));
for (By locator : fieldLocators) {
    WebElement field = wait.until(
        ExpectedConditions.visibilityOfElementLocated(locator)
    );
    Assert.assertTrue(
        field.isDisplayed(),
        "Form field " + locator + " should be displayed"
    );




	}

	}
}
