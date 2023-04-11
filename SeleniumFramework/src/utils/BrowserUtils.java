package utils;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BrowserUtils {
	
	WebDriverWait wait;
	JavascriptExecutor js;
	
	public void clearText(WebElement element) {
		String temp = element.getAttribute("value");
		for (int i = 0; i < temp.length(); i++) {
			element.sendKeys(Keys.BACK_SPACE);
		}
	}
	
	public void waitForElementVisible(WebElement element) {
		wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void scrollToElement (WebElement element) {
		js =(JavascriptExecutor) Driver.getDriver();
		js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	public void printAllWindowHandles() {
		int idNum = 1;
		Set<String> allHandles = Driver.getDriver().getWindowHandles();
		Iterator<String> ids = allHandles.iterator();
		while (ids.hasNext()) {
			System.out.println("ID" + idNum + ": " + ids.next());
		}
	}
}
