package helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assertion {
	public static WebElement element = null;
	
	
	public static void checkElementPresent(WebDriver driver, String type, String locator) {
		WebElement isPresent = null;
		
		WebDriverWait wait = new WebDriverWait(driver, 10);
	
		if(type.equals("id")) {
			System.out.println("Element found with id: " + locator);
			isPresent = wait.until(
					ExpectedConditions.presenceOfElementLocated(By.id(locator)));
			
			
			
		}else if(type.equals("xpath")) {
			System.out.println("Element found with xpath: " + locator);
			isPresent = wait.until(
					ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
		}
		 
		 Assert.assertEquals(true, isPresent.isDisplayed());
	
		
	} 

}
