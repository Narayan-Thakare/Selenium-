package actionClass;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendValueInTextField {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Actions act = new Actions (driver);
		
		Thread.sleep(2000);
		act.keyDown(Keys.TAB).keyDown(Keys.TAB)
		.keyDown(Keys.TAB).keyDown(Keys.TAB)
		.keyDown(Keys.TAB).keyDown(Keys.TAB).perform();
		Thread.sleep(2000);
		act.sendKeys("OnePlus Buds").keyDown(Keys.ENTER).perform();

	}

}
