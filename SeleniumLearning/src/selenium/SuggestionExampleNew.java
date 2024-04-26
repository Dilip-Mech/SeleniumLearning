package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionExampleNew {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("src")).sendKeys("che");
		
		List<WebElement> from=driver.findElements(By.xpath("//li[@class='sc-iwsKbI jTMXri']"));
		
		System.out.println("This is overall place count :"+from.size());
		
		
		for(WebElement aa:from)
		{
			
			String text = aa.getText();
			System.out.println(text);
			
			if(text.contains("Koyambedu")) {
				
				aa.click();
				//break;
			
			}
		}

}
}
