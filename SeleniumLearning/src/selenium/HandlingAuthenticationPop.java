package selenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticationPop {

	
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver",
					"C:\\\\Users\\\\Dilip PC\\\\Downloads\\\\chromedriver-win64\\\\chromedriver-win64\\\\chromedriver.exe");

			WebDriver driver = new ChromeDriver();

			driver.manage().window().maximize();

			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

			driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
			
			

	}

}
