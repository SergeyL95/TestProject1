package selenium_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FirstSelenium {
	public static void main(String[] args) {
		String projectDir = System.getProperty("user.dir");
		String driverPath = projectDir + "/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(ops);
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		
		
		String fullName = "Sergey Lutsenko";
		String emailInfo = "sergey@gmail.com";
		String currentAddress = "123 Something, Jax, FL 32225";
		String permanentAddress = "321 Nothing, Jax, FL 32246";
		
		WebElement fullNameBox = driver.findElement(By.id("userName"));
		fullNameBox.sendKeys(fullName);
		WebElement emailBox = driver.findElement(By.id("userEmail"));
		emailBox.sendKeys(emailInfo);
		WebElement currentAddressBox = driver.findElement(By.id("currentAddress"));
		currentAddressBox.sendKeys(currentAddress);
		WebElement permanentAddressBox = driver.findElement(By.id("permanentAddress"));
		permanentAddressBox.sendKeys(permanentAddress);
		
		WebElement submitButton = driver.findElement(By.id("submit"));
		submitButton.click();
		
		WebElement responseName = driver.findElement(By.id("name"));
		String actualName = responseName.getText();
		String expectedName = "Name:" + fullName;
		
		if (actualName.equals(expectedName)) {
			System.out.println("Name Respone Validation PASSED");
		} else {
			System.out.println("Name Respone Validation FAILED");
		}
		
		driver.close();		
		
		
		
	}
}
