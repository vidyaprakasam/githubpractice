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

public class Test2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		By usernametxt = By.xpath("//input[@name='Username']");
		;
		By passwordtxt = By.xpath("//input[@name='password']");

		By Signinbtn = By.xpath("//button[text()='Sign in']");

		By dispensaryArrow = By.xpath("//span[@data-target='#Dispensary']");
		By dispensaryoptions = By
				.xpath("(//span[@data-target='#Dispensary']/following::ul/li/a/span[1])[position()<=6]");
		By maindispensary = By.xpath("//span[@class='report-name'][1]");
		By morningcounter = By.xpath("//h5[text()='Morning Counter ']");
		By searchpatient = By.xpath("//input[@id='patient-search']");
		By New1 = By.xpath("//h5[contains(text(),'New-1')]");
		


		driver.get("https://healthapp.yaksha.com/");

		WebElement username = driver.findElement(usernametxt);
		WebElement password = driver.findElement(passwordtxt);
		WebElement signin = driver.findElement(Signinbtn);
		username.sendKeys("admin");
		password.sendKeys("pass123");
		signin.click();
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
//System.out.println(driver.getPageSource());
		
		//wait.until(ExpectedConditions.elementToBeClickable(New1));
		Thread.sleep(4000);
		WebElement new1popup = driver.findElement(New1);
		new1popup.click();

		WebElement disarrow = driver.findElement(dispensaryArrow);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", disarrow);

		Thread.sleep(3000);
		
		WebElement maindisp=driver.findElement(By.xpath("//i[text()='Main Dispensary']"));
		maindisp.click();
		
		
		WebElement morningctr=driver.findElement(By.xpath("//h5[text()='Morning Counter ']"));
		morningctr.click();
		
		Thread.sleep(3000);
		WebElement check=driver.findElement(By.xpath("//input[@type='checkbox']"));
		System.out.println("check box selected or not"+check.isSelected());
		
		
		WebElement search=driver.findElement(searchpatient);
		search.click();
		
		
		WebElement report=driver.findElement(By.xpath("//a[text()=' Reports ']"));
		report.click();
		
		Thread.sleep(1000);

		WebElement usercollection=driver.findElement(By.xpath("//span[@class='report-name']"));
		usercollection.click();
		Thread.sleep(1000);

		
		js.executeScript("document.getElementById('date').value = '2025-09-15';");
		
		js.executeScript("document.getElementById('date').value = '2025-09-25';");

		System.out.println("date enterd or not");

		//WebElement fromdate=driver.findElement(By.xpath("(//input[@type='date'])[1]"));
		Thread.sleep(1000);

		//fromdate.click();
		/*
		 * fromdate.sendKeys("28092025"); System.out.println("date entered");
		 */

		
		/*
		 * Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_ALT);
		 * robot.keyPress(KeyEvent.VK_N); robot.keyRelease(KeyEvent.VK_N);
		 * robot.keyRelease(KeyEvent.VK_ALT);
		 */
		
		/*
		 * List<WebElement> disoptions=driver.findElements(dispensaryoptions);
		 * 
		 * for(WebElement options:disoptions)
		 * 
		 * 
		 * { System.out.println(options.getText()); } Thread.sleep(3000);
		 * 
		 * 
		 * WebElement maindis=driver.findElement(maindispensary); maindis.click();
		 * WebElement morningcount=driver.findElement(morningcounter);
		 * morningcount.click(); Thread.sleep(2000); WebElement
		 * search=driver.findElement(searchpatient); search.click(); Thread.sleep(2000);
		 * Robot robot=new Robot(); robot.keyPress(KeyEvent.VK_ALT);
		 * robot.keyPress(KeyEvent.VK_N); robot.keyRelease(KeyEvent.VK_N);
		 * robot.keyRelease(KeyEvent.VK_ALT);
		 * 
		 * 
		 * 
		 * Map<String,String> patientdetails=new
		 * FileOperations().readExcelPOI(expectedDataFilePath,"sheetname"); String
		 * firstname_excel=patientdetails.get("firstname");
		 * 
		 * 
		 * 
		 * WebElement
		 * dropdown=driver.findElement(By.xpath("//select[@id='ddlCountry']")); Select
		 * select=new Select(dropdown); select.selectByVisibleText("India");
		 * System.out.println(select.getFirstSelectedOption().getText());
		 * 
		 * 
		 * WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		 * wait.until(ExpectedConditions.elementToBeClickable(dropdown));
		 * wait.until(ExpectedConditions.presenceOfElementLocated(searchpatient));
		 * 
		 * 
		 * 
		 * //System.out.println(disarrow.getAttribute("aria-expanded"));
		 * 
		 
		 */ 
		
		
		
	}

}
