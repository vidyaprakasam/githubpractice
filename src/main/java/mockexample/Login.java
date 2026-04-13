package mockexample;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 1. summary:verify the title and url of the current page Action:Test steps:
		 * 1.Go to URL:https://healthapp.yaksha.com/ 2.login as a valid credential
		 * (username :admin,password:pass 123) 3.click on signin button expected result
		 * : the title should be Danphehealth 2.The URL should be
		 * https://healthapp.yaksha.com/Home/Index#/ do using selenium java
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

		/*
		 * wait.until(ExpectedConditions.titleIs(expectedTitle));
		 * wait.until(ExpectedConditions.urlToBe(expectedURL));
		 */
		String actualURL = driver.getCurrentUrl();
		String actualTitle = driver.getTitle();

		/*
		 * if (actualTitle.equals(expectedTitle)) {
		 * System.out.println("Title is as expected"); } else {
		 * System.out.println("Title not expected"); }
		 */

		
		  Assert.assertEquals(actualURL, expectedURL,
		  "Page URL should be"+expectedURL); Assert.assertEquals(actualTitle,
		  expectedTitle,"Page title should be "+expectedTitle);
		  
		 

	}

}
