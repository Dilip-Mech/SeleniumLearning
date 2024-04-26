package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FindTextUnderlinedOrNot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.google.co.in/");

		WebElement Tamil = driver.findElement(By.linkText("தமிழ்"));	

		String BeforeOvering = Tamil.getCssValue("text-decoration");

		System.out.println("Before Overing  " +BeforeOvering);

		Actions actions = new Actions(driver);

		actions.moveToElement(Tamil).perform();

		String AfterOvering = Tamil.getCssValue("text-decoration");

		System.out.println("After Overing   " +AfterOvering);





	}

}
