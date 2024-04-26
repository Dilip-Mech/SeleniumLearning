package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/frame.xhtml");

		driver.switchTo().frame(0);

		WebElement click1 = driver.findElement(By.id("Click"));
		click1.click();

		String text = click1.getText();

		System.out.println("The First Click text is :" + text);

		driver.switchTo().defaultContent();

		/*
		 * driver.switchTo().frame(1); driver.switchTo().frame(0);
		 * 
		 * WebElement click2 = driver.findElement(By.id("Click"));
		 * 
		 * click2.click();
		 * 
		 * String text2 = click2.getText();
		 * 
		 * System.out.println("The Second Click text is :"+text2);
		 */

		List<WebElement> listofFrames = driver.findElements(By.tagName("iframe"));

		int size = listofFrames.size();
		System.out.println(size);

	}

}
