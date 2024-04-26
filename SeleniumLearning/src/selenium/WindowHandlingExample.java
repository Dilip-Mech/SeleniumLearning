package selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingExample {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/window.xhtml");

		String oldWindow = driver.getWindowHandle();

		WebElement clickOpenButton = driver.findElement(By.xpath("//button[@id='j_idt88:new']/span"));

		clickOpenButton.click();

		Set<String> handles = driver.getWindowHandles();

		for (String string : handles) {
			driver.switchTo().window(string);
		}
		WebElement enterEmail = driver.findElement(By.id("email"));

		enterEmail.sendKeys("dilipmech18@gmail.com");

		driver.close();

		driver.switchTo().window(oldWindow);

		String title = driver.getTitle();

		System.out.println(title);

		WebElement clickCloseWindows = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt93']/child::span[2]"));

		clickCloseWindows.click();

		int size = driver.getWindowHandles().size();

		System.out.println("The Size of Opened Window is :" + size);

		Set<String> allWindows = driver.getWindowHandles();

		for (String currentWindow : allWindows) {

			if (!currentWindow.equals(oldWindow)) {
				driver.switchTo().window(currentWindow);
				driver.close();

			}

			driver.switchTo().window(oldWindow);

		}

		WebElement clickOpenInDelay = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt95']/child::span"));

		clickOpenInDelay.click();

		Set<String> OpenInDelayWindowsCLose = driver.getWindowHandles();

		for (String closeWindowDelay : OpenInDelayWindowsCLose) {

			if (!closeWindowDelay.equals(oldWindow)) {

				driver.switchTo().window(closeWindowDelay);

				driver.close();

			}

		}

		driver.switchTo().window(oldWindow);

		WebElement typeInSearchBox = driver.findElement(By.xpath("//input[@placeholder='Search...']"));

		typeInSearchBox.sendKeys("Dilip");

		driver.quit();

	}

}
