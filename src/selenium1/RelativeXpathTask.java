package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpathTask {

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

						  driver.findElement(By.xpath("//input[@value='Add to cart']")).click();

						  Thread.sleep(1000);
						  driver.findElement(By.xpath("//input[@class='recipient-name']")).sendKeys("Shreeji");
						  Thread.sleep(1000);
						  
						  driver.findElement(By.xpath("//input[@class='recipient-email']")).sendKeys("Shreeji111thakare@gmail.com");
						  Thread.sleep(1000);

						  driver.findElement(By.xpath("//input[@class='sender-name']")).sendKeys("Narayan");
						  Thread.sleep(2000);

						  driver.findElement(By.xpath("//input[@class='sender-email']")).sendKeys("Narayan111thakare@gmail.com");
						  Thread.sleep(2000);

						  driver.findElement(By.xpath("//textarea[@class='message']")).sendKeys("Please diliverd fast");

						  
						  Thread.sleep(1000);

						  //////////////////////////////////////  here i clear the quantity
						  WebElement qtyInput = driver.findElement(By.xpath("//input[@class='qty-input']"));

						qtyInput.clear();

						
						qtyInput.sendKeys("2");	
						
						
						Thread.sleep(1000);

						  driver.findElement(By.xpath("//input[@id='add-to-cart-button-2']")).click();

						  
							Thread.sleep(1000);

						  driver.findElement(By.xpath("//span[@class='cart-label']")).click();
							Thread.sleep(1000);

						  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
							Thread.sleep(2000);

						  driver.findElement(By.xpath("//input[@name='updatecart']")).click();

						  
						/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
							Thread.sleep(2000);

						 
						  driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();

		//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
							Thread.sleep(2000);

						  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[5]/a")).click();

							Thread.sleep(2000);

							
							 WebElement logo = driver.findElement(By.xpath("//div[@class='header-logo']/a"));
						        if (logo.isDisplayed()) {
						            System.out.println("Web element verification passed: Logo is displayed.");
						        } else {
						            System.out.println("Web element verification failed: Logo is not displayed.");
						        }
						        
								Thread.sleep(3000);

						  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]/input")).click();
							Thread.sleep(3000);

						  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[2]/div/div[2]/div[3]/div[2]/input")).click();
							Thread.sleep(3000);

						  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")).click();
							Thread.sleep(3000);

						  driver.findElement(By.xpath("//span[@class='cart-label']")).click();
							Thread.sleep(3000);

						  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[1]/input")).click();
							Thread.sleep(3000);
							
						  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[2]/td[1]/input")).click();
								Thread.sleep(3000);
								
					   	 driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[3]/td[1]/input")).click();
									Thread.sleep(2000);
							
							

						  driver.findElement(By.xpath("//input[@name='updatecart']")).click();

						  ///////////////////////////////////////////////////////////////////////////////////////
						  driver.findElement(By.xpath("//img[@alt='Tricentis Demo Web Shop']")).click();

						  
						  Thread.sleep(3000);
					//	 driver.quit();
		
		
		
	}

}
