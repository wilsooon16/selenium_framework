package selenium;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import helper.Assertion;
import helper.Base;
import pageObjects.HomePage;
import pageObjects.ProductDetailPage;

public class CheckProductDetailTest extends Base {
	private WebDriver driver;
	private String baseUrl;
	HomePage homepage;
	ProductDetailPage pdp;
	Assertion assertion;

	@Test
	public void f() throws InterruptedException {
		homepage = new HomePage(driver);
		
		homepage.GetPage();
		homepage.GetMainProductImageElement().click();		
		pdp = new ProductDetailPage(driver);
		pdp.assertElementPDP();
		


	}

	@BeforeTest
	public void beforeTest() {
		driver = initDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterTest
	public void afterTest() throws InterruptedException {
		Thread.sleep(2000);
		driver.quit();
	}

}
