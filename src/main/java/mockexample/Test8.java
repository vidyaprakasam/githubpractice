package mockexample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test8 {

	public static void main(String[] args) throws InterruptedException, AWTException {
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
		Thread.sleep(5000);
		WebElement dispensaryarrow=driver.findElement(By.xpath("//a[@href='#/Dispensary']/span[last()]"));
			System.out.println(dispensaryarrow.getAttribute("data-toggle"));
			System.out.println("******");
			WebElement dispensaryarrowafterclick=driver.findElement(By.xpath("//a[@href='#/Dispensary']"));
			dispensaryarrowafterclick.click();
			
		

			

			
			/*
			 * WebElement
			 * saleoption=driver.findElement(By.xpath("//a[@href='#/Dispensary/Sale']"));
			 * saleoption.click()
			 */


WebElement container = driver.findElement(
        By.xpath("//ul[@class='menu-content out page-sidebar-menu cstm-sidebar']"));
    
    // 2) Scroll that container all the way to its bottom
((JavascriptExecutor)driver).executeScript(
        "arguments[0].scrollTop = arguments[0].scrollHeight;", 
        container
    );
    
    // 3) (Optional pause so the scroll animation finishes)
    try { Thread.sleep(3000); } catch (InterruptedException ignored) {}
    
    // 4) Now locate & click Settings inside that container
	WebElement settingslink=driver.findElement(By.xpath("//span[text()='Settings']"));



		

			}

	}
