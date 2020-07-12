package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Scroll {
	private WebDriver driver;
	public WebElement element = null;
	private JavascriptExecutor js;

	public Scroll(WebDriver driver) {
		this.driver = driver;
		js = (JavascriptExecutor) driver;
	}

	public void ScrollIntoElement(By locator) {
		WebElement element = driver.findElement(locator);
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}

	public void ScrollUntilElementFound(By locator) {

		boolean elementVisible = false;
		int temp = 0;

		while (elementVisible != true && temp < 5) {

			elementVisible = driver.findElement(locator).isDisplayed();
				
			js.executeScript("window.scrollBy(0, 1900);");

			temp++;

		}
	}

}
