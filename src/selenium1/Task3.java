package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3 {

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
			

				  driver.findElement(By.className("ico-login")).click();
				  
					 

					  driver.findElement(By.id("Email")).sendKeys("narayan14059969145thakare@gmail.com");

					  driver.findElement(By.id("Password")).sendKeys("Narayan111");

					  driver.findElement(By.id("RememberMe")).click();

					
					  driver.findElement(By.cssSelector(".button-1.login-button")).click();

					  driver.close();

		
		
		
		
		
		
		
		
	}

}
