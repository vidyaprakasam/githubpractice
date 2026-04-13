package InspectingWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getlistofwebelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Launch the chrome browser Navigate to "https://demoqa.com/selectable" url In
		 * the list tab, get the list of elements Print the the name of the content
		 * Close the browser
		 */
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/selectable");
		
		List<WebElement> listofele=driver.findElements(By.xpath("//ul[@id='verticalListContainer']/li"));
		
		for(WebElement ele:listofele)
		{
			System.out.println(ele.getText());
		}
	}

}
