package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Driver;

public class BasePage {
	
	public BasePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy (id = "searchDropdownBox")
	public WebElement searchDropDown;
	
	@FindBy (id = "twotabsearchtextbox")
	public WebElement searchBar;
	
	@FindBy (id = "nav-search-submit-button")
	public WebElement searchBtn;
}
