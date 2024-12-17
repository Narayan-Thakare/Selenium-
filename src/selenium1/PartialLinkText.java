package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkText {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		

		  ChromeDriver driver = new ChromeDriver();
	 	   //maximize the browser
		  	      driver.manage().window().maximize();
		  	      //waiting condition
			//	  Thread.sleep(2000);
				  //enter into the dws page
				  driver.get("https://demowebshop.tricentis.com/");
				 // Thread.sleep(2000);
			
				 
				 // driver.findElement(By.partialLinkText("Shopping")).click();
				  //here we get the text and we only print here in consol
			//	WebElement cart= driver.findElement(By.partialLinkText("Shopping"));

				//System.out.println(cart.getText());
				
				WebElement good= driver.findElement(By.partialLinkText("Poor"));

				System.out.println(good.getText());
				  
				  
	}

}
