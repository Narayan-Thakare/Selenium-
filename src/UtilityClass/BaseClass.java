package UtilityClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {
	
 public static	WebDriver driver = null;
public static String browser ="chrome";


	public static void preCondition() throws InterruptedException {
		
		if(browser.equalsIgnoreCase("chrome")) {
			
			driver = new ChromeDriver();
		}
		else if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
		}else if (browser.equalsIgnoreCase("firefox")) {
			
			driver = new FirefoxDriver();
		}
		else {
			driver = new ChromeDriver();

			
		}
		
		
	//	ChromeDriver driver = new ChromeDriver();

		
	 	   //maximize the browser
		  	      driver.manage().window().maximize();
		  	      //waiting condition
				  Thread.sleep(2000);
				  //enter into the dws page
				  driver.get("https://demowebshop.tricentis.com/");
		
	}
	
	
	public static void login() throws InterruptedException {

		  driver.findElement(By.className("ico-login")).click();
		  Thread.sleep(2000);
		  
			  driver.findElement(By.id("Email")).sendKeys("narayan11190thakare@gmail.com");
			  Thread.sleep(2000);
		
			  driver.findElement(By.id("Password")).sendKeys("narayan111");
			  Thread.sleep(2000);
			  
			  driver.findElement(By.id("RememberMe")).click();
			  Thread.sleep(2000);

			  driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		
	}

	public static void logout() throws InterruptedException {
		  Thread.sleep(2000);

		  driver.findElement(By.className("ico-logout")).click();

		
	}
	
	public static void postCondition() throws InterruptedException {
		  Thread.sleep(2000);

		driver.close();
		
	}
	
	
}
