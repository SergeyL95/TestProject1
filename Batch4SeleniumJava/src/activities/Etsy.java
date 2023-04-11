package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Etsy {
	public static void main(String[] args) {
		String projectDir = System.getProperty("user.dir");
		String driverPath = projectDir + "/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		

	}
	
	public void testCaseOne() throws InterruptedException{
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(ops);
		
		String regEmail = "jon.dow@gmail.com";
		String firstName = "Jon";
		String password = "Password123";
		String expectedMessage = "Sorry, the email you have entered is already in use.";
		
		
		driver.get("https://etsy.com");
		Duration dur = Duration.ofSeconds(5);
		driver.manage().timeouts().implicitlyWait(dur);
		
		driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--small wt-btn--transparent wt-mr-xs-1 inline-overlay-trigger signin-header-action select-signin']")).click();
		driver.findElement(By.xpath("//button[@class='wt-btn wt-btn--secondary wt-btn--small inline-overlay-trigger register-header-action select-register']")).click();
		
		
		driver.findElement(By.xpath("//input[@id='join_neu_email_field']")).sendKeys(regEmail);
		driver.findElement(By.xpath("//input[@id='join_neu_first_name_field']")).sendKeys(firstName);
		driver.findElement(By.xpath("//input[@id='join_neu_password_field']")).sendKeys(password);
		
		driver.findElement(By.xpath("//button[@name='submit_attempt']")).click();
		
		String actualMessage = driver.findElement(By.xpath("//div[@class='wt-validation__message wt-mt-xs-1 ']")).getText();
		
		
		if(actualMessage.equals(expectedMessage)) {
			System.out.println("Message Validation PASSED.");
			System.out.println("Expected message: " + expectedMessage);
			System.out.println("Actual message: " + actualMessage);
		} else {
			System.out.println("Message Validation FAILED. Messages didn't match.");
			System.out.println("Expected message: " + expectedMessage);
			System.out.println("Actual message: " + actualMessage);
		}
	}
}
