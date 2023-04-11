package tests;

import utils.Driver;
import java.util.Set;
import java.io.File;
import java.util.Iterator;

import pages.BasePage;
import utils.BrowserUtils;
import utils.DataReader;


public class WindowsHandling {
	
	BrowserUtils brUt;
	BasePage basePage;
	
	public static void main(String[] args) {
		WindowsHandling obj1 = new WindowsHandling();
		obj1.testCaseOne();
		//obj1.testCaseTwo();
	}
	
	public void testCaseOne() {
		
		basePage = new BasePage();
		Driver.getDriver().get(DataReader.getProperty("baseUrl"));
		Driver.getDriver().manage().window().maximize();
		
		basePage.newTabBtn.click();
//		Set<String> windowIds = Driver.getDriver().getWindowHandles();
//		for (String ids : windowIds) {
//			System.out.println(ids);
//		}
		brUt.printAllWindowHandles();
	}
	
	public void testCaseTwo() {
		basePage = new BasePage();
		Driver.getDriver().get(DataReader.getProperty("baseUrl"));
		Driver.getDriver().manage().window().maximize();
		
		String mainWindowId = Driver.getDriver().getWindowHandle();
		basePage.newTabBtn.click();
		
		Set<String> windowIds = Driver.getDriver().getWindowHandles();
		Iterator<String> ids = windowIds.iterator();
		
		String firstWindowId = ids.next();
		if (mainWindowId.equals(firstWindowId)) {
			System.out.println("Main Window ID and First Window ID in Set MATCHED");
		} else {
			System.out.println("Main Window ID and First Window ID in Set DID NOT MATCH");
		}
		
		String secondWindowId = ids.next();
		Driver.getDriver().switchTo().window(secondWindowId);
		
		System.out.println("New Tab button visability: " + basePage.newTabBtn.isDisplayed());
		
		Driver.getDriver().close();
		Driver.getDriver().switchTo().window(mainWindowId);
		
		if (mainWindowId.equals(Driver.getDriver().getWindowHandle())) {
			System.out.println("Navigation back to Main Window PASSED");
		} else {
			System.out.println("Navigation back to Main Window FAILED");
		}
	}
}
