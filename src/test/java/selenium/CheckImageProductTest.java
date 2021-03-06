package selenium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;

import helper.Assertion;
import helper.Base;
import pageObjects.HomePage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

public class CheckImageProductTest extends Base {
	private WebDriver driver;
	private String baseUrl;
	HomePage homepage;  
	Assertion assertion;

	
  @Test
  public void f() throws InterruptedException {
	  	homepage = new HomePage(driver);
	  	assertion = new Assertion(driver);
	  	homepage.GetPage();
		homepage.GetSingleProductImage("1").click();
		homepage.switchToImage();		
		assertion.checkElementPresent(homepage.productImageQuickView);
	  
  }
  @BeforeTest
  public void beforeTest() {
	  	driver = initDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
  }



}
