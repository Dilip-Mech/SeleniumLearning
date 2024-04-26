package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollOperation {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://www.nsws.gov.in/");

		//JavascriptExecutor executor = (JavascriptExecutor) driver;

		/*
		 * executor.executeScript("window.scroll(0,450)", "");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * executor.executeScript("window.scroll(0,-450)", "");
		 */

		/*
		 * executor.executeScript("window.scrollTo(0,document.body.scrollHeight)", "");
		 * 
		 * Thread.sleep(3000);
		 * 
		 * executor.executeScript("window.scrollTo(0,0)", "");
		 */
		
		/*
		 * WebElement clickLink = driver.findElement(By.
		 * xpath("(//a[text()='Click here to connect'])[position()=2]"));
		 * 
		 * executor.executeScript("arguments[0].scrollIntoView(true);", clickLink);
		 */
		
		Robot robot = new Robot();
		
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
		
		Thread.sleep(3000);
		
		robot.keyPress(KeyEvent.VK_PAGE_UP);
		robot.keyRelease(KeyEvent.VK_PAGE_UP);

		
	}

}
