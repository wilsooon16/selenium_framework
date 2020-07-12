package helper;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assertion {
	private WebDriver driver;
	public WebElement element = null;

	public Assertion(WebDriver driver) {
		this.driver = driver;
	}

	public void checkElementPresent(By locator) {
		WebElement isPresent = null;

		WebDriverWait wait = new WebDriverWait(driver, 10);

		System.out.println("Element found with id: " + locator);
		isPresent = wait.until(ExpectedConditions.presenceOfElementLocated(locator));

		Assert.assertEquals(true, isPresent.isDisplayed());

	}

}
