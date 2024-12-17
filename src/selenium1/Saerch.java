package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Saerch {

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
			//	  driver.findElement(By.id("small-searchterms")).sendKeys("books");
				  // open the browser wrte a script for dws page 
				  // opwe the browser maximixe page . enter into dws page after entering verify the page by using vaerifyter click regiesr link fill all the deatails and click regiester button finanly close the browser

				  driver.findElement(By.id("small-searchterms")).click();
				  
					  driver.findElement(By.id("small-searchterms")).sendKeys("watch");
					  
					  driver.findElement(By.className("search-box-button")).click();

		
	}

}
