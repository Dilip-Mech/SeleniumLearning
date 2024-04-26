import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropDownExp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.google.co.in/");

		WebElement searchBox = driver.findElement(By.name("q"));

		searchBox.sendKeys("letscode");

		WebElement clickGoogleSearchButton = driver.findElement(By.xpath("(//input)[position()=1]"));

		clickGoogleSearchButton.click();

		WebElement clickLetcodeWithKoushik = driver.findElement(By.xpath("//h3[text()='LetCode with Koushik']"));

		clickLetcodeWithKoushik.click();

		WebElement clickWorkspace = driver.findElement(By.xpath("//a[text()='Work-Space']"));

		clickWorkspace.click();

		WebElement clickDropDown = driver.findElement(By.linkText("Drop-Down"));

		clickDropDown.click();

		WebElement selectFruits = driver.findElement(By.id("fruits"));

		Select select = new Select(selectFruits);

		select.selectByVisibleText("Mango");

	}

}
