package selenium1;

import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

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

				  driver.navigate().to("https://www.amazon.in/");
				  Thread.sleep(2000);
				  
				  driver.navigate().back();
				  Thread.sleep(2000);
				  
				  driver.navigate().forward();
				  Thread.sleep(2000);
				  
				  driver.navigate().refresh();

	}

}
