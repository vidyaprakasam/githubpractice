package InspectingWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class backgroundcolour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		   WebElement submitBtn = driver.findElement(By.id("submit"));

		String backgorundcolour=submitBtn.getCssValue("background-color");
		String tagname=submitBtn.getTagName();
		String atrname=submitBtn.getAttribute("class");
		System.out.println(backgorundcolour );
	}

}
