package selenium;

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

public class CheckImageBanner extends Base {
	private WebDriver driver;
	private String baseUrl;
	HomePage homepage;  
	Assertion assertion;

	
  @Test
  public void f() {
	  	homepage = new HomePage(driver);
	  	homepage.GetPage();		
		assertion.checkElementPresent(driver,"xpath",homepage.bannerTopXpath);
		
		

	  
  }
  @BeforeTest
  public void beforeTest() {
	  	driver = initDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
  }



}
