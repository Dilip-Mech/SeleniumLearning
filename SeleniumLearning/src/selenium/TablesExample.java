package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TablesExample {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("https://letcode.in/table");

		List<WebElement> columns = driver.findElements(By.tagName("th"));

		int columnSize = columns.size();

		System.out.println(columnSize);

		List<WebElement> rows = driver.findElements(By.tagName("tr"));

		int rowSize = rows.size();

		System.out.println(rowSize);

		WebElement clickYashwanthCheckBox = driver.findElement(By.xpath("//td[text()='Yashwanth']//following::td[3]"));

		clickYashwanthCheckBox.click();

	}

}
