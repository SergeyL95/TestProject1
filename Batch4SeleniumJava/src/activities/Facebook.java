package activities;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Facebook {
	public static void main(String[] args) {
		String projectDir = System.getProperty("user.dir");
		String driverPath = projectDir + "/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		ChromeOptions ops = new ChromeOptions();
		ops.addArguments("--remote-allow-origins=*");
		
		
		WebDriver driver = new ChromeDriver(ops);
		
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("Automation");
		driver.findElement(By.id("pass")).sendKeys("Automation");
		Duration dur = Duration.ofSeconds(5);
		driver.manage().timeouts().implicitlyWait(dur);
		driver.findElement(By.xpath("//button[@name='login']")).click();
		driver.close();
	}
}
