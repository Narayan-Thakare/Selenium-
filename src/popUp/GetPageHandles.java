package popUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GetPageHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ChromeDriver driver =new ChromeDriver();
		 driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		String parentHandle = driver.getWindowHandle();
		System.out.println(parentHandle);
		Actions act = new Actions (driver);
		act.keyDown(Keys.PAGE_DOWN).perform();
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		Thread.sleep(2000);
Set<String>  child =   driver.getWindowHandles();
		
System.out.println(child);
	}

}
