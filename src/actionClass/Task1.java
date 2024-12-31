package actionClass;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import selenium1.ID;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		
		Actions act = new Actions (driver);

		Thread.sleep(2000);
WebElement	elementToHover = driver.findElement(By.xpath("//a[@data-group='men']"));

act.moveToElement(elementToHover).perform();

Thread.sleep(2000);

WebElement	clickJacket = driver.findElement(By.xpath("//a[text()='Jackets']"));


act.click(clickJacket).perform();
		
		
	}

}
