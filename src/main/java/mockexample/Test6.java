package mockexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test6 {
	
	
	/*
	 * Select India from country dropdown check if user is able to select india from
	 * dropdown
	 */

	public static void main(String[] args) throws AWTException {
		// TODO Auto-generated method stub
		
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

WebElement dropdown=driver.findElement(By.xpath("//select[@formcontrolname='CountryId']"));
Select select =new Select(dropdown);
select.selectByVisibleText("India");

String countryselected=select.getFirstSelectedOption().getText();
System.out.println(countryselected);
System.out.println("hello");

WebElement closebutton=driver.findElement(By.xpath("//button[text()='X']"));
closebutton.click();

robot.keyPress(KeyEvent.VK_ALT);
robot.keyPress(KeyEvent.VK_N);
robot.keyRelease(KeyEvent.VK_N);
robot.keyRelease(KeyEvent.VK_ALT);

WebElement registerbtn=driver.findElement(By.xpath("//button[text()=' Register & Billing ']"));
registerbtn.click();

System.out.println(driver.findElement(By.xpath("//p[@class='msg-status']")).getText());
System.out.println(driver.findElement(By.xpath("//p[@class='main-message']")).getText());

	}

}
