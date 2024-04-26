package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropExp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://letcode.in/dropable");

		WebElement from = driver.findElement(By.id("draggable"));

		WebElement to = driver.findElement(By.id("droppable"));

		Actions actions = new Actions(driver);

		// actions.clickAndHold(from).moveToElement(to).release().build().perform();

		actions.dragAndDrop(from, to).build().perform();

	}

}
