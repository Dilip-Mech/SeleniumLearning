package selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SuggestionExa {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("src")).sendKeys("che");
		
		List<WebElement> from=driver.findElements(By.xpath("//ul[@class='sc-dnqmqq eFEVtU']//following::li"));
		
		System.out.println("This is overall place count :"+from.size());
		
		for(WebElement aa:from)
		{
			System.out.println(aa.getText());
		}
		
		
		/*for(WebElement aa:from)
		{
			if(aa.getText().equalsIgnoreCase("Madhavaram, Chennai"))
			{
				aa.click();
				break;
			}
		}
		
		driver.findElement(By.id("dest")).sendKeys("kan");
		
		List<WebElement> to=driver.findElements(By.cssSelector("ul.autoFill>li"));
		
		System.out.println("This is overall place count :"+to.size());
		
		for(WebElement cc:to)
		{
			System.out.println(cc.getText());
		}
		
		
		for(WebElement dd:to)
		{
			if(dd.getText().equalsIgnoreCase("Kanyakumari"))
			{
				dd.click();
				break;
			}
		}
		
		driver.findElement(By.cssSelector("table.rb-monthTable>tbody>tr>td:nth-of-type(3)")).click();
		driver.findElement(By.cssSelector("td.next")).click();
	}*/
	}
}
