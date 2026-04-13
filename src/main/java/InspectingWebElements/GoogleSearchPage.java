package InspectingWebElements;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class GoogleSearchPage {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");		
		/*
		 * Alert alert=driver.switchTo().alert(); alert.accept();
		 */
		/*
		 * WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		 * 
		 * WebElement consentFrame = wait.until(ExpectedConditions
		 * .presenceOfElementLocated(By.cssSelector("iframe[src*='consent.google.com']")
		 * ));
		 * 
		 * // 3. Switch into the iframe driver.switchTo().frame(consentFrame);
		 * 
		 * // 4. Wait for and click the “Accept all” button WebElement acceptButton =
		 * wait.until(ExpectedConditions
		 * .elementToBeClickable(By.xpath("//button[contains(., 'Accept all')]")));
		 * acceptButton.click();
		 * 
		 * // 5. Return to the main page driver.switchTo().defaultContent();
		 */
	        
			WebElement consent=driver.findElement(By.xpath(" //*[text()=\"Accept all\"]"));
			consent.click();


		WebElement googleLogo=driver.findElement(By.id("hplogo"));
		WebElement googleSearch=driver.findElement(By.id("APjFqb"));
		googleSearch.sendKeys("Bank holidays"+Keys.TAB);
		WebElement Searchbutton=driver.findElement(By.xpath("//div[@class=\"FPdoLc lJ9FBc\"]/child::center/input[@class=\"gNO89b\"]"));
		Searchbutton.click();

	}

}
