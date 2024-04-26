package testNGProject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuitExample {
	
	
	WebDriver driver;
	long startTime;
	long endTime;
	
	@BeforeSuite
	public void launchBrowser() {
		
		startTime = System.currentTimeMillis();

		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}


	@Test
	public void openGoogle() {
		driver.get("https://www.google.co.in/");
	}
	
	@Test
	public void openBing() {
		driver.get("https://www.bing.com/");
	}
	
	@Test
	public void openYahoo() {
		driver.get("https://in.search.yahoo.com/");

	}
	@AfterSuite
	public void closeBrowser() {
		
		driver.quit();
		
		endTime = System.currentTimeMillis();

		long totalTIme= endTime-startTime;

		System.out.println("The Total Time is : "+totalTIme);
		
	}

}
