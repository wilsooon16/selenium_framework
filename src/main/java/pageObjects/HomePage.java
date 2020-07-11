package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {
	public static WebElement element = null;
	private WebDriver driver;
	
	
	
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public String productImageXpath = "//*[text()='demo_1']";
	public String productImageId = "bigpic";
	public String bannerTopXpath = "//*[@id='htmlcontent_top']";
	
	public void GetPage() {
		this.driver.get("http://automationpractice.com/index.php");
	}
	
	
	public void switchToImage() {
		WebElement handle = driver.findElement(By.xpath("//*[@class='fancybox-iframe']"));
		driver.switchTo().frame(handle);
	}
	
	public WebElement GetProductImage(String index) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement ProductImage = wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[@class='product_img_link'])["+index+"]")));
		return ProductImage;
	}
	
	
	

}
