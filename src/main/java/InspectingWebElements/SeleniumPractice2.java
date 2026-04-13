package InspectingWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/radio-button");
		WebElement noradio=driver.findElement(By.xpath("//input[@id=\"noRadio\"]"));
		WebElement yesradio=driver.findElement(By.xpath("//input[@id=\"yesRadio\"]"));

		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", yesradio);


		//WebElement yesradio=driver.findElement(By.xpath("//input[@id=\"yesRadio\"]"));

		if(noradio.isEnabled())
		{
			System.out.println("no radio enabled");
		}
		else
		{
			System.out.println("no radio disabled");

		}
		if(noradio.isDisplayed())
		{
			System.out.println("no radio displayed");

		}
		else
		{
			System.out.println("no radio not displayed");

		}
		if(!(yesradio.isSelected()))
					{
			 ((JavascriptExecutor) driver).executeScript("arguments[0].click();", yesradio);
				System.out.println("Now clicked yes radio button");


		}
		else
		{
			System.out.println("yes radio selected");

		}
		
		List<WebElement> all = driver.findElements(By.xpath("//input[@type=\"radio\" and @class=\"custom-control-input\"]"));
		if (all.stream().filter(WebElement::isSelected).count() != 1) {
		    throw new RuntimeException("More than one radio selected!");
		}



	}

}
