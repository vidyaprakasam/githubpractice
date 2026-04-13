package InspectingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class locationandsize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Launch the chrome browser Navigate to
		 * 'https://demoqa.com/automation-practice-form' url Identify the 'Current
		 * Address' text box Get the size of the 'Current Address' text box Get the
		 * location of the 'Current Address' text box Close the browser
		 */

		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		WebElement currentAddress=driver.findElement(By.xpath("//textarea[@id=\"currentAddress\"]"));
		Point location=currentAddress.getLocation();
		Dimension size=currentAddress.getSize();
		size.getHeight();
		
		

		
		//textarea[@id="currentAddress"]
	}

}
