package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		
		// XPath By Attribute
		ChromeDriver driver = new ChromeDriver();
	 	   //maximize the browser
		  	      driver.manage().window().maximize();
		  	      //waiting condition
				  //enter into the dws page
				  driver.get("https://demowebshop.tricentis.com/");
			
				  
				  
				 // Syntax TagName[@attribute='attribute value']
				  
				  //Add to cart
		//		  driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
		
				//  driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[3]/div/div/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")).click();

		// this is for second element .. X path by group of index
				//  driver.findElement(By.xpath("(//input[@value='Add to cart'])[2]")).click();

		
				 // this is syntax for text function
				  
				  // tagName[text()='textvalue']
				  WebElement communityPoll = driver.findElement(By.xpath("//strong[text()='Community poll']"));
			        

				  String text = communityPoll.getText();
			        System.out.println("Print: " + text);
			        
			        
			        
			        // Syntax :- tagname [contains(text(),'text')]

					  driver.findElement(By.xpath("//a[contains(text(),'Apparel & Shoes')]")).click();
					  
					  
					  
					  

					  
				  
		
	}

}
