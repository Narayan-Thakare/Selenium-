package selectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	      //waiting condition
		  Thread.sleep(2000);
		  //enter into the dws page
		  driver.get("file:///C:/Users/ASUS/Downloads/demo-1%20(1).html");
		  
		WebElement singleSelect=  driver.findElement(By.id("standard_cars"));
		  Select sel = new Select (singleSelect);
		  sel.selectByVisibleText("BMW");
		  Thread.sleep(2000);
		  sel.selectByValue("lr");
		  Thread.sleep(2000);
		//  sel.deselectByValue("lr");
		  Thread.sleep(2000);
		  sel.selectByIndex(10);
		 System.out.println(sel.isMultiple());
		  
		  

		
		
		
	}

}
