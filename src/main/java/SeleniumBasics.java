import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBasics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		//driver.get("https://www.redbus.in/");
		
		//To find element
	   //driver.findelement(By.id(//i[contains(@class,'boarding_point')]))
		WebElement from=driver.findElement(By.id("icon___be1a22 icon icon-boarding_point"));
		//WebElement from=driver.findElement(By.xpath("//i[contains(@class,'boarding_point')])"));
		from.click();
		//driver.quit();

	}

}

//div[@class='placeHolderContainer___17236c']//child::i