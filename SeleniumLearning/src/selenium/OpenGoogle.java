package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dilip PC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.google.co.in/");

		WebElement searchBox = driver.findElement(By.id("APjFqb"));

		searchBox.sendKeys("Selenium");

		WebElement clickSearchButton = driver.findElement(By.xpath("(//input)[position()=1]"));

		clickSearchButton.click();

		// WebElement userName = driver.findElement(By.xpath("//*[@name='username']"));

		// userName.sendKeys("Admin");

		// WebElement passward = driver.findElement(By.xpath("//*[@name='password']"));

		// passward.sendKeys("admin123");

		// driver.close();

	}

}
