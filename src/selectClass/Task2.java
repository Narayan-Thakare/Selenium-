package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Task2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
	 	   //maximize the browser
		  	      driver.manage().window().maximize();
			  Thread.sleep(2000);
				  //enter into the dws page
				  driver.get("https://demowebshop.tricentis.com/");
				 // Thread.sleep(2000);
			
				  String expectedUrl = "https://demowebshop.tricentis.com/";

				// Get the actual URL of the page
				String actualUrl = driver.getCurrentUrl();

				// Verify the page URL
				if (actualUrl.equals(expectedUrl)) {
				    System.out.println("Page URL is verified: " + actualUrl);
				} else {
				    System.out.println("Page URL verification failed. Actual URL: " + actualUrl);
				}
				
				driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[1]/div[1]/div[2]/ul/li[4]/a")).click();
				
//				WebElement sort_by=  driver.findElement(By.id("products-orderby"));
//				 
//				 Select sel = new Select (sort_by);
//				 sel.getOptions();
//				 List<WebElement> options=sel.getOptions();
//			int i= 0;   
//				 
//				 for (WebElement web : options) {
//					 sort_by=  driver.findElement(By.id("products-orderby"));
//					 sel = new Select (sort_by);
//					    sel.selectByIndex(i++);
//					    Thread.sleep(1000);   
//					}
				 
				 
				 
				 ///////////////////////////////////////////////////////////////////////////////////////
				 
				 
				 
//WebElement display_by=  driver.findElement(By.id("products-pagesize"));
//				 
//				 Select sel2 = new Select (display_by);
//				 sel2.getOptions();
//				 List<WebElement> options2=sel2.getOptions();
//			int j= 0;   
//				 
//				 for (WebElement web2 : options2) {
//					 display_by=  driver.findElement(By.id("products-pagesize"));
//					 sel2 = new Select (display_by);
//					    sel2.selectByIndex(j++);
//					    Thread.sleep(1000);   
//					}
				 
				 ///////////////////////////////////////////////////////////////////////////////
				 
				 
WebElement viewas_by=  driver.findElement(By.id("products-viewmode"));
				 
				 Select sel3 = new Select (viewas_by);
				 sel3.getOptions();
				 List<WebElement> options3=sel3.getOptions();
			int f= 0;   
				 
				 for (WebElement web3 : options3) {
					 viewas_by=  driver.findElement(By.id("products-viewmode"));
					 sel3 = new Select (viewas_by);
					    sel3.selectByIndex(f++);
					    Thread.sleep(3000);   
					}
				 
				 
				 
				 
				 
				 
				 


	}}
