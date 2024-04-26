package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURLS {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.name("q")).sendKeys("selenium");

		List<WebElement> listSearchBox=driver.findElements(By.xpath("//div[@id='Alh6id']//li"));

		System.out.println("This is overall search count :"+listSearchBox.size());


		for (WebElement webElement : listSearchBox) {
			
			String text = webElement.getText();
			System.out.println(text);
			
			if(text.contains(" maven dependency")) {
				webElement.click();
				break;
			}
			
			List<WebElement> totalLinks = driver.findElements(By.tagName("a"));
			
			for (WebElement webElement2 : totalLinks) {
				
				String attribute = webElement2.getAttribute("href");
				
				System.out.println(attribute);
			}
			
			
			
		}

	}

}

