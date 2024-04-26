package flipkartWorking;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class FlipkartWorking {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Dilip PC\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.get("https://www.flipkart.com/");

		String getUrl = driver.getCurrentUrl();
		System.out.println(getUrl);

		String getTitle = driver.getTitle();
		System.out.println(getTitle);

		// WebElement clickLoginButton =
		// driver.findElement(By.xpath("//a[@href='/account/login?ret=/']"));
		// clickLoginButton.click();

		WebElement typeUsername = driver
				.findElement(By.xpath("//input[@autocomplete='off'][@type='text'][@class='_2IX_2- VJZDxU']"));
		typeUsername.sendKeys("dilipmech18@gmail.com");

		WebElement typePassward = driver.findElement(By.xpath("//input[@type='password']"));
		typePassward.sendKeys("32410114015");

		WebElement clickLoginButton = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		clickLoginButton.click();

		WebElement clickMobileButton = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		clickMobileButton.click();

		WebElement seacrchToys = driver.findElement(By.xpath("//*[@class='_3OO5Xc']/child::input"));
		seacrchToys.sendKeys("Toys");

		WebElement clickSearchIcon = driver.findElement(By.xpath("//button[@class='L0Z3Pu']"));
		clickSearchIcon.click();

		String oldWindow = driver.getWindowHandle();

		WebElement selectGalacticNew = driver
				.findElement(By.linkText("Galactic New gatling Bubble Machine Bubbles for Kids Co..."));
		selectGalacticNew.click();

		Set<String> handlesNewWindow = driver.getWindowHandles();

		for (String newWindow : handlesNewWindow) {

			driver.switchTo().window(newWindow);

		}

		/*
		 * WebElement clickUmanCreationButton =
		 * driver.findElement(By.xpath("//*[text()='UmanG CreatioN']"));
		 * clickUmanCreationButton.click();
		 * 
		 * WebElement clickCloseIcon =
		 * driver.findElement(By.xpath("/html/body/div/div/div/div/button"));
		 * clickCloseIcon.click();
		 */

		WebElement clickBuyNowButton = driver
				.findElement(By.xpath("/html/body/div/div/div[3]/div/div/div[2]/div/ul/li[2]/form/button/span"));
		clickBuyNowButton.click();

		WebElement clickDeliveryHere = driver.findElement(By.xpath("//*[text()='Deliver Here']"));
		clickDeliveryHere.click();

		// WebElement clickApplySuperCoins =
		// driver.findElement(By.xpath("//*[text()='Apply']"));
		// clickApplySuperCoins.click();

		WebElement clickContinueButton = driver.findElement(By.xpath("//button[text()='CONTINUE']"));
		clickContinueButton.click();

		// Thread.sleep(3000);

		WebElement clickNetBankingRadioButton = driver.findElement(By.xpath("//div[text()='Net Banking']"));

		Boolean display = clickNetBankingRadioButton.isDisplayed();

		Boolean selected = clickNetBankingRadioButton.isSelected();

		System.out.println(display);
		System.out.println(selected);

		clickNetBankingRadioButton.click();

		WebElement selectDropDown = driver.findElement(By.xpath(
				"/html/body/div/div/div[2]/div/div/div[4]/div/div/div[2]/div/label[4]/div/div/div/div[2]/div[2]/select"));

		Select selectDropdown1 = new Select(selectDropDown);
		selectDropdown1.selectByValue("BOI");

		List<WebElement> getList = selectDropdown1.getOptions();

		for (WebElement myList : getList) {

			System.out.println(myList.getText());

		}

		System.out.println(selectDropdown1.getOptions().size());

		WebElement navigateToHomePage = driver.findElement(By.xpath("//a[@href='/']"));
		navigateToHomePage.click();

		WebElement clickAboutUs = driver.findElement(By.linkText("About Us"));
		clickAboutUs.click();

		TakesScreenshot screenShot = (TakesScreenshot) driver;

		File screen = screenShot.getScreenshotAs(OutputType.FILE);

		File destinationFile = new File("C:\\Users\\Dilip\\Desktop\\ScreenShot File\\ScreenShot File.png");

		FileHandler.copy(screen, destinationFile);

		WebElement mouseOverFashion = driver.findElement(By.xpath("//span[text()='Electronics']"));

		Actions act = new Actions(driver);

		act.moveToElement(mouseOverFashion).build().perform();
		act.doubleClick(mouseOverFashion).build().perform();
		act.contextClick(mouseOverFashion).build().perform();

		WebElement inputTypeMob = driver.findElement(By.name("q"));

		inputTypeMob.sendKeys("Mob");

		List<WebElement> mobList = driver.findElements(By.cssSelector("ul.col-12-12>li"));

		int list = mobList.size();

		System.out.println(list);

		for (WebElement webElement : mobList) {

			System.out.println(webElement.getText());

		}

	}
}
