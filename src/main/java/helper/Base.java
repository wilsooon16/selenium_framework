package helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!gagag
 *
 */
public class Base {
	public static WebDriver initDriver() 
    {
    	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/src/chromedriver");
		WebDriver driver = new ChromeDriver();
		return driver;
    }
}
