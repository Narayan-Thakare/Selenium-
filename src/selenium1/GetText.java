package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// XPath By Attribute
		ChromeDriver driver = new ChromeDriver();
	 	   //maximize the browser
		  	      driver.manage().window().maximize();
		  	      //waiting condition
				  //enter into the dws page
				  driver.get("https://demowebshop.tricentis.com/");
			
				  
				
				  driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();

		
				  
				  WebElement communityPoll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
			        
//--------------------------------------------------------------------------------------------------------------------------
				  String text = communityPoll.getText();
			        System.out.println("Print: " + text);
		
		
		
		
	}

}
