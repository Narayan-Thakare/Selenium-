package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabled {

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
				  
			WebElement	register =  driver.findElement(By.className("ico-register"));
			
			if(register.isEnabled()) {
				
				System.out.println("Resgister is enabled ");
				register.click();
				
			}else {
				
				System.out.println("Register is not enabled ");
			}
		


	}

}
