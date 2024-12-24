package selenium1;

import java.sql.Driver;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementTask {

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

				  
				  
				  ///////////////////////////////////////////////////////////////////////////////////////////
				  
				  
				  
				//  List<WebElement> followUs = driver.findElements(By.xpath("//div[@class = 'column follow-us']/ul/li/a"));

			  
//				  List<WebElement> followUs = driver.findElements(By.xpath("//ul/li/a[@target='_blank']"));
//
//					 for(WebElement web : followUs) {
//						 
//						 web.click();
//						 Thread.sleep(3000);
//						
//					// driver.navigate().back();
//					 Thread.sleep(3000);
//
//					 }
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  
				  ////////////////////////////////////////////////////////////////////////////////
				  

				  
				 
				  List<WebElement> followUs = driver.findElements(By.xpath("//div[@class = 'column follow-us']/ul/li/a"));

				  
				//  List<WebElement> followUs = driver.findElements(By.xpath("//ul/li/a[@target='_blank']"));

				 for(WebElement web : followUs) {
					 
					 web.click();
					 Thread.sleep(3000);
					 
					 String  VerifyUrl = "https://demowebshop.tricentis.com/news/rss/1";
					 
					 if (VerifyUrl.equals(driver.getCurrentUrl())) {
						 driver.navigate().back();
					 }

				// driver.navigate().back();
				 Thread.sleep(3000);

				 }
				 
		
		
		
	}

}
