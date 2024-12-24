package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	      //waiting condition
		  Thread.sleep(2000);
		  //enter into the dws page
		  driver.get("file:///C:/Users/ASUS/Downloads/demo-1%20(1).html");
		  
		WebElement multi_select=  driver.findElement(By.id("multiple_cars"));
		  Select sel = new Select (multi_select);
		  sel.selectByVisibleText("BMW");
		  Thread.sleep(2000);
		  sel.selectByValue("lr");
		  Thread.sleep(2000);
		//  sel.deselectByValue("lr");
		  Thread.sleep(2000);
		  sel.selectByIndex(10);

		  Thread.sleep(2000);

		  
		  sel.deselectByVisibleText("BMW");
		  Thread.sleep(2000);
		  sel.deselectByValue("lr");
		  Thread.sleep(2000);
		//  sel.deselectByValue("lr");
		  Thread.sleep(2000);
		  sel.deselectByIndex(10);
		  Thread.sleep(2000);

		  sel.selectByVisibleText("BMW");
		  Thread.sleep(2000);
		  sel.selectByValue("aud");
		  Thread.sleep(2000);
		//  sel.deselectByValue("lr");
		  Thread.sleep(2000);
		  sel.selectByIndex(3);
		  Thread.sleep(2000);

		  sel.deselectAll();
		  
			 System.out.println(sel.isMultiple());

			 
			 
			 Thread.sleep(4000);
			 driver.close();

		  
	}

}
