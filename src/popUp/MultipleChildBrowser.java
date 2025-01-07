package popUp;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MultipleChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String expected_url ="https://x.com/nopCommerce?mx=2";
		
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
		
		driver.findElement(By.xpath("//a[text()='Twitter']")).click();

		Thread.sleep(5000);

		Set<String>  child =   driver.getWindowHandles();
		Thread.sleep(2000);
		
		for (String str : child) {
			Thread.sleep(2000);
			
			driver.switchTo().window(str);
			String actual_url = driver.getCurrentUrl();
			Thread.sleep(2000);
			
			if (expected_url.equals(actual_url)) {
				
				Thread.sleep(2000);

				driver.findElement(By.xpath("//span[text()='Create account']")).click();

				
			}
			Thread.sleep(2000);
			
		}
		
		
	}

}
