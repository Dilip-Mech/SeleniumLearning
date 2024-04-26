package selenium;

import java.awt.AWTException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnterInDiffWays {

	public static void main(String[] args) throws AWTException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//driver.findElement(By.name("q")).sendKeys("selenium"+Keys.ENTER);
		
		WebElement searchBox = driver.findElement(By.name("q"));
		searchBox.sendKeys("selenium \n");
		//searchBox.submit();
		
		
		
		/*
		 * Robot robot = new Robot();
		 * 
		 * robot.keyPress(KeyEvent.VK_ENTER); robot.keyRelease(KeyEvent.VK_ENTER);
		 */

	}

}
