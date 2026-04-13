package mainAssessment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test3 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		By usernametxt = By.xpath("//input[@id=\"username_id\"]");
		By passwordtxt = By.xpath("//input[@id=\"password\"]");
		By Signinbtn = By.xpath("//button[@id=\"login\"]");
		By closebtn = By.xpath("//button[text()='X']");
		By New1 = By.xpath("//h5[contains(text(),'New-1')]");
		By dispensaryArrow = By.xpath("//span[@data-target='#Dispensary']");
		By dispensaryoptions = By
				.xpath("(//span[@data-target='#Dispensary']/following::ul/li/a/span[1])[position()<=6]");
		By maindispensary = By.xpath("");
		By morningcounter = By.xpath("");
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
		
		Thread.sleep(3000);
		WebElement close=driver.findElement(By.xpath("//a[text()='X']"));
		close.click();
		
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		
	

		
		/*
		 * wait.until(ExpectedConditions.elementToBeClickable(closebtn)); WebElement
		 * close=driver.findElement(closebtn); close.click();
		 */
		  WebElement disarrow = driver.findElement(dispensaryArrow);

			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("arguments[0].click();", disarrow);

			Thread.sleep(4000);
			
			WebElement maindisp=driver.findElement(By.xpath("//i[text()='Main Dispensary']"));
			maindisp.click();
			

			WebElement morningctr=driver.findElement(By.xpath("//h5[text()='Morning Counter ']"));
			morningctr.click();
			Thread.sleep(4000);

			WebElement search=driver.findElement(searchpatient);
			search.click();
			
			Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_ALT);
			 robot.keyPress(KeyEvent.VK_N); robot.keyRelease(KeyEvent.VK_N);
			  robot.keyRelease(KeyEvent.VK_ALT);
			  
			
			/*
			 * Thread.sleep(3000); WebElement
			 * check=driver.findElement(By.xpath("//input[@type='checkbox']"));
			 * System.out.println("check box selected or not"+check.isSelected());
			 * 
			 * 
			 * WebElement search=driver.findElement(searchpatient); search.click();
			 * 
			 * 
			 * WebElement report=driver.findElement(By.xpath("//a[text()=' Reports ']"));
			 * report.click();
			 * 
			 * Thread.sleep(1000);
			 * 
			 * WebElement
			 * usercollection=driver.findElement(By.xpath("//span[@class='report-name']"));
			 * usercollection.click(); Thread.sleep(1000);
			 * 
			 * 
			 * js.executeScript("document.getElementById('date').value = '2025-09-15';");
			 * //WebElement
			 * fromdate=driver.findElement(By.xpath("(//input[@type='date'])[1]"));
			 * Thread.sleep(1000);
			 * 
			 * 
			 * wait.until(ExpectedConditions.elementToBeClickable(searchpatient));
			 * WebElement search1 = driver.findElement(searchpatient); search1.click();
			 * 
			 * Robot robot = new Robot(); robot.keyPress(KeyEvent.VK_ALT);
			 * robot.keyPress(KeyEvent.VK_N); robot.keyRelease(KeyEvent.VK_N);
			 * robot.keyRelease(KeyEvent.VK_ALT);
			 * 
			 * WebElement fname = driver.findElement(firstname); WebElement lname =
			 * driver.findElement(lastname); WebElement country =
			 * driver.findElement(countryname); fname.sendKeys("vidya");
			 * lname.sendKeys("prakasam"); Select select = new Select(country);
			 * select.selectByVisibleText("India");
			 * System.out.println(select.getFirstSelectedOption()); WebElement registerbtn =
			 * driver.findElement(registerandbilling); registerbtn.click();
			 * 
			 * WebElement errormsg =
			 * driver.findElement(By.xpath("//p[@class='main-message']"));
			 * 
			 * System.out.println(errormsg.getText());
			 * 
			 * Thread.sleep(8000); //
			 * wait.until(ExpectedConditions.elementToBeClickable(closebtn)); WebElement
			 * closebt = driver.findElement(closebtn); closebt.click();
			 * 
			 * WebElement disparrow = driver.findElement(dispensaryArrow); //
			 * JavascriptExecutor js = (JavascriptExecutor) driver;
			 * js.executeScript("arguments[0].click();", disparrow); Thread.sleep(3000);
			 * System.out.println("expanded" + disparrow.getAttribute("aria-expanded"));
			 * 
			 * List<WebElement> dispoptions = driver.findElements(dispensaryoptions); for
			 * (WebElement option : dispoptions) { System.out.println(option.getText());
			 * 
			 * } WebElement disparrow1 = driver.findElement(dispensaryArrow);
			 * js.executeScript("arguments[0].click();", disparrow1); Thread.sleep(3000);
			 * System.out.println("collapsed" + disparrow1.getAttribute("aria-expanded"));
			 * 
			 * // WebElement
			 * leftscroll=driver.findElement(By.xpath("//div[@class='page-sidebar //
			 * navbar-collapse collapse']"));
			 * 
			 * WebElement leftscroll = driver .findElement(By.
			 * xpath("//ul[@class='menu-content out page-sidebar-menu cstm-sidebar']"));
			 * 
			 * js.executeScript("window.scrollBy(0,1000);");
			 * 
			 * // js.executeScript("arguments[0].scrollTop=arguments[0].scrollHeight;",
			 * leftscroll);
			 * 
			 * System.out.println("scrolled");
			 * 
			 * //System.out.println(disarrow.getAttribute("aria-expanded"));
			 */	}

}
