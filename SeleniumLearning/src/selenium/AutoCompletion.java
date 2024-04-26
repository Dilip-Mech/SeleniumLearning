package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoCompletion {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.google.co.in/");

		WebElement typeInSearchBox = driver.findElement(By.id("APjFqb"));

		typeInSearchBox.sendKeys("nsws");

		List<WebElement> sugList = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']/li"));

		for (WebElement webElement : sugList) {
			if (webElement.getText().equals("nsws peso")) {

				webElement.click();
				break;
			}

		}

	}

}
