package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingSelectable {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://letcode.in/selectable");

		List<WebElement> selectable = driver.findElements(By.xpath("//div[@id='container']/div"));

		int size = selectable.size();

		System.out.println(size);

		Actions actions = new Actions(driver);

		actions.keyDown(Keys.CONTROL).click(selectable.get(0)).click(selectable.get(1)).click(selectable.get(2)).build()
				.perform();

	}

}
