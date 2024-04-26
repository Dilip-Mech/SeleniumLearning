package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderExp {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.navigate().to("https://letcode.in/calendar");

		// WebElement clickCalender =
		// driver.findElement(By.xpath("//div[@id='datetimePickerd069f431-2b8d-46e4-a633-1f943cd3ac6f']"));

		// clickCalender.click();

		WebElement clickNextButton = driver.findElement(By.xpath(
				"(//button[@type='button'][@class='datepicker-nav-next button is-small is-text'])[position()=1]"));

		clickNextButton.click();

		WebElement clickDate18 = driver.findElement(By.xpath("(//button[text()='18'])[position()=1]"));

		clickDate18.click();

	}

}
