package mainAssessment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test4 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		//WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		By usernametxt =By.id("username_id");
		By passwordtxt = By.id("password");
		By Signinbtn = By.id("login");
		By closepopup =By.xpath("//a[@title='Cancel']");
		By New1 = By.xpath("//h5[contains(text(),'New-1')]");
		By dispensaryArrow = By.xpath("//span[@data-target='#Dispensary']");
		By dispensaryoptions = By
				.xpath("(//span[@data-target='#Dispensary']/following::ul/li/a/span[1])[position()<=6]");
		By maindispensary = By.xpath("(//div[@class='span2 padder-v b-r b-light rpt-link-container'])[1]");
		By morningcounter = By.xpath("//h5[contains(text(),'Morning Counter')]");
		By discardbtn=By.xpath("//button[contains(text(),'Discard ')]");
		By searchpatient = By.xpath("//input[@id='patient-search']");
		By firstname = By.xpath("//input[@formcontrolname='FirstName']");
		By lastname = By.xpath("//input[@formcontrolname='LastName']");
		By countryname = By.xpath("//select[@formcontrolname='CountryId']");
		By registerandbilling = By.xpath("//button[@id='registerNbilling']");

		driver.get("https://healthapp.yaksha.com/");

		WebElement username = driver.findElement(usernametxt);
		WebElement password = driver.findElement(passwordtxt);
		WebElement signin = driver.findElement(Signinbtn);
		username.sendKeys("admin");
		password.sendKeys("pass123");
		signin.click();
		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(New1)); WebElement
		 * new1popup = driver.findElement(New1); new1popup.click(); Thread.sleep(2000);
		 */
		
		//Thread.sleep(5000);
		WebElement close=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(closepopup)));
		close.click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
		WebElement disarrow=driver.findElement(dispensaryArrow);
		
		JavascriptExecutor js=	(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", disarrow);
		
		Thread.sleep(3000);

		WebElement maindis=driver.findElement(maindispensary);
		maindis.click();
	
		WebElement mrngcounter=driver.findElement(morningcounter);
		mrngcounter.click();
		Thread.sleep(2000);
		WebElement discard=driver.findElement(discardbtn);
		
	//	js.executeScript("arguments[0].scrollIntoView(true);", discard);
		js.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500);");
		
		WebElement search=driver.findElement(searchpatient); search.click();

 Robot robot=new Robot();
 robot.keyPress(KeyEvent.VK_ALT);
robot.keyPress(KeyEvent.VK_N);
robot.keyRelease(KeyEvent.VK_N);
robot.keyRelease(KeyEvent.VK_ALT);

WebElement okbutton=driver.findElement(By.xpath("//button[contains(text(),' OK')]"));
okbutton.click();

WebElement firstnameerror=driver.findElement(By.xpath("(//span[@class='color-red font-sm'])[1]"));
String msg=firstnameerror.getText();
System.out.println(msg);
	
	
//
//		/*
//		 * WebElement search=driver.findElement(searchpatient); search.click();
//		 * 
//		 * Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_ALT);
//		 * robot.keyPress(KeyEvent.VK_N); robot.keyRelease(KeyEvent.VK_N);
//		 * robot.keyRelease(KeyEvent.VK_ALT);
//		 

		
		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(closebtn)); WebElement
		 * close=driver.findElement(closebtn); close.click();
		 */
		/*
		 * WebElement disarrow = driver.findElement(dispensaryArrow);
		 * 
		 * JavascriptExecutor js = (JavascriptExecutor) driver;
		 * js.executeScript("arguments[0].click();", disarrow);
		 * 
		 * Thread.sleep(4000);
		 * 
		 * WebElement
		 * maindisp=driver.findElement(By.xpath("//i[text()='Main Dispensary']"));
		 * maindisp.click();
		 * 
		 * 
		 * WebElement
		 * morningctr=driver.findElement(By.xpath("//h5[text()='Morning Counter ']"));
		 * morningctr.click(); Thread.sleep(4000);
		 * 
		 * WebElement search=driver.findElement(searchpatient); search.click();
		 * 
		 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_ALT);
		 * robot.keyPress(KeyEvent.VK_N); robot.keyRelease(KeyEvent.VK_N);
		 * robot.keyRelease(KeyEvent.VK_ALT);
		 */
			  
			
	}
}
