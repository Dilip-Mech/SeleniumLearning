package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendkeyInDiffWays {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://www.google.co.in/");
		
		//WebElement searchBox = driver.findElement(By.name("q"));
		
		
		//JavascriptExecutor executor = (JavascriptExecutor) driver;
		//executor.executeScript("document.getElementsByName('q')[0].value='Selenium'", "");
		
		//executor.executeScript("arguments[0].value='Selenium Testing'", searchBox);
		
		driver.switchTo().activeElement();
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_N);
		
		robot.keyPress(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_U);
		
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);
		
		robot.keyPress(KeyEvent.VK_L);
		robot.keyRelease(KeyEvent.VK_L);

	}

}
