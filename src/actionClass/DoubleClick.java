package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
ChromeDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		driver.get("https://demo.guru99.com/test/simple_context_menu");
		
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		Actions act = new Actions (driver);

		
		WebElement	double_click = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		act.doubleClick(double_click).perform();
		Thread.sleep(2000);

		try {
			double_click.click();
			Thread.sleep(2000);
			System.out.println("double click PopUp is not displayed");

		} catch (Exception e) {
			  System.out.println("double click PopUp id Displayed");
		}


	}

}
