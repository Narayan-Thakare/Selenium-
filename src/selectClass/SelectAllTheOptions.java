package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAllTheOptions {

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
		  int i= 0 ;
		 List<WebElement> options=sel.getOptions();
		  for (WebElement web : options) {
			  sel.selectByIndex(i++);
			  Thread.sleep(1000);
			  
			  
			  
			  
			  
			  
		  }

	}

}
