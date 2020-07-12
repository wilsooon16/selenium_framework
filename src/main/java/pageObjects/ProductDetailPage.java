package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.Assertion;


public class ProductDetailPage {
	public WebElement element = null;
	private WebDriver driver;
	Assertion assertion;
	
	public ProductDetailPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public By productPrice = By.xpath("//*[@id='our_price_display']");
	public By productTitle = By.xpath("//h1[contains(text(),'Printed Summer Dress')]");
	
	
	public void assertElementPDP() {
		assertion = new Assertion(driver);
		assertion.checkElementPresent(productPrice);
		assertion.checkElementPresent(productTitle);
	}
	


}
