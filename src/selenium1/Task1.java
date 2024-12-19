package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
	 	   //maximize the browser
		  	      driver.manage().window().maximize();
		  	      //waiting condition
				  Thread.sleep(2000);
				  //enter into the dws page
				  driver.get("https://demowebshop.tricentis.com/");

			        // Expected title of the page
			        String expectedTitle = "Demo Web Shop";

			        // Get the actual title of the page
			        String actualTitle = driver.getTitle();

			        // Verify the page title
			        if (actualTitle.equals(expectedTitle)) {
			            System.out.println("Page title is verified: " + actualTitle);
			        } else {
			            System.out.println("Page title verification failed. Actual title: " + actualTitle);
			        }

					  Thread.sleep(1000);

					  driver.findElement(By.className("ico-register")).click();
					  Thread.sleep(1000);

					  driver.findElement(By.className("ico-login")).click();
					  Thread.sleep(1000);
					  
					  driver.findElement(By.className("cart-label")).click();
					  Thread.sleep(1000);

					  
					  driver.findElement(By.className("cart-label")).click();
					  Thread.sleep(1000);
					  
					  driver.quit();

				//	  driver.findElement(By.className("ico-login")).click();

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
				  
				  
		
		
		

	}

}
