package InspectingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdownelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Launch the chrome browser
		 *  Navigate to * "https://demoqa.com/automation-practice-form" url Check if the City dropdown
		 * is enabled Check if the State dropdown is enabled Select the State as 'NCR'
		 * from drop down Select the City as 'Delhi' from drop down Close the browser
		 */
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement dropdown=driver.findElement(By.xpath("//div[@id=\"state\"]"));

		((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);", dropdown);
		if(dropdown.isEnabled())
		{
			dropdown.sendKeys("NCR"+Keys.ENTER);
		
	}
}
}