package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSeclector {

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
				  
					WebElement	excellent =  driver.findElement(By.id("pollanswers-1"));
					System.out.println(excellent.isSelected());


	}

}
