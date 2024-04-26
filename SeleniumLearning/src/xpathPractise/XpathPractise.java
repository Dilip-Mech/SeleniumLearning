package xpathPractise;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractise {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		// Locating Unknown Element With Known attributes Example

		/*
		 * WebElement userName = driver.findElement(By.xpath("//*[@name='username']"));
		 * 
		 * userName.sendKeys("Admin");
		 * 
		 * WebElement password = driver.findElement(By.xpath("//*[@name='password']"));
		 * 
		 * password.sendKeys("admin123");
		 */

		// Locating Known Element With Known attributes Example

		WebElement userName1 = driver.findElement(By.xpath("//input[@name='username']"));

		userName1.sendKeys("Admin");

		WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));

		password1.sendKeys("admin123");

		WebElement clickLoginButton = driver.findElement(By.xpath("//button[@type='submit']"));

		clickLoginButton.click();

		WebElement clickHumanResource = driver.findElement(By.xpath("//*[text()='Human Resources']"));

		clickHumanResource.click();

	}

}
