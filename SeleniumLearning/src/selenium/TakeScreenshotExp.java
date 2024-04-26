package selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshotExp {

	public static void main(String[] args) throws IOException, AWTException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/alert.xhtml");



		WebElement clickAlertbutton = driver.findElement(By.xpath("(//span[text()='Show'])[position()=1]"));

		clickAlertbutton.click();

		Robot robot = new Robot();
		
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		Rectangle rectangle = new Rectangle(screenSize);
		
		BufferedImage source = robot.createScreenCapture(rectangle);
		
		File destinationFile = new File("D:\\\\Takescreenshot\\\\snapshot.png");
		
		ImageIO.write(source, "png", destinationFile);
		
		
		
		/*
		 * TakesScreenshot screenshot = (TakesScreenshot) driver;
		 * 
		 * File sourceFile = screenshot.getScreenshotAs(OutputType.FILE);
		 * 
		 * File file = new File("D:\\Takescreenshot\\sample.png");
		 * 
		 * FileHandler.copy(sourceFile, file);
		 */


		Alert alert = driver.switchTo().alert();

		alert.accept();


	}

}
