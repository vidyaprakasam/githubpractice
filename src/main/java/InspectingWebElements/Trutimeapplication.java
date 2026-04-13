package InspectingWebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Trutimeapplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.setProperty(webDriver.edge.driver, "")
		WebDriver driver=new ChromeDriver();
		driver.get("https://onecognizant.cognizant.com/Home");

	}

}
