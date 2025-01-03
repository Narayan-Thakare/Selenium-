package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendKeysWithTwoArgument {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Actions act = new Actions (driver);
		
WebElement	search_Field =	driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input"));
		act.sendKeys(search_Field,"Su glasses").perform();
	}

}
