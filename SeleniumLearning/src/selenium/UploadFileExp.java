package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFileExp {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/file.xhtml");

		WebElement clickUploadButton = driver.findElement(By.xpath("//span[@id='j_idt88:j_idt89']/child::span[1]"));

		clickUploadButton.click();

		String file = "C:\\Users\\Dilip PC\\Downloads\\TS03UC8950.pdf";

		StringSelection selection = new StringSelection(file);

		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_ENTER);

	}

}
