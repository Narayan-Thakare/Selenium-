package selenium1;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
	 	   //maximize the browser
		  	      driver.manage().window().maximize();
		  	      //waiting condition
				  Thread.sleep(2000);
				  //enter into the dws page
				  driver.get("https://demowebshop.tricentis.com/");
				  Thread.sleep(2000);

				  
				  
//				 List<WebElement> comunityPoll= driver.findElements(By.xpath("//input[@type='radio']"));
//
//				 for(WebElement web : comunityPoll) {
//					 
//					 web.click();
//					 Thread.sleep(2000);
//				 }
				 
				 
				 List<WebElement> comunityPoll= driver.findElements(By.xpath("//ul[@class='top-menu']/li/a"));

				 for(WebElement web : comunityPoll) {
					 
					 web.click();

				 driver.navigate().back();
				 }
				 
	
	}

}
