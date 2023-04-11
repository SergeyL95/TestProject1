package tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import pages.BasePage;
import utils.DataReader;
import utils.Driver;

public class DropDownTests {
	public static void main(String[] args) {
		
		DropDownTests obj1 = new DropDownTests();
		obj1.testCaseOne();
		obj1.testCaseTwo();
		
	}
	
	BasePage basePage;
	
	public void testCaseOne() {
		
		Driver.getDriver().get(DataReader.getProperty("baseUrl"));
		Driver.getDriver().manage().window().maximize();
		basePage = new BasePage();
		
		Select selectOpt = new Select(basePage.searchDropDown);
		List<WebElement> allOptions = selectOpt.getOptions();
		if (allOptions.size()==58) {
			System.out.println("DropDown size verification PASSED");
		} else {
			System.out.println("DropDown size verification FAILED");
		}
		
		for (WebElement each : allOptions) {
			System.out.println(each.getText());
		}
		
	}
	
	public void testCaseTwo() {
		Driver.getDriver().get(DataReader.getProperty("baseUrl"));
		Driver.getDriver().manage().window().maximize();
		basePage = new BasePage();
		
		
		String actualTitle = Driver.getDriver().getTitle();
		if (actualTitle.equals(DataReader.getProperty("expectedTitle"))) {
			System.out.println("You're on a home page");
		} else {
			System.out.println("You're NOT on a home page");
		}
		
		Select selectOpt = new Select(basePage.searchDropDown);
		
		String expectedDefaultDD = "All Departments";
		String actualDefaultDD = selectOpt.getFirstSelectedOption().getText();
		if (actualDefaultDD.equals(expectedDefaultDD)) {
			System.out.println("Default DropDown value PASSED");
		} else {
			System.out.println("Default DropDown value FAILED");
		}
		
		selectOpt.selectByVisibleText("Home & Kitchen");
		basePage.searchBar.sendKeys(DataReader.getProperty("searchExample"));
		basePage.searchBtn.click();
		
		String expectedSearchTitle = "Amazon.com : " + DataReader.getProperty("searchExample");
		String actualSearchTitle = Driver.getDriver().getTitle();
		if (actualSearchTitle.equals(expectedSearchTitle)) {
			System.out.println("Search Title PASSED");
		} else {
			System.out.println("Search Title FAILED");
		}
		
		String expectedSearchDD = "Home & Kitchen";
		String actualSearchDD = selectOpt.getFirstSelectedOption().getText();
		if (actualSearchDD.equals(expectedSearchDD)) {
			System.out.println("Search DropDown value PASSED");
		} else {
			System.out.println("Search DropDown value FAILED");
		
		}
		
		Driver.getDriver().close();
	}
}
