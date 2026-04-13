package InspectingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class LocatorStratergies {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		//Id locator
		/*
		 * driver.get("https://demo.guru99.com/test/facebook.html"); WebElement
		 * email=driver.findElement(By.id("email")); email.sendKeys("vidya");
		 */
		
		//Name Locator
		
		
		/*
		 * driver.get("https://demo.guru99.com/test/newtours/"); WebElement
		 * username=driver.findElement(By.name("userName")); username.sendKeys("vidya");
		 */
		 
		
		
		//Classname
		
		/*
		 * driver.get("https://demo.guru99.com/test/facebook.html"); WebElement
		 * username=driver.findElement(By.className("inputtext"));
		 * username.sendKeys("vidya");
		 */
		
		//tagname
		
		/*
		 * driver.get("https://www.google.com"); WebElement
		 * consent=driver.findElement(By.xpath(" //*[text()=\"Accept all\"]"));
		 * consent.click();
		 * 
		 * WebElement username=driver.findElement(By.tagName("textarea"));
		 * username.sendKeys("vidya");
		 */
		
		//Link text
		
		/*
		 * driver.get("https://www.google.com"); WebElement
		 * consent=driver.findElement(By.xpath(" //*[text()=\"Accept all\"]"));
		 * consent.click();
		 * 
		 * WebElement gmail =driver.findElement(By.linkText("Gmail")); gmail.click();
		 */
		
		//Partial link text
		
		/*
		 * driver.get("https://www.google.com"); WebElement
		 * consent=driver.findElement(By.xpath(" //*[text()=\"Accept all\"]"));
		 * consent.click();
		 * 
		 * WebElement gmail =driver.findElement(By.partialLinkText("How Search"));
		 * gmail.click();
		 */
		
		//Css selector by id
		/*
		 * driver.get("https://demo.guru99.com/test/facebook.html"); WebElement
		 * cssbyid=driver.findElement(By.cssSelector("#email"));
		 * cssbyid.sendKeys("vidya");
		 */
		
		
		//Css selector by  tag and id
		
		/*
		 * driver.get("https://demo.guru99.com/test/facebook.html"); WebElement
		 * cssbytagid=driver.findElement(By.cssSelector("input#email"));
		 * cssbyid.sendKeys("vidya");
		 */
		
		
		//Css selector by class
		
		/*
		 * driver.get("https://demo.guru99.com/test/facebook.html"); WebElement
		 * cssbyclass=driver.findElement(By.cssSelector(".inputtext"));
		 * cssbyclass.sendKeys("vidya");
		 */
		  
		//Css selector by tag and class
			
		/*
		 * driver.get("https://demo.guru99.com/test/facebook.html"); WebElement
		 * cssbyclass=driver.findElement(By.cssSelector("input.inputtext"));
		 * cssbyclass.sendKeys("vidya");
		 */
		 
			//Css selector by tag and attribute
		  
			/*
			 * driver.get("https://demo.guru99.com/test/facebook.html"); WebElement
			 * cssbytagattribute=driver.findElement(By.cssSelector("input[class=inputtext]")
			 * ); cssbytagattribute.sendKeys("vidya");
			 */

			//Css selector by tag,calss  and attribute
		  
		/*  driver.get("https://demo.guru99.com/test/facebook.html");
		  WebElement cssbytagattribute=driver.findElement(By.cssSelector("input.inputtext[id=email]"));
		  cssbytagattribute.sendKeys("vidya");*/

		  //xpath last()
		  
		  
			/*
			 * driver.get("https://testautomationpractice.blogspot.com/"); //WebElement
			 * cssbytagattribute=driver.findElement(By.xpath("name"));
			 * 
			 * WebElement belowknownelement=driver.findElement(By.id("name")); WebElement
			 * foundElement= driver.findElement(RelativeLocator.with(By.id("email")).below(
			 * belowknownelement)); foundElement.sendKeys("vidya");
			 */
		
		//Shadow Dom
		  
		  driver.get("https://dev.automationtesting.in/shadow-dom");
		  Thread.sleep(5000);
		 WebElement shadowcontext= driver.findElement(By.cssSelector("#shadow-root"));
		SearchContext shadowroot= shadowcontext.getShadowRoot();
		WebElement shadowdom=shadowroot.findElement(By.cssSelector("#shadow-element"));
	//	shadowdom.click();
		
		  //WebElement cssbytagattribute=driver.findElement(By.xpath("name"));
/*
		 WebElement belowknownelement=driver.findElement(By.id("name"));
		  WebElement foundElement= driver.findElement(RelativeLocator.with(By.id("email")).below(belowknownelement));
		  foundElement.sendKeys("vidya");*/
		  
		
       // driver.quit();
	}

}
