package selenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Downloads {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.leafground.com/file.xhtml");

		WebElement clickdownloadFile = driver.findElement(By.xpath("//span[text()='Download']"));

		clickdownloadFile.click();

		File fileLocation = new File("C:\\Users\\Dilip PC\\Downloads");

		File[] totalFiles = fileLocation.listFiles();

		for (File file : totalFiles) {

			if (file.getName().equals("TestLeaf Logo.png")) {
				System.out.println("Your File is Downloaded");
			}
		}

	}

}
