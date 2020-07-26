package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import helper.Assertion;


public class CategoryPage {
	public WebElement element = null;
	private WebDriver driver;
	Assertion assertion;
	
	public CategoryPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void GetPage() {
		this.driver.get("http://automationpractice.com/index.php?id_category=5&controller=category");
	}
	
	
	public By headerBanner = By.xpath("//*[@class='content_scene_cat_bg']");
	public By catalog = By.xpath("//*[contains(text(),'Catalog')]");
	public By productImage = By.xpath("//*[@class='product_img_link']//img[@class='replace-2x img-responsive']");
	
	
	public void assertCategoryPage() {
		assertion = new Assertion(driver);
		assertion.checkElementPresent(headerBanner);
		assertion.checkElementPresent(catalog);
		assertion.checkElementPresent(productImage);
	}
	


}
