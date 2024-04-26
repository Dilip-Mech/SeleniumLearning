package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IntreactWithCheckBox {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.leafground.com/checkbox.xhtml");

		List<WebElement> listOfCheckBox = driver.findElements(By.xpath("//div[@class='ui-chkbox-box ui-widget ui-corner-all ui-state-default']"));

		for (WebElement webElement : listOfCheckBox) {
			webElement.click();

		}



	}

}
