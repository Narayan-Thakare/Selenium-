package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {

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
				  
				  
				  WebElement	dwslogo =  driver.findElement(By.cssSelector(".header-logo"));
					System.out.println(dwslogo.isDisplayed());

				  
					WebElement	facbook =  driver.findElement(By.linkText("Facebook"));
					System.out.println(facbook.isDisplayed());


	}

}
