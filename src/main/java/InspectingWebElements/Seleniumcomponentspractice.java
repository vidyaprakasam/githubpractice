package InspectingWebElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Seleniumcomponentspractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		//1
		/*
		 * driver.get("https://demoqa.com/forms"); driver.navigate().refresh();
		 * System.out.println("current url"+driver.getCurrentUrl());
		 * System.out.println("page source"+driver.getPageSource());
		 * System.out.println("title"+driver.getTitle());
		 * driver.navigate().to("https://demoqa.com/text-box");
		 * driver.navigate().back(); driver.navigate().forward();
		 * 
		 * WebDriver driver1=new ChromeDriver();
		 * driver1.get("https://demoqa.com/forms"); driver1.close(); driver.quit();
		 */
		
		//2.
		/*
		 * driver.get("https://demoqa.com/text-box"); WebElement
		 * username=driver.findElement(By.xpath("//input[@id=\"userName\"]"));
		 * username.sendKeys("vidya prakasam"); WebElement
		 * emailid=driver.findElement(By.xpath("//input[@id=\"userEmail\"]"));
		 * System.out.println("fullname entered is "+username.getAttribute("value"));
		 * WebElement
		 * submitbtn=driver.findElement(By.xpath("//button[@id=\"submit\"]"));
		 */
		
		
		//3.
//		driver.get("https://demoqa.com/checkbox");
		
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	        try {
	            // 2. Navigate to the checkbox page
	            driver.get("https://demoqa.com/checkbox");
	            
	            Thread.sleep(5000);

	            // Wait for the tree to load
	            wait.until(ExpectedConditions
	                .visibilityOfElementLocated(By.cssSelector(".rct-tree")));

	            // 3. Verify/select the Commands checkbox
	            WebElement cmdInput = driver.findElement(By.id("tree-node-commands"));
	            WebElement cmdLabel = driver.findElement(By.xpath("//label[@for='tree-node-commands']"));
	            if (!cmdInput.isSelected()) {
	                cmdLabel.click();
	                System.out.println("Commands checkbox was not selected. Now selected.");
	            } else {
	                System.out.println("Commands checkbox already selected.");
	            }

	            // 4. Verify if Classified checkbox is displayed
	            WebElement classifiedInput = driver.findElement(By.id("tree-node-classified"));
	            System.out.println("Classified checkbox displayed: " + classifiedInput.isDisplayed());

	            // 5. Select Classified, unselect Commands
	            WebElement classifiedLabel = driver.findElement(By.xpath("//label[@for='tree-node-classified']"));
	            if (!classifiedInput.isSelected()) {
	                classifiedLabel.click();
	                System.out.println("Classified checkbox selected.");
	            }


	        
		        
		
	        
	}
	        finally
			{

			driver.quit();
		        }	
	}
}
