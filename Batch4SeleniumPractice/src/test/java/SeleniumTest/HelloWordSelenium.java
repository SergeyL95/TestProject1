package SeleniumTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWordSelenium {
	public static void main(String[] args) {
		//Getting the project directory
		String projectDir = System.getProperty("user.dir");
		System.out.println(projectDir);
		//Getting the driver path
		String driverPath = projectDir + "/drivers/chromedriver.exe";
		System.out.println(driverPath);
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://practice.primetech-apps.com/");
		
	}
}
