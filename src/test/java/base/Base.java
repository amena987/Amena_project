package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Base {
	protected static WebDriver driver;

	public static void navigateURL(String url) {
		driver.get(url);
	}

	public static void click(By a) {// without String,int datatype that time we can use (By a)
		driver.findElement(a).click();
		
	}
	
	
	public static void clear(By locator) {
		driver.findElement( locator ).clear();
	}

	public static void sendkeys(By xpath, String value) {// we write send keys this way

		driver.findElement(xpath).sendKeys(value);
	}

	public static String getElementText(By locator) {

		WebElement element = driver.findElement(locator);
		String s = element.getText();
		return s;
	}
	
	

}
