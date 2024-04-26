package selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonExample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

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

		WebElement clickButton = driver.findElement(By.xpath("(//footer)[position()=2]"));

		clickButton.click();

		// Get the X & Y co-ordinates

		WebElement findLocationButton = driver.findElement(By.xpath("//label[@for='location']/following::button[1]"));

		Point location = findLocationButton.getLocation();

		int xaxis = location.getX();
		int yaxis = location.getY();

		System.out.println("The Position of X Axis is : " + xaxis);
		System.out.println("The Position of Y Axis is : " + yaxis);

		// Find the color of the button

		WebElement findcolor = driver.findElement(By.xpath("//label[@for='location']/following::button[2]"));

		String cssValue = findcolor.getCssValue("background-color");

		System.out.println("The color of the Button is : " + cssValue);

		// Find the height & width of the button

		WebElement findHeightWidth = driver.findElement(By.xpath("//label[@for='location']/following::button[3]"));

		Dimension size = findHeightWidth.getSize();

		int height = size.getHeight();
		int width = size.getWidth();

		System.out.println("The Height of the Button is : " + height);
		System.out.println("THe Width of the Button is : " + width);

		// Confirm button is disabled

		WebElement isEnabledorNot = driver.findElement(By.xpath("//label[@for='location']/following::button[4]"));

		boolean enabled = isEnabledorNot.isEnabled();
		System.out.println(enabled);

		// ALERT HANDLING

		WebElement clickWorkspace1 = driver.findElement(By.xpath("//a[text()='Work-Space']"));

		clickWorkspace1.click();

		WebElement clickDialogButton = driver.findElement(By.linkText("Dialog"));

		clickDialogButton.click();

		/*
		 * WebElement clickSimpleAlertButton =
		 * driver.findElement(By.xpath("//button[text()='Simple Alert']"));
		 * 
		 * clickSimpleAlertButton.click();
		 * 
		 * 
		 * Alert alert = driver.switchTo().alert();
		 * 
		 * alert.accept();
		 * 
		 * WebElement clickConfirmButton = driver.findElement(By.id("confirm"));
		 * 
		 * clickConfirmButton.click();
		 * 
		 * Alert clickConfirAlert = driver.switchTo().alert();
		 * 
		 * clickConfirAlert.dismiss();
		 * 
		 * WebElement clickPropmt = driver.findElement(By.id("prompt"));
		 * 
		 * clickPropmt.click();
		 * 
		 * Alert clickPropmtAlert = driver.switchTo().alert();
		 * 
		 * clickPropmtAlert.sendKeys("Dilip Kumar");
		 * 
		 * clickPropmtAlert.accept();
		 */

		WebElement modernAlert = driver.findElement(By.xpath("//button[text()='Modern Alert']"));

		modernAlert.click();

		Thread.sleep(3000);

		WebElement close = driver.findElement(By.xpath("//button[@aria-label='close']"));

		close.click();

	}

}
