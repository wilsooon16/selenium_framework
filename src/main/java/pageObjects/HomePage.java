package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import helper.Assertion;
import helper.Scroll;

public class HomePage {
	public WebElement element = null;
	private WebDriver driver;
	Scroll scroll;

	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public By productImageQuickView = By.xpath("//*[text()='demo_1']");;
	public By bannerTop = By.xpath("//*[@id='htmlcontent_top']");
	public By homeIframe = By.xpath("//*[@class='fancybox-iframe']");
	public By mainProductImage = By.xpath("(//*[@id='homefeatured']//li)[5]");

	public void GetPage() {
		this.driver.get("http://automationpractice.com/index.php");
	}

	public void switchToImage() {
		WebElement handle = driver.findElement(homeIframe);
		driver.switchTo().frame(handle);
	}

	public void ScrollToProductImage() {
		scroll = new Scroll(driver);
		scroll.ScrollIntoElement(mainProductImage);
	}

	public WebElement MainProductImageElement() {
		WebElement element = driver.findElement(mainProductImage);
		return element;
	}

	public WebElement ProductImageElement(String index) {
		WebDriverWait wait = new WebDriverWait(driver, 3);
		WebElement ProductImage = wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.xpath("(//*[@class='product_img_link'])[" + index + "]")));
		return ProductImage;
	}

}
