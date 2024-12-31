package selectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		
		driver.findElement(By.partialLinkText("Digital")).click();
		
		List<WebElement> addtcart = driver.findElements(By.cssSelector(".button-2.product-box-add-to-cart-button"));
		
		System.out.println(addtcart);
		
		for(WebElement add:addtcart)
		{
			add.click();
			Thread.sleep(2000);
		//driver.navigate().back();
			}
		
		driver.findElement(By.className("cart-label")).click();
		Thread.sleep(3000);
		List <WebElement> text =  driver.findElements(By.xpath("//input[@class='product-unit-price']"));
		List <WebElement> removeButtons =  driver.findElements(By.xpath("//input[@name='removecart']"));
		for(int i=0;i<text.size();i++)
		{
			double price=Double.parseDouble(text.get(i).getText().replace("$",""));
			double highprice=0.0;
			int highpriceindex=0;
			if (price>highprice) {
				highprice=price;
				highpriceindex=i;
				
			}
			removeButtons.get(highpriceindex).click();
			
		}
	//	driver.close();
	}


}
