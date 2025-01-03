package actionClass;


import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
         ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		Actions act = new Actions (driver);
		
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_DOWN).keyUp(Keys.PAGE_DOWN).perform();
		Thread.sleep(2000);
		act.keyDown(Keys.PAGE_UP).keyUp(Keys.PAGE_UP).perform();
		
	}

}
