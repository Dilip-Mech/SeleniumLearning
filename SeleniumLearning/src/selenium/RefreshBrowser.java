package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class RefreshBrowser {

	public static void main(String[] args) throws AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		
		ChromeOptions chromeOptions = new ChromeOptions();
		
		chromeOptions.addArguments("--start-maximized");
		
		WebDriver driver = new ChromeDriver(chromeOptions);

		//driver.manage().window().maximize();
		
		
		
		//Dimension dimension = new Dimension(1920, 1080);
		
		//driver.manage().window().setSize(dimension);

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("https://www.google.co.in/");
		
		WebElement searchBox = driver.findElement(By.id("APjFqb"));
		
		searchBox.sendKeys("Selenium");
		
		//Refresh Browser by using navigate - refersh
		
		//driver.navigate().refresh(); 
		
		//driver.get(driver.getCurrentUrl());
		
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		
		//executor.executeScript("location.reload");
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_F5);
		robot.keyRelease(KeyEvent.VK_F5);

	}

}
