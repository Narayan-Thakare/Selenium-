package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTheValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String product = "aeroplane";

		ChromeDriver driver = new ChromeDriver();
	 	   //maximize the browser
		  	      driver.manage().window().maximize();
		  	      //waiting condition
				  Thread.sleep(2000);
				  //enter into the dws page
				  driver.get("https://demowebshop.tricentis.com/");
				  Thread.sleep(2000);

				  WebElement searchElement = driver.findElement(By.id("small-searchterms"));
				  
				  searchElement.sendKeys("aeroplane");
				 String actual_data = searchElement.getAttribute("value");
				 
				 System.out.println(actual_data);
				 if(product.equals(actual_data)) {
					 
					 System.out.println("data added sussefully");
				 }
				 else {
					 
					 System.out.println("Data is not added");
				 }
				 Thread.sleep(2000);
				 driver.quit();

				 
		
	}

}
