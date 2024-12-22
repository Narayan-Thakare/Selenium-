package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependentAndIndipendentXpath {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		ChromeDriver driver = new ChromeDriver();
	 	   //maximize the browser
		  	      driver.manage().window().maximize();
		  	      //waiting condition
				  Thread.sleep(2000);
				  //enter into the dws page
				  driver.get("https://demowebshop.tricentis.com/");
		
				  driver.findElement(By.xpath("//a[contains(text(),'Digital downloads')]")).click();
				  
				  Thread.sleep(2000);
			WebElement album_3rd	=  driver.findElement(By.xpath("//a[text()='3rd Album']/../following-sibling::div[3]/div/span"));
		
			String text = album_3rd.getText();
			System.out.println(text);

			 Thread.sleep(2000);
				WebElement album_2rd	=  driver.findElement(By.xpath("//a[text()='Music 2']/../following-sibling::div[3]/div/span"));
			
				String text2nd = album_2rd.getText();

				System.out.println(text2nd);  
				
				 Thread.sleep(2000);
					WebElement album_1st	=  driver.findElement(By.xpath("//a[text()='Music 2']/../following-sibling::div[2]/div/span"));
				
					String text1st = album_1st.getText();

					System.out.println(text1st);
			


	}

}
