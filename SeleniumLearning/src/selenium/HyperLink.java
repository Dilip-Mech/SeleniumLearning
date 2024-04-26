package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HyperLink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("https://www.leafground.com/link.xhtml");

		WebElement clickGoToHomePage = driver.findElement(By.linkText("Go to Dashboard"));

		clickGoToHomePage.click();

		driver.navigate().back();

		WebElement findUrl = driver.findElement(By.partialLinkText("Find the URL "));

		String find = findUrl.getAttribute("href");

		System.out.println(find);

		WebElement clickBrokenButton = driver.findElement(By.linkText("Broken?"));

		clickBrokenButton.click();

		String title = driver.getTitle();

		System.out.println(title);

		if (title.contains("404")) {

			System.out.println("Your Link is Broken");

		}

		driver.navigate().back();

		List<WebElement> listOfLinks = driver.findElements(By.tagName("a"));

		int size = listOfLinks.size();
		System.out.println("Total Links Size is " + size);

		clickGoToHomePage.click();

	}

}
