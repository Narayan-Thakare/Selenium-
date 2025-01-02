package actionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
	public static void main(String[] args) throws InterruptedException {
		
		
		
ChromeDriver driver =new ChromeDriver();
		
		
		driver.manage().window().maximize();
		
		
		Thread.sleep(2000);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		Thread.sleep(2000);
		
		
		Thread.sleep(2000);
		Actions act = new Actions (driver);

		WebElement	italy = driver.findElement(By.id("box106"));
		WebElement	rome = driver.findElement(By.id("box6"));
		act.dragAndDrop(rome, italy).perform();
		
		Thread.sleep(2000);
		
		WebElement	spain = driver.findElement(By.id("box107"));
		WebElement	madrid = driver.findElement(By.id("box7"));
		act.dragAndDrop(madrid, spain).perform();
		
		Thread.sleep(2000);
		
		WebElement	norway = driver.findElement(By.id("box101"));
		WebElement	oslo = driver.findElement(By.id("box1"));
		act.dragAndDrop(oslo, norway).perform();
		
		Thread.sleep(2000);
		
		WebElement	denmark = driver.findElement(By.id("box104"));
		WebElement	copenhagen = driver.findElement(By.id("box4"));
		act.dragAndDrop(copenhagen, denmark).perform();
		
		Thread.sleep(2000);
		
		WebElement	south  = driver.findElement(By.id("box105"));
		WebElement	seoul = driver.findElement(By.id("box5"));
		act.dragAndDrop(seoul, south).perform();
		
		Thread.sleep(2000);
		
		WebElement	sweden  = driver.findElement(By.id("box102"));
		WebElement	stockholm = driver.findElement(By.id("box2"));
		act.dragAndDrop(stockholm, sweden).perform();
		
		Thread.sleep(2000);
		
		WebElement	united  = driver.findElement(By.id("box103"));
		WebElement	Washington = driver.findElement(By.id("box3"));
		act.dragAndDrop(Washington, united).perform();
		
		Thread.sleep(2000);
		
		
		

		
	}

}
