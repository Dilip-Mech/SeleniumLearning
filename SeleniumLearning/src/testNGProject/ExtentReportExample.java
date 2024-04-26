package testNGProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportExample {


	WebDriver driver;
	
	ExtentReports report;
	
	ExtentSparkReporter sparkReport;

	ExtentTest testCase;

	@BeforeSuite
	public void launchBrowser() {

		driver = new ChromeDriver();
		driver.manage().window().maximize();
		report = new ExtentReports();
		
		sparkReport = new ExtentSparkReporter("ExtentReport.html");
		report.attachReporter(sparkReport);

	}

	@AfterSuite
	public void closeBrowser() {

		driver.quit();
		report.flush();
	}

	@Test
	public void openGoogle() {
		testCase = report.createTest("Verify Google TestCase");
		driver.get("https://www.google.co.in/");

		String title = driver.getTitle();

		if(title.equals("Google")) {
			System.out.println("Test Case is Passed");
		}else {
			System.out.println("Test Case is Failed");
		}

	}

	@Test
	public void openBing() {
		testCase = report.createTest("Verify bing TestCase");

		driver.get("https://www.bing.com/");

		String title = driver.getTitle();

		if(title.equals("Bing")) {
			System.out.println("Test Case is Passed");
		}else {
			System.out.println("Test Case is Failed");
		}
	}

	@Test
	public void openWikipedia() {
		testCase = report.createTest("Verify wikipedia TestCase");
		
		driver.get("https://www.wikipedia.org/");

		String title = driver.getTitle();

		if(title.equals("wikipedia")) {
			System.out.println("Test Case is Passed");
		}else {
			System.out.println("Test Case is Failed");
		}

	}
}
