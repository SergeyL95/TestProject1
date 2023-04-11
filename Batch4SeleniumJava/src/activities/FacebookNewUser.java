package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FacebookNewUser {
	public static void main(String[] args) {
		String projectDir = System.getProperty("user.dir");
		String driverPath = projectDir + "/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Create new account")).click();
		Duration dur = Duration.ofSeconds(3);
		driver.manage().timeouts().implicitlyWait(dur);
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("Automation");
		driver.findElement(By.id("password_step_input")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@type='radio' and @name='sex' and @value='2']")).click();
		driver.findElement(By.xpath("//button[@name='websubmit']")).click();
		
	}
}
