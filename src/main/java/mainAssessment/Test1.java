package mainAssessment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		By usernametxt=By.xpath("//input[@name='Username']");
		By passwordtxt=By.xpath("//input[@name='password']");

		WebDriver driver = new ChromeDriver();
		driver.get("https://healthapp.yaksha.com/");
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		String name = "admin";
		String pass = "pass123";
		String expectedTitle = "DanpheHealth";
		String expectedURL = "https://healthapp.yaksha.com/Home/Index#/";
		
		WebElement username = wait.until(
				ExpectedConditions.elementToBeClickable(driver.findElement(usernametxt)));
		WebElement password = driver.findElement(passwordtxt);
		WebElement signinbtn = driver.findElement(By.xpath("//button[text()='Sign in']"));
		username.sendKeys(name);
		password.sendKeys(pass);
		signinbtn.click();
		Thread.sleep(4000);
		
		WebElement arrowHost = driver.findElement(By.xpath("//span[@data-target='#Dispensary']"));

		// Use JavaScript to click the element that owns the ::after pseudo-element
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", arrowHost);


		System.out.println(arrowHost.getAttribute("aria-expanded"));
		Thread.sleep(4000);
		
		List<WebElement> options=driver.findElements(By.xpath("(//span[text()='Dispensary']/following::ul/li)[position() <= 6]"));
		
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}

		
		WebElement arrowHost1 = driver.findElement(By.xpath("//span[@data-target='#Dispensary']"));
		js.executeScript("arguments[0].click();", arrowHost);
		System.out.println("minimized");
		System.out.println(arrowHost.getAttribute("aria-expanded"));
		
		
		Thread.sleep(4000);
		
		WebElement maindispensary=driver.findElement(By.xpath("(//span[@class='report-name'])[1]"));
		maindispensary.click();
		
		WebElement morningcounter=driver.findElement(By.xpath("//h5[text()='Morning Counter ']"));
		morningcounter.click();
		Thread.sleep(4000);

		WebElement searchpatient=driver.findElement(By.xpath("//input[@id='patient-search']"));
		searchpatient.click();
		
		Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_ALT);
		
		WebElement heading=driver.findElement(By.xpath("//h3/span[text()='Add New Patient']"));
		System.out.println(heading.getText());

		WebElement container = driver.findElement(
		        By.xpath("//ul[@class='menu-content out page-sidebar-menu cstm-sidebar']"));
		
		WebElement dropdown=driver.findElement(By.xpath("//select[@id='ddlCountry']"));
		Select select=new Select(dropdown);
		select.selectByVisibleText("India");
		System.out.println(select.getFirstSelectedOption().getText());
		
		WebElement closebutton=driver.findElement(By.xpath("//button[text()=\"X\"]"));
		closebutton.click();
		Thread.sleep(2000);
		System.out.println("first");

		
		WebElement discardbutton=driver.findElement(By.xpath("//button[text()=' Discard ']"));
	
		
		/*
		 * JavascriptExecutor js1=(JavascriptExecutor)driver;
		 * js1.executeScript("arguments[0].scrollIntoView(true);",discardbutton);
		 */
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js2.executeScript("window.scrollBy(0, 500);");

		WebElement dispensary=driver.findElement(By.xpath("//span[text()='Dispensary']"));
		dispensary.click();
		
		JavascriptExecutor js3=(JavascriptExecutor)driver;
		js3.executeScript("arguments[0].scrollTop=arguments[0].scrollHeight;",container);
		    
		/*
		 * // 2) Scroll that container all the way to its bottom
		 * ((JavascriptExecutor)driver).executeScript(
		 * "arguments[0].scrollTop = arguments[0].scrollHeight;", container );
		 * 
		 * // 3) (Optional pause so the scroll animation finishes) try {
		 * Thread.sleep(3000); } catch (InterruptedException ignored) {}
		 * 
		 * // 4) Now locate & click Settings inside that container WebElement
		 * settingslink=driver.findElement(By.xpath("//span[text()='Settings']"));
		 */
		
		JavascriptExecutor js4=(JavascriptExecutor)driver;
		js4.executeScript("arguments[0].click();", args);
		js4.executeScript("arguments[0].scrollIntoView(true);", args);
		js4.executeScript("window.scrollBy(0,1000);");
		js4.executeScript("arguments[0].scrollTop=arguments[0].scrollHeight;", args);
		System.out.println("Modified");
		


	}

}
