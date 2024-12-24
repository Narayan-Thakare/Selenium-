package UtilityClass;

import org.openqa.selenium.By;

public class UtilityTask extends BaseClass {

	public static void main(String[] args) throws InterruptedException  {
		
		// TODO Auto-generated method stub

		preCondition();
		  Thread.sleep(2000);

		login();
		  Thread.sleep(2000);

		  
			  driver.findElement(By.cssSelector(".search-box-text.ui-autocomplete-input")).sendKeys("watch");
			  Thread.sleep(2000);
			  
			  driver.findElement(By.xpath("//input[@value='Search']")).click();
			  Thread.sleep(2000);
			  
			  logout();
			  Thread.sleep(2000);

			  postCondition();
		
		
	}

}
