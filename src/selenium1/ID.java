package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {

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

				  driver.findElement(By.className("ico-register")).click();
				  
					  driver.findElement(By.id("FirstName")).sendKeys("Narayan");
					  Thread.sleep(2000);

					  driver.findElement(By.id("LastName")).sendKeys("Thakare");
					  Thread.sleep(2000);

					  driver.findElement(By.id("Email")).sendKeys("narayan117145thakare@gmail.com");

					  driver.findElement(By.id("Password")).sendKeys("Narayan111");

					  driver.findElement(By.id("ConfirmPassword")).sendKeys("Narayan111");
					  Thread.sleep(2000);

					  driver.findElement(By.id("register-button")).click();
					  Thread.sleep(5000);

					  driver.findElement(By.className("register-continue-button")).click();

				  
				  
				  
	}

}
